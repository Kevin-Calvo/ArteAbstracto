package Strategy;

import java.awt.Color;
import java.awt.Graphics;
import java.util.Random;

import GUI.Lienzo;
import Observer.Pintura;

public class PintarPunto implements Pintar{

	public void pintar(Lienzo lienzo, Pintura pintura, Color colorAleatorio){
		int x1 = pintura.sujeto.X1; 
		int y1 = pintura.sujeto.Y1;
		int x2 = pintura.sujeto.X2;
		int y2 = pintura.sujeto.Y2;
		
		Random random = new Random();
			x1 += random.nextInt(100);
			y1 += random.nextInt(100);
			x2 += random.nextInt(10);
			y2 += random.nextInt(100);
		
		

		Graphics g = lienzo.getGraphics();
		/*
		int[] x = {x1, y1, 275, 225, 125};
		int[] y = {x2, y2, 150, 50,  90};
		g.drawPolygon(x, y, 5); 
		*/
		
		g.setColor(colorAleatorio);
		g.fillOval(x1, y1, x2, x2);
		   
		pintura.publicar(x1, x1, x2, x2);
		
		System.out.println("PUNTO");
	
		
	}
}
