package Ejercito;

public class Comunicaciones extends Soldado{
    public Comunicaciones(String nombre,String regimiento){ super(nombre,regimiento);}
    @Override
    public void atencion() { System.out.println("¿Como dice señor? me parece que no tengo cobertura.");}
}
