package app_banco.pruebas;

import app_banco.modelos.Cliente;
import app_banco.modelos.Gestor;
import app_banco.modelos.Mensaje;
import app_banco.modelos.Transferencia;

public class PruebaGestor {


	public static void main(String[] args) {
		
		Cliente cliente = new Cliente(1, "Be", "12321424", "be@correo.com", 200, 1);
		
		cliente.setSaldo(20);
		
		System.out.println(cliente);	

		
		
		Mensaje mensaje = new Mensaje(1, "A", "B", "");
		
		mensaje.setTexto("AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
		
		System.out.println(mensaje);


		
		Transferencia transferencia = new Transferencia(1, "A", "Be", 300.00, "Porque C");
		
		System.out.println(transferencia);
		
		Gestor gestor = new Gestor(1, "paco", "1234", "paco@corre.com");
		Gestor gestorB = new Gestor();
		Gestor gestorC = new Gestor(1, "paco", "1234", "paco@corre.com");
		
		gestorB.setId(2);
		gestorB.setUsuario("ana");
		gestorB.setPassword("5678");
		gestorB.setCorreo("ana@corre.com");


		
		System.out.println(gestor);
		
		if(gestor.equals(gestorB)) {
			System.out.println("Son el mismo gestor");
		} else {
			System.out.println("Son gestores distintos");
		}
		
		if(gestor.equals(gestorC)) {
			System.out.println("Son el mismo gestor");
		} else {
			System.out.println("Son gestores distintos");
		}

	}

}
