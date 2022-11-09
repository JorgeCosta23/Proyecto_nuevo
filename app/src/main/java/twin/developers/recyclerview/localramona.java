package twin.developers.recyclerview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class localramona {

    private String nombre;
    private String descripcion;
    private String precio;
    private int imagen;

    // Constructor
    public localramona(String nombre, String descripcion, String precio, int imagen) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.precio = precio;
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

    public String getDescripcion()
    {
        return descripcion;
    }

    public void setDescripcion(String descripcion)
    {
        this.descripcion = descripcion;
    }

    public String getPrecio()
    {
        return precio;
    }

    public void setPrecio(String precio)
    {
        this.precio = precio;
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