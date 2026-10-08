package If_else_Statement;

import java.util.Scanner;

public class Practice5 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n=sc.nextInt();

        if (n%3==0 && n%6==0){
            System.out.println("number is divisible by 3 and 6");
        }
        else{
            System.out.println("number is not divisible by 3 and 6");
        }
        sc.close();
    }
    
}
