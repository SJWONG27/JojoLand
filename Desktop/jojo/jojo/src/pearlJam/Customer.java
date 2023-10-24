package pearlJam;
public class Customer {
    private String name;
    private int age;
    private String gender;
    private String order;

    public Customer(String name, int age, String gender, String order) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.order = order;
    }
    
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getGender() {
        return gender;
    }
    
    public String getOrder() {
        return order;
    }
    
    @Override
    public String toString() {
        return String.format("%-23s %-15d %-15s %5s", name, age, gender, order);
    }
}
