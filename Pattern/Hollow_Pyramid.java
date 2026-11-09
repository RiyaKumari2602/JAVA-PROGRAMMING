package Pattern;

public class Hollow_Pyramid {
    public static void main(String[] args) {
        int n=5;
        for(int row=1;row<=n;row++){
            for(int col=1;col<=n-row;col++){
                //for spaces
                System.out.print("  ");
            }
            if(row==1||row==n){
                for(int col=1;col<=2*row-1;col++){
                    System.out.print("* ");
                }
            }
            else{
                System.out.print("* ");
                for(int col=1;col<=2*row-3;col++){
                    System.out.print("  ");
                }
                System.out.print("* ");
            }
        System.out.println();
        }
    }
    
}
