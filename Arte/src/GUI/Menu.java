package GUI;

import java.awt.Font;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import Controller.*;
import Lista.ListaConcreta;
import PintorFactory.pintor;

public class Menu {
	JFrame menu;
	JButton iniciar;
	JLabel titulo;
	JLabel pintores;
	JTextField inputPintores;
	JLabel rondas;  
	JTextField inputRondas;
	JLabel x;  
	Font font1; 
	Font font2; 

	public Menu() {
		font1 = new Font("Arial", Font.BOLD, 35); 
		font2 = new Font("Arial", Font.PLAIN, 20);   
		
		menu = new JFrame();
		menu.setVisible(true);
		menu.setBounds(250,250, 600, 400);
		menu.setLayout(null);
		menu.setTitle("Menu Arte Abstracto"); 
		
		titulo = new JLabel();
		titulo.setText("Arte Abstracto");
		titulo.setBounds(180,0,450,100); 
		titulo.setFont(font1);  
		menu.add(titulo);
		
		pintores = new JLabel();
		pintores.setText("Numero Pintores: ");
		pintores.setBounds(150,100,160,40); 
		pintores.setFont(font2);  
		menu.add(pintores);
		
		rondas = new JLabel();
		rondas.setText("Numero Rondas: ");
		rondas.setBounds(150,200,160,40); 
		rondas.setFont(font2);  
		menu.add(rondas);
		
		inputPintores = new JTextField(4);
		inputPintores.setBounds(320,105,50,30);
		inputPintores.setVisible(true);
		menu.add(inputPintores);
		
		inputRondas = new JTextField(4);
		inputRondas.setBounds(320,205,50,30);
		inputRondas.setVisible(true);
		menu.add(inputRondas);
		
		iniciar = new JButton();
		iniciar.setBounds(260,300,100,50);
		iniciar.setText("INICIAR");
		menu.add(iniciar);
		
		iniciar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            	try {
            		int Rondas = Integer.parseInt(inputRondas.getText()); 
            	}
            	catch (NumberFormatException rondas) 
            	{
            		System.out.println("Numero de Rondas invalido"); 
            		return;
            	}
            	
            	try {
            		int pintores = Integer.parseInt(inputPintores.getText()); 
            	}
            	catch (NumberFormatException pintores) 
            	{
            		System.out.println("Numero de Pintores invalido"); 
            		return; 
            	}
            	
            	int Rondas = Integer.parseInt(inputRondas.getText());
            	int Pintores = Integer.parseInt(inputPintores.getText()); 
            	if (Rondas > 5)
            	{
            		System.out.println("Numero Maximo de Rondas es 5");
            		return;
            	}
            	if (Pintores > 9 )
            	{
            		System.out.println("Numero Maximo de Pintores es 9"); 
            		return;
            	}
            	
            	VentanaController controlador = new VentanaController();
            	controlador.abrir(); 
            	ListaConcreta pintores = controlador.generarPintores(Pintores);
            	controlador.generarPintura(pintores, Rondas); 
            	return; 
            }
        });
		
	}
}
