/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.com.iteria;

import java.math.BigDecimal;
import java.util.Objects;

/**
 *
 * @author MAM
 */
public abstract class Inmueble {
    private String codigoNacional;
    private String direccion;
    private double area;
    private BigDecimal valorComercial;
    private int estrato;
    private TipoInmuebleEnum tipo;
    
    public Inmueble(String codigoNal, String dir, double area, BigDecimal valor, int estrato, TipoInmuebleEnum tipo) {
        
    }
    
    public abstract BigDecimal calcularImpuesto();

    public String getCodigoNacional() {
        return codigoNacional;
    }

    public String getDireccion() {
        return direccion;
    }

    public double getArea() {
        return area;
    }

    public BigDecimal getValorComercial() {
        return valorComercial;
    }

    public int getEstrato() {
        return estrato;
    }

    public TipoInmuebleEnum getTipo() {
        return tipo;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 37 * hash + Objects.hashCode(this.codigoNacional);
        hash = 37 * hash + Objects.hashCode(this.direccion);
        hash = 37 * hash + (int) (Double.doubleToLongBits(this.area) ^ (Double.doubleToLongBits(this.area) >>> 32));
        hash = 37 * hash + Objects.hashCode(this.valorComercial);
        hash = 37 * hash + this.estrato;
        hash = 37 * hash + Objects.hashCode(this.tipo);
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
        final Inmueble other = (Inmueble) obj;
        if (Double.doubleToLongBits(this.area) != Double.doubleToLongBits(other.area)) {
            return false;
        }
        if (this.estrato != other.estrato) {
            return false;
        }
        if (!Objects.equals(this.codigoNacional, other.codigoNacional)) {
            return false;
        }
        if (!Objects.equals(this.direccion, other.direccion)) {
            return false;
        }
        if (!Objects.equals(this.valorComercial, other.valorComercial)) {
            return false;
        }
        if (this.tipo != other.tipo) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Inmueble{" + "codigoNacional=" + codigoNacional + ", direccion=" + direccion + ", area=" + area + ", valorComercial=" + valorComercial + ", estrato=" + estrato + ", tipo=" + tipo + '}';
    }
}
