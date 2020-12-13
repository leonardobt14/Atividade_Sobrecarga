import java.text.DecimalFormat;

public class Quadrado {
    private double b,h;

    public Quadrado(double b, double h){
        this.b=b;
        this.h=h;

    }
    
    public double area(double b, double h){
        return 0;
    }
    
    public double area(){
        double area = this.b*this.h;
        return area;
    }
    
    public String exibe(){
        DecimalFormat formataNro= new DecimalFormat("#0.00");
        return "A Área do Quadrado é: "+ formataNro.format(area());
    }
}
