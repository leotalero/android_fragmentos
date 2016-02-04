package com.unir.leonardotalero.fragmentos.clases;

import android.content.Context;
import android.media.Image;
import android.widget.ImageView;

/**
 * Created by leonardotalero on 1/16/16.
 */
public class Libro {

   public String nombre;
    private String descripcion;
    private int imagen;
    private Context context;

    public Libro(String nombre, String descripcion, int imagen) {


        this.nombre = nombre;
        this.descripcion = descripcion;
        this.imagen = imagen;
        this.context = context;
    }


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getImagen() {
        return imagen;
    }

    public void setImagen(int imagen) {
        this.imagen = imagen;
    }
}
