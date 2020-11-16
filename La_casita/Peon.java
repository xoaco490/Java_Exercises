package La_casita;

public class Peon extends Operario{
    private String especialidad, nombre,categoria;
    private double sueldo;
    public Peon(String especialidad, double sueldo, String nombre, String categoria){
        setSueldo(sueldo);
        setEspecialidad(especialidad);
        setNombre(nombre);
        setCategoria(categoria);
        System.out.println("Peon añadido");
    }
}
