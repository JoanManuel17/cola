/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import datos.Persona;

/**
 *
 * @author joan.penna
 */
public class OperacionesCola {

    public static <T extends Base> Cola<T> colaDuplicada(Cola<T> colaOriginal) {

        Cola<T> coladuplicada = new Cola<>();
        Cola<T> pilaaux = new Cola<>();

        while (!colaOriginal.estaVacia()) {
            T elemento = colaOriginal.desencolar();
            pilaaux.encolar(elemento);

        }
        while (!pilaaux.estaVacia()) {
            T elemento = pilaaux.desencolar();
            T copiaelemento = (T) elemento.copy();

            colaOriginal.encolar(elemento);
            coladuplicada.encolar(copiaelemento);
        }
        return coladuplicada;
    }

    public static <T extends Base> Cola<T> filtarInicial(Cola<T> colaOriginal) {
        Cola<T> colaD = colaDuplicada(colaOriginal);
        Cola<T> colaFiltrada = new Cola<>();
        while (!colaD.estaVacia()) {
            T elemento = colaD.desencolar();
            Persona objP = (Persona) elemento;
            String nombre = objP.getNombre();
            if (nombre.charAt(0) == 'D') {
                colaFiltrada.encolar(elemento);
            }
        }
        return colaFiltrada;
    }
}
