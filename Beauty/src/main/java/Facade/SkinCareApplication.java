package Facade;

import Facade.SkinCareFacade;

class SkinCareApplication {
    public static void main(String[] args) {
        SkinCareFacade facade = new SkinCareFacade();

        String result = facade.bookAppointment(
                "Karina Teslenko",
                "Skin Analysis",
                "2024-11-10 14:00",
                "uploads/john_doe_skin.jpg"
        );

        System.out.println(result);
    }
}
