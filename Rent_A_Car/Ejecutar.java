package Rent_A_Car;
import java.util.Scanner;

public class Ejecutar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese cantidad de autos");
        int cantAutos = scanner.nextInt();
        Auto auto[] = new Auto[cantAutos];
        for(int i = 0;i<cantAutos;i++){
            System.out.println("Ingrese la marca");
            scanner.nextLine();
            String marca = scanner.nextLine();
            System.out.println("Modelo");
            scanner.nextLine();
            String modelo = scanner.nextLine();
            System.out.println("Ingrese caballos de fuerza");
            int cV = scanner.nextInt();
            System.out.println("Ingrese plazas");
            int plazas = scanner.nextInt();
            System.out.println("Tiene baul?\n1:Si\n2:No");
            int respB = scanner.nextInt();
            boolean baul;
            switch (respB){
                case 1:
                    baul = true;
                    break;
                case 2:
                    baul = false;
                    break;
                default:
                    System.out.println("Error default:true");
                    baul = true;
                    break;
            }
            System.out.println("Tiene porta equipaje?\n1:Si\n2:No");
            int respP = scanner.nextInt();
            boolean portaEquipaje;
            switch (respP){
                case 1:
                    portaEquipaje = true;
                    break;
                case 2:
                    portaEquipaje = false;
                    break;
                default:
                    System.out.println("Error default:true");
                    portaEquipaje = true;
                    break;
            }
            auto[i] = new Auto(marca,modelo,cV,plazas,baul,portaEquipaje);
        }
        System.out.println("Ingrese cantidad de clientes");
        int cantClientes = scanner.nextInt();
        Cliente cliente[] = new Cliente[cantClientes];
        for(int i=0;i<cantClientes;i++){
            System.out.println("Ingrese nombre");
            String nombre = scanner.next();
            System.out.println("Ingrese dni");
            int dni = scanner.nextInt();
            System.out.println("Ingrese edad");
            int edad = scanner.nextInt();
            cliente[i] = new Cliente(nombre,dni,edad);
        }
        int selecCliente=0;
        while(selecCliente!=cantClientes+1){
            System.out.println("De que cliente desea consultar los autos disponibles?");
            for(int x=0;x<cantClientes;x++){
                System.out.println((x+1)+":"+cliente[x].getNombre());
            }
            System.out.println((cantClientes+1)+":Salir");
            selecCliente = scanner.nextInt();
            for(int z=0;z<cantAutos;z++){
                if(auto[z].getTipoAuto()==cliente[selecCliente-1].getTipoAuto()){
                    auto[z].getInfoAuto();
                }
            }
        }


    }
}
