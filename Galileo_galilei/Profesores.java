package Galileo_galilei;

public class Profesores extends Info_base {
    private String fechaIncorporacion;
    private int numeroLegajo;
    public Profesores(String fechaIncorporacion,int numeroLegajo){
        this.fechaIncorporacion = fechaIncorporacion;
        this.numeroLegajo = numeroLegajo;
    }
    public String getFechaIncorporacion(){
        return fechaIncorporacion;
    }

    public int getNumeroLegajo(){
        return numeroLegajo;
    }
}
