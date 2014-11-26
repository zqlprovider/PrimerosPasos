
public class PruebaConstantes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Empleados trabajador1=new Empleados("Ezequiel Gallo");
		Empleados trabajador2=new Empleados("Guadalupe Astrada");
		
		trabajador1.cambiaSeccion("Sistemas");
		
		System.out.println(trabajador1.devuelveDatos());
		System.out.println(trabajador2.devuelveDatos());
	}

}


class Empleados{
	
	public Empleados(String nom){
		
		nombre=nom;
		seccion="Administración";
		
	}
		
	public void cambiaSeccion(String seccion){ //setter
		this.seccion=seccion;
	}
		
	public String devuelveDatos(){ //getter
		return "El nombre es: "+nombre+" y la sección es: "+seccion;
	}
	
	private final String nombre;
	private String seccion;
}