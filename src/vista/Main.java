package vista;

import modelo.Logica;
import processing.core.PApplet;

public class Main extends PApplet {

	public static void main(String[] args) {
		PApplet.main("vista.Main");

	}
	Logica logica;
	public void settings() {
		size(1000,1000);
	}
	
	public void setup() {
		logica= new Logica(this);
	}
	
	public void draw() {
		background(255);
		logica.pintar();

	}
	
	public void mousePressed() {
		logica.mouse();
	}

}
