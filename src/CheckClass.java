import java.util.Scanner;


class CheckClass{

    static void charCheck(char input_char)
    {
        // CHECKING FOR ALPHABET 
        if ((input_char >= 65 && input_char <= 91))
            System.out.println ( " UpperCase ");
        else if ((input_char >= 97 && input_char <= 122))
            System.out.println ( " LowerCase ");

            // CHECKING FOR DIGITS
        else if (input_char >= 48 && input_char <= 57)
            System.out.println(" Digit ");

            // OTHERWISE SPECIAL CHARACTER
        else
            System.out.println ( " Special Character ");
    }

    // Driver Code 
    public static void main (String[] args)
    {

        Scanner scanner = new Scanner(System.in);
        char c = scanner.next().charAt(0);
        charCheck(c);

    }
} 