package stack_java;

public class Nodo {
	private String _valor;
    private Nodo _anterior;

    public void setValor(String valor) {
    	this._valor = valor;
    }
    
    public String getValor() {
    	return this._valor;
    }
    
    public void setAnterior(Nodo no) {
    	this._anterior = no;
    }
    
    public Nodo getAnterior() {
    	return this._anterior;
    }
}
