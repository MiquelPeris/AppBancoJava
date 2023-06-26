package Banco.util;

import java.util.Random;

public class Utiles{
	
	
	public static final String[] NOMBRES = {"Juan", "Antonio", "Paco", "Laura", "Ana", "Claudia", "Pedro", "María", "Omar", "Clara", "Silvia"};
	
	public static final String[] APELLIDOS = {"Pérez", "Garcia", "Sánchez", "Martín", "Gómez", "Cuevas", "Giménez", "López", "Andiamo", "Rigoberto"};
	
	public static final String[] APELLIDOS2 = {"Pérez", "Garcia", "Sánchez", "Martín", "Gómez", "Cuevas", "Giménez", "López", "Andiamo", "Rigoberto"};
	
	public static final String[] USUARIOS = {"anamaria", "elmuchachito", "mi83amorsito","pantostado","quebuencorreo","carla1990"};
	
	public static final String[] CORREOS = {"@gmail.com","@hotmail.com","@curso.com","@correo.com"};
	
	public static final String[] OFICINAS = {"Valencia", "Madrid", "Barcelona", "Alicante", "Navarra", "Bruselas"};
	
	public static String nombreAleatorio(String[]nombres, String[] apellidos){
		
		Random random = new Random ();
		
		int  indiceNombre = random.nextInt(nombres.length);
		String nombre = nombres[indiceNombre];
		
		int indiceApellidos = random.nextInt(apellidos.length);
		String apellido = apellidos[indiceApellidos];
		
		indiceApellidos = random.nextInt(apellidos.length);
		String apellido2 = apellidos[indiceApellidos];

		
		return nombre + " " + apellido + " " + apellido2;
	};
	
	public static String nombreAleatorio() {
		return nombreAleatorio(NOMBRES, APELLIDOS);
	};
	
	//retornar un email aleatorio
	//completar
	
	public static String correoAleatorio(String[]usuarios, String[] correos) {
		
		Random random = new Random();
		
		int indiceUsuario = random.nextInt(usuarios.length);
		String usuario = usuarios[indiceUsuario];
		
		int indiceCorreos = random.nextInt(correos.length);
		String correo = correos[indiceCorreos];
		
		return usuario + correo;
	};
	
	public static String correoAleatorio() {
		return correoAleatorio(USUARIOS, CORREOS);
		
	
		
	}
	public static String oficinaAleatoria(String[]oficinas){
		
		Random random = new Random ();
		
		int  indiceOficina = random.nextInt(oficinas.length);
		String oficina = oficinas[indiceOficina];


		
		return oficina;
	}
	public static String oficinaAleatoria() {
		return oficinaAleatoria(OFICINAS);

	}

}
