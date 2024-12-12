package Proxy;

public class ImageServiceProxy implements ImageService {
    private RealImageService realImageService;

    public ImageServiceProxy() {
        this.realImageService = new RealImageService();
    }

    @Override
    public String getImage(String imagePath, String userRole) {
        if (!hasAccess(userRole)) {
            return "Access Denied: You do not have the necessary permissions to view this image.";
        }
        return realImageService.getImage(imagePath, userRole);
    }

    private boolean hasAccess(String userRole) {
        return "ADMIN".equals(userRole) || "COSMETOLOGIST".equals(userRole);
    }
}