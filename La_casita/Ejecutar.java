package La_casita;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ejecutar {

    public static void getToString(List<Object> list) {
        for (Object o : list) {
            System.out.println(o.toString());
        }

    }

    public static List searchListForEsp(String especialidad, List<Operario> operarios, List<Peon> peones, List<Oficial> oficiales) {
        List<Object> objects = new ArrayList<>();
        objects.addAll(searchEspOp(operarios, especialidad));
        objects.addAll(searchEspPe(peones, especialidad));
        objects.addAll(searchEspOf(oficiales, especialidad));
        return objects;
    }

    public static List searchEspOp(List<Operario> list, String especialidad) {
        List<Object> objects = new ArrayList<>();
        for (Operario operario : list) {
            if (operario.getEspecialidad().equals(especialidad)) {
                objects.add(operario);
            }
        }
        return objects;
    }

    public static List searchEspPe(List<Peon> list, String especialidad) {
        List<Object> objects = new ArrayList<>();
        for (Peon peon : list) {
            if (peon.getEspecialidad().equals(especialidad)) {
                objects.add(peon);
            }
        }
        return objects;
    }

    public static List searchEspOf(List<Oficial> list, String especialidad) {
        List<Object> objects = new ArrayList<>();
        for (Oficial oficial : list) {
            if (oficial.getEspecialidad().equals(especialidad)) {
                objects.add(oficial);
            }
        }
        return objects;
    }

    public static String setEsp() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Que especialidad es el trabajador\n1:Albañil\n2:Carpintero\n3:Electricista\n4:Plomero\n5:Gasista\n6:Pintor");
        String espe = null;
        int x = scanner.nextInt();
        switch (x) {
            case 1 -> espe = "Albañil";
            case 2 -> espe = "Carpintero";
            case 3 -> espe = "Electricista";
            case 4 -> espe = "Plomero";
            case 5 -> espe = "Gasista";
            case 6 -> espe = "Pintor";
            default -> System.out.println("no se asigno especialidad!!!");
        }
        return espe;
    }

    public static double setS(String especialidad) {
        double sueldo = 0;
        switch (especialidad) {
            case "Albañil" -> sueldo = 35000;
            case "Carpintero" -> sueldo = 28000;
            case "Electricista" -> sueldo = 37000;
            case "Plomero" -> sueldo = 36000;
            case "Gasista" -> sueldo = 38000;
            case "Pintor" -> sueldo = 25000;
            default -> System.out.println("Opcion incorrecta");
        }
        return sueldo;
    }

    public static void main(String[] args) {
        List<Operario> operarios = new ArrayList<>();
        List<Oficial> oficiales = new ArrayList<>();
        List<Peon> peones = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese cantidad de trabajadores");
        int cantT = scanner.nextInt();
        for (int i = 0; i < cantT; i++) {
            System.out.println("¿De que categoria es el trabajador?\n1:Operario\n2:Peon\n3:Oficial");
            int categ = scanner.nextInt();
            switch (categ) {
                case 1:
                    Operario operario = new Operario();
                    System.out.println("Ingrese nombre del Operario");
                    String nombre = scanner.next();
                    operario.setNombre(nombre);
                    String especialidad = setEsp();
                    operario.setEspecialidad(especialidad);
                    operario.setSueldo(setS(especialidad));
                    operario.setCategoria("Operario");
                    operarios.add(operario);
                    break;
                case 2:
                    System.out.println("Ingrese nombre del peon");
                    nombre = scanner.next();
                    especialidad = setEsp();
                    double sueldo = setS(especialidad);
                    sueldo += sueldo * 0.30;
                    String categoria = "Peon";
                    peones.add(new Peon(especialidad, sueldo, nombre, categoria));

                    break;
                case 3:
                    System.out.println("Ingrese nombre del oficial");
                    nombre = scanner.next();
                    especialidad = setEsp();
                    sueldo = setS(especialidad);
                    sueldo += sueldo * 0.40;
                    categoria = "Oficial";
                    oficiales.add(new Oficial(especialidad, sueldo, nombre, categoria));
                    break;
                default:
                    System.out.println("Opcion incorrecta");
                    i--;
                    break;
            }
        }
        int respSelec = 0;
        while (respSelec != 6) {
            System.out.println("¿Que desea hacer?\n1:Listar por especialidad\n2:Listar por especialidad en categoria\n3:Listar mensualidades\n4:Subir categoria");
            respSelec = scanner.nextInt();
            switch (respSelec) {
                case 1:
                    System.out.println("Seleccione especialidad\n1:Albañil\n2:Carpintero\n3:Electricista\n4:Plomero\n5:Gasista\n6:Pintor");
                    int espSelec = scanner.nextInt();
                    switch (espSelec) {
                        case 1 -> getToString(searchListForEsp("Albañil", operarios, peones, oficiales));
                        case 2 -> getToString(searchListForEsp("Carpintero", operarios, peones, oficiales));
                        case 3 -> getToString(searchListForEsp("Electricista", operarios, peones, oficiales));
                        case 4 -> getToString(searchListForEsp("Plomero", operarios, peones, oficiales));
                        case 5 -> getToString(searchListForEsp("Gasista", operarios, peones, oficiales));
                        case 6 -> getToString(searchListForEsp("Pintor", operarios, peones, oficiales));
                        default -> System.out.println("Opcion incorrecta");
                    }
                case 2:
                    System.out.println("Seleccione categoria\n1:Operario\n2:Peon\n3:Oficial");
                    espSelec = scanner.nextInt();
                    switch (espSelec) {
                        case 1:
                            String especialidad = setEsp();
                            getToString(searchEspOp(operarios, especialidad));
                            break;
                        case 2:
                            especialidad = setEsp();
                            getToString(searchEspPe(peones, especialidad));
                            break;
                        case 3:
                            especialidad = setEsp();
                            getToString(searchEspOf(oficiales, especialidad));
                            break;
                        default:
                            System.out.println("Opcion incorrecta");
                            break;
                    }
                case 3:
                    DecimalFormat df = new DecimalFormat("###.#");
                    for (Operario operario : operarios) {
                        System.out.println("Nombre:" + operario.getNombre() + "\nSueldo" + df.format(operario.getSueldo()));
                    }
                    for (Peon peone : peones) {
                        System.out.println("Nombre:" + peone.getNombre() + "\nSueldo" + df.format(peone.getSueldo()));
                    }
                    for (Oficial oficiale : oficiales) {
                        System.out.println("Nombre:" + oficiale.getNombre() + "\nSueldo" + df.format(oficiale.getSueldo()));
                    }

                    break;
                case 4:
                    System.out.println("Seleccione categoria\n1:Operario\n2:Peon");
                    int cateSelec = scanner.nextInt();
                    switch (cateSelec) {
                        case 1:
                            for (int i = 0; i < operarios.size(); i++) {
                                System.out.println((i + 1) + ":" + "Nombre:" + operarios.get(i).getNombre() + "\nCategoria:" + operarios.get(i).getCategoria());
                            }
                            System.out.println("A quien desea subir a peon");
                            int subirCat = scanner.nextInt();
                            peones.add(operarios.get(subirCat - 1).passToPeon());
                            operarios.remove(subirCat - 1);
                            break;
                        case 2:
                            for (int i = 0; i < peones.size(); i++) {
                                System.out.println((i + 1) + ":" + "Nombre:" + peones.get(i).getNombre() + "\nCategoria:" + peones.get(i).getCategoria());
                            }
                            System.out.println("A quien desea subir a oficial");
                            subirCat = scanner.nextInt();
                            operarios.add(operarios.get(subirCat - 1).passToOficial());
                            operarios.remove(subirCat - 1);
                            break;
                        default:
                            break;
                    }
            }
        }
    }
}