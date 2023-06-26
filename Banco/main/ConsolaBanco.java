package Banco.main;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

import Banco.util.Utiles;
import app_banco.modelos.Cliente;
import app_banco.modelos.Gestor;
import app_banco.modelos.Mensaje;
import app_banco.modelos.Transferencia;

public class ConsolaBanco {

	// atributos de la clase consola
	private Scanner teclado;
	private Random random;

	private List<Gestor> gestores;
	private Integer siguienteIdGestor;

	private List<Cliente> clientes;
	private Integer siguienteIdCliente;

	private List<Mensaje> mensajes;
	private Integer siguienteMensaje;

	private List<Transferencia> transferencias;
	private Integer siguienteTransferencia;

	// inicializamos los atributos en el constructor
	ConsolaBanco() {
		this.clientes = new ArrayList<>();
		this.gestores = new ArrayList<>();
		this.mensajes = new ArrayList<>();
		this.transferencias = new ArrayList<>();
		this.siguienteIdGestor = 1;
		this.siguienteIdCliente = 1;
		this.siguienteMensaje = 1;
		this.teclado = new Scanner(System.in);
		this.random = new Random();
	}

	private void mostrarMenuGeneral() {
		System.out
				.println("1. Gestores \n2. Clientes \n3. Mensajes \n4. Transferencias \n4. Iniciar Sesión \n00. Salir");
	}

	private void mostrarMenuGestores() {
		System.out
				.println("1. Insertar gestor \n2. Insertar gestores de prueba \n3. Buscar gestor \n4. Ver los gestores"
						+ " \n5. Actualizar gestor \n6. Eliminar un gestor \n00. Salir ");
	}

	private void mostrarMenuCliente() {
		System.out.println(
				"7. Insertar cliente \n8. Insertar clientes de prueba \n9. Buscar cliente \n10. Ver los clientes"
						+ " \n11. Actualizar cliente \n12. Eliminar un cliente  \n00. Salir ");
	}

	private void mostrarMenuMensajes() {
		System.out.println(
				"13. Crear mensaje \n14. Crear mensajes de prueba \n15. Buscar un mensaje \n16. Ver todos los mensajes \n00. Salir ");

	}

	private void mostrarMenuTransferencias() {
		System.out.println(
				"17. Realizar una transferencia \n18. Ver transferencia \n19. Mostrar todas las transferencias \n00. Salir ");

	}

	private void insertarMensaje() {
		System.out.print("\nNombre de origen: ");
		String origen = teclado.next();
		System.out.print(" Nombre de destino: ");
		String destino = teclado.next();
		System.out.print(" Mensaje: ");
		String texto = teclado.next();
		System.out.print(" Gestor: ");

		Mensaje nuevoMensaje = new Mensaje(siguienteMensaje, origen, destino, texto);
		mensajes.add(nuevoMensaje);
		siguienteMensaje++;
		System.out.print("Mensaje creado con éxito.\n");
	}

	private void mensajesDePrueba() {
		System.out.print("Número de mensajes: ");
		int numeroMensajes = teclado.nextInt();

		for (int i = 0; i < numeroMensajes; i++) {
			String origen = Utiles.nombreAleatorio();
			String destino = Utiles.nombreAleatorio();
			String texto = "";

			Mensaje mensaje = new Mensaje(i + 1, origen, destino, texto);
			mensajes.add(mensaje);
		}
	}

	private Mensaje buscarMensajePorId(Integer idMensaje) {

		Mensaje mensajeResultado = null;
		for (int i = 0; i < mensajes.size(); i++) {
			Mensaje mensaje = mensajes.get(i);
			if (mensaje.getId() == idMensaje) {
				mensajeResultado = mensaje;
				return mensajeResultado;
			}
		}
		return null;
	}

	private void buscarMensaje() {
		System.out.println("Id del mensaje a consultar: ");
		int idMensaje = teclado.nextInt();
		Mensaje mensajeResultado = buscarMensajePorId(idMensaje);
		if (mensajeResultado != null) {
			System.out.println(mensajeResultado);
		} else {
			System.out.println("No se ha encontrado ningún cliente");
		}
	}

	private void verMensajes() {
		if (mensajes.isEmpty()) {
			System.out.println("Todavía no hay clientes\n");
		}
		mensajes.forEach(mensaje -> {
			System.out.println(mensaje);
		});
	}

	private void insertarTransferencia() {
		System.out.print("\nOrdenante: ");
		String ordenante = teclado.next();
		System.out.print(" Beneficiario: ");
		String beneficiario = teclado.next();
		System.out.print(" Saldo: ");
		double saldo = random.nextDouble(100000);
		System.out.print(" Concepto: ");
		String concepto = teclado.next();

		Transferencia nuevaTransferencia = new Transferencia(siguienteIdCliente, ordenante, beneficiario, saldo,
				concepto);
		transferencias.add(nuevaTransferencia);
		siguienteTransferencia++;
		System.out.print("Transferencia realizada con éxito.\n");
	}

	private void verTransferencia() {
		System.out.println("Id de la transferencia a consultar: ");
		int idTransferencia = teclado.nextInt();
		Transferencia transferenciaResultado = buscarTransferenciaPorId(idTransferencia);
		if (transferenciaResultado != null) {
			System.out.println(transferenciaResultado);
		} else {
			System.out.println("No se ha encontrado ninguna transferencia");
		}
	}

	private Transferencia buscarTransferenciaPorId(Integer idTransferencia) {

		Transferencia transferenciaResultado = null;
		for (int i = 0; i < clientes.size(); i++) {
			Transferencia transferencia = transferencias.get(i);
			if (transferencia.getId() == idTransferencia) {
				transferenciaResultado = transferencia;
				return transferenciaResultado;
			}
		}
		return null;
	}

	private void mostrarTransferencias() {
		if (transferencias.isEmpty()) {
			System.out.println("Todavía no hay transferencia\n");
		}
		transferencias.forEach(transferencia -> {
			System.out.println(transferencia);
		});
	}

	private void insertarCliente() {
		System.out.print("\nNombre: ");
		String nombre = teclado.next();
		System.out.print(" Email: ");
		String email = teclado.next();
		System.out.print(" Contraseña: ");
		String password = teclado.next();
		System.out.print(" Saldo: ");
		double saldo = random.nextDouble(100000);
		System.out.print(" Gestor: ");
		Integer gestorId = 1;

		Cliente nuevoCliente = new Cliente(siguienteIdCliente, nombre, password, email, saldo, gestorId);
		clientes.add(nuevoCliente);
		siguienteIdCliente++;
		System.out.print("Cliente creado con éxito.\n");
	}

	private void clientesDePrueba() {
		System.out.print("Número de clientes: ");
		int numeroClientes = teclado.nextInt();

		for (int i = 0; i < numeroClientes; i++) {
			String usuario = Utiles.nombreAleatorio();
			String correo = Utiles.correoAleatorio();
			String password = "";
			double saldo = random.nextDouble(100000);
			Integer gestorId = ((int) (Math.random() * 100 + 1));

			Cliente cliente = new Cliente(i + 1, usuario, password, correo, saldo, gestorId);
			clientes.add(cliente);
		}
	}

	private Cliente buscarClientePorId(Integer idCliente) {

		Cliente clienteResultado = null;
		for (int i = 0; i < clientes.size(); i++) {
			Cliente cliente = clientes.get(i);
			if (cliente.getId() == idCliente) {
				clienteResultado = cliente;
				return clienteResultado;
			}
		}
		return null;
	}

	private void buscarCliente() {
		System.out.println("Id del cliente a consultar: ");
		int idCliente = teclado.nextInt();
		Cliente clienteResultado = buscarClientePorId(idCliente);
		if (clienteResultado != null) {
			System.out.println(clienteResultado);
		} else {
			System.out.println("No se ha encontrado ningún cliente");
		}
	}

	private void verClientes() {
		if (clientes.isEmpty()) {
			System.out.println("Todavía no hay clientes\n");
		}
		clientes.forEach(cliente -> {
			System.out.println(cliente);
		});
	}

	private void actualizarClientes() {
		System.out.println("Id del cliente a actualizar: ");
		Integer idCliente = teclado.nextInt();
		Cliente clienteResultado = buscarClientePorId(idCliente);
		int posicionCliente = -1;
		for (int i = 0; i < gestores.size(); i++) {
			Cliente cliente = clientes.get(i);
			if (cliente.getId() == idCliente) {
				clienteResultado = cliente;
				posicionCliente = i;
				break;
			}

		}
		if (clienteResultado != null) {
			System.out.println("[n] Nombre");
			System.out.println("[e] Email");
			System.out.println("[p] Password");
			System.out.println("[s] Saldo");
			System.out.println("[x] Cancelar");

			System.out.print("Campo a actualizar: ");
			char opcionActualizar = teclado.next().charAt(0);

			switch (opcionActualizar) {
			case 'n':
				System.out.print("Nombre: ");
				String nombre = teclado.next();
				clienteResultado.setUsuario(nombre);
				clientes.set(posicionCliente, clienteResultado);
				break;

			case 'e':
				System.out.print("Email: ");
				String email = teclado.next();
				clienteResultado.setUsuario(email);
				clientes.set(posicionCliente, clienteResultado);
				break;

			case 'p':
				System.out.print("Password: ");
				String password = teclado.next();
				clienteResultado.setUsuario(password);
				clientes.set(posicionCliente, clienteResultado);
				break;

			case 's':
				System.out.print("Saldo: ");
				Double saldo = teclado.nextDouble();
				clienteResultado.setSaldo(saldo);
				clientes.set(posicionCliente, clienteResultado);
				break;

			case 'x':

				break;

			default:
				System.out.print("Opción no válida.");

			}
			if (opcionActualizar != 'x') {
				clientes.set(posicionCliente, clienteResultado);
				System.out.println("Se actualizó correctamente: " + idCliente);
			} else {
			}

			System.out.println("Se actualizó correctamente el cliente con la id: " + idCliente);
		} else {
			System.out.println("No se ha encontrado ningún cliente con la id: " + idCliente);
		}

	}

	private void eliminarCliente() {

		System.out.println("Id del gestor a eliminar: ");
		Integer idCliente = teclado.nextInt();
		Cliente clienteResultado = null;
		int posicionCliente = -1;
		for (int i = 0; i < clientes.size(); i++) {
			Cliente cliente = clientes.get(i);
			if (cliente.getId() == idCliente) {
				clienteResultado = cliente;
				posicionCliente = i;
				break;
			}

		}
		if (clienteResultado != null) {
			gestores.remove(posicionCliente);
			System.out.println("Se eliminó correctamente el gestor con la id: " + idCliente);
		} else {
			System.out.println("No se ha encontrado ningún gestor con la id: " + idCliente);
		}
	}

	private void insertarGestor() {
		System.out.print("\nNombre: ");
		String nombre = teclado.next();
		System.out.print(" Email: ");
		String email = teclado.next();
		System.out.print(" Contraseña: ");
		String password = teclado.next();
		System.out.print(" Oficina: ");
		String oficina = teclado.next();

		Gestor nuevoGestor = new Gestor(siguienteIdGestor, nombre, password, email, oficina);
		gestores.add(nuevoGestor);
		siguienteIdGestor++;
		System.out.print("Gestor creado con éxito.\n");
	}

	private void gestoresDePrueba() {
		System.out.print("Número de gestores: ");
		int numeroGestores = teclado.nextInt();

		for (int i = 0; i < numeroGestores; i++) {
			String usuario = Utiles.nombreAleatorio();
			String correo = Utiles.correoAleatorio();
			String lugar = Utiles.oficinaAleatoria();
			Gestor gestor = new Gestor(i + 1, usuario, "", correo, lugar);
			gestores.add(gestor);
		}
	}

	private void buscarGestores() {
		System.out.println("Id del gestor a consultar: ");
		int idGestor = teclado.nextInt();
		Gestor gestorResultado = buscarGestorPorId(idGestor);
		if (gestorResultado != null) {
			System.out.println(gestorResultado);
		} else {
			System.out.println("No se ha encontrado ningún gestor");
		}
	}

	private Gestor buscarGestorPorId(Integer idGestor) {

		Gestor gestorResultado = null;
		for (int i = 0; i < gestores.size(); i++) {
			Gestor gestor = gestores.get(i);
			if (gestor.getId() == idGestor) {
				gestorResultado = gestor;
				return gestorResultado;
			}
		}
		return null;
	}

	private void verGestores() {
		if (gestores.isEmpty()) {
			System.out.println("Todavía no hay gestores\n");
		}
		gestores.forEach(gestor -> {
			System.out.println(gestor);
		});
	}

	private void actualizarGestores() {
		System.out.println("Id del gestor a actualizar: ");
		Integer idGestor = teclado.nextInt();
		Gestor gestorResultado = buscarGestorPorId(idGestor);
		int posicionGestor = -1;
		for (int i = 0; i < gestores.size(); i++) {
			Gestor gestor = gestores.get(i);
			if (gestor.getId() == idGestor) {
				gestorResultado = gestor;
				posicionGestor = i;
				break;
			}

		}
		if (gestorResultado != null) {
			System.out.println("[n] Nombre");
			System.out.println("[e] Email");
			System.out.println("[p] Password");
			System.out.println("[o] Oficina");
			System.out.println("[x] Cancelar");

			System.out.print("Campo a actualizar: ");
			char opcionActualizar = teclado.next().charAt(0);

			switch (opcionActualizar) {
			case 'n':
				System.out.print("Nombre: ");
				String nombre = teclado.next();
				gestorResultado.setUsuario(nombre);
				gestores.set(posicionGestor, gestorResultado);
				break;

			case 'e':
				System.out.print("Email: ");
				String email = teclado.next();
				gestorResultado.setUsuario(email);
				gestores.set(posicionGestor, gestorResultado);
				break;

			case 'p':
				System.out.print("Password: ");
				String password = teclado.next();
				gestorResultado.setUsuario(password);
				gestores.set(posicionGestor, gestorResultado);
				break;

			case 'o':
				System.out.print("Oficina: ");
				String oficina = teclado.next();
				gestorResultado.setUsuario(oficina);
				gestores.set(posicionGestor, gestorResultado);
				break;

			case 'x':

				break;

			default:
				System.out.print("Opción no válida.");

			}
			if (opcionActualizar != 'x') {
				gestores.set(posicionGestor, gestorResultado);
				System.out.println("Se actualizó correctamente: " + idGestor);
			} else {
			}

			System.out.println("Se actualizó correctamente el gestor con la id: " + idGestor);
		} else {
			System.out.println("No se ha encontrado ningún gestor con la id: " + idGestor);
		}

	}

	private void eliminarGestor() {

		System.out.println("Id del gestor a eliminar: ");
		Integer idGestor = teclado.nextInt();
		Gestor gestorResultado = null;
		int posicionGestor = -1;
		for (int i = 0; i < gestores.size(); i++) {
			Gestor gestor = gestores.get(i);
			if (gestor.getId() == idGestor) {
				gestorResultado = gestor;
				posicionGestor = i;
				break;
			}

		}
		if (gestorResultado != null) {
			gestores.remove(posicionGestor);
			System.out.println("Se eliminó correctamente el gestor con la id: " + idGestor);
		} else {
			System.out.println("No se ha encontrado ningún gestor con la id: " + idGestor);
		}
	}

	private void iniciar() {

		int opcion = -1;
		// menú general
		int menuGeneral = -1;
		do {
			mostrarMenuGeneral();
			System.out.print("\nSelecciona una opción: ");
			menuGeneral = teclado.nextInt();

			
			switch(menuGeneral) {
			// gestores
			case 0:
				System.out.println("¡Hasta pronto!\n");
				break;
				
			case 1:
				
				do {
					mostrarMenuGestores();

					System.out.print("\nSelecciona una opción: ");
					opcion = teclado.nextInt();

					switch (opcion) {
					case 0:
						System.out.println("¡Hasta pronto!\n");
					break;
					case 1:
						insertarGestor();
						break;

					case 2:
						gestoresDePrueba();

						break;

					case 3:
						buscarGestores();

						break;
					case 4:
						verGestores();
						break;

					case 5:
						actualizarGestores();
						break;

					case 6:
						eliminarGestor();
						break;

				} 
				} while (opcion != 0);

			// clientes
			case 2:
				do {
					mostrarMenuCliente();
					System.out.print("\nSelecciona una opción: ");
					opcion = teclado.nextInt();

					switch (opcion) {
					case 0:
						System.out.println("¡Hasta pronto!\n");
					break;
					case 7:
						insertarCliente();
						break;

					case 8:
						clientesDePrueba();
						break;

					case 9:
						buscarCliente();
						break;

					case 10:
						verClientes();
						break;

					case 11:
						actualizarClientes();
						break;

					case 12:
						eliminarCliente();
						break;
					
				}} while(opcion != 0);
				break;
				
			// mensajes
			case 3:
				do {
					mostrarMenuMensajes();
					System.out.print("\nSelecciona una opción: ");
					opcion = teclado.nextInt();

					switch (opcion) {
					case 0:
						System.out.println("¡Hasta pronto!\n");
					break;
					case 13:
						insertarMensaje();
						break;
					case 14:
						mensajesDePrueba();
						break;
					case 15:
						buscarMensaje();
						break;
					case 16:
						verMensajes();
						break;
					}} while (opcion != 0);
				break;
				
			// transferencias
			case 4:
				do {
					mostrarMenuMensajes();
					System.out.print("\nSelecciona una opción: ");
					opcion = teclado.nextInt();

					switch (opcion) {
					case 0:
						System.out.println("¡Hasta pronto!\n");
					break;
					case 17:
						insertarTransferencia();
						break;
					case 18:
						verTransferencia();
						break;
					case 19:
						mostrarTransferencias();
						break;
					}} while (opcion != 0);
				break;
			case 5: 
				login();
				break;

			default:
				System.out.println("Opción no válida\n");
			}} while (menuGeneral != 0);
	}
		
	private void login() {
		verGestores();
		System.out.print("Id gestor: ");
		int idGestor = teclado.nextInt();

		String password = teclado.next();
		Gestor gestor = buscarGestorPorId(idGestor);
		if (gestor != null) {
			if (gestor.getPassword().equals(password)) {
				System.out.println("Has iniciado sesión con éxito!");
			} else {
				System.out.println("Contraseña incorrecta");
			}
		} else {
			System.out.println("Los datos del usuario no coinciden...");

		}
	}

	public static void main(String[] args) {

		ConsolaBanco consola = new ConsolaBanco();
		consola.iniciar();

	}
}
