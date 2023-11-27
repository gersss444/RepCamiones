 
package com.camionesguaymas.models;
 
import com.camionesguaymas.db.ConexionDb;
import com.camionesguaymas.entities.Usuario;
import java.util.ArrayList;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class UsuarioModel {
    
    ConexionDb db = new ConexionDb();
    
    public void insert( Usuario u){
        //"+u.getNombre()+"
       String query = "INSERT INTO usuarios (nombre, correo, telefono) ";
              query+= "values ('"+u.getNombre()+"', '"+u.getCorreo()+"','"+u.getTelefono()+"' )";
              
       db.insert(query);
    
    }
    
    public void update(Usuario u){
    
    String query ="UPDATE usuarios SET  nombre='"+u.getNombre()+"', correo ='"+u.getCorreo()+"' , telefono ='"+u.getTelefono()+"' ";
           query+="Where ID="+u.getId(); 
           
    db.update(query);
    
    }
        
    public Usuario findByID(int id){
     Usuario u = null;   
     String query ="SELECT * FROM usuarios WHERE id="+id;
     
     ResultSet rs = db.select(query);
     try {
        while(rs.next()){

                u = new Usuario(
                        rs.getInt("id"),
                        rs.getString("nombre"),
                        rs.getString("telefono"),
                        rs.getString("correo")
                );
        }
     } catch (SQLException ex) {
        JOptionPane.showMessageDialog(null,"Hay un error con la base de datos!");
     }
     
     return u;
    }
    
    
    public ArrayList<Usuario> select(){ 
        ArrayList<Usuario> lista = new ArrayList<Usuario>(); 
        
        String query = "SELECT * FROM usuarios;"; 
         ResultSet rs = db.select(query);
         
        try {
            while(rs.next()){
                lista.add(new Usuario(
                        rs.getInt("id"),
                        rs.getString("nombre"),
                        rs.getString("telefono"),
                        rs.getString("correo")));
            }
        } catch (SQLException ex) {
             JOptionPane.showMessageDialog(null,"Hay un error con la base de datos!");
        } 
        return lista; 
    
    }
    
    public void delete(int id){
    
        String query = "DELETE FROM usuarios WHERE id ="+id;
        
        db.delete(query);
    
    
    }
    
    public void login(){}
    
    
}
