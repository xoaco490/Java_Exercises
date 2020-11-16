package La_casita;

public class Oficial extends Operario {
    private String especialidad, nombre, categoria;
    private double sueldo;
    public Oficial(String especialidad, double sueldo, String nombre, String categoria){
        setSueldo(sueldo);
        setEspecialidad(especialidad);
        setNombre(nombre);
        setCategoria(categoria);
        System.out.println("Oficial añadido");
    }
}
