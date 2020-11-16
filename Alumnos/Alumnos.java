package Alumnos;
import java.util.ArrayList;
import java.util.List;

public class Alumnos {
    private String nombreAlumno, apellidoAlumno, cursoAlumno, emailAlumno,emailTutor;
    private int edadAlumno;
    private boolean conectProbl;
    private List<Integer> notasAlumno = new ArrayList<>();
    public Alumnos(String nombreAlumno, String apellidoAlumno, String cursoAlumno, String emailAlumno, int edadAlumno, List notasAlumno,String emailTutor, boolean conectProbl){
        this.nombreAlumno = nombreAlumno;
        this.apellidoAlumno = apellidoAlumno;
        this.cursoAlumno = cursoAlumno;
        this.emailAlumno = emailAlumno;
        this.edadAlumno = edadAlumno;
        this.notasAlumno = notasAlumno;
        this.emailTutor = emailTutor;
        this.conectProbl = conectProbl;
        System.out.println("Alumno añadido con exito");
    }
    public void getInfo(){
        System.out.println("Nombre y apellido:"+ nombreAlumno +", "+ apellidoAlumno +"\nCurso:"+ cursoAlumno +"\nEmail:"+"\nEdad:"+ edadAlumno +"\nEmail:"+emailAlumno+"\nNotas:");
        for (Integer nota : notasAlumno) {
            System.out.print(" " + nota);
        }
        System.out.println();
        if(edadAlumno<18){
            System.out.println("\nEste alumno esta a cargo de un tutor\nEmail del tutor:"+emailTutor);
        }
    }
    public boolean getConect(){
        return conectProbl;
    }
    public String getNombreAlumno(){
        return nombreAlumno;
    }
    public String getApellidoAlumno(){
        return apellidoAlumno;
    }
    public int getEdadAlumno(){
        return edadAlumno;
    }
    public double getPromedio(){
        int suma = 0;
        for (Integer integer : notasAlumno) {
            suma += integer;
        }
        return suma/notasAlumno.size();
    }
    public List getNotas(){
        return notasAlumno;
    }
}
