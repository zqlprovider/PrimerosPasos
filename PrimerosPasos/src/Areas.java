import java.util.*;
import javax.swing.*;

public class Areas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Elige una opción: \n 1:Cuadrado\n 2:Rectángulo \n 3:Triángulo \n 4:Circulo");
		
		int figura=entrada.nextInt();
		
		switch (figura){
		case 1:
			int lado=Integer.parseInt(JOptionPane.showInputDialog("Introduce el lado"));
			
			System.out.println("El área del cuadrado es "+Math.pow(lado, 2));
			
			break;
		case 2:
			int altura=Integer.parseInt(JOptionPane.showInputDialog("Introduce el altura"));
			int base=Integer.parseInt(JOptionPane.showInputDialog("Introduce el base"));
			
			System.out.println("El área del rectángulo es "+(altura*base));
			
			break;
		case 3:
			altura=Integer.parseInt(JOptionPane.showInputDialog("Introduce el altura"));
			base=Integer.parseInt(JOptionPane.showInputDialog("Introduce el base"));
			
			System.out.println("El área del triángulo es "+(altura*base)/2);
			
			break;
		case 4:
			int radio=Integer.parseInt(JOptionPane.showInputDialog("Introduce el radio"));
			
			System.out.print("El área del triángulo es ");
			System.out.printf("%1.2f",Math.PI*(Math.pow(radio, 2)));
			
			break;
		default:
			System.out.println("Opción incorrecta.");
			break;
		}

	}

}