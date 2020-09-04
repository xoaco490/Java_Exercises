package Ventas;
public class Vendedor {
    private String nombre,direccion,mail;
    private int telefono,legajo,ventasPorMes;
    public Vendedor(String nombre, String direccion, int telefono, String mail, int legajo, int ventasPorMes){
        this.nombre = nombre;
        this.direccion = direccion;
        this.telefono = telefono;
        this.mail = mail;
        this.legajo = legajo;
        this.ventasPorMes = ventasPorMes;
        System.out.println("vendedor añadido con exito");
    }
    public void infoVendedor(){
        System.out.println("Nombre:"+nombre+"\nDireccion:"+direccion+"\nTelefono:"+telefono+"\nMail:"+mail+"\nLegajo:"+legajo+"\nVentas del mes:"+ventasPorMes);
    }
    public void sumaVentas(int cantVentas){
        this.ventasPorMes += cantVentas;
    }
    public String getNombre(){
        return nombre;
    }
}
