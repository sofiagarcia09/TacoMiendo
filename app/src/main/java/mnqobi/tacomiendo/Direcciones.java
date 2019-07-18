package mnqobi.tacomiendo;

public class Direcciones {
    private String direccion;
    private String ciudad;
    private String estado;
    private String cp;

    public Direcciones(String direccion, String ciudad, String estado, String cp) {
        this.direccion = direccion;
        this.ciudad = ciudad;
        this.estado = estado;
        this.cp = cp;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getCp() {
        return cp;
    }

    public void setCp(String cp) {
        this.cp = cp;
    }
}
