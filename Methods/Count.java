package Methods;

public class Count {
    static int count(int n){
        int count=0;
        while(n!=0){
            //int digit=n%10;
            count++;
            n=n/10;
        }
        return count;
    }
    public static void main(String[] args) {
         int result=count(1234);
         System.out.println(result);
        
    }
    
}
