/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete3;

import paquete2.Menu;

/**
 *
 * @author josef
 */
public class MenuEconomico extends Menu {

    private double porcentajeDescuento;

    public MenuEconomico(String n, double v) {
        super(n, v);
    }

    public void establecerPorcentajeDescuento() {
        porcentajeDescuento = valorInivialMenu * 0.50;
    }

    public void establecerValorMenu() {
        valorMenu = valorInivialMenu - porcentajeDescuento;
    }

    public double obtenerPorcentajeDescuento() {
        return porcentajeDescuento;
    }

    @Override
    public String toString() {

    }

}
