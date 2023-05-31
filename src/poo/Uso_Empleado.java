package poo;

import java.util.*;

public class Uso_Empleado {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
			
		Jefatura jefe_RRHH=new Jefatura("Magda", 95000, 2015,9,25);
		
		jefe_RRHH.estableceIncentivo(2570);
		
		Empleado[] misEmpleados=new Empleado[6];
		
		misEmpleados[0]=new Empleado("Armando Dominguez", 52000, 2017, 12, 22);
		
		misEmpleados[1]=new Empleado("Paula Dominguez", 85000, 2020, 06, 05);
		
		misEmpleados[2]=new Empleado("Sarahi Dominguez", 72000, 2015, 03, 15);
		
		misEmpleados[3]=new Empleado("Debanhi Cantu");
		
		misEmpleados[4]=jefe_RRHH; //Polimorfismo
		
		misEmpleados[5]=new Jefatura("Mercedes", 98000,2015,5,26);
		
		Jefatura jefa_Finanzas=(Jefatura)misEmpleados[5];
		
		jefa_Finanzas.estableceIncentivo(5000);
		
		System.out.println(jefa_Finanzas.tomar_decisiones("Dar mas dias de vacaciones a los empleados"));
		
		System.out.println("El jefe " + jefa_Finanzas.dameNombre() + " tiene un bonus de: " 
		+ jefa_Finanzas.establece_bonus(500));
		/*for(int i=0;i<3; i++) {
			
			misEmpleados[i].subeSueldo(5);
		}*/
		
		System.out.println(misEmpleados[3].dameNombre() + " tiene un bonus de: " + misEmpleados[3].establece_bonus(200));
		
		for(Empleado e: misEmpleados) {
			
			e.subeSueldo(5);
		}
		
		
	/*for(int i=0;i<3;i++) {
		
		System.out.println("Nombre: " + misEmpleados[i].dameNombre() + "Sueldo: " + misEmpleados[i].dameSueldo()
				+ "Fecha de Alta: " + misEmpleados[i].dameFechaContrato());
	}*/
		
		Arrays.sort(misEmpleados);
		
		for(Empleado e: misEmpleados) {
			
			System.out.println("Nombre: " + e.dameNombre() + " Sueldo: " + e.dameSueldo()
					+ " Fecha de Alta: " + e.dameFechaContrato());
			
		}
		
		
	}

}

class Empleado implements Comparable, Trabajadores{
	
	public Empleado(String nom, double sue, int agno, int mes, int dia) {
		
		nombre=nom;
		
		sueldo=sue;
		
		GregorianCalendar calendario=new GregorianCalendar(agno, mes-1, dia);
		
		altaContrato=calendario.getTime();
		
		Id=IdSiguiente;
		
		IdSiguiente++;
		
	}
	
	public double establece_bonus(double gratificacion) {
		
		return Trabajadores.bonus_base+gratificacion;
	}
	
	public Empleado(String nom) {
		
		this(nom, 30000, 2015, 01, 01);
		
	}
	
	public String dameNombre() {  //getter
		
		return nombre + " Id: " + Id;
	}
	
	public double dameSueldo() {  //getter
		
		return sueldo;
	}
	
	public Date dameFechaContrato() {  //getter
		
		return altaContrato;
	}
	
	
	public void subeSueldo(double porcentaje) {
		
		double aumento=sueldo*porcentaje/100;
		
		sueldo+=aumento;
	}
	
	public int compareTo(Object miObjeto) {
		
		Empleado otroEmpleado=(Empleado) miObjeto;
		
		if(this.sueldo<otroEmpleado.sueldo) {
			
			return -1;
		}
		
		if (this.sueldo>otroEmpleado.sueldo) {
			
			return 1;
		}
		
		return 0;
	}
	
	private String nombre;
	
	private double sueldo;
	
	private Date altaContrato;
	
	private static int IdSiguiente;
	
	private int Id;
}

class Jefatura extends Empleado implements Jefes {
	
	public Jefatura(String nom, double sue, int agno, int mes, int dia) {
		
		super(nom, sue, agno, mes, dia);
	}
	
	public String tomar_decisiones(String decision) {
		
		return "Un miembro de la direccion ha tomado la decision de: " + decision;
	}
	
	public double establece_bonus(double gratificacion) {
		
		double prima=2000;
		
		return Trabajadores.bonus_base+gratificacion+prima;
	}
	
	public void estableceIncentivo(double b) {
		
		incentivo=b;
	}
	
	public double dameSueldo() {
		
		double sueldoJefe=super.dameSueldo();
		
		return sueldoJefe + incentivo;
	}
	
	private double incentivo;
}

