package If_else_Statement;

import java.util.Scanner;

public class Practice2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n=sc.nextInt();

        if(n%2==0){
            System.out.println("Even number");
        }
        else{
            System.out.println("odd number");
        }
        sc.close();
    }
    
}
