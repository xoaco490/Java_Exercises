package TorneoTenis;
import java.util.Random;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class Torneo {
    private List<String> rivales = new ArrayList<>();
    public void iniciar(){
        Scanner scanner = new Scanner(System.in);
        for(int i=0;i<8;i++){
            System.out.println("Ingrese nombre del participante num (o ingrese los 8 directamente)"+(i+1));
            String part = scanner.next();
            rivales.add(part);
        }
        scanner.close();
    }
    public void jugar(){
        //cuartos
        System.out.println("Los cuartos de final empiezan, los competidores son:\n"+rivales);
        Random rand = new Random();
        for(int i=0;i<4;i++){
            int r1 = rand.nextInt(10)+1;
            int r2 = rand.nextInt(10)+1;
            if(r2>r1){
                rivales.remove(rivales.get(i));
            } else {
                rivales.remove(rivales.get(i+1));
            }
        }
        System.out.println("Las semi finales empiezan, los competidores son:\n"+rivales);
        for(int i=0;i<2;i++){
            int r1 = rand.nextInt(10)+1;
            int r2 = rand.nextInt(10)+1;
            if(r2>r1){
                rivales.remove(rivales.get(i));
            } else {
                rivales.remove(rivales.get(i+1));
            }
        }
        System.out.println("La final comienza, los finalistas son:\n"+rivales);
        int r1 = rand.nextInt(10)+1;
        int r2 = rand.nextInt(10)+1;
        if(r2>r1){
            System.out.println(rivales.get(1)+" es el ganador.");
            rivales.remove(0);
        } else {
            System.out.println(rivales.get(0)+" es el ganador.");
            rivales.remove(1);
        }
        System.out.println(rivales);
    }
}
