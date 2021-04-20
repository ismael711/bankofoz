package br.com.bankofoz.beans;

public class Corrente extends Conta {
	
	private float limite;
	private float taxa;
	
	public boolean sacar(float valor) {
		if (valor>0) {
			return true;
		}
		return false;
	}
	
	public void debitarTaxa() {
		super.setSaldo(super.getSaldo() - taxa);
	}
	
	public void aumentarLimite(float porc) {
		
	}
	
	public void setAll(float limite, float taxa) {
		this.limite = limite;
		this.taxa = taxa;
	}

	@Override
	public String toString() {
		return "Corrente [limite=" + limite + ", taxa=" + taxa + "]";
	}

	public Corrente() {
		super();
	}

	public Corrente(float limite, float taxa) {
		super();
		this.limite = limite;
		this.taxa = taxa;
	}

	public float getLimite() {
		return limite;
	}

	public void setLimite(float limite) {
		this.limite = limite;
	}

	public float getTaxa() {
		return taxa;
	}

	public void setTaxa(float taxa) {
		this.taxa = taxa;
	}
	
	
	
	

}
