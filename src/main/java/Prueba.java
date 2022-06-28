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

        System.out.println("Ingrese los nuevos datos para la división: ");
        int c = leer.nextInt();
        int d = leer.nextInt();
        if(d==0){
            System.out.println("Error, no se puede didivir entre 0.");
            System.out.println("Ingrese el segundo valor nuevamente: ");
            d = leer.nextInt();
            System.out.println("La división es "+(c/d));
        }
    }
}