package Zoo;

abstract class Animal {
    protected String nombreAnimal;
    protected Animal(String nombreAnimal){
        this.nombreAnimal = nombreAnimal;
    }
    protected void saludar(){
        System.out.println("Hola soy "+nombreAnimal);
    }
    public abstract void animalSonido();
}
