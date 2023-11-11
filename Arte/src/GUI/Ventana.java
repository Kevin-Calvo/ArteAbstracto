package GUI;

import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.*;
import GUI.Lienzo; 

public class Ventana extends JFrame{
	public Lienzo lienzo;
	
	public Ventana(int rondas, int pintores) {
		setTitle("Ventana de Dibujo");
        setSize(800, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        lienzo = new Lienzo();
        add(lienzo);

        setVisible(true);
	}
	
	public Lienzo getLienzo() {
        return lienzo;
    }
	
	public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new Ventana(5,5));
    }

}
