package app_banco.modelos;

import java.util.Date;

public class Mensaje {
	
	private Integer id;
	private String idOrigen;
	private String idDestino;
	private String texto;
	private Date fecha;
	public Integer getId() {
		return id;
	}
	
	public Mensaje() {
		
	}
	
	public Mensaje(Integer id, String idOrigen, String idDestino, String texto) {
		this.id = id;
		this.idOrigen = idOrigen;
		this.idDestino = idDestino;
		this.texto = texto;
		this.fecha = new Date();
		
	}

	public String getIdOrigen() {
		return idOrigen;
	}

	public void setIdOrigen(String idOrigen) {
		this.idOrigen = idOrigen;
	}

	public String getIdDestino() {
		return idDestino;
	}

	public void setIdDestino(String idDestino) {
		this.idDestino = idDestino;
	}

	public String getTexto() {
		return texto;
	}

	public void setTexto(String texto) {
		this.texto = texto;
	}

	public Date getFecha() {
		return fecha;
	}

	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String toString() {
		return "MENSAJE \nFrom: " + this.idOrigen +"\nTo: " + this.idDestino + "\nMensaje:" + "\n" + this.texto +"\n el día: " + fecha + "\n";
	}

}
