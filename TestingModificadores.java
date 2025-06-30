import paquete1.Clase2;

public class TestingModificadores {
    public static void main(String[] args) {
        Padre papa = new Padre();
        Hijo chamaco  = new Hijo();
        Hijo chamaca = new Hijo();
        Clase2 objeto2 = new Clase2();

        // asignar valores a miembros de la clase Padre
        papa.setVariable2(15); // propiedad privada 
        papa.variable1 = 25;   // propiedad pública

        // Leer valores de los miembros de la clase Padre 
        System.out.println("Valor de variable2: " + papa.getVariable2());
        System.out.println("Valor de variable1: " + papa.variable1);

        chamaco.setVariable3(16);
        chamaco.setVarsPadre();
        System.out.println("Info de chamaco: " + chamaco.toString());

        chamaca.setVariable3(98);
        chamaca.variable1 = 32; //uso de la variable publica de hijo
        chamaca.setVariable2(29); //modificacion desde ekl testing
        System.out.println("Info de la chamaca: " + chamaca.toString());

        System.out.println();
        objeto2.x = 500;
        //Esto no se puede hacer por que y es protegida y testing esta en otro paquete o fuera del paquete 
        //objeto2.y = 100;
        objeto2.setZ(48);
        System.out.println(objeto2.getData());
    }
}
