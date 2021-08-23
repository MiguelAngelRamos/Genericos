package Genericos;
/* Estca clase va utilziar un atributo pero el tipo no lo vamos a conocer 
 * hasta que utilizemos esta clase*/
public class ClaseGenerica<T> {
	private T objeto;
	
	public ClaseGenerica(T objeto) {
		this.objeto = objeto;
	}
	
	public void obtenerTipo() {
		System.out.println("El tipo T es: " + objeto.getClass().getSimpleName());
	}
}
