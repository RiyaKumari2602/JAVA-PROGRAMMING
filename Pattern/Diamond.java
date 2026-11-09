package Pattern;

public class Diamond {
    public static void main(String[] args) {
        //for upper half
        int n=5;
        for(int row=1;row<=n;row++){
            //for spaces
            for(int col=1;col<=n-row;col++){
                System.out.print("  ");
            }
            //for stars
            for(int col=1;col<=row*2-1;col++){
                System.out.print("* ");
            }
            System.out.println();
        }

        //for lower half
        for(int row=1;row<=n;row++){
            //to skip 1st row
            if(row==1){
                continue;
            }
            //for spaces
            for(int col=1;col<=row-1;col++){
                System.out.print("  ");
            }
            //for stars
            for(int col=1;col<=(2*n-2*row+1);col++){
                System.out.print("* ");
            }
            System.out.println();

        }
    }
    
}
