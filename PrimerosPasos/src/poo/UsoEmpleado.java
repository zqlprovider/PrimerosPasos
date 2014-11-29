package poo;

import java.util.*;

public class UsoEmpleado {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
		Jefatura jefe_RRHH=new Jefatura("Javier", 30000,2014,10,01);
		
		jefe_RRHH.estableceIncentivo(2599);
		
		Empleado[] misEmpleados=new Empleado[6];
		
		misEmpleados[0]=new Empleado("Paco", 7000, 2012, 12, 19);
		misEmpleados[1]=new Empleado("Ana", 5000, 2014, 11, 03);
		misEmpleados[2]=new Empleado("Juan", 10000, 2002, 01, 15);
		misEmpleados[3]=new Empleado("Pedro");
		misEmpleados[4]=jefe_RRHH; //Ejemplo Polimorfismo
		misEmpleados[5]=new Jefatura("Marta", 40000,2010,5,01);
		
		Jefatura jefe_Finanzas=(Jefatura) misEmpleados[5]; //Ejemplo de Casting
		jefe_Finanzas.estableceIncentivo(999);
		
		System.out.println(jefe_Finanzas.tomar_decisiones("Dar mas vacacciones a los empleados"));
		
		System.out.println("El jefe " +jefe_Finanzas.dameNombre()+" tiene un bonus de " + jefe_Finanzas.establece_bonus(500));
		
		System.out.println(misEmpleados[3].dameNombre()+" tiene un bonus de "+misEmpleados[3].establece_bonus(200));
		
		for(Empleado e: misEmpleados){
			e.subeSueldo(5);
		}
		
		/*for(int i=0;i<3;i++){
			System.out.println("Nombre: "+misEmpleados[i].dameNombre() + "  Sueldo: " +misEmpleados[i].dameSueldo()
					+ "  Fecha de Alta: " + misEmpleados[i].dameFechaAlta());
		}*/
		
		Arrays.sort(misEmpleados);
		
		for(Empleado e: misEmpleados){
			System.out.println("Nombre: "+e.dameNombre() + "  Sueldo: " +e.dameSueldo()
					+ "  Fecha de Alta: " + e.dameFechaAlta());
		}
	}

}

class Empleado implements Comparable, Trabajadores {
	
	public Empleado(String nom, double sue, int anio, int mes, int dia){ //Constructor todos los datos
		
		nombre=nom;
		sueldo=sue;
		
		//OJO ENERO ARRANCA EN 0 CERO
		GregorianCalendar calendario = new GregorianCalendar (anio, mes-1, dia);
		
		altaContrato=calendario.getTime();
		
		Id=IdSiguiente;
		IdSiguiente++;
		
	}
	
	public Empleado(String nom){ //Constructor solo nombre
		this(nom, 30000,2000,01,01);
	}
	
	public double establece_bonus(double gratificacion){
		
		return Trabajadores.bonus_base+gratificacion;
	}
	
	public String dameNombre(){ //getter
		return nombre + " Id="+Id;
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
	
	public int compareTo(Object miObjeto){
		
		Empleado otroEmpleado=(Empleado) miObjeto;
		
		if(this.sueldo<otroEmpleado.sueldo){
			return -1;
		}
		
		if(this.sueldo>otroEmpleado.sueldo){
			return 1;
		}
		
		return 0;
	}
	
	private String nombre;
	private double sueldo;
	private Date altaContrato;
	private int Id;
	private static int IdSiguiente=1;
	
}

class Jefatura extends Empleado implements Jefes{
	
	public Jefatura (String nom, double sue, int anio, int mes, int dia){ //constructor
		super(nom, sue, anio, mes, dia);
		
	}
	
	public String tomar_decisiones(String decision){
		return "Un miembro de la dirección ha tomado la decisión de: "+decision;
	}
	
	public double establece_bonus(double gratificacion){
		
		double prima=2000;
		
		return Trabajadores.bonus_base+gratificacion+prima;
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
