package Day4;

import java.util.Scanner;

public class Armstrong {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the number:");
        int num=sc.nextInt();
        int original=num;
        int sum=0;
        for(;num>0;)
        {
           int digit=num%10;
           sum=sum+digit*digit*digit;
           num=num/10;
        }
        System.out.println(sum);
       
        if(sum==original)
        {
            System.out.println(sum+"is"+" Armstrong number");
        }
        
            else
            {
                System.out.println("Not a Armstrong number");
    }
    
}
}
        
        