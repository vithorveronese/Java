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
public class Fila {

    private int _quantidade = 0; // qtde de elementos enfileirados
    private Nodo _inicio = null; // indica qual a primeira posiÃ§Ã£o da fila
    private Nodo _fim = null; // indica a prÃ³xima posiÃ§Ã£o

    // retorna o tamanho da fila
    public int getTamanho() {
        return this._quantidade;
    }

    // enfileira um valor string
    public void enfileirar(String p_valor) {
        Nodo novo = new Nodo();

        novo.setValor(p_valor);
        novo.setProximo(null);

        if (this._quantidade == 0) {
            this._inicio = novo;
        } else {
            this._fim.setProximo(novo);
        }

        this._fim = novo;
        this._quantidade++;
    }

    // remove o primeiro elemento da fila e devolve.
    public String desenfileira() throws Exception {
        if (this._quantidade == 0) {
            throw new Exception("A fila está¡ vazia!");
        } else {
            String valor = this._inicio.getValor();
            this._inicio = this._inicio.getProximo();
            this._quantidade--;

            if (this._quantidade == 0) {
                this._fim = null;
            }

            return valor;
        }
    }

    public String listagem() {
        String retorno = "";

        Nodo aux = this._inicio;

        while (aux != null) {
            retorno = retorno + aux.getValor() + " - ";
            aux = aux.getProximo();
        }
        
        retorno = retorno.substring(0, retorno.length() - 3);

        return retorno;
    }
}
