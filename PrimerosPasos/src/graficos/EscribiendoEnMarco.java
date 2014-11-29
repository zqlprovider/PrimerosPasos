package graficos;
import javax.swing.*;
import java.awt.*;

public class EscribiendoEnMarco {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MarcoConTexto mimarco=new MarcoConTexto();
		
		mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		

	}

}

class  MarcoConTexto extends JFrame{
	
	public MarcoConTexto(){
		setVisible(true);
		
		setSize(600,450);
		
		setLocation(400,200);
		
		setTitle("Primer Texto");
		
		Lamina milamina=new Lamina();
		
		add(milamina);
	}
}

class Lamina extends JPanel{
	
	public void paintComponent(Graphics g){
		super.paintComponent(g);
		g.drawString("Hola Mundo!", 100, 100);
	}
}
