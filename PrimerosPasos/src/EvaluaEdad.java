import java.util.*;

public class EvaluaEdad {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Ingrese una edad por favor");
		
		Scanner entrada=new Scanner(System.in);
		
		int edad=entrada.nextInt();	
		
		if (edad<18){
			System.out.println("Eres un adolescente");
		}
		else if(edad<40){
			System.out.println("Eres joven");
		}
		else if(edad<65){
			System.out.println("Eres maduro");
		}
		else{
			System.out.println("Cuidate");
		}
		
		entrada.close();

	}

}
