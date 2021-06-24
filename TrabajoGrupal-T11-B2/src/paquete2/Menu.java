/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package paquete2;

/**
 * 
 * @author josef
 */
public  abstract class Menu {
  
    protected String nombrePlato;
    protected double valorMenu;
    protected double valorInivialMenu;
    
    public Menu (String nombre, double cuotaB){
        establecerNombreDelPlato(nombre);
        
    }
     
    public void establecerNombreDelPlato(String nombre){
        nombrePlato = nombre;
    }
    public void establecerValorDelMenu(double v){
        valorMenu = v;
    }
    
    public void establecerValorInicialMenu(double i){
        valorInivialMenu = i;
    }  
    
    public abstract void establecerValorMenu();
    
    public String obtenerNombreDelPlato(){
        return nombrePlato;
    }
    
    public double obtenerValorDelMenu(){
        return valorMenu;
    }
    public double obtenerInicialMenu(){
        return valorInivialMenu;
    }
       
}


