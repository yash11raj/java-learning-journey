package Day6;

import java.util.Scanner;

public class SecondLargestElement {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the numbers:");
        int[]num=new int[5];
        for(int i=0;i<num.length;i++)
        {
            num[i]=sc.nextInt();
        }
        int largest=num[0];
        int secondlargest=Integer.MIN_VALUE;
        for(int i=0;i<num.length;i++)
        {
          if(num[i]>largest)
        {
            secondlargest=largest;
            largest=num[i];
        }
       else if(num[i] > secondlargest && num[i] != largest)
            {
                secondlargest = num[i];
            }
     }
     System.out.println("Second largest number is: "+secondlargest);
    }
    
}
