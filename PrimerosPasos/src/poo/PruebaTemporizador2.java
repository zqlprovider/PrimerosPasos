package poo;

import javax.swing.*;

import java.awt.Toolkit;
import java.awt.event.*;
import java.util.*;

import javax.swing.Timer;

public class PruebaTemporizador2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Reloj mireloj=new Reloj();
		
		mireloj.enMarcha(3000,true);
		
		JOptionPane.showMessageDialog(null, "Pulsa Aceptar para terminar");
		
		System.exit(0);

	}

}

class Reloj {
	// para poder acceder en la clase interna a un parametro debe usarse final
	public void enMarcha(int intervalo, final boolean sonido){ 
		
		class DameLaHora2 implements ActionListener{ //clase interna local
			
			public void actionPerformed(ActionEvent evento){
				Date ahora=new Date();
				
				System.out.println("Te pongo la hora cada 3sg "+ahora);
				
				if(sonido){ //puedo acceder a una propiedad de una clase q la contiene sin getter
					Toolkit.getDefaultToolkit().beep();
				}
				
			}
		}
		
		ActionListener oyente=new DameLaHora2();
		
		Timer mitemporizador=new Timer(intervalo,oyente);
		
		mitemporizador.start();
	}
	
}