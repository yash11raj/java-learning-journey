package Day2.Day4.Day5.Day6.Day7;

import java.util.Scanner;

public class VowelsInString {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter any string:");
        String str=sc.nextLine();
         int count=0;
        for(int i=0;i<str.length();i++)
        {
            if(str.charAt(i)=='a'||str.charAt(i)=='A'||str.charAt(i)=='e'||str.charAt(i)=='E'||str.charAt(i)=='i'||str.charAt(i)=='I'||str.charAt(i)=='o'||str.charAt(i)=='O'||str.charAt(i)=='u'||str.charAt(i)=='U')
            {
                count++;
            }
        }
        System.out.println("Total no of vowels are: "+count); 
}
}
