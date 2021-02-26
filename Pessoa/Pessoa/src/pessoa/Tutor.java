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
public class Tutor extends Pessoa {

    protected String _formacao;

    public void setFormacao(String formacao) {
        this._formacao = formacao;
    }

    public String getFormacao() {
        return this._formacao;
    }

    @Override
    public String saudacao(Pessoa modelo) {
        if (modelo == null) {
            return "Olá meu caro(a)";
        }

        return "Olá Sr(a). " + modelo.getNome() + ". Como está?";
    }
}
