
public class OrientationTask1_6 {

    public static void main(String[] args) {

        CustomerGenerator generator = new CustomerGenerator();

        for (int run = 1; run <= 3; run++) {

            System.out.println("\nRun " + run);

            ServicePoint servicePoint = new ServicePoint();

            generator.generateCustomers(5, servicePoint);

            servicePoint.serve();

            System.out.println("Average service time: "
                    + servicePoint.getAverageServiceTime() + " ms");
        }
    }
}
