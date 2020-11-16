package Zoo;

public class Tigre extends Animal{
    private int rayas;
    public Tigre(String nombreAnimal,int rayas){
        super(nombreAnimal);
        this.rayas = rayas;
        saludar();
        animalSonido();
    }
    @Override
    public void animalSonido() {
        System.out.println("Tengo "+rayas+" rayas.");
    }
}
