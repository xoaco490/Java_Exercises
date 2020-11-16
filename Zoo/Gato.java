package Zoo;

public class Gato extends Animal{
    private int vidas;
    public Gato(String nombreAnimal,int vidas){
        super(nombreAnimal);
        this.vidas = vidas;
        saludar();
        animalSonido();
    }
    @Override
    public void animalSonido() {
        System.out.println("Me quedan "+vidas+" vidas.");
    }
}
