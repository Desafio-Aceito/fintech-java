package br.com.fiap.bancodados.view;

import java.sql.Date;
import java.text.SimpleDateFormat;


public class ConvertStringToDate {

	public static void main(String[] args) {
		
		String strDate = "08/12/2022";
		Date dataCorreta = new SimpleDateFormat("dd/MM/yyyy").parse(strDate);
		System.out.println(data.Correta);
		
	}
}
