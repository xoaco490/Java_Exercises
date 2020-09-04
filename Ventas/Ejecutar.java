package Ventas;
import java.util.Scanner;
public class Ejecutar {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese al cantidad de vendedores");
        int cantVendedores = scanner.nextInt();
        Vendedor vendedor[] = new Vendedor[cantVendedores];
        for(int i = 0; i<cantVendedores;i++){
            System.out.println("Ingrese nombre");
            String nombre = scanner.next();
            System.out.println("Ingrese direccion");
            scanner.nextLine();
            String direccion = scanner.nextLine();
            System.out.println("Ingrese telefono");
            int telefono = scanner.nextInt();
            System.out.println("Ingrese mail");
            String mail = scanner.next();
            System.out.println("Ingrese numero de legajo");
            int legajo = scanner.nextInt();
            System.out.println("Ingrese ventas del mes de "+nombre);
            int ventasPorMes = scanner.nextInt();
            vendedor[i] = new Vendedor(nombre,direccion,telefono,mail,legajo,ventasPorMes);
        }
        int respuestaSelec = 0,selecVendedor = 0, x = 0;
        while (respuestaSelec!=3){
            System.out.println("¿Que desea hacer?\n1:Consultar datos\n2:Sumar ventas\n3:Salir");
            respuestaSelec = scanner.nextInt();
            switch (respuestaSelec){
                case 1:
                    x=0;
                    for(; x<cantVendedores;x++){
                        System.out.println((x+1)+":"+vendedor[x].getNombre());
                    }
                    System.out.println("De quien desea consultar los datos?");
                    selecVendedor = scanner.nextInt();
                    vendedor[selecVendedor-1].infoVendedor();
                    break;
                case 2:
                    x=0;
                    for(; x<cantVendedores;x++){
                        System.out.println((x+1)+":"+vendedor[x].getNombre());
                    }
                    System.out.println("A quien desea sumar ventas?");
                    selecVendedor = scanner.nextInt();
                    System.out.println("Cuantas ventas deseas sumar a "+vendedor[selecVendedor-1].getNombre());
                    int cantVentas = scanner.nextInt();
                    vendedor[selecVendedor-1].sumaVentas(cantVentas);
                    break;
                case 3:
                    break;
                default:
                    System.out.println("Incorrecto");
                    break;
            }
        }
    }
}
