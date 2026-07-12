package Day7;

import java.util.Scanner;

public class PalindromeString {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter ant string:");
        String str=sc.nextLine();
        String reverse="";
        for(int i=str.length()-1;i>=0;i--)
        {
            reverse=reverse+str.charAt(i);
        }
        if(reverse.equals(str))
        {
            System.out.println("Palindrome string");
        }
        else
            System.out.println("Not a palindrome string");
    }
    
}
