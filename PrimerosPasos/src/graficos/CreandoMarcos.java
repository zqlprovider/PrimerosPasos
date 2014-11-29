package graficos;

import java.awt.Frame;

import javax.swing.*;

public class CreandoMarcos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		miMarco marco1=new miMarco(250,250,"Prueba");
		
		marco1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

}

class miMarco extends JFrame{
	
	public miMarco(int ancho, int alto, String titulo){
		
		setVisible(true);
		
		setResizable(true); //no permite cambiar tamaño
			
		//setExtendedState(Frame.MAXIMIZED_BOTH); //inicia maximizada
		
		setTitle(titulo);
		
		setBounds(500,300,ancho,alto);
		
		
		
		
	}
}