/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Control;

import Modelo.Dao.ProductoDAO;
import Modelo.Dto.ProductoDTO;
import Modelo.Dao.UsuarioDAO;
import Modelo.Dto.UsuarioDTO;
import java.util.List;

/**
 *
 * @author Gigabyte
 */
public class Facade 
{
    ProductoDAO objPDAO;
    UsuarioDAO objUDAO;

    public Facade() {
    }
    
    public List<ProductoDTO> ListarProductos()
    {
        List<ProductoDTO> lista;
        objPDAO = new ProductoDAO();
        lista = objPDAO.readall();
        return lista;
    }
    
    public List<UsuarioDTO> ListarUsuarios()
    {
        List<UsuarioDTO> lista;
        objUDAO = new UsuarioDAO();
        lista = objUDAO.readall();
        System.out.println(lista.get(0).getPri_Nombre());
        return lista;
        
    }
    
    public boolean borrar(ProductoDTO elim)
    {
        ProductoDAO p = new ProductoDAO();
        p.delete(elim);
        return true;
    }
}
