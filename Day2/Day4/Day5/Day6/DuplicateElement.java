package Day2.Day4.Day5.Day6;

import java.util.Scanner;

public class DuplicateElement {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the elements in an array:");
        int[]num=new int[5];
        for(int i=0;i<num.length;i++)
        {
            num[i]=sc.nextInt();
        }
        boolean duplicate=false;
        for(int i=0;i<num.length;i++)
        {
            for(int j=i+1;j<num.length;j++)
            {
                if(num[i]==num[j])
                {
                   duplicate=true;
                   System.out.println("Duplicate element is "+num[i]);
                   break;
                }
            }
        }
        if(duplicate==false)
        {
            System.out.println("No duplicate eleements found");
        }
    }
    
}
