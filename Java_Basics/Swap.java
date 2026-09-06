import java.util.Scanner;
public class Swap {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter 1st number: ");
        int a= sc.nextInt();
        System.out.println("Enter 2nd number: ");
        int b=sc.nextInt();
        int temp=a;
        a=b;
        b=temp;
        System.out.println("a: "+a+" "+"b: "+b);
        sc.close();
   }
    
}
