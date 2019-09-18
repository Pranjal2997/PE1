import java.util.Scanner;

public class oddEven{
    public static void main(String[] args) {
        int num;
        Scanner sc = new Scanner(System.in);

        System.out.println("enter the number");

        num = sc.nextInt();
        if (num >20 && num <30)
        {
            if (num%2==0)
            {
                System.out.println("Jerry");
            }
            else
            {
                System.err.println("Tom");
            }
        }
        else{
            System.err.println("Enter the number between 20 and 30");
        }
        sc.close();
    }
}
