package Paz;

public class Comandante {
    private String nombre = ("Pipo");

    public void apto(int diasMision, Soldado soldado){
        if(soldado.getExp() >= (diasMision*2)){
            System.out.println("El comandante "+ nombre + " dicta que el soldado esta capacitado para la mision de paz.");
        }else{
            System.out.println("El comandante "+ nombre + " dicta que el soldado no esta capacitado para la mision de paz ");
        }
    }
}
