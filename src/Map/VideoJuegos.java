package Map;

public class VideoJuegos {
    private String ID;
    private String Juego;
    private int HorasJuego;

    public VideoJuegos(String ID, String juego, int horasJuego) {
        this.ID = ID;
        Juego = juego;
        HorasJuego = horasJuego;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getJuego() {
        return Juego;
    }

    public void setJuego(String juego) {
        Juego = juego;
    }

    public int getHorasJuego() {
        return HorasJuego;
    }

    public void setHorasJuego(int horasJuego) {
        HorasJuego = horasJuego;
    }
}

