package Function;

import java.util.function.Function;

public class Function2 {
    public static void main(String[] args) {
        Consumidor consumidor = new Consumidor("Darc_16066", "Fornite", 17, "OroII");
        Function<Consumidor, String> MostrarRango = c -> "El rango del jugador identificado como " + c.getID()
                + " en el juego " + c.getJuego() + " es de " + c.getRango();
        System.out.println(MostrarRango.apply(consumidor));

    }
}
