package work3;
import java.util.*;
public class text2 {
    public static void main(String[] args) {
        int max=0,count=1;
        Scanner sc=new Scanner(System.in);
        String[] nums=null;
        System.out.print("Enter numbers: ");

        nums=sc.nextLine().split(" ");
        int num[]=new int[nums.length];
        for(int i=0;i<num.length;i++){
            num[i]=Integer.valueOf(nums[i]);
        }
        max=num[0];
        for(int i=1;i<num.length;i++) {
            if (num[i] > max) {
                max = num[i];
                count=1;
            }
            else if(num[i]==max){
                count++;
            }
        }
        System.out.println("The largest number is "+max);
        System.out.println("The occurrence count of the largest number is "+count);
    }
}
