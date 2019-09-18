import java.util.Scanner;

public class GuessNumber {
    public static void main(String[] args) {
        int orig = 31;
        int range=50;
        System.out.println("Enter a number :");
        Scanner sc =new Scanner(System.in);
        int num = sc.nextInt();

        while (num!= orig)
        {
            if (num > orig+range/2)
            {
                System.out.println("Number guessed is more than original number");
                num = sc.nextInt();
            }
            else if(num < orig-range/2){
                System.out.println("Number guessed is less than original number");
                num = sc.nextInt();
            }
            else{
            System.out.println("Number guessed is in the range");
            num = sc.nextInt();
        }
        }
        System.out.println("Number guessed matches the original number.");
    }
}