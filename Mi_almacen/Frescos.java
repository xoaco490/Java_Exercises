package Mi_almacen;

public class Frescos extends BaseProd {
    private String fechaEnvasado, paisOrigen;
    public Frescos(String fechaEnvasado,String paisOrigen) {
        this.fechaEnvasado = fechaEnvasado;
        this.paisOrigen = paisOrigen;
        System.out.println("El fresco se ha añadido correctamente");
    }
    public void setInfoFrescos(String fechaEnvasado,String paisOrigen){
        this.fechaEnvasado = fechaEnvasado;
        this.paisOrigen = paisOrigen;
    }
    public String getFechaEnvasadoFresco(){
        return fechaEnvasado;
    }
    public String getPaisOrigenFresco(){
        return paisOrigen;
    }
}
