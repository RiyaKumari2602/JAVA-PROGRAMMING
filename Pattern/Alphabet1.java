package Pattern;

public class Alphabet1 {
    public static void main(String[] args) {
        int n=5;
        for(int row=1;row<=n;row++){
            for(int col=1;col<=row;col++){
                int a=col;
                int b=('A'-1);
                int ans=a+b;
                char finalAns=(char)ans;
                System.out.print(finalAns+" ");
            }
            System.out.println();
        }
    }
    
}
