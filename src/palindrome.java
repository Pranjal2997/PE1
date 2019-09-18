import java.util.*;
public class palindrome{
    public static void main(String[] args) {
        int num1;
        int original;
        int original1;
        int sum = 0;
        int rev = 0;
        int remainder, remainder1;

        System.out.println("Enter the number: ");
        Scanner sc = new Scanner(System.in);
        num1 = sc.nextInt();
        original = num1;
        original1  = num1;
        while(num1!=0)
        {
            remainder = num1 % 10;
            rev = rev * 10 + remainder;
            num1 = num1/10;
        }

        if (rev == original)
        {   System.out.println("Yes it is a palindrome.");
            while(original1> 0)
            {
                remainder1 = original1 % 10;
                if (remainder1%2 == 0)
                {
                    sum = sum + remainder1;

                }
                original1 = original1/10;
            }
            if (sum > 25 )
            {
                System.out.println("The sum is greater than 25.");
            }
            else{
                System.out.println("Sum is less than 25.");
            }
        }
        else
        {
            System.out.println("It is not a Palindrome.");
        }
    }
}