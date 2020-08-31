package AutoConstructor;
import java.util.Scanner;

public class Ejecutable {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Auto auto = new Auto("Chevrolet",2009,"ABC 123");
        int resp = 0;
        while(resp!=5){
            System.out.println("¿Que desea cambiar?\n1:Marca\n2:Modelo\n3:Patente\n4:Info del auto\n5:Salir");
            resp = scanner.nextInt();
            //TODO buscar alguna forma de evitar que el usuario pueda equivocarse nuevamente al ingresar patente/modelo
            switch (resp) {
                case 1:
                    System.out.println("Ingrese nueva marca:");
                    scanner.nextLine();
                    String newMarca = scanner.nextLine();
                    auto.cambiarMarca(newMarca);
                    break;
                case 2:
                    System.out.println("Ingrese nuevo modelo");
                    int newModelo = scanner.nextInt();
                    auto.cambiarModelo(newModelo);
                    break;
                case 3:
                    //TODO error a la hora de querer cambiar variables!!!!
                    System.out.println("Ingrese nueva patente");
                    //scanner.nextInt(); deja un espacio de linea sin saltar por lo tanto utilizo nextLine(); antes para saltarlo
                    scanner.nextLine();
                    String newPatente = scanner.nextLine();
                    auto.cambiarPatente(newPatente);
                    break;
                case 4:
                    auto.getInfoAuto();
                    break;
                case 5:
                    break;
                default:
                    System.out.println("Argumento incorrecto");
                    break;
                }
            }
        scanner.close();
    }
}
