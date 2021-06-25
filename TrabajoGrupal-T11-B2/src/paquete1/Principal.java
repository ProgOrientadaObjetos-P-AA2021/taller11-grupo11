/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete1;
import java.util.ArrayList;
import paquete2.Menu;
import paquete3.MenuCarta;
import paquete3.MenuDia;
import paquete3.MenuEconomico;
import paquete3.MenuNiño;
import paquete4.Cuenta;
/**
 *
 * @author josef
 */
public class Principal {

    public static void main(String[] args) {
           ArrayList<Menu> listaMenu = new ArrayList<>();

        MenuCarta menucarta = new MenuCarta(">>> Camarones apanados"
                                                , 1.0, 1.5, 2.50);
        menucarta.establecerPorcentajeAdicional();

        MenuNiño menuniños1 = new MenuNiño(">>> Cajita Feliz De McDonald's"
                                                        , 2.00, 2.50, 3.00);

        MenuEconomico menueconomico = new MenuEconomico("Sopas", 2.25);
        menueconomico.establecerPorcentajeDescuento();

        MenuDia menudia = new MenuDia("Guatita", 1.50, 2.50, 2.00);

        listaMenu.add(menucarta);
        listaMenu.add(menuniños1);
        listaMenu.add(menueconomico);
        listaMenu.add(menudia);

        for (int i = 0; i < listaMenu.size(); i++) {
            listaMenu.get(i).obtenerValorDelMenu();
        }

    }

}