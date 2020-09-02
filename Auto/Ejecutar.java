package Auto;
import java.util.Scanner;

public class Ejecutar 
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese la patente del auto(1994: ABC-123 o 2015 AB-123-CD): ");
        String patente = scanner.next();
        int patentelargo = patente.length();
        int minimomod = 0;
        switch(patentelargo){
            case 7:
                minimomod = 1994;
                break;
            case 9:
                minimomod = 2015;
                break;
            default:
                while(patentelargo != 7 || patentelargo != 9){
                    System.out.println("Patente incorrecta ingrese nuevamente: ");
                    patente = scanner.next();
                    patentelargo = patente.length();
                }
                break;
        }
        System.out.println("Ingrese modelo del auto"+"("+minimomod+"): ");
        int modelo = scanner.nextInt();
        switch(minimomod){
            case 1994:
            while(modelo < minimomod || modelo >= 2015)
            {
                System.out.println("Modelo incorrecto ingrese nuevamente: ");
                modelo = scanner.nextInt(); 
            }
            break;
            case 2015:
                while(modelo < minimomod)
                {
                    System.out.println("Modelo incorrecto ingrese nuevamente: ");
                    modelo = scanner.nextInt();  
                }
                break;
        }
        System.out.println("Ingrese marca: ");
        String marca = scanner.next();
        System.out.println("Ingrese color: ");
        String color = scanner.next();
        System.out.println();
        Auto auto1 = new Auto();
        auto1.auto(color, patente, marca, modelo);
        auto1.infoauto();
        scanner.close();
    }
}