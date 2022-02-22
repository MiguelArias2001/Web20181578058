/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo.Dto;

import java.io.Serializable;
import java.util.Objects;

/**
 *
 * @author Gigabyte
 */
public class ProductoDTO implements Serializable
{
    private int id_prod, und; 
    private long valor;
    private String Nombre_prod, Descripcion_prod;

    public ProductoDTO() {
    }

    public ProductoDTO(int id_prod, int und, long valor, String Nombre, String Descripcion) {
        this.id_prod = id_prod;
        this.und = und;
        this.valor = valor;
        this.Nombre_prod = Nombre;
        this.Descripcion_prod = Descripcion;
    }
    
    public ProductoDTO(int und, int valor, String Nombre, String Descripcion) {
        this.und = und;
        this.valor = valor;
        this.Nombre_prod = Nombre;
        this.Descripcion_prod = Descripcion;
    }

    public int getId_prod() {
        return id_prod;
    }

    public void setId_prod(int id_prod) {
        this.id_prod = id_prod;
    }

    public int getUnd() {
        return und;
    }

    public void setUnd(int und) {
        this.und = und;
    }

    public long getValor() {
        return valor;
    }

    public void setValor(long valor) {
        this.valor = valor;
    }

    public String getNombre() {
        return Nombre_prod;
    }

    public void setNombre(String Nombre) {
        this.Nombre_prod = Nombre;
    }

    public String getDescripcion() {
        return Descripcion_prod;
    }

    public void setDescripcion(String Descripcion) {
        this.Descripcion_prod = Descripcion;
    }

    @Override
    public String toString() {
        return "ProductoDTO{" + "id_prod=" + id_prod + ", und=" + und + ", valor=" + valor + ", Nombre_prod=" + Nombre_prod + ", Descripcion_prod=" + Descripcion_prod + '}';
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 71 * hash + this.id_prod;
        hash = 71 * hash + this.und;
        hash = 71 * hash + (int) (this.valor ^ (this.valor >>> 32));
        hash = 71 * hash + Objects.hashCode(this.Nombre_prod);
        hash = 71 * hash + Objects.hashCode(this.Descripcion_prod);
        return hash;
    }



    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final ProductoDTO other = (ProductoDTO) obj;
        if (this.id_prod != other.id_prod) {
            return false;
        }
        if (this.und != other.und) {
            return false;
        }
        if (this.valor != other.valor) {
            return false;
        }
        if (!Objects.equals(this.Nombre_prod, other.Nombre_prod)) {
            return false;
        }
        if (!Objects.equals(this.Descripcion_prod, other.Descripcion_prod)) {
            return false;
        }
        return true;
    }

    
    
    
}
