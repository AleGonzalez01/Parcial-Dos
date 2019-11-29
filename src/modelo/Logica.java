package modelo;

import java.util.ArrayList;

import processing.core.PApplet;

public class Logica {
	ArrayList<Personaje> personajes;
	PApplet p;
	float posX;
	float posY;
	int edad;
	int numero;
	public Logica(PApplet p){
		this.p=p;
		
		this.personajes =new ArrayList<Personaje>();
	}
	
	public void pintar() {
		for (int i = 0; i < personajes.size(); i++) {
			personajes.get(i).pintar();
			
		}
	}
	public void mouse() {
		posX= p.random(200, 1000);
		posY= p.random(100, 800);
		edad= (int) p.random(40);
		numero= (int) p.random(100);
		personajes.add(new Personaje(posX, posY, edad, numero, p));
		PApplet.println(personajes.size());
	}

}
