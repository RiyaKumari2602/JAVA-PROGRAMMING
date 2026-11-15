package Methods;

public class Factorial {
    static int fact(int a){
        int f=1;
        for(int i=1;i<=a;i++){
            f=f*i;
        }
        return f;
    }
    public static void main(String[] args) {
        int result=fact(4);
        System.out.println("Factorial: "+result);
        
    }
    
}
