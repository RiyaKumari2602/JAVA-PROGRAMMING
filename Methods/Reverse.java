package Methods;

public class Reverse {
    static int reverse(int n){
        int rev=0;
        while(n!=0){
            int digit=n%10;
            rev=rev*10+digit;
            n=n/10;
        }
        return rev;
    }
    public static void main(String[] args) {
        int result=reverse(1289);
        System.out.println(result);
        
    }
    
}
