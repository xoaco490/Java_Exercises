package Mi_almacen;

public class Refrigerados extends BaseProd{
    private String infoOrgAlimentaria, paisOrigen;
    public Refrigerados(String infoOrgAlimentaria,String paisOrigen){
        this.infoOrgAlimentaria = infoOrgAlimentaria;
        this.paisOrigen = paisOrigen;
        System.out.println("El refrigerado se a añadido correctamente");
    }
    public void setInfoRefrigerados(String infoOrgAlimentaria,String paisOrigen){
        this.infoOrgAlimentaria = infoOrgAlimentaria;
        this.paisOrigen = paisOrigen;
    }
    public String getInfoOrgAlimentariaRefrigerados(){
        return infoOrgAlimentaria;
    }
    public String getPaisOrigenRefrigerados(){
        return paisOrigen;
    }
}
