public class methodOverloading {
    public static void main(String[] args) {

        Calculator calc=new Calculator();
        System.out.println(calc.sum(2, 1));
        System.out.println(calc.sum((float)8.2, (float)7.5));
        System.out.println(calc.sum(6, 64, 7));
        
    }
    
}

class Calculator{
    int sum(int a,int b){
        return a+b;
    }

    float sum(float a, float b){
        return a+b;
    }

    int sum (int a,int b, int c){
        return a+b+c;
    }
}
