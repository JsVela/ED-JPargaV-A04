/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ed.jpargav.a04;
import java.util.Scanner;
/**
 *
 * @author JESUS PARGA VELA
 */
public abstract class Busquedas { //Abstract significa que no puedes instanciar un objeto u objetos
    //Atributos
    protected int []vector;
    Scanner s = new Scanner(System.in);
    
    //Métodos
    public void setVector(){
       System.out.println("Dime el tamaño del vector: ");
       int n = s.nextInt();
       vector = new int[n];
       System.out.println("Dame los valores para el vector: ");
       for(int pos = 0;pos < n;pos++){
           vector[pos] = s.nextInt();
       } 
    }
    public int[] getVector(){
        return vector;
    }
    public int queBusco(){
        System.out.println("Cuál elemento buscas: ");
        int num = s.nextInt();
        return num;
    }
    public void muestraVector(){
       for(int pos = 0;pos < vector.length;pos++){
           System.out.print("[" +vector[pos] + " ]  ");
           
    }
        System.out.println("");
  }     
    public void muestraResultado(int pos,int num){
       System.out.println("El valor "+ num + " se encuentra en la posición: "+ pos); 
    }
    public abstract int Buscar(int num);
        
    
}
