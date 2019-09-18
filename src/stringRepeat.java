import java.util.Scanner;

public class stringRepeat{
    public static void main(String[] args) {
        System.out.println("Enter the string which you want to repeat: ");
        Scanner sc = new Scanner(System.in);
        String  word = sc.nextLine();
        System.out.println("Enter number of time to repeat: ");
        char[] letters = word.toCharArray();
        int num = sc.nextInt();
        System.out.print(word);
        for (int i=0 ;i < num; i++)
        {
            for(int j=letters.length-num;j<=letters.length-1;j++)
                System.out.print(letters[j]);
        }
    }
}