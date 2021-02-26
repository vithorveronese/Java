package stack_java;

public class Stack {
	private Nodo topo = null;

    int _quantidade = 0;
    
    public int getQuantidade()
    {
      return this._quantidade;
    }

    public void Empilhar(String valor)
    {
      Nodo novoNodo = new Nodo();
      novoNodo.setValor(valor);
      novoNodo.setAnterior(topo);

      topo = novoNodo;
      this._quantidade++;
    }
    
    public String Desempilhar() throws Exception
    {
      if (this._quantidade == 0)
        throw new Exception("A pilha está vazia!");
      else
      {
        String retorno = topo.getValor();
        
        topo = topo.getAnterior();
        
        this._quantidade--;
        
        return retorno;
      }
    }

    public String RetornaTopo() throws Exception
    {
      if (this._quantidade == 0)
        throw new Exception("A pilha está vazia!");
      else
      {
        return topo.getValor();
      }
    }


    public String Listar()
    {
      String r = "";
      Nodo aux = topo;
      
      while (aux != null)
      {
        r += aux.getValor() + "-";
        aux = aux.getAnterior();
      }
      
      return r;
    }
}
