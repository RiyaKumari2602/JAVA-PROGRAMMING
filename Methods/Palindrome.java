package Methods;

public class Palindrome {
    static boolean palindrome(int a){
        int temp=a;
        int rev=0;
        while(a!=0){
             int digit=a%10;
             rev=rev*10+digit;
             a=a/10;
        }
        if(temp==rev){
           return true;
        }
        else{
            return false;
        }
        
    }
    public static void main(String[] args) {
        boolean result=palindrome(121);
        System.out.println(result);
        
    }
    
}
