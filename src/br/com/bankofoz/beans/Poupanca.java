package br.com.bankofoz.beans;

public class Poupanca extends Conta {
	
	private float rendimento;
	
	public void creditarRendimentos() {
	}
	
	
	

	public void setAll(float rendimento) {
		this.rendimento = rendimento;
	}


	@Override
	public String toString() {
		return "Poupanca [rendimento=" + rendimento + "]";
	}

	public Poupanca() {
		super();
	}

	public Poupanca(float rendimento) {
		super();
		this.rendimento = rendimento;
	}

	public float getRendimento() {
		return rendimento;
	}

	public void setRendimento(float rendimento) {
		this.rendimento = rendimento;
	}
	
	

}
