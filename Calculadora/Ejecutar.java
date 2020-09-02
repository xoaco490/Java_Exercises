package Calculadora;
import java.util.Scanner;
public class Ejecutar {
    public  static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Calculadora calculadora = new Calculadora();
        System.out.print("Ingrese entero 1: ");
        int entero1 = scanner.nextInt(); 
        System.out.print("Ingrese entero 2: ");
        int entero2 = scanner.nextInt();
        
        calculadora.sumar(entero1, entero2);
        calculadora.restar(entero1, entero2);
        calculadora.multiplicar(entero1, entero2);
        calculadora.dividir(entero1, entero2);
        /*
        System.out.print("Ingrese numero ¿Usted desea?: \n1:Sumar\n2:Restar\n3:Multiplicar\n4:Dividir\n");
        int resp = scanner.nextInt();
        while(resp<1 || resp>4){
            System.out.println("Numero incorrecto ingrese nuevamente: ");
            System.out.print("Ingrese numero ¿Usted desea?: \n1:Sumar\n2:Restar\n3:Multiplicar\n4:Dividir\n");
            resp = scanner.nextInt();
        }
        if (resp == 1){
            calculadora.sumar(entero1, entero2);
        }
        else if (resp <1 || resp>4){
            System.out.println("Numero incorrecto intente denuevo");
        }*/
        scanner.close();
    }
}