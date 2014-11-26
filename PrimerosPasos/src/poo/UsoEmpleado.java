package poo;

import java.util.*;

public class UsoEmpleado {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

class Empleado{
	
	public Empleado(String nom, double sue, int anio, int mes, int dia){
		
		nombre=nom;
		sueldo=sue;
		
		//OJO ENERO ARRANCA EN 0 CERO
		GregorianCalendar calendario = new GregorianCalendar (anio, mes-1, dia);
		
		altaContrato=calendario.getTime();
		
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
