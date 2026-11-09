package Pattern;

public class Right_Aligned_Triangle {
    public static void main(String[] args) {
        int n=4;
        for(int row=1;row<=n;row++){
            //for spaces
            for(int col=1;col<=n-row;col++){
                System.out.print("  ");
            }
            //for stars
            for(int col=1;col<=row;col++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
