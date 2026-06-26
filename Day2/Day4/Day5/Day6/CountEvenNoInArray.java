package Day2.Day4.Day5.Day6;

import java.util.Scanner;

public class CountEvenNoInArray{
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the numbers:");
        int[] num=new int[5];
        for(int i=0;i<num.length;i++)
        {
            num[i]=sc.nextInt();
        }
        int count=0;
        for(int i=0;i<num.length;i++)
        {
            if(num[i]%2==0)
            {
              count++;
            }
        }
        System.out.println("Even number in an array are:");
         System.out.println(count);
            if(count==0)
            {
              System.out.println("No even number found");
            }
        }
    }

