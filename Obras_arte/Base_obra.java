package Obras_arte;
//“Se desea mantener un catálogo de distintas obras de arte. Cada obra tiene un autor, título
//y dimensiones. Existen tres tipos de obras de arte: pintura, escultura y grabado. El catálogo
//debe poder listar las obras de arte que posee (usar el método toString())."
public class Base_obra {
    private String titulo,autor,dimension,tipo;
    public Base_obra(String titulo, String autor, String dimension, String tipo){
        this.titulo = titulo;
        this.autor = autor;
        this.dimension = dimension;
        this.tipo = tipo;
        System.out.println("Se ha añadido con exito "+titulo+".");
    }
    public String toString(){
        return "Titulo: "+titulo+"\nAutor: "+autor+"\nDimension: "+dimension+"\nTipo: "+tipo;
    }
    public String getTitulo(){
        return titulo;
    }
}