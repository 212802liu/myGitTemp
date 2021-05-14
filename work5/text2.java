package work5;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class text2 {
    public static int max(ArrayList list){
        int max=0;
        if(list==null)
            return 0;
        for (Object o : list) {
            if(max<(int) o)
                max=(int) o;
        }
        return max;
    }
    public static void main(String[] args) {
        //List<Integer>
        ArrayList<Integer>list = new ArrayList<>();
        int i;
        Scanner sc =new Scanner(System.in);
        i=sc.nextInt();
        while (i!=0){
            list.add(i);
            i=sc.nextInt();
        }

        System.out.println(max(list));

    }
}
