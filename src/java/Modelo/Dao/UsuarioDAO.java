/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo.Dao;

import Conecciones.ConexionMySQL;
import Modelo.Interface.Obligacion;
import Modelo.Dto.UsuarioDTO;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Gigabyte
 */
public class UsuarioDAO implements Obligacion <UsuarioDTO>
{
    private static final String SQL_CREATE = "INSERT INTO tb_usuario (nombre1,nombre2,apellido1,apellido2,n_identificacion,correo,clave,sexo,fecha_nac,estado) VALUES(?,?,?,?,?,?,?,?,?,?) ", 
                   SQL_READ = "SELECT * FROM tb_usuario WHERE id = ? ", 
                   SQL_UPDATE = "UPDATE FROM tb_usuario SET ", 
                   SQL_DELETE = "DELETE FROM tb_usuario WHERE id = ? ", 
                   SQL_READALL = "SELECT * FROM tb_usuario ",
                   SQL_VALIDAR = "SELECT * FROM tb_usuario WHERE correo = ? AND clave = ? ";
    private ConexionMySQL con = ConexionMySQL.getInstance();

    public UsuarioDAO() {
    }

    @Override
    public Boolean create(UsuarioDTO udto) 
    {
        boolean rsp = false;
        try {
            PreparedStatement ps;
            ps = con.getCnn().prepareStatement(SQL_CREATE);
            ps.setString(1, udto.getPri_Nombre());
            ps.setString(2, udto.getSeg_Nombre());
            ps.setString(3, udto.getPri_Apellido());
            ps.setString(4, udto.getSeg_Apellido());
            ps.setInt(5, udto.getIdentificacion());            
            ps.setString(6, udto.getCorreo());
            ps.setString(7, udto.getClave());
            ps.setString(8, udto.getSexo());
            ps.setString(9, udto.getFecha_nac());
            ps.setInt(10, udto.getEstado());  
            if(ps.executeUpdate() > 0)
            {
                return rsp = true;
            }
            else
            {
                return rsp = false;
            }
            
        } 
        catch (SQLException ex) 
        {
            System.out.println("Error de cracion del producto: "+ex.getMessage());
        }
        finally
        {
            con.cerrarConexion();
        }
        
        return rsp;
    }

    @Override
    public UsuarioDTO read(UsuarioDTO pdto) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Boolean update(UsuarioDTO pdto) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Boolean delete(UsuarioDTO pdto) {
        PreparedStatement ps;
            
        try 
        {
            ps = con.getCnn().prepareStatement(SQL_DELETE);
            ps.setInt(1, pdto.getID());
            if(ps.executeUpdate() > 0)
            {
                return true;
            }            
        } 
        catch (SQLException ex) 
        {
            System.out.println("Error al borrar el Usuario "+ex.getMessage());
        }
        finally
        {
            con.cerrarConexion();
        }
        
        return false;
    }
    
    public UsuarioDTO validar (UsuarioDTO pdto){
        UsuarioDTO aux = null;
        PreparedStatement ps;
        boolean rsp;
        try 
        {
            ps = con.getCnn().prepareStatement(SQL_VALIDAR);
            ps.setString(1, pdto.getCorreo());
            ps.setString(2, pdto.getClave());
            ResultSet rs = ps.executeQuery();
            if(rs.next())
            {
                aux = new UsuarioDTO(rs.getInt("id"),rs.getString("nombre1"),rs.getString("nombre2"),rs.getString("apellido1"),rs.getString("apellido2"),rs.getInt("n_identificacion"),rs.getString("correo"),rs.getString("clave"),rs.getString("sexo"),rs.getString("fecha_nac"),rs.getInt("estado"));
            }
        } 
        catch (SQLException ex) 
        {
            System.out.println("Error en validar: "+ex.getMessage());
        }
        
        return aux;
    }

    @Override
    public List<UsuarioDTO> readall() {
        List<UsuarioDTO> lista = null;
        PreparedStatement ps;        
        try 
        {
            ps = con.getCnn().prepareStatement(SQL_READALL);
            ResultSet rs = ps.executeQuery();
            lista = new ArrayList<>();
            while(rs.next())
            {
                UsuarioDTO obj = new UsuarioDTO(rs.getInt("id"),rs.getString("nombre1"),rs.getString("nombre2"),rs.getString("apellido1"),rs.getString("apellido2"),rs.getInt("n_identificacion"),rs.getString("correo"),rs.getString("clave"),rs.getString("sexo"),rs.getString("fecha_nac"),rs.getInt("estado"));
                lista.add(obj);
            }
            System.out.println("estoy leyendo");
        } 
        catch (SQLException ex) 
        {
            System.out.println("Error en lectura: "+ex.getMessage());
        }
       finally
        {
            con.cerrarConexion();
        }
        return lista;
    }
    

}
