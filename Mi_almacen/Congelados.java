package Mi_almacen;

public class Congelados extends BaseProd {
    private String fechaEnvasado;
    private int temperaturaMantenimiento;
    public Congelados(String fechaEnvasado,int temperaturaMantenimiento){
        this.fechaEnvasado = fechaEnvasado;
        this.temperaturaMantenimiento = temperaturaMantenimiento;
    }
    public void setInfoCongelados(String fechaEnvasado,int temperaturaMantenimiento){
        this.fechaEnvasado = fechaEnvasado;
        this.temperaturaMantenimiento = temperaturaMantenimiento;
    }
    public String getFechaEnvasadoCongelados(){
        return fechaEnvasado;
    }
    public int getTemperaturaMantenimientoCongelados(){
        return temperaturaMantenimiento;
    }
}
