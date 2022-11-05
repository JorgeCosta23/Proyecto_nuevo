package twin.developers.recyclerview;

public class Locales {

    private String nombre;
    private String direccion;
    private int imagen;

    // Constructor
    public Locales(String nombre, String direccion, int imagen) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.imagen = imagen;
    }

    // Getter and Setter
    public String getNombre()
    {
        return nombre;
    }

    public void setNombre(String nombre)
    {
        this.nombre = nombre;
    }

    public String getDireccion()
    {
        return direccion;
    }

    public void setDireccion(String direccion)
    {
        this.direccion = direccion;
    }

    public int getImagen()
    {
        return imagen;
    }

    public void setImagen(int imagen)
    {
        this.imagen = imagen;
    }
}