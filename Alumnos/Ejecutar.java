package Alumnos;
import java.util.*;

public class Ejecutar {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese cantidad de alumnos");
        int cantAlumnos = scanner.nextInt();
        System.out.println("Ingrese cantidad de notas:");
        int cantNotas = scanner.nextInt();
        List<Alumnos> alumnos = new ArrayList<>();
        List<Alumnos> conectAlumnos = new ArrayList<>();
        for(int i = 0;i<cantAlumnos;i++){
            System.out.println("Ingrese nombre:");
            String nombre = scanner.next();
            System.out.println("Ingrese apellido:");
            String apellido = scanner.next();
            System.out.println("Ingrese curso:");
            String curso = scanner.next();
            scanner.nextLine();
            System.out.println("Ingrese email:");
            String email = scanner.next();
            System.out.println("Ingrese edad:");
            int edad = scanner.nextInt();
            List<Integer> notas = new ArrayList<>();
            for(int x = 0;x<cantNotas;x++){
                System.out.println("Ingrese nota nro("+(x+1)+"):");
                notas.add(scanner.nextInt());
            }

            System.out.println("¿Tiene problemas de conectividad?\n1:Si\n2:No");
            int conec = scanner.nextInt();
            boolean conectProbl;
            switch (conec){
                case 1:
                    conectProbl = true;
                default:
                    conectProbl = false;

            }

            if(edad<18){
                System.out.println("El alumno es menor de edad y se necesita info de contacto del tutor\nIngrese email del tutor:");
                String emailTutor = scanner.next();
                alumnos.add(new Alumnos(nombre,apellido,curso,email,edad,notas,emailTutor, conectProbl));
            } else {
                String emailTutor = "El alumno no necesita tutor";
                alumnos.add(new Alumnos(nombre,apellido,curso,email,edad,notas,emailTutor, false));
            }


       }
        //Seteo de lista de alumnos con problemas de conex
        for(int i = 0;i<alumnos.size();i++){
            if(alumnos.get(i).getConect()){
                conectAlumnos.add(alumnos.get(i));
            }
        }
        int respuestaSelec = 0;
        while(respuestaSelec!=3){
            System.out.println("¿Que desea hacer?\n1:Consultar datos\n2:Mejor promedio");
            respuestaSelec = scanner.nextInt();
            switch (respuestaSelec){
                case 1:
                    //for(Alumnos alumnoActual : alumnos){
                    //
                    //                    }
                    for(int i = 0;i<alumnos.size();i++){
                        System.out.println((i+1)+":"+alumnos.get(i).getNombreAlumno()+", "+alumnos.get(i).getApellidoAlumno());
                        if(alumnos.get(i).getEdadAlumno()<18){
                            System.out.println("(Alumno a cargo de tutor)");
                        }
                    }
                    System.out.println("Seleccione el alumno:");
                    int selecAlumno = scanner.nextInt();
                    alumnos.get(selecAlumno-1).getInfo();

                case 2:
                    List<Double> numbers = new ArrayList<>();
                    for(int i=0;i<cantAlumnos;i++){
                        numbers.add(alumnos.get(i).getPromedio());
                        //numbers[i] = alumnos.get(i).getPromedio();
                    }
                    //System.out.println(numbers);
                    //organiza los alumnos de menor a mayor
                    Collections.sort(numbers);
                    //los reorganiza de mayor a menor
                    Collections.reverse(numbers);
                    //System.out.println(numbers);
                    System.out.println("Los mejores promedios de alumnos de mayor a menor son los siguientes:");
                    for(int i=0;i<cantAlumnos;i++){
                        double temp = alumnos.get(i).getPromedio();
                        for (int j=0;j<cantAlumnos;j++){
                            if (temp==numbers.get(j)){
                                //alumnos.get(j).getInfo();
                                System.out.println(alumnos.get(j).getNombreAlumno()+", "+alumnos.get(j).getApellidoAlumno());
                                System.out.println(alumnos.get(j).getPromedio());
                            }
                        }
                    }
            }
        }
    }
}
