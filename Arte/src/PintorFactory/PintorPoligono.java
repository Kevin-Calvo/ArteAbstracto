package PintorFactory;

import java.awt.Color;
import java.awt.Graphics;
import java.util.Random;

import GUI.Lienzo;
import Observer.*;
import Strategy.Contexto;
import Strategy.PintarPoligono;

public class PintorPoligono implements pintor {
	@Override
	public void pintar(Lienzo lienzo, Pintura pintura, Color colorAleatorio) {
		Contexto contexto = new Contexto(new PintarPoligono() ); 
		contexto.ejecutar(lienzo, pintura, colorAleatorio);
	}

}
