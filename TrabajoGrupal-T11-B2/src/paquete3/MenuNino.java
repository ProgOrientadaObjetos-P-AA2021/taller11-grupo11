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
public class MenuNino extends Menu {

    private double valorHelado;
    private double valorPastel;

    public MenuNino(String n, double v, double vH, double vP) {
        super(n, v);
        valorHelado = vH;
        valorPastel = vP;
        establecerValorMenu();
    }

    @Override
    public void establecerValorMenu() {
        valorMenu = valorInicialMenu + valorHelado + valorPastel;
    }

    public void establecerValorHelado(double vH) {
        valorHelado = vH;
    }

    public void establecerValorPastel(double vP) {
        valorPastel = vP;
    }

    public double obtenerValorHelado() {
        return valorHelado;
    }

    public double obtenerValorPastel() {
        return valorPastel;
    }

    @Override
    public String toString() {
        String cadena = String.format("MENÚ DE NIÑO:\n"
                + ">> Nombre del plato: %s\n"
                + ">> Porción Helado: $%.2f\n"
                + ">> Porción pastel: $%.2f\n"
                + ">> Valor inicial del menú: $%.2f\n"
                + ">> Valor del menú: $%.2f\n",
                obtenerNombreDelPlato(),
                obtenerValorHelado(),
                obtenerValorPastel(),
                obtenerInicialMenu(),
                obtenerValorDelMenu());
        return cadena;
    }
}