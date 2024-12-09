package Proxy;

import Proxy.ImageService;
import Proxy.ImageServiceProxy;

public class SkinCareApplication {
    public static void main(String[] args) {
        ImageService imageService = new ImageServiceProxy();

        System.out.println(imageService.getImage("uploads/skin_photo_123.jpg", "USER"));

        System.out.println(imageService.getImage("uploads/skin_photo_123.jpg", "COSMETOLOGIST"));

        System.out.println(imageService.getImage("uploads/skin_photo_123.jpg", "ADMIN"));
    }
}