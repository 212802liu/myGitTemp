package work2;

import java.util.Scanner;

public class text4 {

    public static boolean isConsecutiveFour(int [][] a){
        boolean flag = false;
        int i,j,k;
        for(i=0;i<a.length;i++)
            for(j=0;j<a[i].length;j++){
                if(i>2)   //竖行
                    if(a[i][j]==a[i-1][j]&&a[i-1][j]==a[i-2][j]&&a[i-2][j]==a[i-3][j]){
                        flag=true;
                        break;
                    }
                if(j>2)   //横行
                    if(a[i][j]==a[i][j-1]&&a[i][j]==a[i][j-2]&&a[i][j]==a[i][j-3]){
                        flag=true;
                        break;
                    }
                if(i>2&&j>2)    // "\"对角线
                    if(a[i][j]==a[i-1][j-1]&&a[i][j]==a[i-2][j-2]&&a[i][j]==a[i-2][j-2]) {
                        flag = true;
                        break;
                    }
                if(j>2&&(i<a.length-3))  //  "/"对角线
                    if(a[i][j]==a[i+1][j-1]&&a[i][j]==a[i+2][j-2]&&a[i][j]==a[i+3][j-3]) {
                        flag = true;
                        break;
                    }
            }
        return flag;
    }
   
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Please enter the number of rows and columns");
        int m=sc.nextInt();
        int n=sc.nextInt();
        int [][]a=new int[m][n];
        for(int i=0;i<m;i++)
            for(int j=0;j<n;j++)
                a[i][j]=sc.nextInt();

        System.out.println(isConsecutiveFour(a));
    }
}
