package com.cris.amisListas.print;

import java.util.Iterator;

import com.cris.amisListas.error.FueraDeRangoException;
import com.cris.misListas.bean.Persona;
import com.cris.misListas.negocio.ListaPersonas;

public class ImprimirConsola {
	
	/**
	 * Metodo estatico que me permite imprimir sin que haya un objeto creado
	 * @param lista ListaPersonas a imprimir
	 */
	public static void imprimirListaPersonas(ListaPersonas lista) {
		
		for(int i=0; i<lista.getElementos(); i++) {
			
			//probamos que no haya errores e imprimimos la informacion
			try {
				
				Persona persona = lista.getPersona(i);
				
				System.out.println("********************");
				System.out.println(persona.getNombre());
			} 
			catch (FueraDeRangoException e) {
			}
			
		}
		
		
		
		//permite imprimir la lista pasandola entera o pasando su iterador
		/**
		 * Imprime con un iterador
		 * @param lista iterador de Persona
		 */
		public static void imprimirListaPersonas(Iterator<Persona> lista) {
			
			while (lista.hasNext()) {//pregunta si tiene elementos
				
				Persona persona =  lista.next();
				System.out.println("********************");
				System.out.println(persona.getNombre());
			}
			
			// lista.next()  dice que le de el siguiente elemento
		}
	}
}
