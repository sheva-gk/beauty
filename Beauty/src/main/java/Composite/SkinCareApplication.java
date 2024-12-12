package Composite;

public class SkinCareApplication {
    public static void main(String[] args) {
        Service skinDiagnosis = new SingleService("Skin Diagnosis", 50);
        Service peeling = new SingleService("Peeling", 100);
        Service massage = new SingleService("Facial Massage", 80);

        ServiceGroup facialCare = new ServiceGroup("Facial Care");
        facialCare.addService(skinDiagnosis);
        facialCare.addService(peeling);
        facialCare.addService(massage);

        Service bodyScrub = new SingleService("Body Scrub", 120);

        ServiceGroup completeCare = new ServiceGroup("Complete Care");
        completeCare.addService(facialCare);
        completeCare.addService(bodyScrub);

        System.out.println("Complete Service Details:");
        completeCare.showDetails();
    }
}
