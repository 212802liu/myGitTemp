package work5;

public class text3 {
    public static void main(String[] args) {
        Person p=new Person("刘1","上海",13109287165L,"12121@ii");
        Student s=new Student("刘2","上海",2310927165L,"2121@ii");
        Employee e=new Employee("刘3","北京",33109287165L,"32121@ii","bei",12345,new mydata(2020,12,1));
        Staff staff =new Staff("刘4","北京",33109287165L,"32121@ii","bei",12345,new mydata(2020,12,1),"精英");
        Faculty f=new Faculty("刘4","北京",33109287165L,"32121@ii","bei",12345,new mydata(2020,12,1),"10","nv");
        System.out.println(p.toString());
        System.out.println(s.toString());
        System.out.println(e.toString());
        System.out.println(staff.toString());
        System.out.println(f.toString());
    }

}
