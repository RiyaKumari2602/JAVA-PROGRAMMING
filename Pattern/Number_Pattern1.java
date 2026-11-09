package Pattern;

public class Number_Pattern1 {
    public static void main(String[] args) {
        int n=5;
        for (int row=1;row<=n;row++){
            for(int col=1;col<=row;col++){
                System.out.print(col+" ");
            }
            System.out.println();
        }
    }
    
}
