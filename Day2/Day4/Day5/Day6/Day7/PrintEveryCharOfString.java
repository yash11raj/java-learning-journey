package Day2.Day4.Day5.Day6.Day7;

import java.util.Scanner;

public class PrintEveryCharOfString {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the string:");
        String str=sc.nextLine();
         System.out.println("Every character of string are:");
        for(int i=0;i<str.length();i++)
        {
            System.out.println(str.charAt(i));
        }

    }
    
}
