package personas;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * <h1>Ejercicio con JavaDoc</h1>
 * <h3>Escribir un programa Java que crea un ArrayList de Objetos de tipo Persona. El programa pide por
	teclado los datos de las personas y los guarda en el ArrayList.</h3>
	 
 * @author Jes�s �ngel Segovia Yarlequ�
 * @since 24-4-2021
 * @version 1.5
 */

public class PersonaArraylist {
	public static void main(String[] args) {
		ArrayList<Persona> lista = new ArrayList<Persona>();
		Scanner sc = new Scanner(System.in);
		// Creamos la lista manualmente aunque podr� ser modificada posteriormente
		lista.add(new Persona("Wayne", "John", 1907));
		lista.add(new Persona("McQueen", "Steve", 1930));
		lista.add(new Persona("Lennon", "John", 1940));
		lista.add(new Persona("Gibson", "Mel", 1956));
		lista.add(new Persona("Willis", "Bruce", 1955));
		int opcion;
		do {
			System.out.println();
			System.out.println("****MENU****");
			System.out.println("1.- A�adir");
			System.out.println("2.- Borrar");
			System.out.println("3.- Modificar");
			System.out.println("4.- Visualizar");
			System.out.println("5.- Buscar");
			System.out.println("6.- Salir");
			System.out.print("Elegir opcion: ");
			opcion = sc.nextInt();
			if (opcion == 1) {
				introducir(lista);
			}
			if (opcion == 2) {
				borrar(lista);
			}
			if (opcion == 3) {
				modificar(lista);
			}
			if (opcion == 4) {
				visualizar(lista);
			}
			if (opcion == 5) {
				buscar(lista);
			}
			/**
			 * Mientras la varibale opcion no sea igual a 6 nos repetir� el men� hasta
			 * introducir algun n�mero esperado dentro del bucle.
			 */
		} while (opcion != 6);
		System.out.println("****FIN****");
	}
	

	/**
	 * @param colecci�n de elementos de clase persona Este m�todo nos permite a�adir
	 * tantas personas como queramos a una lista ya cargada por
	 * defecto anteriormente.
	 */
	public static void introducir(ArrayList<Persona> lista) {
		Scanner sc = new Scanner(System.in);
		String resp = "si";
		/**
		 * mientras a la varibale resp le llegue el valor "si" el bucle se ir�
		 * repitiendo hasta introducir una respuesta diferente
		 */
		while (resp.equalsIgnoreCase("si")) {
			System.out.println("\nIntroduce apellido: ");
			String ap = sc.next();
			System.out.println("\nIntroduce nombre: ");
			String nom = sc.next();
			System.out.println("\nIntroduce a�o: ");
			int an = sc.nextInt();
			lista.add(new Persona(ap, nom, an));
			System.out.println("�Quiere introducir otra persona (si/no)?");
			resp = sc.next();
		}
	}

	
	
	/**
	 * @param coleci�n de elementos de clase persona Con este m�todo podremos borrar
	 * a una persona si se encuentra en la lista creada
	 * anteriormente comprobandolo por apellido si existe o no.
	 */
	public static void borrar(ArrayList<Persona> lista) {
		Scanner sc = new Scanner(System.in);
		boolean bol = false;
		System.out.print("\nIntroduce apellido: ");
		String ap = sc.next();
		// buscamos en la lista si existe la persona seg�n apellido
		for (int i = 0; i < lista.size(); i++) {
			if (lista.get(i).getApellido().equalsIgnoreCase(ap)) {
				System.out.println(ap + " est� en la lista de personas.");
				lista.remove(i);
				System.out.println(ap + " ha sido borrado correctamente.");
				// otra manera para borrar ser�a haciendo -> lista.remove(lista.get(i));
				bol = true;
			}
		}
		/**
		 * Como no ha entrado en la condici�n anterior del bucle for, la variable bol
		 * sigue teniendo el valor false y muestra el siguiente mensaje
		 */
		if (bol == false)
			System.out.println(ap + " no est� en la lista de personas.");
	}
	
	

	/**
	 * 
	 * @param colleci�n de elementos de la clase persona El m�todo nos permite
	 * modificar los datos de una persona que se encuentra en la
	 * lista creada anteriormente comprobando por nombre si existe o no.
	 */

	public static void modificar(ArrayList<Persona> lista) {
		Scanner sc = new Scanner(System.in);
		boolean bol = false;
		System.out.println("\nIntroduce el nombre de la persona a modificar: ");
		String nombre = sc.next();
		// Busca en la lista si existe la persona seg�n nombre.
		for (int i = 0; i < lista.size(); i++) {
			if (lista.get(i).getNombre().equalsIgnoreCase(nombre)) {
				System.out.println(nombre + " est� en la lista de personas");
				System.out.println("\nIntroduce el nuevo apellido: ");
				String app = sc.next();
				System.out.println("\nIntroduce el nuevo nombre: ");
				String nom = sc.next();
				System.out.println("\nIntroduce el nuevo a�o: ");
				int an = sc.nextInt();
				Persona p = new Persona(app, nom, an);
				lista.set(i, p);
				// Como ha encontrado una persona la varibale bol pasa a ser true.
				bol = true;
			}
		}
		/**
		 * Como no ha entrado en la condici�n anterior del bucle for, la variable bol
		 * sigue teniendo el valor false y muestra el siguiente mensaje
		 */
		if (bol == false)
			System.out.println(nombre + " no est� en la lista de personas.");
	}
	
	

	/**
	 * 
	 * @param colecci�n de elementos de la clase persona Este m�todo nos permite
	 * visualizar los datos de cada persona que se encuentra en la
	 * lista de personas.
	 */

	public static void visualizar(ArrayList<Persona> lista) {
		boolean bol = false;
		System.out.println("*****DATOS******");
		for (Persona auxPerson : lista) {
			// si la longitud de la lista es mayor que 0 la variable bol cambia a true
			if (lista.size() > 0) {
				bol = true;
			}
			System.out.print(auxPerson.getApellido() + "  ");
			System.out.print(auxPerson.getNombre() + "  ");
			System.out.println(auxPerson.getFecha_naci());
		}
		/**
		 * Como no ha entrado en la condici�n anterior del bucle for, la variable bol
		 * sigue teniendo el valor false y muestra el siguiente mensaje
		 */
		if (bol == false)
			System.out.println("No existen personas en la lista.");
	}
	
	

	/**
	 * 
	 * @param coleci�n de elementos de la clase persona Con este m�todo podemos
	 * comprobar si una persona se encuentra en la lista comprobando
	 * por nombre y apellido si existe.
	 */
	public static void buscar(ArrayList<Persona> lista) {
		Scanner sc = new Scanner(System.in);
		System.out.println("\nIntroduce nombre: ");
		String nom = sc.next();
		System.out.println("\nIntroduce apellido: ");
		String ap = sc.next();
		boolean bol = false;
		/**
		 * Busca en la lista si existe la persona comprobandolo por nombre y apellido,
		 * en caso de encontrarlo cambiar� la variable bol a true.
		 */
		for (Persona auxPersona : lista) {
			if (auxPersona.getNombre().equalsIgnoreCase(nom) && auxPersona.getApellido().equalsIgnoreCase(ap)) {
				System.out.println(nom + " " + ap + " est� en la lista de personas");
				bol = true;
			}
		}
		/**
		 * Como no ha entrado en la condici�n anterior del bucle for, la variable bol
		 * sigue teniendo el valor false y muestra el siguiente mensaje
		 */
		if (bol == false)
			System.out.println(nom + " " + ap + " no est� en la lista de personas");
	}
}

