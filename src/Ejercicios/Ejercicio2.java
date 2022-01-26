package Ejercicios;
import java.util.Scanner;

public class Ejercicio2 {
	public static void main(String[] args) {
		String name, genero,job,preferencia, nacionalidad,sangre;
        int edad;
        Scanner entrada = new Scanner(System.in);
        
		System.out.print("Ingresa tu nombre: ");
		name = entrada.next();
		System.out.print("Ingresa tu edad: ");
		edad = entrada.nextInt();
		System.out.print("Ingresa tu genero: ");
		genero = entrada.next();
		System.out.print("Ingresa tu trabajo: ");
		job = entrada.next();
		System.out.print("Ingresa tu preferencia: ");
		preferencia = entrada.next();
		System.out.print("Ingresa tu nacionalidad: ");
		nacionalidad = entrada.next();
		System.out.print("Ingresa tu tipo de sangre: ");
		sangre = entrada.next();
		
		int calcularEdad = 2022-edad;
		
		System.out.print("Hola "+name+" tu fecha de nacimiento es: "+calcularEdad+" tu genero es: "+genero+" tu profesion es "+job+", tu preferencia es "
				+preferencia+", tu nacionalidad es "+nacionalidad+ " y tu tipo de sangre es "+sangre);
		
	}
}
