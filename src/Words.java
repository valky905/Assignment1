import java.util.Scanner;
public class Words {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String text = input.nextLine();
        String r;
        r= text.toLowerCase( );
        for(int i=0;i< text.length();i++)
        {
            char c = r.charAt(i);

            if( (c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z'))
            {
                if(r.charAt(i)=='a'||r.charAt(i)=='e'|| r.charAt(i)=='i'||r.charAt(i)=='o'||r.charAt(i)=='u')
                {
                    System.out.println(r.charAt(i)+" Vowel");
                }
                else
                {
                    System.out.println(r.charAt(i)+" Consonent");
                }
            }
            else
            {
                System.out.println(c + " error message.");

            }
        }
    }
}