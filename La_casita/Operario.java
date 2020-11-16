package La_casita;

import java.text.DecimalFormat;

public class Operario {
    private String especialidad, nombre, categoria;
    private double sueldo;
    public void setCategoria(String categoria){
        this.categoria = categoria;
    }
    public void setEspecialidad(String especialidad){
        this.especialidad = especialidad;
    }
    public void setSueldo(double sueldo){
        this.sueldo = sueldo;
    }
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    public String getEspecialidad(){
        return especialidad;
    }
    public double getSueldo(){
        return sueldo;
    }
    public Oficial passToOficial(){
        return new Oficial(especialidad,sueldo+=sueldo*0.10,nombre,categoria);
    }
    public Peon passToPeon(){
        return new Peon(especialidad,sueldo+=sueldo*0.30,nombre,categoria);
    }
    public String getNombre(){
        return nombre;
    }

    public String getCategoria() {
        return categoria;
    }

    @Override
    public String toString() {
        DecimalFormat df = new DecimalFormat("###.#");
        return "Operario\n" +
                "Especialidad=" + especialidad + '\n' +
                "Nombre=" + nombre + '\n' +
                "Sueldo=$" + df.format(sueldo) +"\n"+
                "Categoria="+ categoria + "\n";
    }
}
