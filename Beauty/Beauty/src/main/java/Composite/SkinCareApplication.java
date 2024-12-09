package Composite;

import Composite.*;

public class SkinCareApplication {
    public static void main(String[] args) {
        // Окремі послуги
        Service skinDiagnosis = new SingleService("Skin Diagnosis", 50);
        Service peeling = new SingleService("Peeling", 100);
        Service massage = new SingleService("Facial Massage", 80);

        // Група послуг "Догляд за обличчям"
        ServiceGroup facialCare = new ServiceGroup("Facial Care");
        facialCare.addService(skinDiagnosis);
        facialCare.addService(peeling);
        facialCare.addService(massage);

        // Окрема послуга
        Service bodyScrub = new SingleService("Body Scrub", 120);

        // Група послуг "Комплексний догляд"
        ServiceGroup completeCare = new ServiceGroup("Complete Care");
        completeCare.addService(facialCare);
        completeCare.addService(bodyScrub);

        // Відображення структури послуг
        System.out.println("Complete Service Details:");
        completeCare.showDetails();
    }
}
