package Strategy;

import java.awt.Color;
import java.awt.Graphics;
import java.util.Random;

import GUI.Lienzo;
import Observer.Pintura;

public class PintarRaya implements Pintar { 
	
	public void pintar(Lienzo lienzo, Pintura pintura, Color colorAleatorio){
		int x1 = 0; 
		int y1 = 0;
		int x2 = 0;
		int y2 = 0;
		
		Random random = new Random();
		if ((pintura.sujeto.X1 == 0) && (pintura.sujeto.Y1 == 0) && (pintura.sujeto.X2 == 0) && (pintura.sujeto.Y2 == 0))
		{
			
			x1 = random.nextInt(800); 
			y1 = random.nextInt(600); 
			x2 = random.nextInt(800); 
			y2 = random.nextInt(600); 
		}
		else
		{
			x1 += random.nextInt(800);
			y1 += random.nextInt(600);
			x2 += random.nextInt(800);
			y2 += random.nextInt(600);
		}
		
		Graphics g = lienzo.getGraphics();

		g.setColor(colorAleatorio);
		g.drawLine(x1, y1, x2, y2);
		   
		pintura.publicar(x1, y1, x2, y2);
		
		System.out.println("RAYA");
	} 
}
