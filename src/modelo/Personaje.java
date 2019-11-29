package modelo;

import processing.core.PApplet;
import processing.core.PImage;

public class Personaje implements Runnable{
	float posX,posY;
	int edad, numero;
	PApplet p;
	PImage imagen;
	boolean dale= false;
	int velocidad = 1;
public Personaje(float posX, float posY, int edad, int numero, PApplet p) {
	this.edad=edad;
	this.numero=numero;
	this.p=p;
	new Thread(this).start();
	imagen=p.loadImage("data/bart_simpson.png");
}

public void run() {
	while(dale) {
		mover();
	try {
		Thread.sleep(50);
	} catch (InterruptedException e) {
		e.printStackTrace();
	}
	}
}
public void pintar() {
	posX= p.random(200, 1000);
p.image(imagen, posX, p.random(100,800),50,100);
}
public void mover() {
	int ancho = 800;
	if(posX<200 || posX>ancho-10) {
		velocidad*=-1;
	}
}
}
