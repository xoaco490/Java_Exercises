package Galileo_galilei;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ejecutar {
    private static void setBase(Info_base objeto){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese nombre");
        String nombre = scanner.next();
        scanner.nextLine();
        objeto.setNombre(nombre);
        System.out.println("Ingrese direccion");
        String direccion = scanner.next();
        scanner.nextLine();
        objeto.setDireccion(direccion);
        System.out.println("Ingrese email");
        String email = scanner.next();
        objeto.setEmail(email);
        System.out.println("Ingrese telefono");
        String telefono = scanner.next();
        objeto.setTelefono(telefono);
    }
    private static Profesores setProf(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese la fecha de incorporacion dd/mm/aa");
        String fechaIncorporacion = scanner.next();
        System.out.println("Ingrese el numero de legajo");
        int numeroLegajo = scanner.nextInt();
        Profesores profesor = new Profesores(fechaIncorporacion,numeroLegajo);
        setBase(profesor);
        System.out.println("Profesor: "+profesor.getNombre()+" Añadido.");
        return profesor;
    }

    private static Alumnos setAlumn(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese division");
        String division = scanner.next();
        scanner.nextLine();
        Alumnos alumno = new Alumnos(division);
        setBase(alumno);
        System.out.println("Alumno: "+alumno.getNombre()+" Añadido.");
        return alumno;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Alumnos> listaAlumnos = new ArrayList<>();
        List<Profesores> listaProfesores = new ArrayList<>();
        System.out.println("Ingrese cantidad de profesores:");
        int cantProf = scanner.nextInt();
        for(int i=0;i<cantProf;i++){
            listaProfesores.add(setProf());
        }
        System.out.println("Ingrese cantidad de alumnos");
        int cantAlumn = scanner.nextInt();
        for (int i=0;i<cantAlumn;i++){
            listaAlumnos.add(setAlumn());
        }
        int selecUser = 0,selecW=0;
        while (selecUser!=3){
            System.out.println("Quien desea consultar\n1:Alumnos\n2:Profesores\n3:Salir");
            selecUser=scanner.nextInt();
            switch (selecUser){
                case 1:
                    while (selecW!=listaAlumnos.size()+1){
                        for (int i=0;i<listaAlumnos.size();i++){
                            System.out.println((i+1)+":"+listaAlumnos.get(i).getNombre());
                        }
                        System.out.println((listaAlumnos.size()+1)+":Salir");
                        System.out.println("Ingrese numero de alumno a consultar");
                        selecW = scanner.nextInt();
                        if(selecW==listaAlumnos.size()+1){
                            break;
                        }else if(selecW>listaAlumnos.size()){
                            System.out.println("Valor incorrecto");
                        } else {
                            System.out.println("Nombre:"+listaAlumnos.get(selecW-1).getNombre()+"\nDireccion:"+listaAlumnos.get(selecW-1).getDireccion()+"\nEmail:"+listaAlumnos.get(selecW-1).getEmail()+"\nTelefono:"+listaAlumnos.get(selecW-1).getTelefono()+"\nDivision:"+listaAlumnos.get(selecW-1).getDivision());
                        }
                    }
                    break;
                case 2:
                    while (selecW!=listaProfesores.size()+1){
                        for (int i=0;i<listaProfesores.size();i++){
                            System.out.println((i+1)+":"+listaProfesores.get(i).getNombre());
                        }
                        System.out.println((listaProfesores.size()+1)+":Salir");
                        System.out.println("Ingrese numero de alumno a consultar");
                        selecW = scanner.nextInt();
                        if(selecW==listaProfesores.size()+1){
                            break;
                        }else if(selecW>listaProfesores.size()){
                            System.out.println("Valor incorrecto");
                        } else {
                            System.out.println("Nombre:"+listaProfesores.get(selecW-1).getNombre()+"\nDireccion:"+listaProfesores.get(selecW-1).getDireccion()+"\nEmail:"+listaProfesores.get(selecW-1).getEmail()+"\nTelefono:"+listaProfesores.get(selecW-1).getTelefono()+"\nFecha de ingreso:"+listaProfesores.get(selecW-1).getFechaIncorporacion()+"\nNumero de legajo:"+listaProfesores.get(selecW-1).getNumeroLegajo());
                        }
                    }
                    break;
                default:
                    System.out.println("Valor incorrecto");
                    break;
            }
        }
    }
}
