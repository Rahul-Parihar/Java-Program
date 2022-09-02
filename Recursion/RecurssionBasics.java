 public class RecurssionBasics {
    public static void PrintdecNo(int n){
        if(n==1){
            System.out.print(n);
            return;
        }
        System.out.print(n+" ");
        PrintdecNo( n-1);
    
    }
    public static void main(String[] args) {
        int n=10;
        PrintdecNo(n);
        
    }
    
}
