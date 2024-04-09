package model;

public class Cliente {
	public String nome;
	public int QuantidadePecas;
	public float ValorPecas;

	public Cliente(String nome, int quantidadePecas, float valorPecas) {
		this.nome = nome;
		this.QuantidadePecas = quantidadePecas;
		this.ValorPecas = valorPecas;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getQuantidadePecas() {
		return QuantidadePecas;
	}

	public void setQuantidadePecas(int quantidadePecas) {
		QuantidadePecas = quantidadePecas;
	}

	public float getValorPecas() {
		return ValorPecas;
	}

	public void setValorPecas(float valorPecas) {
		ValorPecas = valorPecas;
	}

}
