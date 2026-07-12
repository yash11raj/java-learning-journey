package Day5;

import java.util.Scanner;

public class SearchElement {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the numbers in an array:");
        int[] num= new int[5];
        for(int i=0;i<num.length;i++)
        {
            num[i]=sc.nextInt();
        }
        System.out.println("Which number do you want to search:");
        int nm=sc.nextInt();
       boolean found=false;
        for(int i=0;i<num.length;i++)
        {
            if(nm==num[i])
            {
                found=true;
                System.out.println("Number is at index "+i);
            }
        }
            if(found==false)
            {
                System.out.println("Number is not in the array");
            }   
    }
    }

