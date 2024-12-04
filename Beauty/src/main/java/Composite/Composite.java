package products;

import java.util.ArrayList;
import java.util.List;

public class ServiceGroup implements Service {
    private String groupName;
    private List<Service> services = new ArrayList<>();

    public ServiceGroup(String groupName) {
        this.groupName = groupName;
    }

    public void addService(Service service) {
        services.add(service);
    }

    public void removeService(Service service) {
        services.remove(service);
    }

    @Override
    public void showDetails() {
        System.out.println("Service Group: " + groupName);
        for (Service service : services) {
            service.showDetails();
        }
    }
}
