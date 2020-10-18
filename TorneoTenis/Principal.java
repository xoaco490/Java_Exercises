package TorneoTenis;
import java.util.Scanner;
public class Principal {
    public static void main(String[] args){
        Torneo torneo = new Torneo();
        torneo.iniciar();
        torneo.jugar();
    }
}
