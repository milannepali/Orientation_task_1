
public class CustomerGenerator {

    public void generateCustomers(int number, ServicePoint sp) {

        for (int i = 0; i < number; i++) {

            Customer customer = new Customer();

            sp.addToQueueue(customer);

            System.out.println("Customer " + customer.getId()
                    + " added to queue.");
        }
    }
}
