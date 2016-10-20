
package Boletin5_4;

import javax.swing.JOptionPane;


public class Boletin5_4 {

   
    public static void main(String[] args) {
        Peso resultado=new Peso();
        float peso1=Float.parseFloat(JOptionPane.showInputDialog("Introduzca o peso da primeira persoa"));
        float peso2=Float.parseFloat(JOptionPane.showInputDialog("Introduzca o peso da segunda persoa"));
        resultado.resultado(peso1, peso2);
    }
    
}
