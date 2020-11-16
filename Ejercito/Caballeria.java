package Ejercito;

public class Caballeria extends Soldado {
    public Caballeria(String nombre,String regimiento){ super(nombre,regimiento);}
    @Override
    public void atencion() {System.out.println("Ya mismo señor, me subo al tanque y le meto bomba.");}
}
