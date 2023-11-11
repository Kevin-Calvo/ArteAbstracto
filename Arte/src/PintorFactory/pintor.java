package PintorFactory;

import java.awt.Color;
import java.awt.Graphics;
import GUI.Lienzo; 
import Observer.*;

public interface pintor {
	
	void pintar(Lienzo lienzo, Pintura pintura, Color colorAleatorio) ;
	
}
