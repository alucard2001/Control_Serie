/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Sys.Model;

import Sys.Dao.DTemporada;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Alucard
 */
public class MTemporada {
    
    private Conection myConexion = new Conection();
    private Connection cn = myConexion.conectar();
    private String sSQL = "";
    public Integer totalregistro;

    public DefaultTableModel mostrar(String Buscar) {
        DefaultTableModel modelo;
        String[] titulo = {"ID", "Temporada"};
        String[] registro = new String[3];
        String estado="";
        totalregistro = 0;
        modelo = new DefaultTableModel(null, titulo);
        sSQL = "SELECT idtenporada, num FROM controlseries.temporada num = '" + Buscar + "' ORDER BY idtenporada ";
        try {
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery(sSQL);
            while (rs.next()) {
                registro[0] = rs.getString("idtenporada");
                registro[1] = rs.getString("num");
                 
                totalregistro += 1;
                modelo.addRow(registro);

            }
            return modelo;
        } catch (Exception e) {
            JOptionPane.showConfirmDialog(null, e);
            return null;
        }
    }

    public boolean insertar(DTemporada dts) {
        sSQL = "INSERT INTO controlseries.temporada(num)VALUES (?)";
        try {
            PreparedStatement pst = cn.prepareStatement(sSQL);
            pst.setInt(1, dts.getTemporada());
          
            int n = pst.executeUpdate();
            if (n != 0) {
                return true;
            } else {
                return false;
            }

        } catch (Exception e) {
            JOptionPane.showConfirmDialog(null, e);
            return false;
        }

    }

    public boolean editar(DTemporada dts) {
        sSQL = "UPDATE controlseries.temporada SET num = ? WHERE idtenporada = ?";
        try {
            PreparedStatement pst = cn.prepareStatement(sSQL);
            
            pst.setInt(1, dts.getTemporada());
            pst.setInt(2, dts.getIdTemporada());
           
            int n = pst.executeUpdate();
            if (n != 0) {
                return true;
            } else {
                JOptionPane.showConfirmDialog(null,"" );
                return false;
            }

        } catch (Exception e) {
            JOptionPane.showConfirmDialog(null, e);
            return false;
        }

    }

    public boolean delete(DCategoria dts) {
        sSQL = "UPDATE controlseries.categira WHERE idcategoria = ?";
        try {
            PreparedStatement pst = cn.prepareStatement(sSQL);
          
            pst.setInt(1, dts.getIdCategoria());

            int n = pst.executeUpdate();
            if (n != 0) {
                return true;
            } else {
                return false;
            }

        } catch (Exception e) {
            JOptionPane.showConfirmDialog(null, e);
            return false;
        }

    }
    
    
}
