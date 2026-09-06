import java.util.Scanner;

public class Minute {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the second: ");
        int second=sc.nextInt();
        int minute=second/60;
        int sec=second%60;
        System.out.println("Minute and Second: "+minute+"min"+" "+sec+"sec");
        sc.close();
    }
    
}
