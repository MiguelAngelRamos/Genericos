package test;

import Genericos.ClaseGenerica;

public class EjecutandoGenerics {
	
	public static void main(String[] args) {
		ClaseGenerica<Integer> objetoInt = new ClaseGenerica(15);
		objetoInt.obtenerTipo();
		
		ClaseGenerica<String> objectoString = new ClaseGenerica("Miguel");
		objectoString.obtenerTipo();
		
	}

}
