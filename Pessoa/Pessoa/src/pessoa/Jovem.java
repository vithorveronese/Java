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
public class Jovem extends Pessoa {

    protected String _hobby;

    public void setHobby(String hobby) {
        this._hobby = hobby;
    }

    public String getHobby() {
        return this._hobby;
    }

    @Override
    public String saudacao(Pessoa modelo) {
        if (modelo == null) {
            return "Iai jovem!";
        }

        return "Iai jow";
    }
}
