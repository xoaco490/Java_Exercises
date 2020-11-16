package Mi_almacen;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class Ejecutar {
    private static void setBaseProd(BaseProd producto){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese fecha de caducidad(formato dd/mm/aa):");
        String fechaCaducidad = scanner.next();
        producto.setFechaCaducidad(fechaCaducidad);
        System.out.println("Ingrese lote");
        String lote = scanner.next();
        producto.setLote(lote);
        System.out.println("Ingrese stock:");
        int stock = scanner.nextInt();
        producto.setStock(stock);
    }
    private static Frescos setFrescos(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese fecha de envasado(formato dd/mm/aa):");
        String fechaEnvasado = scanner.next();
        System.out.println("Ingrese pais de origen:");
        String paisOrigen = scanner.next();
        Frescos fresco = new Frescos(fechaEnvasado,paisOrigen);
        setBaseProd(fresco);
        return fresco;
    }

    private static Refrigerados setRefrigerados(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese info de organizacion alimentaria:");
        String infoOrgAlimentaria = scanner.next();
        System.out.println("Ingrese pais de origen:");
        String paisOrigen = scanner.next();
        Refrigerados refrigerado = new Refrigerados(infoOrgAlimentaria,paisOrigen);
        setBaseProd(refrigerado);
        return refrigerado;
    }

    private static Congelados setCongelados(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese fecha de envasado(formato dd/mm/aa):");
        String fechaEnvasado = scanner.next();
        System.out.println("Ingrese temperatura de mantenimiento en numeros:");
        int temperaturaMantenimiento = scanner.nextInt();
        Congelados congelado = new Congelados(fechaEnvasado,temperaturaMantenimiento);
        setBaseProd(congelado);
        return congelado;
    }


    public static void main(String[] args){
        List<Frescos> frescos = new ArrayList<>();
        List<Congelados> congelados = new ArrayList<>();
        List<Refrigerados> refrigerados = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese la cantidad de productos disponible");
        int cantProductos = scanner.nextInt();
        int selecUserProd;
        for(int i = 0;i<cantProductos;i++){
            System.out.println("El producto es un:\n1:Fresco\n2:Refrigerado\n3:Congelado");
            selecUserProd = scanner.nextInt();
            switch (selecUserProd) {
                case 1 -> frescos.add(setFrescos());
                case 2 -> refrigerados.add(setRefrigerados());
                case 3 -> congelados.add(setCongelados());
                default -> {
                    System.out.println("Opcion incorrecta");
                    i--;
                }
            }
        }
        int selecUser = 0,selecLote = 0;
        while (selecUser!=4){
            System.out.println("De que producto desea consultar los datos\n1:Frescos\n2:Congelados\n3:Refrigerados\n4:Salir");
            selecUser = scanner.nextInt();
            switch (selecUser){
                case 1:
                    while (selecLote!=frescos.size()+1){
                        for (int i=0;i<frescos.size();i++){
                            System.out.println((i+1)+":"+frescos.get(i).getLote());
                        }
                        System.out.println((frescos.size()+1)+":Salir");
                        System.out.println("Que producto desea consultar:");
                        selecLote = scanner.nextInt();
                        if(selecLote==frescos.size()+1){
                            break;
                        }else{
                            System.out.println("Stock:"+frescos.get(selecLote-1).getStock()+"\nFecha de caducidad:"+frescos.get(selecLote-1).getFechaCaducidad()+"\nFecha de envasado:"+frescos.get(selecLote-1).getFechaEnvasadoFresco()+"\nPais de origen:"+frescos.get(selecLote-1).getPaisOrigenFresco());
                        }

                    }
                    break;
                case 2:
                    while (selecLote!=congelados.size()+1){
                        for(int i=0;i<congelados.size();i++){
                            System.out.println((i+1)+":"+congelados.get(i).getLote());
                        }
                        System.out.println("Que producto desea consultar:");
                        selecLote = scanner.nextInt();
                        if(selecLote==congelados.size()+1){
                            break;
                        }else{
                            System.out.println("Stock:"+congelados.get(selecLote-1).getStock()+"\nFecha de caducidad:"+congelados.get(selecLote-1).getFechaCaducidad()+"\nFecha de envasado:"+congelados.get(selecLote-1).getFechaEnvasadoCongelados()+"\nTemperatura de mantenimiento:"+congelados.get(selecLote-1).getTemperaturaMantenimientoCongelados());
                        }
                    }
                    break;
                case 3:
                    while (selecLote!=refrigerados.size()+1){
                        for(int i=0;i<refrigerados.size();i++){
                            System.out.println((i+1)+":"+refrigerados.get(i).getLote());
                        }
                        System.out.println("Que producto desea consultar:");
                        selecLote = scanner.nextInt();
                        if(selecLote==refrigerados.size()+1){
                            break;
                        }else{
                            System.out.println("Stock:"+refrigerados.get(selecLote-1).getStock()+"\nFecha de caducidad:"+refrigerados.get(selecLote-1).getFechaCaducidad()+"\nInfo organizacion alimentaria"+refrigerados.get(selecLote-1).getInfoOrgAlimentariaRefrigerados()+"\nPais de origen:"+refrigerados.get(selecLote-1).getPaisOrigenRefrigerados());
                        }
                    }
                default:
                    System.out.println("Opcion incorrecta");
                    break;
            }
        }
    }
}
