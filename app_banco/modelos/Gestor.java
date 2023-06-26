package app_banco.modelos;

public class Gestor extends Usuario {
	
	private String oficina;
	
	public Gestor() {
		
	}

	public Gestor(Integer id, String usuario, String password, String correo) {
		super(id,usuario,password,correo);
		
	}
	
	public Gestor(Integer id, String usuario, String password, String correo, String oficina) {
		super(id,usuario,password,correo);
		this.oficina = oficina;
		
	}

	public String getOficina() {
		return oficina;
	}

	public void setOficina(String oficina) {
		this.oficina = oficina;
	}

	public String toString() {
		return "GESTOR \nid: " + this.id +"| Usuario: " + this.usuario + "| Correo: " + this.correo + "| Oficina: " + this.oficina + "\n";
	}

	public boolean equals(Object o) {
		Gestor g = (Gestor) o;
		boolean mismoId = this.id == g.id;
		return mismoId;
		}

}
