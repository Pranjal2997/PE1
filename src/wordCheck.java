import java.util.Scanner;
public class wordCheck {
    public static void main(String[] args) {

        int i;
        System.out.println("Enter the word or letter");

        Scanner sc = new Scanner(System.in);
        String word = sc.nextLine();
        String word1 = word.toUpperCase();
        char[] letters = word1.toCharArray();

        for (char c : letters) {
            switch (c) {
                case 'A':
                case 'E':
                case 'I':
                case 'O':
                case 'U':

                    System.out.println("Vowel");
                    break;
                case 'B':
                case 'C':
                case 'D':
                case 'F':
                case 'G':
                case 'H':
                case 'J':
                case 'K':
                case 'L':
                case 'M':
                case 'N':
                case 'P':
                case 'Q':
                case 'R':
                case 'S':
                case 'T':
                case 'V':
                case 'W':
                case 'X':
                case 'Y':
                case 'Z':
                    System.out.println("Consonent");
                    break;
                default:
                    System.out.println("Not a letter");
                    break;
            }
        }

        sc.close();

    }
}