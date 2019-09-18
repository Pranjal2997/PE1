import java.io.*;
import java.util.Scanner;
class check {  static void charCheck(char a)
{
    // CHECKING FOR ALPHABET
    if ((a >= 65 && a <= 90) )
        System.out.println(" Capital Alphabet ");
    else if ( (a >= 97 && a <= 122))
        System.out.println(" Small Alphabet ");
        // DIGITS
    else if (a >= 48 && a <= 57)
        System.out.println(" Digit ");
        // SPECIAL CHARACTER
    else
        System.out.println(" Special Character ");
}
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        String b = in.nextLine();
        char[] a = b.toCharArray();
        for(int i=0; i< a.length;i++)
        {
            charCheck(a[i]);
        }

    }
}