package Zoo;

public class Leon extends Animal {
    private int edad;
    public Leon(String nombreAnimal,int edad){
        super(nombreAnimal);
        this.edad = edad;
        saludar();
        animalSonido();
    }
    @Override
    public void animalSonido() {
        System.out.println("Tengo "+edad+" años.");
    }
}
