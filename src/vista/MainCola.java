/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import datos.Productos;
import modelo.Cola;
import modelo.OperacionesCola;

/**
 *
 * @author JOAN
 */
public class MainCola {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Cola<Productos> colaC = new Cola<>();
        colaC.encolar(new Productos("Arroz", 2, 5000));
        colaC.encolar(new Productos("Lentejas", 3, 7000));
        colaC.encolar(new Productos("Pollo", 4, 15000));
        colaC.encolar(new Productos("Atun", 3, 20000));
        colaC.encolar(new Productos("Tomate", 2, 4000));
        colaC.encolar(new Productos("Aguate", 1, 5000));

        System.out.println("Pila \n" + colaC.toString());

        colaC.desencolar();
        System.out.println("Pila \n"+ colaC.toString());
        
        Cola<Productos> pd = OperacionesCola.colaDuplicada(colaC);
        System.out.println("Cola Duplicada\n" + pd.toString());

    }

}
    
