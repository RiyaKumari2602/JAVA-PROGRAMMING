package If_else_Statement;

import java.util.Scanner;

public class Practice1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n=sc.nextInt();

        if (n>=0){
            System.out.println("Number is positive");
        
        }
        else{
            System.out.println("number is negative");
        }
        sc.close();
    }
    
}
