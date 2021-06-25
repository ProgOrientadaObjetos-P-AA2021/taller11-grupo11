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
    private double ivaPor;
    private double ivaVal;
    private ArrayList<Menu> lista = new ArrayList<>();
    private double subtotal;
    private double total;

    public Cuenta(String n, double i, ArrayList<Menu> l) {
        nombreCliente = n;
        ivaPor = i;
        lista = l;
        establecerSubtotal();
        establecerIvaVal();
        establecerTotal();
    }

    public void establecerNombreCliente(String n) {
        nombreCliente = n;
    }

    public void establecerIvaPor(double i) {
        ivaPor = i;
    }

    public void establecerIvaVal() {
        ivaVal = (subtotal * ivaPor) / 100;
    }

    public void establecerLista(ArrayList<Menu> l) {
        lista = l;
    }

    public void establecerSubtotal() {
        double suma = 0;
        for (int i = 0; i < lista.size(); i++) {
            suma = suma + lista.get(i).obtenerValorMenu();
        }
        subtotal = suma;
    }

    public void establecerTotal() {
        total = subtotal + ivaVal;
    }

    public String obtenerNombreCliente() {
        return nombreCliente;
    }

    public double obtenerIvaPor() {
        return ivaPor;
    }

    public double obtenerIvaVal() {
        return ivaVal;
    }

    public ArrayList<Menu> obtenerLista() {
        return lista;
    }

    public double obtenerSubtotal() {
        return subtotal;
    }

    public double obtenerTotal() {
        return total;
    }
    
    @Override
    public String toString(){
        String cadena = String.format("Nombre del Cliente: %s\n"
                + "Listado de menús:\n",
                obtenerNombreCliente());
        for(int i = 0; i < lista.size(); i++){
            cadena = String.format("%s**Menú %d**\n%s\n",
                    cadena, i + 1, lista.get(i));
        }
        cadena = String.format("%s - Subtotal: $%.2f\n"
                + " - IVA %.2f%% = $%.2f\n"
                + " - Total: $%.2f\n",
                cadena,
                obtenerSubtotal(),
                obtenerIvaPor(), obtenerIvaVal(),
                obtenerTotal());
        return cadena;
    }

}
