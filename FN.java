// 下面这段代码是Marvin写的 
public class FN {
    
    public static void main(String[] args) {
     
        int n = 5;
        int fn = f(n);
        System.out.println(fn);
    }
    
    static int f(int n){
        
        if ( n == 1){
            return 2;    
        }

        int y = f(n-1) + 2; 
        return y;
    }
   
} 