import java.util.Scanner;

public class Total_bill {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the price of the product: ");
        int price=sc.nextInt();
        System.out.println("Enter the quantity of product: ");
        float quantity=sc.nextFloat();
        float Total_bill=price*quantity;
        System.out.println("Total bill of product: "+Total_bill);
        sc.close();
    }
    
}
