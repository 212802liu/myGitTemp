package work3;
import java.util.*;
import java.math.*;
import java.text.DecimalFormat;
public class text1 {
    public static void main(String[] args) {
        // TODO Auto-generated method stub

        Scanner input=new Scanner(System.in);
        System.out.print("Loan Amount: ");
        double amount=input.nextDouble();
        System.out.print("number of year: ");
        int years=input.nextInt();
        double rate=0.05;
        System.out.println("Interest Rate"+"\t"+"Monthly Payment"+"\t"+"Total Payment");
        while(rate<0.081)   //因为double会加上几个小数使本应为0.08的值偏大
        {

            DecimalFormat df=new DecimalFormat("#.00");
            DecimalFormat da=new DecimalFormat("#.000");
            double payment=amount*rate/12/(1-1/Math.pow((1+rate/12),years*12));

            System.out.println(da.format(rate*100)+"%"+"\t"+"\t"+"\t"+df.format(payment)+"\t"+"\t"+"\t"+df.format(payment*years*12));
            System.out.println("_________________________________________________________");
            rate=rate+0.00125;
        }


    }

}
