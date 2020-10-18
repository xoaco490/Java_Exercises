package Rent_A_Car;

public class Cliente {
    private String nombre;
    private int dni,edad;
    public Cliente(String nombre,int dni , int edad){
        this.nombre=nombre;
        this.dni=dni;
        this.edad=edad;
    }

    public int getEdad(){
        return edad;
    }

    public String getTipoAuto(){
        if(edad>=18 && edad<=33){
            return "rally";
        } else if (edad>33 && edad<=45){
            return "colectivo escolar";
        } else if (edad>45 && edad<=55){
            return "descapotable";
        } else if (edad>55){
            return "smart";
        } else{
            return "error";
        }
    }

    public String getNombre(){
        return nombre;
    }
}
