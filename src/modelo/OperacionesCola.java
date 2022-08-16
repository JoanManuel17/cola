/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author joan.penna
 */
public class OperacionesCola {

    public static <T extends Base> Cola<T> colaDuplicada(Cola<T> colaOriginal) {

        Cola<T> piladuplicada = new Cola<>();
        Cola<T> pilaaux = new Cola<>();

        while (!colaOriginal.estaVacia()) {
            T elemento = colaOriginal.desencolar();
            pilaaux.encolar(elemento);

        }
        while (!pilaaux.estaVacia()) {
            T elemento = pilaaux.desencolar();
            T copiaelemento = (T) elemento.copy();

            colaOriginal.encolar(elemento);
            piladuplicada.encolar(copiaelemento);
        }
        return piladuplicada;
    }
    
}
