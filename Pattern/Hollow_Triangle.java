package Pattern;

public class Hollow_Triangle {
    public static void main(String[] args) {
        int n=6;
        for(int row=1;row<=n;row++){
            if(row==1||row==2||row==n){
                for(int col=1;col<=row;col++){
                    System.out.print("* ");
 
                    }
                }
            else{
                //1 star
                System.out.print("* ");
                // for spaces
                for(int col=1;col<=(row-2);col++){
                    System.out.print("  ");
                }
                // for 1 star
                System.out.print("* ");
            }
            System.out.println();
            }
        }
    }
    

