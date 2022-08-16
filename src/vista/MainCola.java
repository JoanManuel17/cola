/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import datos.Persona;
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
        Cola<Persona> colaC = new Cola<>();
        colaC.encolar(new Persona("Joan", "314", "uao"));
        colaC.encolar(new Persona("Miguel", "312", "uao"));
        colaC.encolar(new Persona("Elian", "312", "uao"));
        colaC.encolar(new Persona("Vidal", "315", "uao"));
        colaC.encolar(new Persona("David", "312", "uao"));
        colaC.encolar(new Persona("Laura", "316", "uao"));

        System.out.println("Pila \n" + colaC.toString());

        colaC.desencolar();
        System.out.println("Pila \n"+ colaC.toString());
        
        Cola<Persona> pd = OperacionesCola.colaDuplicada(colaC);
        System.out.println("Cola Duplicada\n" + pd.toString());

    }

}
    
