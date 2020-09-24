package Rent_A_Car;

public class Auto {
    private String marca,modelo;
    private int cV,plazas;
    private boolean baul,portaEquipaje;
    public Auto(String marca,String modelo,int cV, int plazas, boolean baul,boolean portaEquipaje){
        this.marca = marca;
        this.modelo = modelo;
        this.cV = cV;
        this.plazas = plazas;
        this.baul = baul;
        this.portaEquipaje = portaEquipaje;
    }
    public String getTipoAuto(){
        if(cV>200 && plazas>2 && baul){
            return "rally";
        } else if(plazas>5 && baul && portaEquipaje){
            return "colectivo escolar";
        } else if(cV>150 && plazas==2 && !baul && !portaEquipaje){
            return "descapotable";
        } else if(cV<90 && plazas==2 && baul && !portaEquipaje){
            return "smart";
        }else{
            return "error";
        }
    }
    public void getInfoAuto(){
        String baulS,portaEquipajeS;
        if(baul){
            baulS = "si";
        }else{
            baulS = "no";
        }

        if(portaEquipaje){
            portaEquipajeS="si";
        }else{
            portaEquipajeS="no";
        }

        System.out.println("Marca: "+marca+"\nModelo: "+modelo+"\nCaballos de fuerza: "+cV+"\nPlazas: "+plazas+"\nBaul: "+baulS+"\nPorta equipaje: "+portaEquipajeS);
    }


    // entonces seria un for que haga getTipoAuto a todos los autos y if y si coincide con el return mostrarle los autos de la lista con un getInfo en ejemplo
}
