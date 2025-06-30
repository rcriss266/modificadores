package paquete1;

public class Clase2 extends Clase1 {

    //Clase2 hereda de Clase1 y ambas estan en el mismo paquete 
    //Por eso Clase2 puede usar los datos de Clase1 como si fueran suyos

    public void setData(){
        super.x = 12; //public
        this.y = 9; //protected
        setZ(18); //private
    }
    
    public String getData(){
        return "Datos de Clase2; x=" + this.x + " y= " + this.y + " z= " + getZ();
    }
}
