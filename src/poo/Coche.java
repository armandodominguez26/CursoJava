package poo;

public class Coche {
	
	private int ruedas;
	
	private int largo;
	
	private int ancho;
	
	private int motor;
	
	private int peso_plataforma;
	
	private String Modelo1;
	
	private String Modelo2;
	
	private String color;
	
	private int peso_total;
	
	private boolean asientos_piel,climatizador;
		
	
	public Coche() {
		
		ruedas=6;
		largo=2000;
		ancho=300;
		motor=1600;
		peso_plataforma=500;
		
		Modelo1="Renault";
		Modelo2="Figo";
				
	}
	
	public String dime_datos_generales() {     //GETTER
		
		return "La plataforma del vehiculo tiene " + ruedas + " ruedas"+ ". Mide " + largo/1000 + " metros con un ancho de "
	    + ancho + " cm y un peso de plataforma " + peso_plataforma +  " kg";
		
	}
	
	public void establece_color(String color_coche) {   //SETTER
		
		color=color_coche;
	}
	
	public String dime_color() {
		
		return "El color del coche es " + color;
	}

	public void configura_asientos(String asientos_piel) {
		
		
		if (asientos_piel.equalsIgnoreCase("si"))
			{
		this.asientos_piel=true;
	}else {
		this.asientos_piel=false;
	}
	
}
	
	public String dime_asientos() {
		
		if (asientos_piel==true) {
			
			return"El coche tiene asientos de piel";
		}else {
			return "El coche tiene asientos de serie";
		}
	}
	
	public void configura_climatizador(String climatizador) {
		
		if(climatizador.equalsIgnoreCase("si")) {
			
			this.climatizador=true;
		}else {
			this.climatizador=false;
		}
	}
	
	public String dime_climatizador() {
		
		if(climatizador==true) {
			
			return "El coche contiene climatizador";
		}else {
			return "El coche lleva aire acondicionado";
		}
	}
	
	public String dime_peso_coche() {    //SETTER + GETTER
		
		int peso_carroceria=500;
		
		peso_total=peso_plataforma+peso_carroceria;
		
		if(asientos_piel==true) {
			
			peso_total=peso_total+50;
		}
		
		if(climatizador==true) {
			
			peso_total=peso_total+20;
		}
		
		return "El peso del coche es " + peso_total;
	}
	
	public int precio_coche() {
		
		int precio_final=10000;
		
		if(asientos_piel==true) {
			
			precio_final+=2000;
			
		}
		if (climatizador==true) {
			precio_final+=1500;
		}
		
		return precio_final;
	}
	
}
