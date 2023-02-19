package factory;

import java.awt.image.BandCombineOp;
import java.sql.Connection;
import java.sql.SQLException;

import javax.sql.DataSource;

import com.mchange.v2.c3p0.ComboPooledDataSource;

public class ConnectionFactory {
	public DataSource dataSource;
	
	public ConnectionFactory() {
		ComboPooledDataSource comobopooled = new ComboPooledDataSource();
		comobopooled.setJdbcUrl("jdbc:mysql://localhost:3306/hotelaluralatam?useTimezone=true&serverTimezone=UTC");
		comobopooled.setUser("root");
		comobopooled.setPassword("java9017");
		
		this.dataSource = comobopooled;
	}
	
	public Connection recuperarConexion() {
		try {
			return this.dataSource.getConnection();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			throw new RuntimeException(e);
		}
	}

}
