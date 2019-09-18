import java.lang.*;
import java.io.*;
import java.util.*;
public class sortrevn{
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        long n=sc.nextLong();
        String str= sortString(String.valueOf(n));
        long result = Long.parseLong(str);
        long  reversed = 0,sum=0;
        while(result != 0) {
            long digit = result % 10;
            if(digit%2==0){
                sum+=digit;
            }
            reversed = reversed * 10 + digit;
            result /= 10;
        }


        System.out.println(reversed);
       if(sum>=15){
           System.out.println("true");
       }
       else{
           System.out.println("false");
       }
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