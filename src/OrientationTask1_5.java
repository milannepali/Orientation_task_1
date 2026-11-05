
public class OrientationTask1_5 {

    public static void main(String[] args) {

        ServicePoint servicePoint = new ServicePoint();

        CustomerGenerator generator = new CustomerGenerator();

        generator.generateCustomers(5, servicePoint);

        System.out.println("\nStarting service...\n");

        servicePoint.serve();

        System.out.println("All customers served.");
    }
}
