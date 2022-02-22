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
public class UsuarioDTO implements Serializable
{
    private int ID, Identificacion,Estado;
    private String Pri_Nombre, Pri_Apellido, Seg_Nombre, Seg_Apellido, Correo, Fecha_nac, Sexo,Clave;

    public UsuarioDTO() {}

    public UsuarioDTO(int ID, String Pri_Nombre, String Seg_Nombre, String Pri_Apellido, String Seg_Apellido, int Identificacion, String Correo, String Clave, String Sexo, String Fecha_nac, int Estado) 
    {
        this.ID = ID;
        this.Identificacion = Identificacion;
        this.Pri_Nombre = Pri_Nombre;
        this.Pri_Apellido = Pri_Apellido;
        this.Seg_Nombre = Seg_Nombre;
        this.Seg_Apellido = Seg_Apellido;
        this.Correo = Correo;
        this.Clave = Clave;
        this.Fecha_nac = Fecha_nac;
        this.Sexo = Sexo;
        this.Estado = Estado;
    }
    
    public UsuarioDTO(String Correo,String Clave)
    {
        this.Correo = Correo;
        this.Clave = Clave;
    }
    
    public UsuarioDTO(int Identificacion, String Pri_Nombre, String Pri_Apellido, String Seg_Nombre, String Seg_Apellido, String Correo, String Clave, String Fecha_nac, String Sexo, int Estado) 
    {
        this.Identificacion = Identificacion;
        this.Pri_Nombre = Pri_Nombre;
        this.Pri_Apellido = Pri_Apellido;
        this.Seg_Nombre = Seg_Nombre;
        this.Seg_Apellido = Seg_Apellido;
        this.Correo = Correo;
        this.Clave = Clave;
        this.Fecha_nac = Fecha_nac;
        this.Sexo = Sexo;
        this.Estado = Estado;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public int getIdentificacion() {
        return Identificacion;
    }

    public void setIdentificacion(int Identificacion) {
        this.Identificacion = Identificacion;
    }

    public String getPri_Nombre() {
        return Pri_Nombre;
    }

    public void setPri_Nombre(String Pri_Nombre) {
        this.Pri_Nombre = Pri_Nombre;
    }

    public String getPri_Apellido() {
        return Pri_Apellido;
    }

    public void setPri_Apellido(String Pri_Apellido) {
        this.Pri_Apellido = Pri_Apellido;
    }

    public String getSeg_Nombre() {
        return Seg_Nombre;
    }

    public void setSeg_Nombre(String Seg_Nombre) {
        this.Seg_Nombre = Seg_Nombre;
    }

    public String getSeg_Apellido() {
        return Seg_Apellido;
    }

    public void setSeg_Apellido(String Seg_Apellido) {
        this.Seg_Apellido = Seg_Apellido;
    }

    public String getCorreo() {
        return Correo;
    }

    public void setCorreo(String Correo) {
        this.Correo = Correo;
    }

    public String getClave() {
        return Clave;
    }

    public void setClave(String Clave) {
        this.Clave = Clave;
    }

    public String getFecha_nac() {
        return Fecha_nac;
    }

    public void setFecha_nac(String Fecha_nac) {
        this.Fecha_nac = Fecha_nac;
    }

    public String getSexo() {
        return Sexo;
    }

    public void setSexo(String Sexo) {
        this.Sexo = Sexo;
    }

    public int getEstado() {
        return Estado;
    }

    public void setEstado(int Estado) {
        this.Estado = Estado;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 37 * hash + this.ID;
        hash = 37 * hash + this.Identificacion;
        hash = 37 * hash + Objects.hashCode(this.Pri_Nombre);
        hash = 37 * hash + Objects.hashCode(this.Pri_Apellido);
        hash = 37 * hash + Objects.hashCode(this.Seg_Nombre);
        hash = 37 * hash + Objects.hashCode(this.Seg_Apellido);
        hash = 37 * hash + Objects.hashCode(this.Correo);
        hash = 37 * hash + Objects.hashCode(this.Clave);
        hash = 37 * hash + Objects.hashCode(this.Fecha_nac);
        hash = 37 * hash + Objects.hashCode(this.Sexo);
        hash = 37 * hash + this.Estado;
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
        final UsuarioDTO other = (UsuarioDTO) obj;
        if (this.ID != other.ID) {
            return false;
        }
        if (this.Identificacion != other.Identificacion) {
            return false;
        }
        if (this.Sexo != other.Sexo) {
            return false;
        }
        if (this.Estado != other.Estado) {
            return false;
        }
        if (!Objects.equals(this.Pri_Nombre, other.Pri_Nombre)) {
            return false;
        }
        if (!Objects.equals(this.Pri_Apellido, other.Pri_Apellido)) {
            return false;
        }
        if (!Objects.equals(this.Seg_Nombre, other.Seg_Nombre)) {
            return false;
        }
        if (!Objects.equals(this.Seg_Apellido, other.Seg_Apellido)) {
            return false;
        }
        if (!Objects.equals(this.Correo, other.Correo)) {
            return false;
        }
        if (!Objects.equals(this.Clave, other.Clave)) {
            return false;
        }
        if (!Objects.equals(this.Fecha_nac, other.Fecha_nac)) {
            return false;
        }
        return true;
    }
    
    
}
