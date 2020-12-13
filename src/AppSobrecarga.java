import java.util.Scanner;

public class AppSobrecarga {

    public static void main(String[] args) {
        Menu();
    }
    
    public static void Menu(){

        Scanner sc = new Scanner(System.in);
        int opcao;
        
        do {
            System.out.println("-------------------------------");
            System.out.println("        MENU DE OPÇÕES         ");
            System.out.println("-------------------------------");
            System.out.println("1 - Circulo");
            System.out.println("2 - Triângulo");
            System.out.println("3 - Quadrado");
            System.out.println("4 - Sair");
            System.out.println("-------------------------------");
            System.out.print("Escolha uma Opção: ");
            opcao= sc.nextInt();
            System.out.println("");
            
            if(opcao==1){
                double raio;
                System.out.print("Informe o raio do Circulo: ");
                raio=sc.nextDouble();
                Circulo circulo = new Circulo(raio,0,0);
                System.out.println("");
                System.out.println(circulo.exibe());
                System.out.println("");
            }
            
            else if(opcao==2){
                System.out.print("Informe a base do triangulo: ");
                double base = sc.nextDouble();
                System.out.print("Informe  a altura do triangulo: ");
                double altura = sc.nextDouble();
                Triangulo triangulo = new Triangulo(base,altura);
                System.out.println("");
                System.out.println(triangulo.exibe());
                System.out.println("");
            }
            
            else if (opcao==3) {
                System.out.print("Informe a base do Quadrado: ");
                double base = sc.nextDouble();
                System.out.print("Informe  a altura do Quadrado: ");
                double altura = sc.nextDouble();
                Quadrado quadrado=new Quadrado(base,altura);
                System.out.println("");
                System.out.println(quadrado.exibe());
                System.out.println("");
            }
            
            else if (opcao==4){
                System.out.println("Fim do Programa!");
            }
            
            else {
                System.out.println("Opção Inválida! Tente Novamente");
                System.out.println("");
            }
            
        }while (opcao!=4);


    }

}
