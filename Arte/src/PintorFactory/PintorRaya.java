package PintorFactory;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

import GUI.Lienzo;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics;
import Observer.*;
import Strategy.*;
public class PintorRaya implements pintor{
	
	public void pintar(Lienzo lienzo, Pintura pintura, Color colorAleatorio){
		Contexto contexto = new Contexto(new PintarRaya() );
		contexto.ejecutar(lienzo, pintura, colorAleatorio); 
	}
}
