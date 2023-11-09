package Map;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Map1 {
    public static void main(String[] args) {
        List<String> juegos = Arrays.asList("Valorant", "Fornite", "Minecraft");

        List<String> uppercaseJuegos = juegos.stream()
                .map(String::toUpperCase)
                .collect(Collectors.toList());
        System.out.println("la lista de juegos es " + uppercaseJuegos);
    }
}
