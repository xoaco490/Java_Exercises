package Obras_arte;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Ejecutar {
    public static void Consulta(List<Base_obra> nombreObj){
        Scanner scanner = new Scanner(System.in);
        int selecW2=0;
        while (selecW2!=nombreObj.size()+1){
            for (int i = 0;i<nombreObj.size();i++){
                System.out.println((i+1)+":"+nombreObj.get(i).getTitulo());
            }
            System.out.println((nombreObj.size()+1)+":Salir");
            System.out.println("Numero de obra a consultar");
            selecW2 = scanner.nextInt();
            if(selecW2==nombreObj.size()+1){
                break;
            } else if(selecW2>nombreObj.size()){
                System.out.println("Valor incorrecto");
            } else {
                nombreObj.get(selecW2-1).toString();
            }
        }
    }
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese cantidad de obras a ingresar");
        int cantObras = scanner.nextInt();
        List<Base_obra> pinturas = new ArrayList<>();
        List<Base_obra> esculturas = new ArrayList<>();
        List<Base_obra> grabados = new ArrayList<>();
        for(int i = 0;i<cantObras;i++){
            int selecTipo=0;
            String tipo;
            System.out.println("Ingres titulo");
            String titulo = scanner.next();
            System.out.println("Ingrese autor");
            String autor = scanner.next();
            scanner.nextLine();
            System.out.println("Ingrese dimension");
            String dimension = scanner.next();
            scanner.nextLine();
            while (selecTipo!=1 && selecTipo!= 2 && selecTipo!= 3){
                System.out.println("Ingrese tipo de obra\n1:Pintura\n2:Escultura\n3:Grabado");
                selecTipo = scanner.nextInt();
                switch (selecTipo) {
                    case 1 -> {
                        tipo = "pintura";
                        pinturas.add(new Base_obra(titulo, autor, dimension, tipo));
                    }
                    case 2 -> {
                        tipo = "escultura";
                        esculturas.add(new Base_obra(titulo, autor, dimension, tipo));
                    }
                    case 3 -> {
                        tipo = "grabado";
                        grabados.add(new Base_obra(titulo, autor, dimension, tipo));
                    }
                    default -> System.out.println("Opcion incorrecta");
                }
            }
        }
        System.out.println("Que desea consultar?\n1:Pinturas\n2:Esculturas\n3:Grabados\n4:salir");
        int selecW1 = scanner.nextInt();
        while (selecW1!=4)
            System.out.println("Que desea consultar?\n1:Pinturas\n2:Esculturas\n3:Grabados\n4:salir");
            selecW1 = scanner.nextInt();
            switch (selecW1){
                case 1:
                    Consulta(pinturas);
                    break;
                case 2:
                    Consulta(esculturas);
                    break;
                case 3:
                    Consulta(grabados);
                    break;
                case 4:
                    break;
                default:
                    System.out.println("Opcion incorrecta");
            }
    }
}