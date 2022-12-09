public class Customer {
    long customerId;
    String name;
    Date birthDate;

    public Customer(long customerId, String name, int month, int day, int year) {
        this.customerId = customerId;
        this.name = name;
        birthDate = new Date(month, day, year);
    }
}
