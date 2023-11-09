package Predicate;

import java.util.function.Predicate;

public class P1 {
    public static void main(String[] args) {
        Supermercado s = new Supermercado("Papel higienico", true);
        Supermercado s2 = new Supermercado("Cocholate",true);
        Supermercado s3 = new Supermercado("jabon",false);
        Predicate<Supermercado> estaDisponible = Supermercado::isActivo;
        System.out.println("¿El "+s.nombreProducto+" Esta disponible?: "+estaDisponible.test(s));
        System.out.println("¿El "+s2.nombreProducto+" Esta disponible?: "+estaDisponible.test(s2));
        System.out.println("¿El "+s3.nombreProducto+" Esta disponible?: "+estaDisponible.test(s3));
    }
}
