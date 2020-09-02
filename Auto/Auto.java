package Auto;
public class Auto 
{
    private String color, patente, marca;
    private int modelo;
    /*Con modelo se refiere a la denominacion(por ej: Volswagen Golf) del mismo o al año(2011)?*/
    public void auto(String aColor, String aPatente ,String aMarca,int aModelo ){
        color = aColor;
        patente = aPatente;
        marca = aMarca;
        modelo = aModelo;
    }
    public void infoauto(){
        System.out.print("Patente: "+patente+"\nMarca: "+marca+"\nModelo: "+modelo+"\nColor: "+color);
    }
}