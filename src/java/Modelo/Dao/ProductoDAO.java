/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo.Dao;

import Conecciones.ConexionMySQL;
import Modelo.Dto.ProductoDTO;
import Modelo.Interface.Obligacion;
import java.util.List;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.ResultSet;
import java.util.ArrayList;

/**
 *
 * @author Gigabyte
 */
public class ProductoDAO implements Obligacion <ProductoDTO>
{
    private static final String SQL_CREATE = "INSERT INTO tb_producto (nombre_producto,descripcion_producto,unidades,valor) VALUES(?,?,?,?) ",
                                SQL_READ = "SELECT * FROM tbproducto WHERE id_producto = ? ", 
                                SQL_UPDATE = "UPDATE FROM tb_producto SET "
                                            +"nombre_producto = ?,descripcion_producto = ?,unidades = ?,valor = ? WHERE id_producto = ?",
                                SQL_DELETE = "DELETE FROM tb_producto WHERE id_producto = ? ",
                                SQL_READALL = "SELECT * FROM tb_producto ";
    private static final ConexionMySQL con  = ConexionMySQL.getInstance();

    public ProductoDAO() {
    }

    @Override
    public Boolean create(ProductoDTO pdto) 
    {
        try {
            PreparedStatement ps;
            ps = con.getCnn().prepareStatement(SQL_CREATE);
            ps.setString(1, pdto.getNombre());
            ps.setString(2, pdto.getDescripcion());
            ps.setInt(3, (int) pdto.getUnd());
            ps.setInt(4, (int) pdto.getValor());
            if(ps.executeUpdate() > 0)
            {
                return true;
            }
            else
            {
                return false;
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
        
        return false;
    }

    @Override
    public ProductoDTO read(ProductoDTO pdto) 
    {
            ProductoDTO obj = null;
            PreparedStatement psnt;
                    
        try {
            psnt = con.getCnn().prepareStatement(SQL_READ);
            psnt.setInt(1, pdto.getId_prod());
            ResultSet rs = psnt.executeQuery();
            if(rs.next())
            {
                obj = new ProductoDTO(
                        rs.getInt("id_producto"),
                        rs.getInt("unidades"),
                        rs.getInt("valor"),
                        rs.getString("nombre_producto"),
                        rs.getString("descripcion_producto"));
            }
        } 
        catch (SQLException ex) 
        {
            System.out.println("Error al conectar Read "+ex.getMessage());
        }
        finally
        {
            con.cerrarConexion();
        }
        
        return obj;
    }

    @Override
    public Boolean update(ProductoDTO pdto) 
    {
        PreparedStatement ps;

        try {
            ps = con.getCnn().prepareStatement(SQL_UPDATE);
            ps.setString(1, pdto.getNombre());
            ps.setString(2, pdto.getDescripcion());
            ps.setInt(3, (int) pdto.getUnd());
            ps.setInt(4, (int) pdto.getValor());
            ps.setInt(5, pdto.getId_prod());
            if(ps.executeUpdate()>0)
            {
                return true;
            }
        } 
        catch (SQLException ex) 
        {
            System.out.println("Error al actualizr PRoductoDTO "+ex.getMessage());
        }
        finally
        {
            con.cerrarConexion();
        }
        return false;
    }

    @Override
    public Boolean delete(ProductoDTO pdto) 
    {
            PreparedStatement ps;
            
        try 
        {
            ps = con.getCnn().prepareStatement(SQL_DELETE);
            ps.setInt(1, pdto.getId_prod());
            if(ps.executeUpdate() > 0)
            {
                return true;
            }            
        } 
        catch (SQLException ex) 
        {
            System.out.println("Error al borrar el producto "+ex.getMessage());
        }
        finally
        {
            con.cerrarConexion();
        }
        
        return false;
    }

    @Override
    public List<ProductoDTO> readall() {
        List<ProductoDTO> lista = null;
        PreparedStatement ps;        
        try 
        {
            ps = con.getCnn().prepareStatement(SQL_READALL);
            ResultSet rs = ps.executeQuery();
            lista = new ArrayList<>();
            while(rs.next())
            {
                ProductoDTO obj = new ProductoDTO(rs.getInt("id_producto"),rs.getInt("unidades"),rs.getInt("valor"),rs.getString("nombre_producto"),rs.getString("descripcion_producto"));
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
