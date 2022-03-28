package personas;
/**
 * <h1>Ejercicio con JavaDoc</h1>
 * <h3>Escribir un programa Java que crea un ArrayList de Objetos de tipo Persona. El programa pide por
	teclado los datos de las personas y los guarda en el ArrayList.</h3>
	 
 * @author Jesús Ángel Segovia Yarlequé
 * @since 24-4-2021
 * @version 1.5
 */
public class Persona {
	/**
	 * Atributos de la clase Persona
	 */
	private String apellido;
	private String nombre;
	private int fecha_naci;
	
	public Persona() {
		
	}
	/**
	 * 
	 * @param apellido
	 * @param nombre
	 * @param fecha_naci
	 */
	public Persona(String apellido, String nombre, int fecha_naci) {
		super();
		this.apellido = apellido;
		this.nombre = nombre;
		this.fecha_naci = fecha_naci;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getFecha_naci() {
		return fecha_naci;
	}

	public void setFecha_naci(int fecha_naci) {
		this.fecha_naci = fecha_naci;
	}	
}
