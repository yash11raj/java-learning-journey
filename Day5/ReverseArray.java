package Day5;

import java.util.Scanner;

public class ReverseArray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
         System.out.println("Enter 5 numbers:");
        int []num=new int[5];
        for(int i=0;i<num.length;i++)
        {
          num[i]=sc.nextInt();
        }
        System.out.println("Reverse of an array is:");
        for(int i=num.length-1;i>=0;i--)
        {
            System.out.println(num[i]);
    }
}  
}
