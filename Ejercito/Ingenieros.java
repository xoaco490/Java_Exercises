package Ejercito;

public class Ingenieros extends Soldado{
    public Ingenieros(String nombre,String regimiento){ super(nombre,regimiento);}
    @Override
    public void atencion() {System.out.println("Ya mismo señor, tomo la pala y empiezo a cavar la trinchera.");}
}
