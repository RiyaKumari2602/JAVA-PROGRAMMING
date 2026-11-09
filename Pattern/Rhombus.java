package Pattern;

public class Rhombus {
    public static void main(String[] args) {
        int n=5;
        for(int row=1;row<=n;row++){
            //for spaces
            for(int col=1;col<=n-row;col++){
                System.out.print(" ");
            }
            //for stars
            for(int col=1;col<=n;col++){
                System.out.print("* ");
            }
            //move to next row
            System.out.println();
        }
    }
    
}
