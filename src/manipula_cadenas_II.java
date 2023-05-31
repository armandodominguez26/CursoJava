
public class manipula_cadenas_II {

	public static void main(String[] args) {
		
		String frase="Hoy es un dia especial para aprender a programar en java";
		
		String frase_resumen = frase.substring(0, 27) + " irnos a la playa y olvidarnos de todo..." + "y " +
		frase.substring(28, 56);
		
		
		
		System.out.println(frase_resumen);
		
		

	}

}
