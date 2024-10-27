
public class Calculadora {
    public double sumar(int a, int b){
        return a + b;
    }

    public double restar(int a,int b){
        return a - b;
    }

    public double mult(int a,int b){
        return a * b;
    }

    public double div(int a,int b){
        if (b != 0) {
            return (double) a / b;
        }else{
            return 0;
        }
    }
    
}
