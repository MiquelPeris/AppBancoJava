package app_banco.pruebas;

import java.util.ArrayList;
import java.util.List;

import Banco.util.Utiles;
import app_banco.modelos.Gestor;

public class PruebaUtil {

	public static void main(String[] args) {
		
		// nombre y apellido

		String nombreAleatorio = Utiles.nombreAleatorio(Utiles.NOMBRES, Utiles.APELLIDOS);

		System.out.println(nombreAleatorio);
		
		nombreAleatorio = Utiles.nombreAleatorio();

		System.out.println(nombreAleatorio);
		
		String[] nombres = {"Juan", "Antonio", "Paco", "Laura", "Ana", "Claudia", "Pedro", "María", "Omar", "Clara", "Silvia"};
		String[] apellidos = {"Pérez", "Garcia", "Sánchez", "Martín", "Gómez", "Cuevas", "Giménez"};
		
		nombreAleatorio = Utiles.nombreAleatorio(nombres, apellidos);
		System.out.println(nombreAleatorio);
		
		// correo

		String correoAleatorio = Utiles.correoAleatorio(Utiles.USUARIOS, Utiles.CORREOS);
		
		System.out.println(correoAleatorio);
		
		String oficinaAleatoria = Utiles.oficinaAleatoria(Utiles.OFICINAS);
		
		// guardar los gestores
		List<Gestor> gestores = new ArrayList<>();
		
		// generador de gestores
		
		for(int i = 0; i < 10; i++) {
			String usuario = Utiles.nombreAleatorio();
			String correo = Utiles.correoAleatorio();
			String password = "****";
			Gestor gestor = new Gestor(i+1, usuario, password, correo);
			gestores.add(gestor);
		}
		
		System.out.println(gestores);
		

	}

}
