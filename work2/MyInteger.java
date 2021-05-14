package work2;

public class MyInteger {
    private int value;

    public MyInteger(int value) {
        this.value = value;
    }

    public MyInteger() {
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }
    public static boolean isEven(int n){  //偶数
        if(n%2==0)
            return true;
        else return false;
    }
    public static boolean isOdd(int n){
        if(n%2==1)
            return true;
        else return false;
    }
    public boolean isEven(){
        return isEven(this.value);
    }
    boolean isOdd(){
        return isOdd(this.value);
    }
    public static boolean isPrime(int n){
        int flag=1;
        for (int i=2;i<n/2;i++){
            if(n%i==0)
                flag=0;
        }
       if(flag==1)
           return true;
       else return false;
    }
    public boolean isPrime(){
        return isPrime(this.value);
    }
    public boolean equals(int n){
        if(value==n)
            return true;
        else return false;
    }
    public boolean equals(MyInteger MI2){
        if(this.value==MI2.value)
            return true;
        else return false;
    }
    public static int parseInt(char a[]){
        int b=0;
        for(int i=0;i<a.length;i++)
            b=b*10+a[i];
        return b;
    }
    public static int parseInt(String s){
        return Integer.valueOf(s);
    }
}
