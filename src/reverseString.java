import java.util.Scanner;

public class reverseString{
    public static void main(String[] args) {
        System.out.println("Enter the string which you want to reverse");
        Scanner sc = new Scanner(System.in);
        String  word = sc.nextLine();
        char[] letters = word.toCharArray();

        for (int i = letters.length-1; i>=0; i--)
            System.out.print(letters[i]);
    }
}