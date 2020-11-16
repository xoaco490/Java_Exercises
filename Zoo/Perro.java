package Zoo;

public class Perro extends Animal{
    private String raza;
    public Perro(String nombreAnimal,String raza){
        super(nombreAnimal);
        this.raza = raza;
        saludar();
        animalSonido();
    }
    @Override
    public void animalSonido() {
        System.out.println("Mi raza es "+raza+".");
    }
}
