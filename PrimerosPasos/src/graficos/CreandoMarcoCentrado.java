package graficos;

import java.awt.*;
import java.awt.Toolkit;
import javax.swing.*;

public class CreandoMarcoCentrado {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MarcoCentrado mimarco=new MarcoCentrado();
		mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}

}

class MarcoCentrado extends JFrame {
	
	public MarcoCentrado(){
		
		setVisible(true);
		Toolkit mipantalla=Toolkit.getDefaultToolkit();
		
		Dimension tamanoPantalla=mipantalla.getScreenSize();
		
		int alturaPantalla=tamanoPantalla.height;
		int anchoPantalla=tamanoPantalla.width;
		
		setSize(anchoPantalla/2,alturaPantalla/2);
		
		setLocation(anchoPantalla/4,alturaPantalla/4);
		
		setTitle("Marco Centrado");
		
		Image miIcono=mipantalla.getImage("src/graficos/icono.gif");
		
		setIconImage(miIcono);

	}
	
}
