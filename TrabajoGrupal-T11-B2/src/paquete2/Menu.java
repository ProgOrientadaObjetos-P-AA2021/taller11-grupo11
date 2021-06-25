package paquete2;

/**
 *
 * @author josef
 */
public abstract class Menu {

    protected String nombrePlato;
    protected double valorMenu;
    protected double valorInicialMenu;

    public Menu(String nombre, Double valorI) {
        nombrePlato = nombre;
        valorInicialMenu = valorI;
    }

    public void establecerNombreDelPlato(String nombre) {
        nombrePlato = nombre;
    }

    public abstract void establecerValorMenu();

    public void establecerValorInicialMenu(double i) {
        valorInicialMenu = i;
    }

    public String obtenerNombreDelPlato() {
        return nombrePlato;
    }

    public double obtenerValorDelMenu() {
        return valorMenu;
    }

    public double obtenerInicialMenu() {
        return valorInicialMenu;
    }

    @Override
    public String toString() {
        String cadena = String.format(">> Nombre del plato: %s\n"
                + ">> Valor inicial del menú: %.2f\n"
                + ">> Valor del menú: %.2f\n", obtenerNombreDelPlato(),
                obtenerInicialMenu(), obtenerValorDelMenu());
        return cadena;
    }

}
