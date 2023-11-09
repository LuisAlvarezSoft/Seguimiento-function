package Predicate;

public class Supermercado {
    public String nombreProducto;
    public boolean activo;

    public Supermercado(String nombreProducto, boolean activo) {
        this.nombreProducto = nombreProducto;
        this.activo = activo;
    }
    public boolean isActivo() {
        return activo;
    }
}
