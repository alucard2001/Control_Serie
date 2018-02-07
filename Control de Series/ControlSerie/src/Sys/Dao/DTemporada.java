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
public class DTemporada {

    private int IdTemporada;
    private int Temporada;

    public DTemporada() {
    }

    public DTemporada(int IdTemporada, int Temporada) {
        this.IdTemporada = IdTemporada;
        this.Temporada = Temporada;
    }

    public int getIdTemporada() {
        return IdTemporada;
    }

    public void setIdTemporada(int IdTemporada) {
        this.IdTemporada = IdTemporada;
    }

    public int getTemporada() {
        return Temporada;
    }

    public void setTemporada(int Temporada) {
        this.Temporada = Temporada;
    }

}
