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
public class Binaria extends Busquedas {//La clase Binaria hereda de la clase Busquedas los atributos y los métodos
    @Override//Se aplica polimorfismo
    public int Buscar(int num){//sobreescribe el método Buscar de la clase abstracta Busquedas
        int inicio = 0, fin = vector.length - 1, centro=0;
        while (inicio <= fin ) {
            centro = (inicio + fin) / 2;
            if (num == vector[centro]) {
                return centro;
            } else if (num < vector[centro]) {
                fin = centro - 1;
            } else {
                inicio = centro + 1;
            }
        }
        if (inicio > fin) {
            System.out.println("No existe el elemento en búsqueda binaria");
            return -1;
        }
        return centro;
    }
}
