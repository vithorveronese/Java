/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fila;

/**
 *
 * @author Gustavo
 */
public class Nodo {

    private String _valor;

    public String getValor() {
        return this._valor;
    }

    public void setValor(String valor) {
        this._valor = valor;
    }

    private Nodo _proximo = null;

    public void setProximo(Nodo novo) {
        this._proximo = novo;
    }

    public Nodo getProximo() {
        return this._proximo;
    }
}
