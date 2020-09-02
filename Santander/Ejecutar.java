package Santander;
import java.util.Scanner;
public class Ejecutar
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        Sistemas sistemas = new Sistemas();
        System.out.print("Bienvenido a el sistema santander porfavor ingrese su nombre:");
        String nnombre = scanner.next();
        sistemas.renombre(nnombre);
        int opcion;
        System.out.println("Bienvenido, "+nnombre+" ¿Que operacion desea realizar?");
        System.out.print("1:Ingreso/Retiro\n2:Cambio de titular\n3:Consulta de saldo\n4:Salir\nIngrese:");
        opcion = scanner.nextInt();
        while (opcion!=4)
        {
            switch (opcion)
            {
                case 1:
                    System.out.println("Ingrese la cantidad a ingresar/retirar de la cuenta");
                    int cant = scanner.nextInt();
                    sistemas.ingresoretiro(cant);
                    break;
                case 2:
                    System.out.print("Ingrese el nuevo titular: ");
                    nnombre = scanner.next();
                    sistemas.renombre(nnombre);
                    break;
                case 3:
                    sistemas.consulta();
                    break;
            }
            System.out.println( nnombre +" ¿Que operacion desea realizar?");
            System.out.print("1:Ingreso/Retiro\n2:Cambio de titular\n3:Consulta de saldo\n4:Salir\nIngrese:");
            opcion = scanner.nextInt();
        }
        System.out.println("Gracias por utilizar nuestros servicios ,"+nnombre);
    }
}
