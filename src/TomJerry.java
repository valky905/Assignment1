import java.util.Scanner;

public class TomJerry {

    public static void main(String args[]) {


        int number;

        Scanner s = new Scanner(System.in);

        number = s.nextInt();
        if(number>=20 && number<=30)
        {
            if(number%2==0)
            {
                System.out.println("Jerry");
            }
            else
            {
                System.out.println("Tom");
            }
        }
    }

}
