package Strategy;

import java.awt.Color;

import GUI.Lienzo;
import Observer.Pintura;

public class Contexto {

	private Pintar paint;
	
	public Contexto(Pintar estilo) {
		this.paint = estilo;
	}
	
	public void ejecutar(Lienzo lienzo, Pintura pintura, Color colorAleatorio) {
		this.paint.pintar(lienzo, pintura, colorAleatorio);
	}
}
