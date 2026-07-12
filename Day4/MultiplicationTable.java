package Day4;

import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Which number multiplication table you want:");
        int n=sc.nextInt();
        System.out.println("Multiplication table of number is:");
        
      for(int i=1;i<=10;i++)
      {
        int multab=n*i;
        System.out.println(n+"*"+i+"="+multab);
      }
    }
    
}
