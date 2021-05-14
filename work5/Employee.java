package work5;

 class Employee extends Person{
    String office;
    double salary;
    mydata mydata;

    public Employee() {
    }

     public Employee(String name,
                     String address,
                     long phonenumber,
                     String email,
                     String office,
                     double salary,
                     mydata mydata) {
         super(name, address, phonenumber, email);
         this.office = office;
         this.salary = salary;
         this.mydata = mydata;
     }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + super.name + '\'' +
                '}';
    }
}
class mydata {
    int year;
    int month;
    int day;

    public mydata(int year, int month, int day) {
        this.year = year;
        this.month = month;
        this.day = day;
    }
}
class Faculty extends Employee{
    String officehours;
    String rank;

    public Faculty(String officehours, String rank) {
        this.officehours = officehours;
        this.rank = rank;
    }

    public Faculty(String name, String address, long phonenumber, String email, String office, double salary, mydata mydata, String officehours, String rank) {
        super(name, address, phonenumber, email, office, salary, mydata);
        this.officehours = officehours;
        this.rank = rank;
    }

    public String toString(){
        return "faculty:"+super.name;
    }
}
class Staff extends Employee{
    String title;

    public Staff() {
    }

    public Staff(String name, String address, long phonenumber, String email, String office, double salary, mydata mydata, String title) {
        super(name, address, phonenumber, email, office, salary, mydata);
        this.title = title;
    }

    public String toString(){
        return "Staff:"+super.name;
    }
}