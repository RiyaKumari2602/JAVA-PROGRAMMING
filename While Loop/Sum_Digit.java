package Loop;

import java.util.Scanner;

public class Sum_Digit {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n=sc.nextInt();
        int s=0;
        int digit=0;
        while (n!=0){
            digit=n%10;
            s=s+digit;
            n=n/10;
        }
        System.out.println("Sum of number: "+s);
        sc.close();
    }
    
}
