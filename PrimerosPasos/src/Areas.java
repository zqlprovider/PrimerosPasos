import java.util.*;
import javax.swing.*;

public class Areas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Elige una opci�n: \n 1:Cuadrado\n 2:Rect�ngulo \n 3:Tri�ngulo \n 4:Circulo");
		
		int figura=entrada.nextInt();
		
		switch (figura){
		case 1:
			int lado=Integer.parseInt(JOptionPane.showInputDialog("Introduce el lado"));
			
			System.out.println("El �rea del cuadrado es "+Math.pow(lado, 2));
			
			break;
		case 2:
			int altura=Integer.parseInt(JOptionPane.showInputDialog("Introduce el altura"));
			int base=Integer.parseInt(JOptionPane.showInputDialog("Introduce el base"));
			
			System.out.println("El �rea del rect�ngulo es "+(altura*base));
			
			break;
		case 3:
			altura=Integer.parseInt(JOptionPane.showInputDialog("Introduce el altura"));
			base=Integer.parseInt(JOptionPane.showInputDialog("Introduce el base"));
			
			System.out.println("El �rea del tri�ngulo es "+(altura*base)/2);
			
			break;
		case 4:
			int radio=Integer.parseInt(JOptionPane.showInputDialog("Introduce el radio"));
			
			System.out.print("El �rea del tri�ngulo es ");
			System.out.printf("%1.2f",Math.PI*(Math.pow(radio, 2)));
			
			break;
		default:
			System.out.println("Opci�n incorrecta.");
			break;
		}

	}

}