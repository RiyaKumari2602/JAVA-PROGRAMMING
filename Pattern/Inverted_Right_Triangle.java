package Pattern;

public class Inverted_Right_Triangle {
    public static void main(String[] args) {
        int n=5;
        for(int row=1;row<=n;row++){
            //col->n-row+1 to print star
            for(int col=1;col<=n-row+1;col++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    
}
