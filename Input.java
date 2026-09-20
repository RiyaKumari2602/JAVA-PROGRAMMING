import java.util.Scanner;

public class Input {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int a=sc.nextInt();
        System.out.println("Enter another number: ");
        int b=sc.nextInt();
        int Sum=a+b;
        System.out.println("Sum of two number is: "+Sum);
       sc.close();
    
    }
    
}
