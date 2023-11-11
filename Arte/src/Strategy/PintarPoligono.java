package Strategy;

import java.awt.Color;
import java.awt.Graphics;
import java.util.Random;

import GUI.Lienzo;
import Observer.Pintura;

public class PintarPoligono implements Pintar{

	public void pintar(Lienzo lienzo, Pintura pintura, Color colorAleatorio) {
		
		// TODO Auto-generated method stub
		System.out.println("POLIGONO");
		
		int x1 = pintura.sujeto.X1; 
		int y1 = pintura.sujeto.Y1;
		int x2 = pintura.sujeto.X2;
		int y2 = pintura.sujeto.Y2;
		
		Random random = new Random();
		x1 += random.nextInt(10);
		y1 += random.nextInt(10);
		x2 += random.nextInt(10);
		y2 += random.nextInt(10);
		
		

		Graphics g = lienzo.getGraphics();
		
		g.setColor(colorAleatorio);
		int forma = random.nextInt(4);

		
		if (forma == 1)
		{
			int[] x = {x1, x2, 100};
			int[] y = {y1, y2, 150};
			g.fillPolygon(x, y, 3);
		}
		if (forma == 2)
		{
			int[] X1 = {x1, x2, random.nextInt(50), random.nextInt(50)};
			int[] Y1 = {y1, y2, random.nextInt(50), random.nextInt(50)};
			g.fillPolygon(X1, Y1, 4);
		}
		if (forma == 3)
		{
			int[] X2 = {x1, x2, random.nextInt(50), random.nextInt(50), random.nextInt(50)};
			int[] Y2 = {y1, y2, random.nextInt(50), random.nextInt(50), random.nextInt(50)};
			g.fillPolygon(X2, Y2, 5);
		}
		if (forma == 4)
		{
			int[] X3 = {x1, y1, random.nextInt(50), random.nextInt(50), random.nextInt(50), random.nextInt(50)};
			int[] Y3 = {y1, y2, random.nextInt(50), random.nextInt(50), random.nextInt(50), random.nextInt(50)};
			g.fillPolygon(X3, Y3, 6);
		}
		
		 
			   
		pintura.publicar(x1, y1, x2, y2);
	}
}
