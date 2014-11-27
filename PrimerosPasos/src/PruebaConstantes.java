
public class PruebaConstantes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Empleados trabajador1=new Empleados("Paco");
		Empleados trabajador2=new Empleados("Ana");
		Empleados trabajador3=new Empleados("Antonio");
		Empleados trabajador4=new Empleados("Maria");
		
		trabajador1.cambiaSeccion("Sistemas");
		
		System.out.println(trabajador1.devuelveDatos());
		System.out.println(trabajador2.devuelveDatos());
		System.out.println(trabajador3.devuelveDatos());
		System.out.println(trabajador4.devuelveDatos());
		
	}

}


class Empleados{
	
	public Empleados(String nom){ //constructor
		
		nombre=nom;
		seccion="Administración";
		Id=IdSiguiente;
		
		IdSiguiente++;
		
	}
		
	public void cambiaSeccion(String seccion){ //setter
		this.seccion=seccion;
	}
		
	public String devuelveDatos(){ //getter
		return "El nombre es: "+nombre+", la sección es: "+seccion+
				" y le Id="+Id;
	}
	
	private final String nombre;
	private String seccion;
	private int Id;
	private static int IdSiguiente=1;
}