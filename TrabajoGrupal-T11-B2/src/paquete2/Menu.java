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
     //**444444
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


