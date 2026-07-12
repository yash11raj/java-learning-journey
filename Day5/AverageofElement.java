package Day5;

import java.util.Scanner;

public class AverageofElement {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the numbers:");
        int[]num=new int[5];
        for(int i=0;i<num.length;i++)
        {
            num[i]=sc.nextInt();
        }
        System.out.println("Average of all numbers are:");
       
        int sum=0;
        for(int i=0;i<num.length;i++)
        {
            sum=sum+num[i];
          
        }
         int avg=sum/num.length;
        
        System.out.println(avg);
        
    }
    
}
