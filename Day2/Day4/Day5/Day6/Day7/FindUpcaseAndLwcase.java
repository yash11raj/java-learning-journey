package Day2.Day4.Day5.Day6.Day7;

import java.util.Scanner;

public class FindUpcaseAndLwcase {
    public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter string in UPcase and LWcase");
    String str=sc.nextLine();
int upcount=0;
int lwcount=0;
for(int i=0;i<str.length();i++)
{
    char ch=str.charAt(i);
    if(ch>='A'&&ch<='Z')
    {
       upcount++;
    }
    if(ch>='a'&&ch<='z')
    {
        lwcount++;
    }
}
System.out.println("Upper case ="+upcount);
System.out.println("Lower case ="+lwcount);
    }
}

