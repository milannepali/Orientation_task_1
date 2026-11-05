
import java.util.LinkedList;
import java.util.Scanner;

public class OrientationTask1_4 {

    public static void main(String[] args) {

        LinkedList<Customer> queue = new LinkedList<>();
        Scanner scanner = new Scanner(System.in);

        while (true) {

            System.out.println("\n1. Add customer");
            System.out.println("2. Remove customer");
            System.out.println("3. Exit");
            System.out.print("Choose an option: ");

            int choice = scanner.nextInt();

            if (choice == 1) {

                Customer customer = new Customer();
                customer.setStartTime(System.nanoTime());

                queue.addFirst(customer);

                System.out.println("Customer " + customer.getId()
                        + " added to queue.");

            } else if (choice == 2) {

                if (queue.isEmpty()) {
                    System.out.println("Queue is empty.");
                } else {

                    Customer customer = queue.removeLast();
                    customer.setEndTime(System.nanoTime());

                    double waitingTime =
                            customer.getTimeSpent() / 1_000_000.0;

                    System.out.println("Customer " + customer.getId()
                            + " removed from queue.");

                    System.out.println("Waiting time: "
                            + waitingTime + " ms");
                }

            } else if (choice == 3) {

                System.out.println("Program ended.");
                break;

            } else {

                System.out.println("Invalid option.");
            }
        }

        scanner.close();
    }
}
