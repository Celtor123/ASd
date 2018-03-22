package cafetera;

import javax.swing.JOptionPane;


/**
 * <!-- begin-user-doc -->
 * <!--  end-user-doc  -->
 * @generated
 */

public class Precio
{
private double precio;
private double dinero;

    public Precio(double precio , double dinero) {
        this.precio = precio;
        this.dinero = dinero;
    }

    Precio() {
        
    }

   

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public void setDinero(double dinero) {
        this.dinero = dinero;
    }

    public double getPrecio() {
        return precio;
    }

    public double getDinero() {
        return dinero;
    }

public void demandarimporte(double dinero){
    JOptionPane.showInputDialog("Inserte el importe.");
    if (dinero >= getPrecio()){
        
        JOptionPane.showInputDialog("Espere, su cafe se esta preparando.");
        if(dinero>getPrecio()){
            dinero = dinero-getPrecio();
            JOptionPane.showInputDialog("Reciba su cambio: "+dinero);
        }
    } 
}}

