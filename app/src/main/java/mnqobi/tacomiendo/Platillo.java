package mnqobi.tacomiendo;

public class Platillo {

    private String nombre, precio;
    private int img_pla;

    public Platillo(String nombre, String precio, int img_pla) {
        this.nombre = nombre;
        this.precio = precio;
        this.img_pla = img_pla;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPrecio() {
        return precio;
    }

    public void setPrecio(String precio) {
        this.precio = precio;
    }

    public int getImg_pla() {
        return img_pla;
    }

    public void setImg_pla(int img_pla) {
        this.img_pla = img_pla;
    }
}
