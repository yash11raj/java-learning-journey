package Day2.Day4.Day5.Day6;

import java.util.Scanner;

public class SortElementInArray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the elements in an array:");
        int []num=new int[5];
        for(int i=0;i<num.length;i++)
        {
            num[i]=sc.nextInt();
        }
        boolean sorted=true;
        for(int i=0;i<num.length-1;i++)
        {
        if(num[i]>num[i+1])
        {
            sorted=false;
            break;
        }
    }
     
     if(sorted)
     {
       System.out.println("Elements are sorted");
     }
     else{
        System.out.println("Elements are not sorted");
     }
    }
    }
 
