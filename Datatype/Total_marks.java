import java.util.Scanner;

public class Total_marks {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the 1st marks: ");
        int m1=sc.nextInt();
        System.out.println("Enter the 2nd marks: ");
        int m2=sc.nextInt();
        System.out.println("Enter the 3rd marks: ");
        int m3=sc.nextInt();
        int Total_marks=m1+m2+m3;
        float Average_marks=Total_marks/3;
        float Percentage=(Total_marks*100)/300;
        
        System.out.println("Total marks: "+Total_marks);
        System.out.println("Average: "+Average_marks);
        System.out.println("Percentage: "+Percentage + "%");
        sc.close();
    }
    
}
