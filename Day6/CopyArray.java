package Day6;

import java.util.Scanner;

public class CopyArray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the nubers in an array:");
        int[]array=new int[5];
        int[]copy=new int[5];
        for(int i=0;i<array.length;i++)
        {
            array[i]=sc.nextInt();
        }
         System.out.println("Copy of an array is:");
         for(int i=0;i<copy.length;i++)
         {
            copy[i]=array[i];
            System.out.println(copy[i]);
         }
       
    }
    
}
