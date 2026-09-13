import java.util.Scanner;

public class Typecasting {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value : ");
        int a=sc.nextInt();
        System.out.println("Enter the value: ");
        float b=sc.nextFloat();
        a=(int)b;
        System.out.println(a);
        System.out.println(b);
        sc.close();

    }
    
}
