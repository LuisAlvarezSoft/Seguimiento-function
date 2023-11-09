package Function;

import java.util.function.Function;

public class Function1 {
    public static void main(String[] args) {
        Function<String, String> toUpper = str -> str.toUpperCase();
        String uppercaseModificado = toUpper.apply("Buenos dias :D ");
        System.out.println("su uppercase modificado a String es " + uppercaseModificado);
    }
}
