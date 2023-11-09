package Function;

public class Consumidor {
    private String ID;
    private String Juego;
    private int edad;
    private String Rango;

    public Consumidor(String ID, String juego, int edad, String rango) {
        this.ID = ID;
        Juego = juego;
        this.edad = edad;
        Rango = rango;
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

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getRango() {
        return Rango;
    }

    public void setRango(String rango) {
        Rango = rango;
    }
}



