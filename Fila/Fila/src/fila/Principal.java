/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fila;

import java.io.Console;
import java.util.Scanner;

/**
 *
 * @author Gustavo
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String opcao = "", valor;
        Fila minhafila = new Fila();

        System.out.println("Sistema em Java para testar a execução de uma fila circular\n");

        do {
            try {
                System.out.println("\n\nDigite: 1->Enfileirar 2->Desenfileirar "
                        + "3-> Tamanho   4-> Listar Fila 9->Sair");
                Scanner scanner = new Scanner(System.in);
                
                opcao = scanner.nextLine();

                switch (opcao) {
                    case "1":
                        System.out.println("Digite um valor para enfileirar: ");
                        scanner = new Scanner(System.in);
                        minhafila.enfileirar(scanner.nextLine());

                        break;
                    case "2":
                        System.out.println("Desenfileirado: " + minhafila.desenfileira());
                        break;
                    case "3":
                        System.out.println("Tamanho da fila: " + minhafila.getTamanho());
                        break;
                    case "4":
                        System.out.println(minhafila.listagem());
                        break;
                    case "9":
                        System.out.println("Saindo do sistema...");
                        break;
                    default:
                        System.out.println("Opção inválida!!!");
                        break;
                }
            } catch (Exception erro) {
                System.out.println(erro.getMessage());
            }
        } while (opcao != "9");
    }
}
