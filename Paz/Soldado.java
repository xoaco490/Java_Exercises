package Paz;

public class Soldado {
    private int exp = 0;

    public void practicaMilitar(int dias){
        if(dias>0) {
            int aptitud = dias - exp;

            if (aptitud <= 2) {
                System.out.println("El soldado es apto para la practica de " + dias + " dias.");
                exp += dias * 2;
                System.out.println("Experiencia ganada: " + dias * 2);
            } else {
                System.out.println("El soldado no es apto.");
            }
        }
    }
    public void consultaExp(){
        System.out.println("El soldado tiene "+ exp +" puntos de experiencia");
    }
    public int getExp() { return exp; }
}
