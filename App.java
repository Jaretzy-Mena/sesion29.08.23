import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        //Condicional Switch
        Scanner lector =new Scanner(System.in);
        System.out.println("Menu de opciones");
        System.out.println("1) Sumar");
        System.out.println("2) Restar");
        System.out.println("3) Multiplicar");
        System.out.println("4) Dividir");
        System.out.println("5) Salir");
        byte opc = lector.nextByte();
        double ValorA, ValorB, resultado, cociente = 0.0;
        
        switch(opc){
            case 1:
                System.out.println("1) Sumar");
                System.out.print("a: ");
                ValorA = lector.nextDouble();
                System.out.print("b: ");
                ValorB = lector.nextDouble();
                resultado=(ValorA+ValorB);
                System.out.println("La suma de "+ValorA+" + "+ValorB+" = "+resultado);
                break;
            case 2:
                System.out.println("2) Restar");
                System.out.print("a: ");
                ValorA = lector.nextDouble();
                System.out.print("b: ");
                ValorB = lector.nextDouble();
                resultado=(ValorA-ValorB);
                System.out.println("La diferencia de "+ValorA+" - "+ValorB+" = "+resultado);
                break;
            case 3:
                System.out.println("3) Multiplicar");
                System.out.print("a: ");
                ValorA = lector.nextDouble();
                System.out.print("b: ");
                ValorB = lector.nextDouble();
                resultado=(ValorA*ValorB);
                System.out.println("El producto de "+ValorA+" x "+ValorB+" = "+resultado);
                break;
            case 4:
                System.out.println("4) Dividir");
                System.out.print("a: ");
                ValorA = lector.nextDouble();
                System.out.print("b: ");
                ValorB = lector.nextDouble();
                if(ValorB==0){
                    System.out.println("El valor no puede ser 0.");
                }else{
                    cociente=(ValorA/ValorB);
                    System.out.println("El cocinete de "+ValorA+" / "+ValorB+" = "+cociente);                
                }
                
                break;
            case 5:
                System.out.println("Saliendo de la app");
                break;            
            default:
                System.out.println("Opción incorrecta/No valida");
                System.out.println("Saliendo de la app");
            break;

        }
        lector.close();
    }
}
