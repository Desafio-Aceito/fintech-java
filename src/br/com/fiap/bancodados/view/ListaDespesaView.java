package br.com.fiap.bancodados.view;

import java.util.List;

import br.com.fiap.bancodados.dao.DespesaDao;
import br.com.fiap.bancodados.model.DespesaModel;

public class ListaDespesaView {
	
	public static void main(String[] args) {
		
		DespesaDao dao = new DespesaDao();
		List<DespesaModel> listaDespesa = dao.findAll();
		
		for (DespesaModel despesaModel: listaDespesa) {
			System.out.println(despesaModel);
		}
		
		
	}

}
