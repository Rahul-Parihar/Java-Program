public class PowOfTwo {

    public static boolean isPowerOftwo(int n){
        return(n&(n-1))==0;
    }
    public static void main(String[] args) {
        System.out.println(isPowerOftwo(10));
        System.out.println(isPowerOftwo(16));
        
    }
    
}
