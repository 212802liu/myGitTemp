package work2;

import java.util.Date;
public class text2 {
    public static void main(String[] args) {

        Account a;
        Date date = new Date();

        a=new Account(1122, 20000, 0.045,date);
        a.getmoney(2500);
        a.putmoney(3000);
        System.out.println("余额："+a.getBalance()+" 每月利息："+ 100*a.getMonthlyInterestRate()+"%"+"\n"+"创建此账户日期："+a.toStr());
    }
}
