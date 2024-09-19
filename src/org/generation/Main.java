package org.generation;
import org.generation.classes.Person;

public class Main {

	public static void main(String[] args) {
		Person luis = new Person("Luis Loranca", 23, "prueba@correo", 
				"020245", "Simon laguna #33");
		Person Elizabeth = new Person("Elizabeth Díaz", 20, "elizabeth20@yahoo.com");
		
		System.out.println(luis.toString());
		System.out.println(Elizabeth);
	}

}
