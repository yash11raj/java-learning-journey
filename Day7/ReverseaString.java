package Day7;

import java.util.Scanner;

public class ReverseaString {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter any string:");
        String str=sc.nextLine();
        for(int i=str.length()-1;i>=0;i--)
        {
           System.out.print(str.charAt(i));
        }
    }
    
}
