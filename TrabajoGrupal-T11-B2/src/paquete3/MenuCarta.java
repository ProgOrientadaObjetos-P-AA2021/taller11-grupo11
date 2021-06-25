package paquete3;

import paquete2.Menu;

/**
 *
 * @author josef
 */
public class MenuCarta extends Menu {

    private double valorPorcionGuarnicion;
    private double valorBebida;
    private double porcentajeAdicional;

    public MenuCarta(String np, double v, double vb, double cI) {
        super(np, cI);
        valorPorcionGuarnicion = v;
        valorBebida = vb;
    }

    public void establecerValorPorcionGuarnicion(double n) {
        valorPorcionGuarnicion = n;
    }

    public void establecerValorBebida(double n) {
        valorBebida = n;
    }

    public void establecerPorcentajeAdicional() {
        porcentajeAdicional = valorInivialMenu * 0.10;
    }

    @Override
    public void establecerValorMenu() {
        valorMenu = valorBebida + valorPorcionGuarnicion
                + valorInivialMenu + porcentajeAdicional;
    }

    public double obtenerValorPorcionGuarnicion() {
        return valorPorcionGuarnicion;
    }

    public double obtenerValorBebida() {
        return valorBebida;
    }

    public double obtenerPorcentajeAdicional() {
        return porcentajeAdicional;
    }

    @Override
    public String toString() {
        String cadena = String.format(">>>>>> Menú <<<<<< \n"
                + ">> Nombre del plato: %s\n"
                + ">> Valor inicial del menu: %.2f\n"
                + ">> Valor porcion de guarnicion: %.2f\n"
                + ">> Valor de bebida: %.2f\n"
                + ">> Porcentaje de servicio: %.2f\n"
                + ">> Valor del menu: %.2f\n",
                obtenerNombreDelPlato(),
                obtenerInicialMenu(),
                obtenerValorPorcionGuarnicion(),
                obtenerValorBebida(),
                obtenerPorcentajeAdicional(),
                obtenerValorDelMenu());
        return cadena;
    }

}
