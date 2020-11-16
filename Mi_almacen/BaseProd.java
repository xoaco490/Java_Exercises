package Mi_almacen;

public class BaseProd {
    private String fechaCaducidad, lote;
    private int stock;
    public void setFechaCaducidad(String fechaCaducidad){
        this.fechaCaducidad = fechaCaducidad;
    }
    public void  setLote(String lote){
        this.lote = lote;
    }
    public void setStock(int stock){
        this.stock = stock;
    }
    public String getFechaCaducidad(){
        return fechaCaducidad;
    }
    public String getLote(){
        return lote;
    }
    public int getStock(){
        return stock;
    }
}
