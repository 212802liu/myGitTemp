package work5;

public class Person {
    public String name;
    public String address;
    public long phonenumber;
    public String email;

    public Person() {
    }

    public Person(String name, String address, long phonenumber, String email) {
        this.name = name;
        this.address = address;
        this.phonenumber = phonenumber;
        this.email = email;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                '}';
    }
}
