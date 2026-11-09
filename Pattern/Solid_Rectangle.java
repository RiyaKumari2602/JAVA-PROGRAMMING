package Pattern;

public class Solid_Rectangle {
    public static void main(String[] args) {
        int n=3;
        //print rows
        for(int row=1;row<=n;row++){
            //print columns
            for(int col=1;col<=5;col++){
                //print pattern
                System.out.print("*");
            }
            //move to next row
            System.out.println();
        }
    }
    
}
