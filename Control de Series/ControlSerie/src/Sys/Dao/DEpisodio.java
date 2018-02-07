/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Sys.Dao;

import java.sql.Date;

/**
 *
 * @author Alucard
 */
public class DEpisodio {

    private int idepiesodio;
    private String nombre;
    private int num;
    private Double tamano;
    private int idserie_seire;
    private int idtenporada_temporada;
    private Date fecha_emicion;

    public DEpisodio() {
    }

    public DEpisodio(int idepiesodio, String nombre, int num, Double tamano, int idserie_seire, int idtenporada_temporada, Date fecha_emicion) {
        this.idepiesodio = idepiesodio;
        this.nombre = nombre;
        this.num = num;
        this.tamano = tamano;
        this.idserie_seire = idserie_seire;
        this.idtenporada_temporada = idtenporada_temporada;
        this.fecha_emicion = fecha_emicion;
    }

    public int getIdepiesodio() {
        return idepiesodio;
    }

    public void setIdepiesodio(int idepiesodio) {
        this.idepiesodio = idepiesodio;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public Double getTamano() {
        return tamano;
    }

    public void setTamano(Double tamano) {
        this.tamano = tamano;
    }

    public int getIdserie_seire() {
        return idserie_seire;
    }

    public void setIdserie_seire(int idserie_seire) {
        this.idserie_seire = idserie_seire;
    }

    public int getIdtenporada_temporada() {
        return idtenporada_temporada;
    }

    public void setIdtenporada_temporada(int idtenporada_temporada) {
        this.idtenporada_temporada = idtenporada_temporada;
    }

    public Date getFecha_emicion() {
        return fecha_emicion;
    }

    public void setFecha_emicion(Date fecha_emicion) {
        this.fecha_emicion = fecha_emicion;
    }
    
    
}
