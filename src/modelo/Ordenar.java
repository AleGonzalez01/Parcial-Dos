package modelo;

import java.util.Comparator;

public class Ordenar implements Comparator<Personaje>{

	public int compare(Personaje edad, Personaje edad1) {
		if (edad.edad == edad1.edad) {     
            return 0;
        } else if (edad.edad > edad1.edad) {   
        } else {                          
            return -1;
        }
		return 0;
	
	}

}
