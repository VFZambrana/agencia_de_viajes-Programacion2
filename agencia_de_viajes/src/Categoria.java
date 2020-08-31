public class Categoria {
    private int IdCategoria;
    private String nombre;


    public Categoria(int idCategoria, String nombre) {
        IdCategoria = idCategoria;
        this.nombre = nombre;
    }

    public int getIdCategoria() {
        return IdCategoria;
    }

    public void setIdCategoria(int idCategoria) {
        IdCategoria = idCategoria;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
