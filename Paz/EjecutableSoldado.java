package Paz;
import java.util.Scanner;

public class EjecutableSoldado {
    public static void main(String[] args) {
        Soldado soldado = new Soldado();
        Comandante comandante = new Comandante();
        Scanner scanner = new Scanner(System.in);

        int preg = 0;
        while (preg != 4) {
            System.out.println("¿Que desea?\n1:Entrenar soldado\n2:Mision de paz\n3:Consular Exp\n4:Salir");
            preg = scanner.nextInt();
            switch (preg){
                case 1:
                    int dias;
                    System.out.println("Ingrese la cantidad de dias de la practica");
                    dias= scanner.nextInt();
                    soldado.practicaMilitar(dias);
                    break;

                case 2:
                    int diaspaz;
                    System.out.println("Ingrese la cantidad de dias de la mision de paz");
                    diaspaz = scanner.nextInt();
                    comandante.apto(diaspaz, soldado);
                    break;

                case 3:
                    soldado.consultaExp();
                    break;

                case 4:
                    System.out.println("Gracias por usar");
                    break;

                default:
                    System.out.println("Seleccion incorrecta");
            }
        }
        scanner.close();
    }
}
