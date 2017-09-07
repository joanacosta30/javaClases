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
public class Lote extends Inmueble {

    public Lote(String codigoNal, String dir, double area, BigDecimal valor, int estrato, TipoInmuebleEnum tipo) {
        super(codigoNal, dir, area, valor, estrato, tipo);
    }

    @Override
    public BigDecimal calcularImpuesto() {
        BigDecimal a = this.getValorComercial();
        BigDecimal b = new BigDecimal( this.getArea() );
        return a.multiply(b);
    }
}
