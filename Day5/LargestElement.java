package Day5;

import java.util.Scanner;

public class LargestElement {
    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);
        System.out.println("Enter the number:");
        int[] num= new int [5];
        for(int i=0;i<num.length;i++)
        {
            num[i]=sc.nextInt();
        }
        int largest=num[0];
          for(int i=0;i<num.length;i++)
          {
            if(num[i]>largest)
          {
            largest=num[i];
          }
        }
           System.out.println("Largest element is "+largest);
    }
    
}
