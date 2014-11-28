package poo;

import java.util.*;

public class UsoEmpleado {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		Empleado empleado1=new Empleado("Paco", 7000, 2012, 12, 19);
		
		Empleado empleado2=new Empleado("Ana", 5000, 2014, 11, 03);

		Empleado empleado3=new Empleado("Juan", 10000, 2002, 03, 15);
		
		empleado1.subeSueldo(5);
		empleado2.subeSueldo(5);
		empleado3.subeSueldo(5);
		
		System.out.println("Nombre: "+empleado1.dameNombre() + "  Sueldo: " +empleado1.dameSueldo()
				+ "  Fecha de Alta: " + empleado1.dameFechaAlta());
		System.out.println("Nombre: "+empleado2.dameNombre() + "  Sueldo: " +empleado2.dameSueldo()
				+ "  Fecha de Alta: " + empleado2.dameFechaAlta());
		System.out.println("Nombre: "+empleado3.dameNombre() + "  Sueldo: " +empleado3.dameSueldo()
				+ "  Fecha de Alta: " + empleado3.dameFechaAlta()); 
		*/
		
		Empleado[] misEmpleados=new Empleado[4];
		
		misEmpleados[0]=new Empleado("Paco", 7000, 2012, 12, 19);
		misEmpleados[1]=new Empleado("Ana", 5000, 2014, 11, 03);
		misEmpleados[2]=new Empleado("Juan", 10000, 2002, 01, 15);
		misEmpleados[3]=new Empleado("Pedro");
		
		/*for(int i=0;i<3;i++){
			misEmpleados[i].subeSueldo(5);
		}*/
		
		for(Empleado e: misEmpleados){
			e.subeSueldo(5);
		}
		
		/*for(int i=0;i<3;i++){
			System.out.println("Nombre: "+misEmpleados[i].dameNombre() + "  Sueldo: " +misEmpleados[i].dameSueldo()
					+ "  Fecha de Alta: " + misEmpleados[i].dameFechaAlta());
		}*/
		
		for(Empleado e: misEmpleados){
			System.out.println("Nombre: "+e.dameNombre() + "  Sueldo: " +e.dameSueldo()
					+ "  Fecha de Alta: " + e.dameFechaAlta());
		}
	}

}

class Empleado{
	
	public Empleado(String nom, double sue, int anio, int mes, int dia){ //Constructor todos los datos
		
		nombre=nom;
		sueldo=sue;
		
		//OJO ENERO ARRANCA EN 0 CERO
		GregorianCalendar calendario = new GregorianCalendar (anio, mes-1, dia);
		
		altaContrato=calendario.getTime();
		
	}
	
	public Empleado(String nom){ //Constructor solo nombre
		this(nom, 30000,2000,01,01);
	}
	
	public String dameNombre(){ //getter
		return nombre;
	}
	
	public double dameSueldo(){ //getter
		return sueldo;
	}
	
	public Date dameFechaAlta(){ //getter
		return altaContrato;
	}
	
	public void subeSueldo(double porcentaje){ //setter
		double aumento=sueldo*porcentaje/100;
		sueldo+=aumento;
	}
	
	private String nombre;
	private double sueldo;
	private Date altaContrato;
	
}

class Jefatura extends Empleado{
	
	public Jefatura (String nom, double sue, int anio, int mes, int dia){ //constructor
		super(nom, sue, anio, mes, dia);
		
	}
	
	public void estableceIncentivo(double b){ //setter
		incentivo=b;
	}
	
	public double dameSueldo(){ //getter
		double sueldoJefe=super.dameSueldo();
		return sueldoJefe+incentivo;
	}
	
	private double incentivo;
}
