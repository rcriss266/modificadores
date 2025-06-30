public class Hijo  extends Padre {
    private int variable3;
    public int variable1;

    public Hijo(){
        super();
    }

    public int getVariable3() {
        return variable3;
    }

    public void setVariable3(int variable3) {
        this.variable3 = variable3;
    }
    //Modificar las variables de la clase Padre
    public void setVarsPadre(){
        super.variable1 = 500; //propiedad publica del padre
        this.variable1 = 250;// Propiedad publica 
        super.setVariable2(-12); // propiedad privada 
    }

    @Override
    public String toString() {
        return super.toString() + "Hijo [variable3=" + variable3 + "variable1= " + this.variable1 + "]";
    }

    
    
}
