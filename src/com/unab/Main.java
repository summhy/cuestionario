package com.unab;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Indique cantidad de preguntas:");
		int cantidad = entrada.nextInt();
		entrada.nextLine();
		Pregunta cuestionario[] = new Pregunta[cantidad]; 
		
		String preg;
		boolean resp;
		
		for(int i = 0; i < cantidad; i++) {
			System.out.println("Pregunta " + (i+1));
			preg = entrada.nextLine();
			System.out.println("Respuesta " + (i+1));
			resp = entrada.nextBoolean();
			entrada.nextLine();
			cuestionario[i] = new Pregunta(preg, resp);
			
		}

		System.out.println("Iniciar Cuestionario");
		
		int puntaje=0;
		for(int i = 0; i < cantidad; i++) {
			System.out.println(cuestionario[i].getPregunta());
			resp = entrada.nextBoolean();
			puntaje += cuestionario[i].validar(resp);

		}
		System.out.println("Tu resultado es: " + puntaje);
		
		
		
			
		

	}

}
