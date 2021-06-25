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
public class MenuDia extends Menu {

    private double valPostre;
    private double valBebida;
    
    public MenuDia(String n,double vP, double vB, double v){
        super(n, v);
        valPostre = vP;
        valBebida = vB;
    }
    
    public void establecerValorPostre(double vP){
        valPostre = vP;
    }
    
    public void establecerValorDeBebida(double vB){
        valBebida = vB;
    }
    
    public void establecerValorMenu() {
        valorMenu = valorInivialMenu + valBebida+valPostre;
    }
    
    public double obtenerValorDelPostre(){
        return valPostre;
    }
    
    public double obtenerValorDeBebida(){
        return valBebida;
    }

    @Override
    public String toString() {
      }

}