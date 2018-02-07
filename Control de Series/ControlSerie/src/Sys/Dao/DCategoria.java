/*
 * 
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Sys.Dao;

/**
 *
 * @author  Carlos E. Cedeño 30/01/2018 6:50 pm
 */
public class DCategoria {
    private int idCategoria;
    private String Categoria;

    public DCategoria() {
    }

    public DCategoria(int idCategoria, String Categoria) {
        this.idCategoria = idCategoria;
        this.Categoria = Categoria;
    }

    public int getIdCategoria() {
        return idCategoria;
    }

    public void setIdCategoria(int idCategoria) {
        this.idCategoria = idCategoria;
    }

    public String getCategoria() {
        return Categoria;
    }

    public void setCategoria(String Categoria) {
        this.Categoria = Categoria;
    }
    
    
    
}
