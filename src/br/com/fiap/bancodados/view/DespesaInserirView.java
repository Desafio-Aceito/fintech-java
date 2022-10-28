package br.com.fiap.bancodados.view;

import java.sql.Date;

import br.com.fiap.bancodados.dao.DespesaDao;
import br.com.fiap.bancodados.model.DespesaModel;

public class DespesaInserirView {

	public static void main(String[] args) {
		
		
		
		DespesaModel model = new DespesaModel ();
		
		model.setCd_despesa(600);
		model.setNr_conta("1245-6");
		model.setVl_despesa(400);
		model.setDt_despesa( Date.valueOf("2022-10-20"));
		
		model.setDs_despesa("conta luz");
		
		DespesaDao dao = new DespesaDao ();
		dao.insert(model);
		
		
		
		


	}

}
