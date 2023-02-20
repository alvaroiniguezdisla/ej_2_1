package dominio;
import java.util.Scanner;

public class ej2_1 {


    public	static int suma(int n) {
        if(n<=1) {
            return n;

        }else {
            return n+ suma(n-1);
        }
    }

}