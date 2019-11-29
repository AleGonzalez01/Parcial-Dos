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
	 static String [] personajesOR;
	public Logica(PApplet p){
		this.p=p;
		this.personajes =new ArrayList<Personaje>();
		this.personajesOR = new String[4];
	}
	
	public void pintar() {
		for (int i = 0; i < personajes.size(); i++) {
			personajes.get(i).pintar();
			new Thread(personajes.get(i)).start();

		}
	}
	public void mouse() {
		posX= p.random(200, 900);
		posY= p.random(100, 800);
		edad= (int) p.random(40);
		numero= (int) p.random(100);
		personajes.add(new Personaje(posX, posY, edad, numero, p));
		for (int i = 0; i < personajes.size(); i++) {
		if(PApplet.dist(p.mouseX, p.mouseY, personajes.get(i).getPosX(), personajes.get(i).getPosY())<10) {
			for (int j = 0; j < personajesOR.length; j++) {
				
			}
		}
		}
		
		
		
	}
	
	public static void excepcion()throws Excepcion{
        if(personajesOR [4] != null){
            throw new Excepcion("No más");
        }

}
}
