package work2;
import java.util.Date;
public class Account {
    private int id;
    private double balance;
    private double annualInterestRate;
    private Date dateCreated;
    public Account() {
    }
    public Account(int id, double balance, double annualInterestRate, Date  dateCreated) {
        this.id = id;
        this.balance = balance;
        this.annualInterestRate = annualInterestRate;
        this.dateCreated= dateCreated;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getAnnualInterestRate() {
        return annualInterestRate;
    }

    public void setAnnualInterestRate(double annualInterestRate) {
        this.annualInterestRate = annualInterestRate;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void getmoney(double money){
        balance-=money;
    }
    public void putmoney(double money){
        balance+=money;
    }

    public  double getMonthlyInterestRate(){
        return annualInterestRate/12;
    }
    public String toStr(){
        return dateCreated.toString();
    }


}
