import java.util.Optional;

public class Persona {
	
	private Optional<String> nombre;
	private Optional <Integer> id;

	public Optional<Integer> getId() {
		return id;
	}

	public void setId(Optional<Integer> id) {
		this.id = id;
	}

	public Persona(String nombre, int edad) {
		this.nombre = Optional.of(nombre);
		this.edad = edad;
	}
	
	public Persona(String nombre, int edad,int id) {
		this.nombre = Optional.of(nombre);
		this.edad = edad;
		this.id= Optional.of(id);
	}
	public Optional<String> getNombre() {
		return nombre;
	}
	public void setNombre(Optional<String> nombre) {
		this.nombre = nombre;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	
	private int edad;
	

}

