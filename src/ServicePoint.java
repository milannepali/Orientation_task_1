
import java.util.LinkedList;

public class ServicePoint {

    private LinkedList<Customer> queue = new LinkedList<>();

    private double totalServiceTime = 0;
    private int servedCustomers = 0;

    public void addToQueueue(Customer customer) {
        customer.setStartTime(System.nanoTime());
        queue.addFirst(customer);
    }

    public Customer removeFromQueueue() {
        return queue.removeLast();
    }

    public void serve() {

        while (!queue.isEmpty()) {

            Customer customer = removeFromQueueue();

            long serviceStart = System.nanoTime();

            long sleepTime = (long)(Math.random() * 1000) + 500;

            try {
                Thread.sleep(sleepTime);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                return;
            }

            long serviceEnd = System.nanoTime();
            customer.setEndTime(serviceEnd);

            double serviceTime =
                    (serviceEnd - serviceStart) / 1_000_000.0;

            double responseTime =
                    customer.getTimeSpent() / 1_000_000.0;

            totalServiceTime += serviceTime;
            servedCustomers++;

            System.out.println("Customer " + customer.getId());
            System.out.println("Service time: " + serviceTime + " ms");
            System.out.println("Response time: " + responseTime + " ms");
            System.out.println();
        }
    }

    public double getAverageServiceTime() {

        if (servedCustomers == 0) {
            return 0;
        }

        return totalServiceTime / servedCustomers;
    }
}
