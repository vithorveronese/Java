package stack_java;
import java.io.*;

public class ConsoleController {
	 public static void main ( String [] arguments )
	 {
         int opcao = 0;
         String valor;
         Stack minhaPilha = new Stack();
         Console console = System.console();
         
         do
         {
             try
             {
            	 opcao = Integer.parseInt(console.readLine("\n\n Escolha: 1-> empilha 2->desempilha " +
                 " 3->topo 4-> tamanho 9-> sair : "));
            	 
                 if (opcao == 1)
                 {
                	 System.out.println(">>Digite o valor que deseja empilhar: ");                     
                     valor = console.readLine();
                     minhaPilha.Empilhar(valor);
                 }
                 else if (opcao == 2)
                 {
                     valor = minhaPilha.Desempilhar();
                     System.out.println(">>Desempilhado: "+ valor + " \n\n");
                 }
                 else if (opcao == 3)
                 {
                     valor = minhaPilha.RetornaTopo();
                     System.out.println(">>Valor no topo: " + valor + "\n\n");
                 }
                 else if (opcao == 4)
                 {
                	 System.out.println(">>Tamanho da pilha: " + minhaPilha.getQuantidade());
                 }
                 else if (opcao == 9)
                 {
                     //getout
                 }
             }
             catch (Exception erro)
             {
            	 System.out.println("ERRO: " + erro.getMessage());
             }
         }
         while (opcao != 9);
	 }
}
