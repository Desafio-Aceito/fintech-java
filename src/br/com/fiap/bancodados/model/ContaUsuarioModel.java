package br.com.fiap.bancodados.model;

public class ContaUsuarioModel {
	
	private String nr_conta;
	private String dt_abertura;
	private String dt_fechamento;

	public ContaUsuarioModel(String nr_conta, String dt_abertura, String dt_fechamento) {
		this.nr_conta = nr_conta;
		this.dt_abertura = dt_abertura;
		this.dt_fechamento = dt_fechamento;
	}
	

	public String getNr_conta() {
		return nr_conta;
	}

	public void setNr_conta(String nr_conta) {
		this.nr_conta = nr_conta;
	}

	public String getDt_abertura() {
		return dt_abertura;
	}

	public void setDt_abertura(String dt_abertura) {
		this.dt_abertura = dt_abertura;
	}

	public String getDt_fechamento() {
		return dt_fechamento;
	}

	public void setDt_fechamento(String dt_fechamento) {
		this.dt_fechamento = dt_fechamento;
	}
	
	

}
