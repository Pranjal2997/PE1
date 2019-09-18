import  java.util.Scanner;
public class repeatedSum{
    public static void main(String[] args) {

        int num;
        int sum= 0;
        System.out.println("please enter a number: ");
        Scanner sc = new Scanner(System.in);
        while (sc.hasNextInt())
        {
            num = sc.nextInt();
            sum+=num;
            System.out.println("please enter another number: ");
            if (num==0)

                break;
        }
        if(!sc.hasNextInt())
        {
            System.out.println("Error! not an integer");
        }
        else
        {
            System.out.println("The sum is "+ sum);
        }


    }
}