import  java.util.*;
public class loop {
    public static void main(String[] args) {
        int num;
        System.out.println("Enter the number:");

        Scanner sc = new Scanner(System.in);
        num = sc.nextInt();

        for (int i=1; i<= num ; i++)
        {
            for (int j =1; j<=i; j++)
            {
                System.out.print(""+ i +" ");

            }
        }
        sc.close();
    }
}