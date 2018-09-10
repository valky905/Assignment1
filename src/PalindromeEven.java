package main.java;

import java.util.Scanner;


public class PalindromeEven

{

    public static void main(String args[])

    {


        int number;

        Scanner s = new Scanner(System.in);

        number = s.nextInt();

       int  m = number;
       int rev=0;
       int sum=0;
       int digit;

        while(m > 0)

        {

            digit = m % 10;
            if(digit%2==0)
            {
                sum=sum+digit;
            }

            rev = rev* 10 + digit;

            m = m / 10;

        }

        if(rev == number)

        {

            System.out.print( number +" is Palindrome ");
            if(sum>25)
            {
                System.out.println( "and the sum of even numbers is greater than 25");
            }
            else
            {
                System.out.println( "and the sum of even numbers is less than 25");

            }

        }

        else

        {

            System.out.println(number +" is Not Palindrome");

        }

    }

}