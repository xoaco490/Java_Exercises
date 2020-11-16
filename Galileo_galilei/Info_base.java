package Galileo_galilei;
//El colegio Galileo Galiei nos solicita un sistema para guardar la información de sus alumnos
//y profesores. Cabe destacar que, aunque muchos alumnos no lo crean, los profesores también
//son personas al igual que los alumnos. La información que se desea almacenar es Nombre,
//dirección, teléfono, email. Además, para los alumnos tienen que tener la división en la que
//están y en los profesores su número de legajo y la fecha en la que se incorporaron a la
//institución.
public class Info_base {
    private String nombre,direccion,email,telefono;
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    public void setDireccion(String direccion){
        this.direccion = direccion;
    }
    public void setEmail(String email){
        this.email = email;
    }
    public void setTelefono(String telefono){
        this.telefono = telefono;
    }
    public String getNombre(){
        return nombre;
    }
    public String getDireccion(){
        return  direccion;
    }
    public String getEmail(){
        return email;
    }
    public String getTelefono(){
        return telefono;
    }
}
