package app_banco.modelos;

public class Usuario {

	protected Integer id;
	protected String usuario;
	protected String password;
	protected String correo;
	
	public Usuario() {
		
	}

	public Usuario(Integer id, String usuario, String password, String correo) {
		this.id = id;
		this.usuario = usuario;
		this.password = password;
		this.correo = correo;
		
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getUsuario() {
		return usuario;
	}

	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getCorreo() {
		return correo;
	}

	public void setCorreo(String correo) {
		this.correo = correo;
	}

	public String toString() {
		return "CLIENTE" + "\nusuario: " + this.usuario + "\ncorreo: " + this.correo + "\nsaldo: €\n";
	}

	public boolean equals(Object o) {
		Usuario u = (Usuario) o;
		boolean mismoId = this.id == u.id;
		return mismoId;
		}


}
