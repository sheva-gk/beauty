package Proxy;

public class RealImageService implements ImageService {

    @Override
    public String getImage(String imagePath, String userRole) {
        return "Image loaded from path: " + imagePath;
    }
}