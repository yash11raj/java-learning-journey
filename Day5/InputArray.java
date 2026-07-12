package Day5;

import java.util.Scanner;

public class InputArray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter 5 numbers:");
        int []num=new int[5];
        for(int i=0;i<num.length;i++)
        {
          num[i]=sc.nextInt();
        }
        System.out.println("Array elements are:");
        for(int i=0;i<num.length;i++)
        {
            System.out.println(num[i]);
        }
}
}