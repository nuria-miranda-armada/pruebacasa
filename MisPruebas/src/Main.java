import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> nombres = Arrays.asList("Maria", "Pepa","Marcos","Laura","Pepe","Jose","Isabel");

		Predicate<String> nombresconA =  x -> x.contains("a");
		
		Predicate<Integer> mayorqueX = (edad) -> edad>4;
		
	nombres.stream().filter(nombresconA).forEach(System.out::println);
		
		System.out.println("--------reducir---------");
		
		String reducir = nombres
		.stream()
		.reduce("tres", String::concat);
		System.out.println(reducir);
		
		System.out.println("---------------------------------");
	
		//Editar desde git
		
		Persona p1 = new Persona("Maria", 22);
		Persona p2 = new Persona("Pili", 59);
		
		List<Persona> personas = new ArrayList<Persona>();
		personas.add(p1);
		personas.add(p2);
		
		
		
	System.out.println("OPTINAL");
		Optional <Persona> personaOptional = Optional.of(personas.get(0));
		Optional<Persona> personap1op = Optional.of(p1);

		Optional<String> nombre = personaOptional
				.flatMap(Persona::getNombre); //comprueba ya si existe el optina(isPresent) y lo localiza para poder extraerlo
		System.out.println(nombre.get());
	
		
		System.out.println("OPTINAL 2");
		Optional<String> nombrep1 = personap1op
			.flatMap(Persona::getNombre);
		System.out.println(nombre.get());
		
		
		//INteger debe tener la propiedad optional
		Optional<String> nom = personap1op
				.flatMap(Persona::getNombre)
				.filter(nombresconA);
		
		//Lambda de tipo consumidor 
		
		Consumer<String> pasoCadena = x -> System.out.println(x);
		pasoCadena.accept("adad");
		
		Supplier<String> supplier = () -> {
			Persona p = new Persona("Pepa",23);
			return p.getNombre().get();
			};
		
	
			System.out.println("------------Pruebas con optional--------------");
			
			
			
			

	}

}
