import java.io.PrintStream;
import java.text.DecimalFormat;

public class Circulo {

    private double r,xc,yc;

    public Circulo(double xc, double yc){
           this.xc=xc;
           this.yc=yc;
    }
    
    public Circulo(double r, double xc,double yc){
         this.r=r;
         this.xc=xc;
         this.yc=yc;
    }

    public double area(){
        double r = this.r;
        double pi = 3.14159;
        double area = pi*(r*r);
        return area;
    }
    
    public double area(double r){
        return 0;
    }
    
    public String exibe(){
        DecimalFormat formataNro= new DecimalFormat("#0.00");
        return "a Área do Circulo é: "+ formataNro.format(area());
    }

}
