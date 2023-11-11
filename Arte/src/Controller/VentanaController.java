package Controller;

import java.awt.Color;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.Timer;
import java.util.TimerTask;

import GUI.Ventana;
import PintorFactory.*;
import Lista.*;
import Observer.*;

public class VentanaController {
	private Ventana ventana;
	private List<String> nombresColores = (List<String>) Arrays.asList(
            "BLACK", "BLUE", "CYAN", "DARK_GRAY", "GRAY", "GREEN",
            "LIGHT_GRAY", "MAGENTA", "ORANGE", "PINK", "RED", "BLACK", "YELLOW"
    );
	
	public VentanaController() {
		
	}
	
	public void abrir() {
		this.ventana = new Ventana(0, 0); 
	}
	
	public ListaConcreta generarPintores(int rondas) { 
		ListaConcreta pintores = new ListaConcreta();
		int cantidad = 1;
		while (cantidad <= rondas)
		{
			if (cantidad % 3 == 1)
			{
				pintor pintor = pintorFactory.pintorFactory("rayas");  
				pintores.agregarPintor(pintor);
			}
			if (cantidad % 3 == 2)
			{
				pintor pintor = pintorFactory.pintorFactory("puntos"); 
				pintores.agregarPintor(pintor);
			}
			if (cantidad % 3 == 0)
			{
				pintor pintor = pintorFactory.pintorFactory("poligonos"); 
				pintores.agregarPintor(pintor);
			}
			
			cantidad += 1;
				 
		}
		return pintores;
	}
	
	
	public void generarPintura (ListaConcreta pintores, int rondas) {
		Timer timer = new Timer();
		TimerTask pintura = new TimerTask() {

			int rounds = rondas;
			Sujeto sujeto = new Sujeto();
			Pintura pintura = new Pintura(sujeto);
			List<String> colores = new ArrayList<>();
			
			@Override
			public void run() {
				
				if (rounds > 0)
				{	
					Iterador iterador = pintores.crearIterador();
					while (iterador.siguiente())
					{
						Random random = new Random();
						String nombreColor = nombresColores.get(random.nextInt(nombresColores.size()));
						Color colorAleatorio = getColorPorNombre(nombreColor);
						pintor pintor = (PintorFactory.pintor) iterador.actual();
						pintor.pintar(ventana.lienzo, pintura, colorAleatorio);
						iterador.next(); 
					}
				rounds -= 1;
				}
				else { System.out.println("FIN"); timer.cancel(); }
				
			}
			
		};
		
		timer.schedule(pintura,0, 300);
			 
	}
	
	private Color getColorPorNombre(String nombreColor) {
        // Utilizar reflexión para obtener el objeto Color por nombre
        try {
            java.lang.reflect.Field campoColor = Class.forName("java.awt.Color").getField(nombreColor);
            return (Color) campoColor.get(null);
        } catch (Exception e) {
            e.printStackTrace();
            // En caso de error, devolver un color por defecto (negro)
            return Color.BLACK;
        }
    }
}
