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
        establecerPorcentajeDescuento();
        establecerValorMenu();
    }

    public void establecerPorcentajeDescuento() {
        porcentajeDescuento = valorInicialMenu * 0.50;
    }

    @Override
    public void establecerValorMenu() {
        valorMenu = valorInicialMenu - porcentajeDescuento;
    }

    public double obtenerPorcentajeDescuento() {
        return porcentajeDescuento;
    }

    @Override
    public String toString() {
        String cadena = String.format("*MENÚ ECONÓMICO:\n%s"
                + " - Descuento: $%.2f\n", super.toString(),
                obtenerPorcentajeDescuento());
        return cadena;
    }

}
