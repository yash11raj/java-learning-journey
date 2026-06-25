package Day2.Day4.Day5;

import java.util.Scanner;

public class SmallestElement {
    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);
        System.out.println("Enter the number:");
        int[] num= new int [5];
        for(int i=0;i<num.length;i++)
        {
            num[i]=sc.nextInt();
        }
        int smallest=num[0];
          for(int i=0;i<num.length;i++)
          {
            if(num[i]<smallest)
          {
            smallest=num[i];
          }
        }
           System.out.println("Smallest element is "+smallest);
    }
    
}
