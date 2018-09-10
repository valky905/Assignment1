import java.util.*;
import java.lang.*;

class Assign10

{
    public static void main (String[] args) throws java.lang.Exception

    {

        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int num = sc.nextInt();
        int len = str.length();
        String strr = str.substring(len-num,len);
        System.out.print(str);
        for(int i=0;i<num;i++)
            System.out.print(strr);



    }

}