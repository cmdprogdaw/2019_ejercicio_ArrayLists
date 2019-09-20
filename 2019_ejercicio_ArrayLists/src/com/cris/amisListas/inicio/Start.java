package com.cris.amisListas.inicio;

import com.cris.amisListas.error.FueraDeRangoException;
import com.cris.amisListas.print.ImprimirConsola;
import com.cris.misListas.bean.Persona;
import com.cris.misListas.negocio.ListaPersonas;

public class Start {

	public static void main(String[] args){
		//creacion de objetos
		//Persona uno = new Persona("Adrian", "Lodeiro", "987643222", "Llanera", 19, 65);
		
		Persona personal = new Persona();
		personal.setNombre("Maria");
		personal.setApellidos("López");
		personal.setTelefono("634623231");
		personal.setCiudad("Oviedo");
		personal.setEdad(27);
		personal.setPeso(56);
		
		ListaPersonas lista = new ListaPersonas();
		lista.addPersona(personal);
		
		ImprimirConsola.imprimirListaPersonas(lista);
		ImprimirConsola.imprimirListaPersonas(lista.getElementos());
		
		/*necesita saber que esto lanza cosas, dos opciones: 
		avisar tu de que vienen cosas volando > el programa se detiene en cuanto lanza la excepcion
		o 
		no avisar de que llegan cosas > y lo protege, en este caso a las dos cosas
		
		
		//java te dice que no esta inicializado asi que ponemos null
		Persona persona2 = null;
		try {
			persona2 = lista.getPersona(10);
		} 
		catch (FueraDeRangoException e) {
			e.printStackTrace();
		}
		
		/*} catch (Exception e) { cualquier otra excepcion que haga esto
			e.printStackTrace();
			podemos obviar la informacion que casca, o sea, si quitamos el 
			e.printStackTrace(); no salta excepcion
		}
		
		try { 
			persona2= lista.getPersona(0);
		} 
		catch (FueraDeRangoException e) { 
			e.printStackTrace();
		}
		System.out.println(persona2);
		*/
	}

}
