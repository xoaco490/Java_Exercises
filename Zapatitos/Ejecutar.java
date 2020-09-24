package Zapatitos;
import java.util.Scanner;
public class Ejecutar {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese la cantidad de vendedores");
        int cantVendedores = scanner.nextInt();
        Vendedor vendedor[] = new Vendedor[cantVendedores];
        for(int i = 0;i<cantVendedores;i++){
            System.out.println("Ingrese nombre");
            String nombre = scanner.next();
            System.out.println("Ingrese especialidad");
            scanner.nextLine();
            String especialidad = scanner.nextLine();
            System.out.println("Ingrese sucursal");
            String sucursal = scanner.next();
            System.out.println("Ingrese ventas");
            int ventas = scanner.nextInt();
            System.out.println("Ingrese total de dinero recaudado");
            int dinero = scanner.nextInt();
            vendedor[i] = new Zapatitos.Vendedor(nombre,especialidad,sucursal,ventas,dinero);
        }
        int respuestaSelec = 0,x;
        while (respuestaSelec!=4){
            System.out.println("¿Que desea hacer?\n1:Consultar datos\n2:Sumar ventas\n3:Subir especialidad\n4:Salir");
            respuestaSelec = scanner.nextInt();
            switch (respuestaSelec){
                case 1:
                    //(Preguntar como simplificar)
                    for(x=0;x<cantVendedores;x++){
                        System.out.println((x+1)+":"+vendedor[x].getNombre());
                    }
                    System.out.println("¿De quien desea consultar los datos?");
                    int selecVendedor=scanner.nextInt();
                    vendedor[selecVendedor-1].getInfoVendedor();
                    break;
                case 2:
                    for(x=0;x<cantVendedores;x++){
                        System.out.println((x+1)+":"+vendedor[x].getNombre());
                    }
                    System.out.println("¿A quien desea agregar ventas?");
                    selecVendedor=scanner.nextInt();
                    System.out.println("Cantidad de ventas:");
                    int newVentas=scanner.nextInt();
                    System.out.println("Total de dinero recaudado:");
                    int newTotalDinero=scanner.nextInt();
                    vendedor[selecVendedor-1].addVentas(newVentas,newTotalDinero);
                    break;
                case 3:
                    for(x=0;x<cantVendedores;x++){
                        System.out.println((x+1)+":"+vendedor[x].getNombre());
                    }
                    System.out.println("¿A quien desea subir de especialidad?");
                    selecVendedor=scanner.nextInt();
                    vendedor[selecVendedor-1].nextEspec();
                default:
                    System.out.println("Opcion incorrecta");
                    break;
            }
        }
    }
}
