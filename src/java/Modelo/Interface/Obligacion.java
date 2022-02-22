/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo.Interface;

import java.util.List;

/**
 *
 * @author Gigabyte
 */
public interface Obligacion <Objeto>
{
    public Boolean create(Objeto pdto);
    
    public Objeto read(Objeto pdto);
        
    public Boolean update(Objeto pdto);
            
    public Boolean delete(Objeto pdto);
    
    public List<Objeto> readall();
}
