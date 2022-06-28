import java.util.Scanner;

public class Prueba {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int a, b;
        System.out.println("Ingrese dos números: ");
        a = leer.nextInt();
        b = leer.nextInt();
        System.out.println("La suma es: "+(a+b));

        if(a>b){
            System.out.println("El mayor es "+a);
        }else {
            System.out.println("El mayor es "+b);
        }
    }
}