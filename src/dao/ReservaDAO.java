package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

import modelo.Reserva;

public class ReservaDAO {
	
	private Connection connection;
	
	public ReservaDAO(Connection connection) {
		this.connection = connection;
	}

	public void guardar (Reserva reserva) {
		
		String sql = "INSERT INTO reservas (fecha_entrada,fecha_salida,valor,valor_pago" + "VALUES (?,?,?,?)";
		
		try (PreparedStatement pstm = connection.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS)){
			
			pstm.setDate(1, reserva.getFechaSalida());
			pstm.setDate(2, reserva.getFechaSalida());
			pstm.setString(3, reserva.getValor());
			pstm.setString(4, reserva.getFormaPago());
			
			pstm.executeUpdate();
			
			try (ResultSet rst = pstm.getGeneratedKeys()){
				
			 while (rst.next()) {
				reserva.setId(rst.getInt(1));
				
			} 
			
		}
	}catch (Exception e) {
			// TODO: handle exception
		}
		
}
}
