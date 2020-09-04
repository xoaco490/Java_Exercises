package Pokemon;
import java.util.Scanner;
public class EjecutablePokemon {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese nombre del pokemon:");
        String nombre = scanner.next();
        System.out.println("Ingrese color del pokemon:");
        String color = scanner.next();
        System.out.println("Ingrese tipo del pokemon:");
        String tipo = scanner.next();
        System.out.println("Ingrese hp del pokemon:");
        int hp = scanner.nextInt();
        System.out.println("Ingrese nivel del pokemon:");
        int lvl = scanner.nextInt();
        StatsPokemon pokemon = new StatsPokemon(nombre,color,tipo,hp,lvl);
        int resp = 0;
        while (resp!=4){
            System.out.println("¿Que desea hacer?\n1:Consultar info pokemon\n2:Cambiar hp del pokemon\n3:Cambiar nivel del pokemon\n4:Salir");
            resp = scanner.nextInt();
            switch (resp){
                case 1:
                    pokemon.getInfoPokemon();
                    break;
                case 2:
                    System.out.println("¿Cuanto hp tiene el pokemon?");
                    int newHp = scanner.nextInt();
                    pokemon.setHpPokemon(newHp);
                    break;

                case 3:
                    System.out.println("¿Que nivel es el pokemon?");
                    int newLvl = scanner.nextInt();
                    pokemon.setLvlPokemon(newLvl);
                    break;

                case 4:
                    System.out.println("Gracias por usar");
                    break;

                default:
                    System.out.println("Input incorrecto");
            }
        }
    }
}
