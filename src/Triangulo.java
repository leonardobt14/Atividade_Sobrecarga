import java.text.DecimalFormat;

public class Triangulo {

    private double b,h;

    public Triangulo(double b,double h){
        this.b=b;
        this.h=h;

    }
    
    public double area (double h, double b){

        return 0;
    }
    
    public double area(){

        double area = (this.b* this.h)/2;
        return area;
    }
    
    public String exibe(){
        DecimalFormat formataNro= new DecimalFormat("#0.00");
        return "A Área do Triângulo é: "+ formataNro.format(area());
    }

}
