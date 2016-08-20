/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ed.jpargav.a04;

/**
 *
 * @author JESUS PARGA VELA
 */
public class EDJPargaVA04 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //Se crean los onjetos de las clases Secuencial y Binaria
        Secuencial sec = new Secuencial();
        Binaria bin = new Binaria();
        //Se aplican los métodos con la clase Secuencial
        sec.setVector();
        sec.muestraVector();
        int num = sec.queBusco();
        int pos = sec.Buscar(num);
        sec.muestraResultado(pos,num);
        //Se aplican los métodos con la clase Binaria
        bin.setVector();
        bin.muestraVector();
        num = bin.queBusco();
        pos = bin.Buscar(num);
        bin.muestraResultado(pos,num);
    }
    
}
