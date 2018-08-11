package banco;
import java.util.Scanner;
public class Banco {
    public static void main(String[] args) {
        // TODO code application logic here
        double saldo_cliente = 0;
        int opcion = 0;
        Scanner entrada = new Scanner(System.in);
        do{
        System.out.println("Menu");
        System.out.println("0 - Salir");
        System.out.println("1 - Consultar");
        System.out.println("2 - Depositar");
        System.out.println("3 - Retirar");
        opcion = entrada.nextInt();
        switch(opcion){
            case 0://salir del programa
                System.out.println("Fin del programa \nAdios....");
                break;
            case 1://Consultar saldo
                System.out.println("Tu saldo es de: " + saldo_cliente);
                break;
            case 2://Depositar
                System.out.println("Ingresa la cantidad a depositar: " );
                double deposito = entrada.nextDouble();
                saldo_cliente = saldo_cliente + deposito; 
                break;                
            case 3://Retirar saldo
                System.out.println("Ingresa la cantidad a retitirar: " );
                  double retiro = entrada.nextDouble();
                  if(retiro <= saldo_cliente){
                      saldo_cliente = saldo_cliente - retiro;
                      
                  }else{System.out.println("No puedes retirar esa cantidad" );}
                break;   
            default:
                System.out.println("Numero/Letra no valido. Intenta de nuevo" );
                break; 
        }
        }while(opcion != 0);
        switch(opcion){
        }
        entrada.close();
        //System.out.println("La opcion que eligiste es: " + opcion);
    }
}
