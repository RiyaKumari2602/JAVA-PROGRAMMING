package Loop;

import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n=sc.nextInt();
        int s=0;
        for(int i=1;i<=n;i++){
            if (i%2!=0){
               s=s+i;
            }
        }
        System.out.println("Sum of odd number: "+s);
        sc.close();
    }
    
}
