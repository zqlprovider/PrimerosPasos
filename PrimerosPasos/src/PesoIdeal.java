import javax.swing.*;

public class PesoIdeal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String genero="";
		
		do{
			genero=JOptionPane.showInputDialog("Introduce tu genero (H/M)");
			
		}while (genero.equalsIgnoreCase("H")==false && genero.equalsIgnoreCase("M")==false);
		
		int altura=Integer.parseInt(JOptionPane.showInputDialog("Introduce altura en cm"));
		
		int pesoideal=0;
				
		if (genero.equalsIgnoreCase("H")==true){
			pesoideal=altura-110;
		}
		else {
			
			pesoideal=altura-120;
			
		}
		
		System.out.println("Tu peso ideal es "+pesoideal);

	}

}
