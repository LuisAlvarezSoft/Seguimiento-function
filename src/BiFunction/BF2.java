package BiFunction;

import java.util.Scanner;
import java.util.function.BiFunction;

public class BF2 {
    public static void main(String[] args) {


        BiFunction<String, String, String> nombre_completo = (a, b) -> a+" "+b;
        Scanner s = new Scanner(System.in);
        System.out.println("Ingrese su nombre");
        String name = s.nextLine();
        System.out.println("Ingrese su apellido");
        String apellido = s.nextLine();
        String fullname = nombre_completo.apply(name,apellido);
        System.out.println("Su nombre completo es: "+fullname);
    }
}
