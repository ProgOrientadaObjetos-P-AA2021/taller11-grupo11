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
public class MenuNiño extends Menu {


    private double valorHelado;
    private double valorPastel;

    public MenuNiño(String n, double vH, double vP, double v) {
        super(n, v);
        valorHelado = vH;
        valorPastel = vP;
    }

    public void establecerValorMenu() {
        valorMenu = valorInivialMenu + valorHelado + valorPastel;
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
    }
}