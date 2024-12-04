package main;

import facade.SkinCareFacade;

public class SkinCareApplication {
    public static void main(String[] args) {
        SkinCareFacade facade = new SkinCareFacade();

        // Спрощений запис на прийом через Facade
        String result = facade.bookAppointment(
                "John Doe",
                "Skin Analysis",
                "2024-11-10 14:00",
                "uploads/john_doe_skin.jpg"
        );

        System.out.println(result);
    }
}
