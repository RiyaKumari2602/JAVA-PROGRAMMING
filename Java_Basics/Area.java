import java.util.Scanner;
public class Area {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the length: ");
        int length =sc.nextInt();
        System.out.println("Enter the breadth: ");
        int breadth =sc.nextInt();
        int Area=length*breadth;
        System.out.println("Area of rectangle: "+Area);
        sc.close();

    }
    
}
