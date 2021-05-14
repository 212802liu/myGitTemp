package work3;
import java.util.*;
import java.math.*;
import java.text.DecimalFormat;
import java.text.NumberFormat;
public class text3 {
    public static double futureInvestmentValue(double investmentAmount, double monthlyInterestRate, int years){
        double value=investmentAmount*Math.pow((1+monthlyInterestRate),years*12);
        return value;
    }

    public static void main(String[] args) {
        DecimalFormat df=new DecimalFormat("#.00");
        Scanner sc=new Scanner(System.in);

        System.out.print("The amount invested:  ");
        double amount=sc.nextDouble();
        System.out.print("Annual interest rate: (输出小数)");
        double rate=sc.nextDouble();
        System.out.println("years"+"\t"+"Future Value");

        for (int i=1;i<=30;i++){
            System.out.println(i+"\t"+ df.format(futureInvestmentValue(amount,rate/12,i)));


        }

    }
}
