
public class manipula_cadenas {

	public static void main(String[] args) {
		
		String nombre="Armando";
		
		System.out.println("Mi nombre es " + nombre);
		
		System.out.println("Mi nombre tiene " + nombre.length() + " letras");
		
		System.out.println("La segunda letra de " + nombre + " es " + nombre.charAt(1));
		
		int ultima_letra;
		
		ultima_letra=nombre.length();
		
		System.out.println("La ultima letra es la " + nombre.charAt(ultima_letra-1));

	}

}
