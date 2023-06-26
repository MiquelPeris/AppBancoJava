package app_banco.modelos;

public class Cliente extends Usuario {
	
	private Integer idGestor;	
	private double saldo;
	
	public Cliente() {
		
	}

	public Cliente(Integer id, String usuario, String password, String correo, double saldo, Integer idGestor) {
		super(id,usuario,password,correo);
		this.saldo = saldo;
		this.idGestor = idGestor;
		
	}

	public Integer getIdGestor() {
		return idGestor;
	}

	public void setIdGestor(Integer idGestor) {
		this.idGestor = idGestor;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	
	public String toString() {
		return "CLIENTE" + "\nusuario: " + this.usuario + "\ncorreo: " + this.correo + "\nsaldo:" + this.saldo + "€\n";
	}
	

}
