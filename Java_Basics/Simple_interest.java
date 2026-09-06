import java.util.Scanner;

public class Simple_interest {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the principal: ");
        int p=sc.nextInt();
        System.out.println("Enter the rate: ");
        int r=sc.nextInt();
        System.out.println("Enter the time: ");
        int t=sc.nextInt();
        float SI=(p*r*t)/100;
        System.out.println("Simple interest: "+SI);
        sc.close();

    }
    
}
