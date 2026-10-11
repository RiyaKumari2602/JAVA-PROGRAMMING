package If_Else_if_Else_Statement;

import java.util.Scanner;

public class Practice2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the salary: ");
        int salary=sc.nextInt();
        double tax;

        if(salary>=50000){
            tax=salary*0.2;
            System.out.println("pay tax: "+tax);
        }
        else if(salary>=20000 && salary<50000){
            tax=salary*0.5;
            System.out.println("pay tax: "+tax);
        }
        else{
            System.out.println("no tax to pay");
        }
        sc.close();
    }
    
}
