package Methods;

public class Overloading2 {
    static void multiply(int a,int b){
        System.out.println(a*b);
    }
    static void multiply(float a,int b){
        System.out.println(a*b);
    }
    public static void main(String[] args) {
        multiply(2,3);
        multiply(2.3f,6);
        
    }
    
}
