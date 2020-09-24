package Zapatitos;
public class Vendedor {
    private String nombreVendedor, especialidadVendedor, sucursalVendedor;
    private int ventasVendedor, totalDinero;
    public Vendedor(String nombreVendedor,String especialidadVendedor, String sucursalVendedor, int ventasVendedor, int totalDinero){
        this.nombreVendedor=nombreVendedor;
        this.especialidadVendedor=especialidadVendedor.toLowerCase();
        this.sucursalVendedor=sucursalVendedor.toLowerCase();
        this.ventasVendedor=ventasVendedor;
        this.totalDinero=totalDinero;
        System.out.println(nombreVendedor+" vendedor agregado");
    }
    public void getInfoVendedor(){
        System.out.println("Datos del vendedor\nNombre: "+nombreVendedor+"\nEspecialidad: "+especialidadVendedor+"\nSucursal: "+sucursalVendedor+"\nVentas: "+ventasVendedor+"\nTotal recaudado: "+totalDinero);
        getComision();
    }

    public String getEspec(){
        return especialidadVendedor;
    }

    public void  addVentas(int newVentas,int newTotalDinero){
        ventasVendedor+=newVentas;
        totalDinero+=newTotalDinero;
    }

    public void nextEspec(){
        switch (getEspec()){
            case "verano":
                especialidadVendedor = "oficina";
                System.out.println("El vendedor "+nombreVendedor+" ahora se especializa en calzado de "+especialidadVendedor);
                break;
            case "oficina":
                especialidadVendedor = "deportivo";
                System.out.println("El vendedor "+nombreVendedor+" ahora se especializa en calzado de "+especialidadVendedor);
                break;
            case "deportivo":
                especialidadVendedor = "tap";
                System.out.println("El vendedor "+nombreVendedor+" ahora se especializa en calzado de "+especialidadVendedor);
                break;
            default:
                System.out.println("Es imposible subir de especializacion");
                break;
        }
    }

    public void getComision(){
        switch (getEspec()){
            case "verano":
                System.out.println("La comision(3%) del vendedor es de $"+(Math.round((totalDinero*0.03))));
                break;
            case "oficina":
                System.out.println("La comision(5%) del vendedor es de $"+(Math.round((totalDinero*0.05))));
                break;
            case "deportivo":
                System.out.println("La comision(7%) del vendedor es de $"+(Math.round((totalDinero*0.07))));
                break;
            case "tap":
                System.out.println("La comision(10%) del vendedor es de $"+(Math.round((totalDinero*0.10))));
                break;
        }
    }

    public String getNombre(){
        return nombreVendedor;
    }


}
