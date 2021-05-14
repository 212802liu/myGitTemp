package work2;
import java.util.*;
public class text3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a int number to create MyInteger object:");
        int value = scanner.nextInt();
        System.out.println("Enter a string which can transform to a int:");
        String str = scanner.next();
        MyInteger myInteger1 = new MyInteger(value);
        System.out.println("myInteger1 is even? " + myInteger1.isEven());
        System.out.println("myInteger1 is odd? " + myInteger1.isOdd());
        System.out.println("myInteger1 is isPrime? " + myInteger1.isPrime());
        MyInteger myInteger2 = new MyInteger(MyInteger.parseInt(str));
        System.out.println("myInteger2 is  "+MyInteger.parseInt(str));
        System.out.println("myInteger2 is even? " + myInteger2.isEven() );
        System.out.println("myInteger2 is odd? " + myInteger2.isOdd());
        System.out.println("myInteger2 is isPrime? " + myInteger2.isPrime());
        System.out.println("myInteger1 is equal to myInteger2? "+myInteger1.equals(myInteger2));

        scanner.close();
    }
}
