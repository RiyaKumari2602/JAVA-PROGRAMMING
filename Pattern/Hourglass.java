package Pattern;

public class Hourglass {
    public static void main(String[] args) {
        int n=5;
        //upper half
        for(int row=1;row<=n;row++){
            //for spaces
            for(int col=1;col<=row-1;col++){
                System.out.print("  ");
            }
            //for stars
            for(int col=1;col<=2*n-2*row+1;col++){
                System.out.print("* ");
            }
            System.out.println();
        }

        //for lower half
        for(int row=1;row<=n;row++){
            if(row==1){
                continue;
            }
            //for spaces
            for(int col=1;col<=n-row;col++){
                System.out.print("  ");
            }
            //for stars
            for(int col=1;col<=2*row-1;col++){
                System.out.print("* ");
            }
            System.out.println();
        }

    }
}
