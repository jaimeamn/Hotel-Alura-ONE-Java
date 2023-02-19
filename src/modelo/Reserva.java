package modelo;

import java.sql.Date;


public class Reserva {
	
	private Integer id;
	private Date fechaEntrada;
	private Date fechaSalida;
	private String valor;
	
	
	public Reserva(Date fechaEntrada, Date fechaSalida, String valor, String formaPago) {
		super();
		this.fechaEntrada = fechaEntrada;
		this.fechaSalida = fechaSalida;
		this.valor = valor;
		this.formaPago = formaPago;
	}
	
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Date getFechaEntrada() {
		return fechaEntrada;
	}
	public Date getFechaSalida() {
		return fechaSalida;
	}
	public String getValor() {
		return valor;
	}
	public String getFormaPago() {
		return formaPago;
	}
	private String formaPago;

}
