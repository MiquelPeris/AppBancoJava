package app_banco.modelos;

import java.util.Date;

public class Transferencia {

	private Integer id;
	private String idOrdenante;
	private String idBeneficiario;
	private Double importe;
	private String concepto;
	private Date fecha;
	
	public Transferencia() {
		
	}

	public Transferencia(Integer id, String idOrdenante, String idBeneficiario, Double importe, String concepto) {
		this.id = id;
		this.idOrdenante = idOrdenante;
		this.idBeneficiario = idBeneficiario;
		this.importe = importe;
		this.concepto = concepto;
		this.fecha = new Date();
		
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getIdOrdenante() {
		return idOrdenante;
	}

	public void setIdOrdenante(String idOrdenante) {
		this.idOrdenante = idOrdenante;
	}

	public String getIdBeneficiario() {
		return idBeneficiario;
	}

	public void setIdBeneficiario(String idBeneficiario) {
		this.idBeneficiario = idBeneficiario;
	}

	public Double getImporte() {
		return importe;
	}

	public void setImporte(Double importe) {
		this.importe = importe;
	}

	public String getConcepto() {
		return concepto;
	}

	public void setConcepto(String concepto) {
		this.concepto = concepto;
	}

	public Date getFecha() {
		return fecha;
	}

	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}
	
	public String toString() {
		return "TRANSFERENCIA \nDe: " + this.idOrdenante +"\nPara: " + this.idBeneficiario + "\nConcepto: " + this.concepto +"\nPor un total de: " + importe + "€"+"\n";
	}


}
