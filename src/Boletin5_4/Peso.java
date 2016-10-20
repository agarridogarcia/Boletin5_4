
package Boletin5_4;


public class Peso {
    private float peso1, peso2;
    //constructores
    public Peso(){
        peso1=0;
        peso2=0;
    }
    public Peso (float p1, float p2){
        peso1=p1;
        peso2=p2;
    }
    //métodos
    public void resultado(float p1, float p2){
        if (p1>p2)
            System.out.println("A diferencia de peso é " + (p1-p2) + "kg. A primeira persoa pesa máis.");
        else if (p2>p1)
            System.out.println("A diferencia de peso é " + (p2-p1) + "kg. A segunda persoa pesa máis.");
            else 
            System.out.println("Pesan o mesmo");
    }
    
}
