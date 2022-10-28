package br.com.fiap.bancodados.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.sql.Date;
import java.util.List;
import br.com.fiap.bancodados.model.DespesaModel;

public class DespesaDao {

	public DespesaModel findByCd_despesa (int cd_despesa) {
	  String query = "SELECT * FROM T_DESPESA WHERE cd_despesa = ? ";
		PreparedStatement stmt = null;
    ResulltSet res = null;
    Connection conn = null;
    DespesaModel despesaModel = null;
		
		try {
			conn = DAO.makeConn();
	    
      stmt = conn.prepareStatement(query);
      stmt.setString(1, cd_despesa);
			res = stmt.execute();
			
			if (rs.next()) {
				despesaModel = new DespesaModel();
				despesaModel.setCd_despesa(rs.getInt("cd_despesa"));
				despesaModel.setNr_conta(rs.getString("nr_conta"));
				despesaModel.setVl_despesa(rs.getDouble("vl_despesa"));
				despesaModel.setDt_despesa(rs.getDate("dt_despesa"));
				despesaModel.setDs_despesa(rs.getString("ds_despesa"));
			}
			
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
      	if(stmt != null) {
				  stmt.close();
			  }
      
			if(conn != null) {
				conn.close();
			}
    }
		return despesaModel;
	}

	public List<DespesaModel> findAll () {
		String query = "SELECT * FROM T_DESPESA";

		List<DespesaModel> listaDespesa = new ArrayList<DespesaModel>();
	  PreparedStatement stmt = null;
		Connection conn = null;
    ResultSet res = null;

		try {
			conn = DAO.makeConn();
		  stmt = conn.prepareStatement();
		  res = stmt.execute();
		
			while ( res.next()) {
				DespesaModel despesaModel = new DespesaModel();
				
        despesaModel.setCd_despesa(rs.getInt("cd_despesa"));
				despesaModel.setNr_conta(rs.getString("nr_conta"));
				despesaModel.setVl_despesa(rs.getDouble("vl_despesa"));
				despesaModel.setDt_despesa(rs.getDate("dt_despesa"));
				despesaModel.setDs_despesa(rs.getString("ds_despesa"));
				
				listaDespesa.add(despesaModel);				
			}
	
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {

			if(stmt != null) {
				stmt.close();
			}
      
			if(conn != null) {
				conn.close();
			}
		}
		
		
		return listaDespesa;
	}


	public void insert (DespesaModel despesaModel) {
		
		String query = "INSERT INTO T_DESPESA (cd_despesa, nr_conta, vl_despesa, dt_despesa, ds_despesa) VALUES (? ,? ,? , ?, ?)";
		Connection conn = null;
    PreparedStatement stmt = null;
		
    try {	
			conn = DAO.makeConn(); 
			
			stmt = conn.prepareStatement(query);
			
	    stmt.setInt(1,despesaModel.getCd_despesa());
		  stmt.setString(2,despesaModel.getNr_conta());
		  stmt.setDouble(3,despesaModel.getVl_despesa());
		  stmt.setDate(4,new Date(despesaModel.getDt_despesa().getTime()));
		  stmt.setString(5,despesaModel.getDs_despesa());
					
			stmt.execute();
			
      System.out.println("Insert Successfully");
			
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
			
		}finally {
			
			if(stmt != null) {
				stmt.close();
			}
			if(conn != null) {
				conn.close();
			}
		}
	}
}
