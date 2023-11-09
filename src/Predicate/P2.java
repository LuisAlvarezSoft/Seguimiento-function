package Predicate;

import java.util.function.Predicate;

public class P2 {
    public static void main(String[] args) {
        Persona p = new Persona(16);
        Persona p2 = new Persona(19);
        Predicate<Integer> mayorEdad = n -> n > 17;
        System.out.println("puede entrar?: "+mayorEdad.test(p.age));
        System.out.println("puede entrar?: "+mayorEdad.test(p2.age));
    }
}
