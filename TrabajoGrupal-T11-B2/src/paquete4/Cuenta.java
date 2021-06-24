/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package paquete4;

import java.util.ArrayList;
import paquete2.Menu;

/**
 * 
 * @author josef
 */
public class Cuenta {
    
    private String nombreCliente;
    private double iva;
    private double subtotal;
    private double total;
    private ArrayList<Menu> lista = new ArrayList<>();
    
    public Cuenta(String n, double i){
        nombreCliente = n;
        iva = i;
    }
    
    public void establecerNombreCliente(String n){
        nombreCliente = n;
    }

}
