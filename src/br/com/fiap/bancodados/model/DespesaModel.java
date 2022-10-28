package br.com.fiap.bancodados.model;

import java.sql.Date;

public class DespesaModel{
	
    private int cd_despesa;
    private String nr_conta;
  	private double vl_despesa;
	  private Date dt_despesa;
	  private String ds_despesa;
    public DespesaModel () {}

	

	public DespesaModel(int cd_despesa, String nr_conta, double vl_despesa, Date dt_despesa, String ds_despesa) {
		super();
		
		this.cd_despesa = cd_despesa;
		this.nr_conta = nr_conta;
		this.vl_despesa = vl_despesa;
		this.dt_despesa = dt_despesa;
		this.ds_despesa = ds_despesa;
	}



	public int getCd_despesa() {
		return cd_despesa;
	}


	public void setCd_despesa(int cd_despesa) {
		this.cd_despesa = cd_despesa;
	}


	public String getNr_conta() {
		return nr_conta;
	}


	public void setNr_conta(String nr_conta) {
		this.nr_conta = nr_conta;
	}


	public double getVl_despesa() {
		return vl_despesa;
	}


	public void setVl_despesa(double vl_despesa) {
		this.vl_despesa = vl_despesa;
	}


	public Date getDt_despesa() {
		return dt_despesa;
	}


	public void setDt_despesa(Date dt_despesa) {
		this.dt_despesa = dt_despesa;
	}


	public String getDs_despesa() {
		return ds_despesa;
	}


	public void setDs_despesa(String ds_despesa) {
		this.ds_despesa = ds_despesa;
	}



	@Override
	public String toString() {
		return "DespesaModel [cd_despesa=" + cd_despesa + ", nr_conta=" + nr_conta + ", vl_despesa=" + vl_despesa
				+ ", ds_despesa=" + ds_despesa + "]";
	}

	
	
}
