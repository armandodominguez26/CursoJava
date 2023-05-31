package poo;



public class Uso_Vehiculo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Coche Renault=new Coche();
		//Coche Figo=new Coche();
		
		/*System.out.println("Este coche modelo " + Renault.Modelo1 + " tiene " + Renault.ruedas +  " ruedas.");

		System.out.println("Este coche modelo " + Renault.Modelo1 + " tiene " + Renault.largo +  " cm de largo" + " y " + Renault.ancho + " cm de ancho");
		
		System.out.println("Este coche modelo " + Figo.Modelo2 + " tiene " + Figo.ruedas +  " ruedas.");

		System.out.println("Este coche modelo " + Figo.Modelo2 + " tiene " + Figo.largo +  " cm de largo.");*/
		
		//System.out.print(Renault.dime_largo());
		
		/*Renault.establece_color(JOptionPane.showInputDialog("Introduce color"));
		
		System.out.println(Renault.dime_datos_generales());
		
		System.out.println(Renault.dime_color());
		
		Renault.configura_asientos(JOptionPane.showInputDialog("Tiene asientos de piel"));
		
		System.out.println(Renault.dime_asientos());
		
		Renault.configura_climatizador(JOptionPane.showInputDialog("Tiene climatizador"));
		
		System.out.println(Renault.dime_climatizador());
		
		System.out.println(Renault.dime_peso_coche());
		
		System.out.println("El precio final del coche es: " + Renault.precio_coche());*/
		
		Coche micoche1=new Coche();
		
		micoche1.establece_color("Morado");
		
		Furgoneta mifurgoneta1=new Furgoneta(7, 580);
		
		mifurgoneta1.establece_color("Gris");
		
		mifurgoneta1.configura_asientos("Si");
		
		mifurgoneta1.configura_climatizador("Si");
		
		System.out.println(micoche1.dime_datos_generales() + " " + micoche1.dime_color());
		
		System.out.println(mifurgoneta1.dime_datos_generales() + mifurgoneta1.dimeDatosFurgoneta());
		
		
		
		
		
	
	}

}
