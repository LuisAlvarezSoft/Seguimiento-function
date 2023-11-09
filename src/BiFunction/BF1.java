package BiFunction;

import java.util.Scanner;
import java.util.function.BiFunction;

public class BF1 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        BiFunction<String, String, Integer> edad = (a,b)-> Integer.parseInt(a)-Integer.parseInt(b);
        System.out.println("Diga el año actual");
        String añoA= s.nextLine();
        System.out.println("Diga su año de nacimiento");
        String añoN= s.nextLine();
        int age = edad.apply(añoA,añoN);
        System.out.println("Su edad es: "+age);
    }
}
