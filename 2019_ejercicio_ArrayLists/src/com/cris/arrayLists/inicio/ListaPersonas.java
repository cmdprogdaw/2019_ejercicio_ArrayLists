package com.cris.arrayLists.inicio;

import java.util.ArrayList;

public class ListaPersonas{
	
	private int longitud;
	
	ArrayList<Persona> datos = new ArrayList<Persona>();
	
	private void addPersona(Persona p) {
		datos.add(p); //añade al arraylist datos, la persona p que se le pasa como parametro al hacer una llamada a ese metodo
	}
	
	public double getLongitud() {
		longitud = datos.size();
		return longitud;
	}	

}
