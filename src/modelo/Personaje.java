package modelo;

import processing.core.PApplet;
import processing.core.PImage;

public class Personaje extends Thread{
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
	this.posX=posX;
	this.posY=posY;
	imagen=p.loadImage("data/bart_simpson.png");
}

public void run() {
	mover();
	try {
		Thread.sleep(50);
	} catch (InterruptedException e) {
		e.printStackTrace();
	}
}
public void pintar() {
	
p.image(imagen, posX+velocidad, posY,65,100);
}
public void mover() {
		velocidad+=1;
	
	
	if(posX+velocidad>=800) {
		velocidad*=-100;
	}
}

public float getPosX() {
	return posX;
}

public void setPosX(float posX) {
	this.posX = posX;
}

public float getPosY() {
	return posY;
}

public void setPosY(float posY) {
	this.posY = posY;
}

public int getEdad() {
	return edad;
}

public void setEdad(int edad) {
	this.edad = edad;
}

public int getNumero() {
	return numero;
}

public void setNumero(int numero) {
	this.numero = numero;
}

public PApplet getP() {
	return p;
}

public void setP(PApplet p) {
	this.p = p;
}

public PImage getImagen() {
	return imagen;
}

public void setImagen(PImage imagen) {
	this.imagen = imagen;
}

public boolean isDale() {
	return dale;
}

public void setDale(boolean dale) {
	this.dale = dale;
}

public int getVelocidad() {
	return velocidad;
}

public void setVelocidad(int velocidad) {
	this.velocidad = velocidad;
}

}
