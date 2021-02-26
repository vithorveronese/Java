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
public class Crianca extends Pessoa {

    public String _responsavel;

    public void setResponsavel(String responsavel) {
        this._responsavel = responsavel;
    }

    public String getResponsavel() {
        return this._responsavel;
    }

    @Override
    public String saudacao(Pessoa modelo) {
        if (modelo == null) {
            return "Oi Tio(a)!";
        }

        return "Oi Tio(a) " + modelo.getNome();
    }
}
