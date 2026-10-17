package Nested_if;

import java.util.Scanner;

public class Practice1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the username: ");
        String username=sc.nextLine();
        if(username.equals("admin")){
            System.out.println("Enter the password: ");
            String password=sc.nextLine();
        
            if(password.equals("123abc")){
                System.out.println("login successfull");
            }
            else{
                System.out.println("invalid password");
            }
        }
        else{
            System.out.println("invalid username");
        }
        sc.close();

    }
    
}
