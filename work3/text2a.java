package work3;
import java.util.*;
public class text2a {
    public static void main(String[] args) {

        int max = 0, count = 1, i = 0, x;
        System.out.print("Enter numbers: ");
        Scanner sc = new Scanner(System.in);
        do {
            x=sc.nextInt();
            if (x > max) {
                max = x;
                count=1;
            }
            else if(x==max){
                count++;
            }

        }while (x!=0);
            System.out.println("The largest number is " + max);
        System.out.println("The occurrence count of the largest number is " + count);
    }
}
