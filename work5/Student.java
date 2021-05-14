package work5;


public class Student extends Person{

    public void setGrade(){
        final String s1="freshman";
        final String s2="sophomore";
        final String s3="junior";
        final String s4="ssenior";
    }

    public Student() {
    }

    public Student(String name, String address, long phonenumber, String email) {
        super(name, address, phonenumber, email);
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + super.name + '\'' +
                '}';
    }
}
