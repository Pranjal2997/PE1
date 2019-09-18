import java.lang.*;
import java.io.*;
import java.util.*;
public class sortNumber{
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        long n=sc.nextLong();
        String str= sortString(String.valueOf(n));
        long result = Long.parseLong(str);
        System.out.println(result);
        sc.close();
    }
    public static String sortString(String inputString)
    {
        // convert input string to char array
        char tempArray[] = inputString.toCharArray();
        // sort tempArray
        Arrays.sort(tempArray);
        // return new sorted string
        return new String(tempArray);
    }
}