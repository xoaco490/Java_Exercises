package AutoConstructor;
public class Auto  {
    private String marca,patente;
    private int minimomod,modelo;
    private int getMini(){
        switch (patente.length()) {
            case 7:
                return 1994;
            case 9:
                return 2015;
            default:
                return 0;
        }
    }
    private void checkModelo(){
        switch (minimomod) {
            case 1994:
                if (modelo < minimomod || modelo >= 2015) {
                    System.out.println("La fecha del modelo no concuerda con su patente");
                }
                break;

            case 2015:
                if (modelo < minimomod) {
                    System.out.println("La fecha del modelo no concuerda con su patente");
                }
                break;
        }
    }
    public Auto(String marca, int modelo, String patente){
        //this hace referencia dentro de la instancia
        this.marca = marca;
        this.modelo = modelo;
        this.patente = patente;
        minimomod = getMini();
        if (patente.length()!=7 && patente.length() !=9){
            System.out.println("Se ha inicializado la patente con un valor incorrecto.");
        }
        checkModelo();
        System.out.println("Nuevo auto creado");
        System.out.println("Marca:"+marca+"\nModelo:"+modelo+"\nPatente:"+patente);
    }
    public void cambiarMarca(String newMarca){
        marca = newMarca;
    }
    public void cambiarPatente(String newPatente){
        patente = newPatente;
        minimomod = getMini();
        checkModelo();
    }

    public void cambiarModelo(int newModelo){
        modelo = newModelo;
        checkModelo();
    }
    public void getInfoAuto(){
        System.out.println("Marca:"+(marca)+"\nModelo:"+(modelo)+"\nPatente:"+(patente));
    }
}