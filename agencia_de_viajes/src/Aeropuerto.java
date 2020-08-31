public class Aeropuerto {
    private String codigoAreopuerto;
    private String nombre;
    private Ciudad ciudad;

    public Aeropuerto(String codigoAreopuerto, String nombre, Ciudad ciudad) {
        this.codigoAreopuerto = codigoAreopuerto;
        this.nombre = nombre;
        this.ciudad = ciudad;
    }

    public String getCodigoAreopuerto() {
        return codigoAreopuerto;
    }

    public void setCodigoAreopuerto(String codigoAreopuerto) {
        this.codigoAreopuerto = codigoAreopuerto;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Ciudad getCiudad() {
        return ciudad;
    }

    public void setCiudad(Ciudad ciudad) {
        this.ciudad = ciudad;
    }
}


