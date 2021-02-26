/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pessoa;

/**
 *
 * @author Gustavo
 */
public class Pessoa {

    protected String _nome;
    protected int _idade;

    public String getNome() {
        return this._nome;
    }

    public int getIdade() {
        return this._idade;
    }

    public void setNome(String nome) {
        this._nome = nome;
    }

    public void setIdade(int idade) {
        this._idade = idade;
    }

    public String saudacao(Pessoa modelo) {
        if (modelo == null) {
            return "Olá!";
        }

        return "Olá " + modelo.getNome();
    }
}
