
package cafetera;

public class azucar {
    private String tipo;
    private int azucar;

    public azucar(String tipo, int azucar) {
        this.tipo = tipo;
        this.azucar = azucar;
    }

    azucar() {
       
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getAzucar() {
        return azucar;
    }

    public void setAzucar(int azucar) {
        this.azucar = azucar;
    } 
    public void masazucar(){
        if(azucar<6){
            azucar++;
        }
        
    }
    public void menosazucar(){
        if (azucar>0){
            azucar--;
        }
    }}
