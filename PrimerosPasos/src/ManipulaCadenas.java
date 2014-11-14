
public class ManipulaCadenas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String nombre = "Ezequiel";
		
		System.out.println("Mi nombre es: "+nombre);
		
		System.out.println("Mi nombre tiene " + nombre.length() + " letras.");
		
		System.out.println("La primera letra de " + nombre + " es la " + nombre.charAt(0));
		
		int UltimaLetra = nombre.length()-1;
		
		System.out.println("La ultima letra de " + nombre + " es la " + nombre.charAt(UltimaLetra));

	}

}
