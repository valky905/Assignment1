import java.util.Scanner;

public class Iteration {

    public static void main(String args[]) {


        int n;

        Scanner s = new Scanner(System.in);

        n = s.nextInt();
        for(int i=1;i<=5;i++)
        {
            for(int j=1;j<=i;j++)
            {
                System.out.print(i);
            }
        }

    }

}