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
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Programa de manipulação de pessoas (polimorfismo)");
        
        //instanciando um Tutor...
        Tutor tutor = new Tutor();
        tutor.setNome("LULA");
        tutor.setIdade(55);
        tutor.setFormacao("Pós Doc em computação.");
        
        //instanciando um Jovem...
        Jovem jovem = new Jovem();
        jovem.setNome("Gustavo");
        jovem.setIdade(26);
        jovem.setHobby("Futebol");
        
        //instanciando uma criança...
        Crianca crianca = new Crianca();
        crianca.setResponsavel("Márcia");
        crianca.setNome("Daniel");
        crianca.setIdade(5);
        
        //saudação do tutor...
        System.out.println(tutor.saudacao(jovem));
        
        //saudação do jovem...
        System.out.println(jovem.saudacao(tutor));
        
        //saudação da criança...
        System.out.println(crianca.saudacao(jovem));
        System.out.println(crianca.saudacao(tutor));
    }
}
