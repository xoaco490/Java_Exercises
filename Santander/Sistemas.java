package Santander;
import java.util.Scanner;
public class Sistemas
{
    private String nombre;
    private int saldo = 0;

    public void renombre(String nnombre)
    {
        nombre = nnombre;
    }
    public void ingresoretiro(int cantidad)
    {
        System.out.println("1:ingreso\n2:retiro");
        System.out.println("Desea ingresar el dinero o retirar, ingrese el numero correspondiente: ");
        Scanner scanner = new Scanner(System.in);
        int opcion = scanner.nextInt();
        while(opcion != 1 && opcion != 2) {
            System.out.println("Numero incorrecto ingrese nuevamente");
            opcion = scanner.nextInt();
        }
        switch (opcion){
            case 1:
                saldo = saldo + cantidad;
                System.out.println("EL DINERO FUE PROCESADO");
                break;
            case 2:
                if(opcion==2 && saldo==0) {
                System.out.println("ERROR USTED NO TIENE SUFICIENTE SALDO PARA RETIRAR\nSALDO:$"+saldo);
                break;
                }
                saldo = saldo - cantidad;
                System.out.println("EL DINERO FUE PROCESADO");

        }
    }
    public void consulta() {
        System.out.println("El usuario "+ nombre + " tiene $"+ saldo + " pesos en su cuenta");
    }
}