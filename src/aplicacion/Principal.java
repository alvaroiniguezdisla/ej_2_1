package aplicacion;
import dominio.ej2_1;
import java.util.Scanner;
public class Principal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce un numero");
        int num = sc.nextInt();
        System.out.println("Suma desde 1 hasta " + num + " = " + ej2_1.suma(num));


    }
}
