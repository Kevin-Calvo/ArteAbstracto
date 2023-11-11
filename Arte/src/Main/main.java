package Main;
import GUI.*;
import GUI.Menu;
import PintorFactory.PintorRaya;

import javax.swing.*;

import Controller.VentanaController;

import java.awt.*;
public class main {

	public static void main(String[] args) {
		SwingUtilities.invokeLater(() -> {
			Menu menu = new Menu();
		});
	}
}
