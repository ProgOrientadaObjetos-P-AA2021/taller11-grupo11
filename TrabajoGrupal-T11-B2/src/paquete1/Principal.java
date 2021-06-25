/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete1;
import java.util.ArrayList;
import paquete2.Menu;
import paquete3.*;
import paquete4.Cuenta;
/**
 *
 * @author josef
 */
public class Principal {

    public static void main(String[] args) {
        ArrayList<Menu> listaMenu = new ArrayList<>();
        
        MenuNino menuniños1 = new MenuNino(">>> Cajita Feliz De McDonald's",
                2, 2.5, 3);
        MenuNino menuniños2 = new MenuNino(">>> KFC Kids", 3, 2, 2.5);

        MenuEconomico menueconomico = new MenuEconomico(">>> Sopas", 1.5);

        MenuDia menudia = new MenuDia(">>> Guatita", 1.5, 2.5, 2);
        
        MenuCarta menucarta = new MenuCarta(">>> Camarones apanados",
                1, 2.5, 1);

        listaMenu.add(menuniños1);
        listaMenu.add(menuniños2);
        listaMenu.add(menueconomico);
        listaMenu.add(menudia);
        listaMenu.add(menucarta);
        
        Cuenta cuentaTotal = new Cuenta("Carlos Rodrigues", 2, listaMenu);
        
        System.out.println(cuentaTotal);
    }

}