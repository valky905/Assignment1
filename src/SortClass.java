import java.util.Scanner;
import java.util.Arrays;


public class SortClass{


    public static void main(String args[]) {




        Scanner s = new Scanner(System.in);

       String  inputString= s.nextLine();
        char tempArray[] = inputString.toCharArray();


        // sort tempArray
        Arrays.sort(tempArray);
        int sum=0;
        for(int i = tempArray.length - 1; i >= 0; i--) {

            System.out.print(tempArray[i]);
            int a=Character.getNumericValue(tempArray[i]);
            if(a%2==0)
                sum=sum+a;
        //    System.out.println(sum);


        }
        System.out.println();
        System.out.println("sum of even numbers "+sum);


        if(sum>15)
            System.out.println("true");
        else
            System.out.println("false");




    }

}