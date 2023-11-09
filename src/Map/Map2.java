package Map;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Map2 {
    public static void main(String[] args) {

            List<VideoJuegos> Games = Arrays.asList(new VideoJuegos("Darc_16066", "Minecraft", 36),
                    new VideoJuegos("alfonso", "valorant", 30));

            List<String>  juego = Games.stream()
                    .map(VideoJuegos -> VideoJuegos.getJuego().toUpperCase())
                    .collect(Collectors.toList());
        System.out.println(juego);

    }
}
