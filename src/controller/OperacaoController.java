package controller;

import model.Cliente;
import model.FilaGeneric;

public class OperacaoController {
	public void caixa(FilaGeneric<Cliente> fila) {
		while (!fila.isEmpty()) {
			try {
				Cliente cliente = fila.remove();

				float valorTotal = cliente.ValorPecas * cliente.QuantidadePecas;

				System.out.println(cliente.nome + " | Valor total da compra: R$" + valorTotal);

			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
}
