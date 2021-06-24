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
    
    public Menu (String nombre, double cuotaB){
        establecerNombreArrendatario(nombre);
        cuotaBase = cuotaB;
    }
    //************************
    public void establecerNombreArrendatario(String nombre){
        nombreArrendatario = nombre;
    }
    
    public void establecerCuotaBase(double x){
        cuotaBase = x;
    }
    
    public abstract void establecerArriendoMensual();
    
    public String obtenerNombreArrendatario(){
        return nombreArrendatario;
    }
    
    public double obtenerCuotaBase(){
        return cuotaBase;
    }
    
    public double obtenerArriendoMensual(){
        return arriendoMensual;
    }
       
}


