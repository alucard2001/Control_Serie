/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Sys.Dao;

/**
 *
 * @author Alucard
 */
public class DSerie {

    private int IdSerie;
    private String Nombre;
    private String descripcion;
    private String estado;
    private int IdCategoria;

    public DSerie() {
    }

    public DSerie(int IdSerie, String Nombre, String descripcion, String estado, int IdCategoria) {
        this.IdSerie = IdSerie;
        this.Nombre = Nombre;
        this.descripcion = descripcion;
        this.estado = estado;
        this.IdCategoria = IdCategoria;
    }

    public int getIdSerie() {
        return IdSerie;
    }

    public void setIdSerie(int IdSerie) {
        this.IdSerie = IdSerie;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public int getIdCategoria() {
        return IdCategoria;
    }

    public void setIdCategoria(int IdCategoria) {
        this.IdCategoria = IdCategoria;
    }

}
