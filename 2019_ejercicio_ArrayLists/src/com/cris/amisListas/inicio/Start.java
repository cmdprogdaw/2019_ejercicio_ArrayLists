package com.cris.amisListas.inicio;

import com.cris.amisListas.error.FueraDeRangoException;
import com.cris.amisListas.print.ImprimirConsola;
import com.cris.misListas.bean.Persona;
import com.cris.misListas.negocio.ListaPersonas;
import com.cris.misListas.negocio.ordenador.OrdenadorPersonas;

public class Start {

	public static void main(String[] args){
		//creacion de objetos
		//Persona uno = new Persona("Adrian", "Lodeiro", "987643222", "Llanera", 19, 65);
		
		Persona persona1 = new Persona();
		persona1.setNombre("Maria");
		persona1.setApellidos("López");
		persona1.setTelefono("634623231");
		persona1.setCiudad("Oviedo");
		persona1.setEdad(27);
		persona1.setPeso(56);
		
		Persona persona2 = new Persona();
		persona2.setNombre("Paco");
		persona2.setApellidos("Garcia");
		persona2.setTelefono("61444931");
		persona2.setCiudad("Gijon");
		persona2.setEdad(40);
		persona2.setPeso(70);
		
		Persona persona3 = new Persona();
		persona3.setNombre("Rogelio");
		persona3.setApellidos("Garcia");
		persona3.setTelefono("612345671");
		persona3.setCiudad("Gijon");
		persona3.setEdad(10);
		persona3.setPeso(136);
		
		
		ListaPersonas lista = new ListaPersonas();
		lista.addPersona(persona1);
		lista.addPersona(persona2);
		lista.addPersona(persona3);
		
		
		//primero lo imprime sin ordenar, luego ordenando por peso y por ultimo por edad
		ImprimirConsola.imprimirListaPersonas(lista.getPersonas());
		
		OrdenadorPersonas op = new OrdenadorPersonas();
		op.ordenatePeso();
		lista.ordenar(op);
		ImprimirConsola.imprimirListaPersonas(lista.getPersonas());
		
		op.ordenateEdad();
		lista.ordenar(op);
		ImprimirConsola.imprimirListaPersonas(lista.getPersonas());
		
		
		
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
