package PintorFactory;

import java.awt.Color;
import java.awt.Graphics;
import java.util.Random;

import javax.swing.JComponent;

import GUI.Lienzo;
import Observer.*;
import Strategy.Contexto;
import Strategy.PintarPoligono;
import Strategy.PintarPunto;

public class PintorPunto implements pintor {
	public void pintar(Lienzo lienzo, Pintura pintura, Color colorAleatorio){
		Contexto contexto = new Contexto(new PintarPunto() );
		contexto.ejecutar(lienzo, pintura, colorAleatorio);
	}
}
