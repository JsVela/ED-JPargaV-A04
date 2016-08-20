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
public class Secuencial extends Busquedas{//Abstract significa que no puedes instanciar un objeto u objetos
    @Override//Se aplica polimorfismo
    public int Buscar(int num){//sobreescribe el método Buscar de la clase abstracta Busquedas
        boolean ban = false;
        int i;
        for (i = 0; i < vector.length && !ban; i++) {
            if (vector[i] == num) {
                System.out.println("Lo encontraste");
                ban = true;
            }
        }
        if (!ban) {
            System.out.println("No existe el elemento en búqueda secuencial");
            i = -1;
        }
        return i-1;
    }  
    
}
