package view;

import controller.OperacaoController;
import model.Cliente;
import model.FilaGeneric;

public class Main {
	public static void main(String[] args) {

		FilaGeneric<Cliente> f = new FilaGeneric<>();

		for (int i = 1; i <= 20; i++) {
			String nome = "Cliente" + i;
			int quantidadeDePecas = (int) (Math.random() * (50 - 20 + 1) + 20);
			float valorDasPecas = 5.00f + (95.00f) * (float) Math.random();

			Cliente cliente = new Cliente(nome, quantidadeDePecas, valorDasPecas);
			f.insert(cliente);
		}

		OperacaoController ctrlOperacao = new OperacaoController();
		ctrlOperacao.caixa(f);

	}
}
