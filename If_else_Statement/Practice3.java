package If_else_Statement;

import java.util.Scanner;

public class Practice3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the age: ");
        int age=sc.nextInt();

        if(age>=18){
            System.out.println("Eligible for vote");

        }
        else{
            System.out.println("not eligible for vote");
        }
        sc.close();

    }
}
