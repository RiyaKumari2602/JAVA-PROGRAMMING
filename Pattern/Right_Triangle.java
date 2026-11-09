package Pattern;

public class Right_Triangle {
    public static void main(String[] args) {
        int n=5;
        for(int row=1;row<=n;row++){
            //col->1 to value of row
            for(int col=1;col<=row;col++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    
}
