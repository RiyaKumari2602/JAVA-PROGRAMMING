package If_Else_if_Else_Statement ;
import java.util.Scanner;
public class Practice1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the marks: ");
        int marks=sc.nextInt();

        if(marks>=90 && marks<100){
            System.out.println("A");
        }
        else if(marks>=80 && marks<90){
            System.out.println("B");
        }
        else if(marks>=70 && marks<80){
            System.out.println("C");
        }
        else{
            System.out.println("D");
        }
        sc.close();
    }
}

    

