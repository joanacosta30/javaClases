/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.com.iteria;

import java.math.BigDecimal;

/**
 *
 * @author MAM
 */
public class Casa extends Inmueble {
  
    public Casa(String codigoNal, String dir, double area, BigDecimal valor, int estrato, TipoInmuebleEnum tipo) {
        super(codigoNal, dir, area, valor, estrato, tipo);
    }
  
    @Override
    public BigDecimal calcularImpuesto() {
        BigDecimal a = this.getValorComercial();
        BigDecimal b = new BigDecimal( this.getArea() );
        BigDecimal c = new BigDecimal( 0.9 );
        return a.multiply(b).multiply(c);
    }
    
}
