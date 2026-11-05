
public class OrientationTask1_3 {

    public static void main(String[] args) {

        Customer c1 = new Customer();
        Customer c2 = new Customer();

        c1.setStartTime(100);
        c1.setEndTime(500);

        c2.setStartTime(200);
        c2.setEndTime(800);

        System.out.println("Customer " + c1.getId());
        System.out.println("Time spent: " + c1.getTimeSpent());

        System.out.println("Customer " + c2.getId());
        System.out.println("Time spent: " + c2.getTimeSpent());
    }
}
