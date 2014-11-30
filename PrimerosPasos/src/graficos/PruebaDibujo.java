package graficos;
import javax.swing.*;

import java.awt.*;
import java.awt.geom.*;
import java.awt.geom.Ellipse2D.Double;

public class PruebaDibujo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MarcoConDibujos mimarco=new MarcoConDibujos();
		
		mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

}

class MarcoConDibujos extends JFrame {
	
	public MarcoConDibujos(){
		setVisible(true);
		
		setTitle("Prueba de Dibujo");
		
		setSize(400,400);
		
		LaminaConFiguras milamina=new LaminaConFiguras();
		
		add(milamina);
		
	}
}

class LaminaConFiguras extends JPanel {
	
	public void paintComponent (Graphics g){
		
		super.paintComponent(g);
		
		//g.drawRect(50, 50, 200, 200);
		//g.drawLine(50, 50, 300, 200);
		//g.drawArc(50, 100, 100, 200, 120, 150);
		
		Graphics2D g2=(Graphics2D) g;
		
		Rectangle2D rectangulo=new Rectangle2D.Double(50,50,100,100);
		
		g2.setPaint(Color.BLUE);
		
		g2.fill(rectangulo);
		
		Ellipse2D elipse=new Ellipse2D.Double();
		
		elipse.setFrame(50, 50, 100, 100);
		
		g2.setPaint(new Color(0,140,255));
		
		g2.fill(elipse);
		
		g2.draw(new Line2D.Double(50, 50, 150, 150));
		
		double centroEnX=rectangulo.getCenterX();
		double centroEnY=rectangulo.getCenterY();
		double radio=150;
		
		Ellipse2D circulo=new Ellipse2D.Double();
		
		circulo.setFrameFromCenter(centroEnX, centroEnY, centroEnX+radio,centroEnY+radio);
		
		g2.draw(circulo);
		
		
	}
}
