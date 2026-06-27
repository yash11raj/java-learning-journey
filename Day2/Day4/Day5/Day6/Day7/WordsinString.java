package Day2.Day4.Day5.Day6.Day7;

import java.util.Scanner;

public class WordsinString {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter any sentnce:");
        String str =sc.nextLine();
        int word=1;
        for(int i=0;i<str.length();i++)
        {
            String spc=" ";
            if(str.charAt(i)==' ')
            {
              word++;
            }
        }
        System.out.println("Total words ="+word);
    }
    
}
