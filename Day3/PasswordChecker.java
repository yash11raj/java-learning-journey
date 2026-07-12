package Day3;

import java.util.Scanner;

public class PasswordChecker {
     public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the password:");
        String password= sc.nextLine();
        if(password.equals("admin123"))
        {
            System.out.println("Access granted");
        }
        else{
            System.out.println("Access denied");
        }
}
}
