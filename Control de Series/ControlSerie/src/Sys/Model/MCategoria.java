/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Sys.Model;

import Sys.Dao.DCategoria;
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
public class MCategoria {
    
    private Conection myConexion = new Conection();
    private Connection cn = myConexion.conectar();
    private String sSQL = "";
    public Integer totalregistro;

    public DefaultTableModel mostrar(String Buscar) {
        DefaultTableModel modelo;
        String[] titulo = {"ID", "Categoria"};
        String[] registro = new String[2];
        String estado="";
        totalregistro = 0;
        modelo = new DefaultTableModel(null, titulo);
        sSQL = "SELECT idcategoria, catergoria FROM controlseries.categira catergoria like '%" + Buscar + "%' ORDER BY idcategoria ";
        try {
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery(sSQL);
            while (rs.next()) {
                registro[0] = rs.getString("idcategoria");
                registro[1] = rs.getString("catergoria");
                 
                totalregistro += 1;
                modelo.addRow(registro);

            }
            return modelo;
        } catch (Exception e) {
            JOptionPane.showConfirmDialog(null, e);
            return null;
        }
    }

    public boolean insertar(DCategoria dts) {
        sSQL = "INSERT INTO controlseries.categira(catergoria)VALUES (?)";
        try {
            PreparedStatement pst = cn.prepareStatement(sSQL);
            pst.setString(1, dts.getCategoria());
          
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

    public boolean editar(DCategoria dts) {
        sSQL = "UPDATE controlseries.categira SET catergoria = ? WHERE idcategoria = ?";
        try {
            PreparedStatement pst = cn.prepareStatement(sSQL);
            
            pst.setString(1, dts.getCategoria());
            pst.setInt(2, dts.getIdCategoria());
           
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
