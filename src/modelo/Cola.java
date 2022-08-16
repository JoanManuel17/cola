/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.util.LinkedList;

/**
 *
 * @author JOAN
 */
public class Cola<T extends Base> {

    LinkedList<T> tope;

    public Cola() {
        tope = new LinkedList<>();
    }

    public void encolar(T elemeto) {
        tope.addFirst(elemeto);
    }

    public T desencolar() {

        return tope.removeLast();
    }

    public boolean estaVacia() {
        return tope.isEmpty();
    }

    @Override
    public String toString() {

        StringBuilder sb = new StringBuilder("[");
        for (T e : tope) {

            sb.append(" ").append(e.toString() + "\n");
        }
        sb.append("]");

        return sb.toString();
    }

}
