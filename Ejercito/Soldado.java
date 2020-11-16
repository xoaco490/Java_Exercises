package Ejercito;

abstract class Soldado {
    protected String regimiento,nombre;
    protected Soldado(String nombre,String regimiento){
        this.nombre = nombre;
        this.regimiento = regimiento;
    }
    protected void saludar(){System.out.println("Saludos señor soy el soldado, "+nombre+" del regimiento de, "+regimiento); }
    protected void rifles(){System.out.println("Ya mismo disparo el rifle");}
    protected void aTierra(){System.out.println("Estoy cuerpo a tierra señor");}
    public abstract void atencion();
}
