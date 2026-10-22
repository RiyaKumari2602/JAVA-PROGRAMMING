package Loop;

import java.util.Scanner;

public class Product {
    public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the number: ");
    int n=sc.nextInt();
    int p=1,d=0;
    while(n!=0){
        d=n%10;
        p=p*d;
        n=n/10;
    }
    System.out.println(p);
    sc.close();

    }
}
