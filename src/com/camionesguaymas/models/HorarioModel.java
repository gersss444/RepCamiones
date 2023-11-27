/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.camionesguaymas.models;

import com.camionesguaymas.db.ConexionDb;
import com.camionesguaymas.entities.Horario;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import java.sql.*;

/**
 *
 * @author Propietario
 */
public class HorarioModel {
     ConexionDb db = new ConexionDb();
     
     
      public ArrayList<Horario> select(){ 
        ArrayList<Horario> lista = new ArrayList<Horario>(); 
        
        String query = "SELECT * FROM horarios;"; 
         ResultSet rs = db.select(query);
         
        try {
            while(rs.next()){
                lista.add(new Horario(
                        rs.getInt("id"),
                        rs.getString("camion_id"),
                        rs.getString("ruta_id"),
                         rs.getString("hora_salida"),
                        rs.getString("hora_llegada"),
                        rs.getString("fecha"),
                        rs.getString("latitud"),
                        rs.getString("longitud")
                ));
            }
        } catch (SQLException ex) {
             JOptionPane.showMessageDialog(null,"Hay un error con la base de datos!");
        } 
        return lista; 
    
    }
}
