package work3;
import java.util.*;
public class text4 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a credit card number as a long integer: ");
        long num=sc.nextLong();
        long t=num,n=num,suma=0,sumb=0,i=1,a;



        while(num>0){
            if(i%2==0){
                a=(num%10)*2;
                if( a>=10){
                    a=a/10+a%10;
                    suma+=a;
                }
                else
                    suma+=a;
            }
            num=num/10;
            i++;
        }
        i=1;
        while (t>0){
            if(i%2!=0){
                sumb+=t%10;
            }
            t=t/10;
            i++;
        }
        if((suma+sumb)%10==0){
            System.out.println(n+" is valid");
        }
        else
            System.out.println(n+" is invalid");

    }
}
