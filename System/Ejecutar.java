package System;
import java.util.Scanner;

public class Ejecutar
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        Conversion conversion = new Conversion();
        int opcion;
        System.out.println("Welcome to the Mi Desarrollo System units conversion system");
        System.out.println("These are our conversions options:");
        System.out.println("1:Km to miles\n2:Kilos to pounds\n3:Peso to Dollar\n4:Liters to ounces\n5:Exit");
        System.out.print("Choose:");
        opcion = scanner.nextInt();
        while (opcion!=5) {
            switch (opcion) {
                case 1:
                    System.out.print("Enter kilometers:");
                    int x = scanner.nextInt();
                    conversion.kmamilla(x);
                    break;

                case 2:
                    System.out.print("Enter kilos:");
                    x = scanner.nextInt();
                    conversion.klalibras(x);
                    break;

                case 3:
                    System.out.print("Enter Pesos:");
                    x = scanner.nextInt();
                    conversion.pesodolar(x);
                    break;

                case 4:
                    System.out.print("Enter liters:");
                    x = scanner.nextInt();
                    conversion.laoz(x);
                    break;
            }
            System.out.println("Enter y to continue or n to exit");
            Character pregunta = scanner.next().charAt(0);
            while (pregunta != 'n' || pregunta != 'y'){
                System.out.println(pregunta);
                if (pregunta == 'y'){
                    System.out.print("1:Km to miles\n2:Kilos to pounds\n3:Peso to Dollar\n4:Liters to ounces\n5:Exit\n");
                    System.out.print("Choose:");
                    opcion = scanner.nextInt();
                    break;
                } else if (pregunta == 'n'){
                    System.out.println("Thanks for using our conversion system");
                    break;
                } else {
                    System.out.println("Enter y to continue or n to exit");
                    pregunta = scanner.next().charAt(0);
                }
            }
            if (pregunta == 'n'){
                break;
            }
        }
    }
}
