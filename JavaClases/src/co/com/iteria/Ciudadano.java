/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.com.iteria;

import java.util.List;
import java.util.Objects;

/**
 *
 * @author MAM
 */
public class Ciudadano {
    private String id;
    private String nombres;
    private String apellidos;
    
    public Ciudadano(String id, String nombres, String apellidos, List inmuebles) {
        
        
    }

    public String getId() {
        return id;
    }

    public String getNombres() {
        return nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    @Override
    public int hashCode() {
        int hash = 7;
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
        final Ciudadano other = (Ciudadano) obj;
        if (!Objects.equals(this.id, other.id)) {
            return false;
        }
        if (!Objects.equals(this.nombres, other.nombres)) {
            return false;
        }
        if (!Objects.equals(this.apellidos, other.apellidos)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Ciudadano{" + "id=" + id + ", nombres=" + nombres + ", apellidos=" + apellidos + '}';
    }
    

    
}
