package poo;

import java.util.Date;
import java.util.GregorianCalendar;

public class UsoPersona {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Persona[] lasPersonas=new Persona[2];
		lasPersonas[0]=new Empleado2("Luis Conde",50000,2009,02,25);
		lasPersonas[1]=new Alumno("Ana Lopez","Biologicas");
		
		for(Persona p:lasPersonas){
			System.out.println(p.dameNombre()+ ", " +p.dameDescripcion());
		}
		

	}

}

abstract class Persona{
	
	public Persona(String nom){
		nombre=nom;
	}
	
	public String dameNombre(){
		return nombre;
	}
	
	public abstract String dameDescripcion();
	
	private String nombre;
}

class Empleado2 extends Persona{
	
	public Empleado2(String nom, double sue, int anio, int mes, int dia){ //Constructor todos los datos
		
		super(nom);
		
		sueldo=sue;
		
		//OJO ENERO ARRANCA EN 0 CERO
		GregorianCalendar calendario = new GregorianCalendar (anio, mes-1, dia);
		
		altaContrato=calendario.getTime();
		
		Id=IdSiguiente;
		IdSiguiente++;
		
	}
	
	public String dameDescripcion(){
		return "Este empleado tiene un Id="+Id+" con un sueldo="+sueldo;
		
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
	
	private double sueldo;
	private Date altaContrato;
	private int Id;
	private static int IdSiguiente=1;
	
}

class Alumno extends Persona{
	public Alumno(String nom, String car){
		super(nom);
		carrera=car;
	}
	
	public String dameDescripcion(){
		return "El alumno "+this.dameNombre()+" estudia la carrera "+carrera;
	}
	
	private String carrera;
}