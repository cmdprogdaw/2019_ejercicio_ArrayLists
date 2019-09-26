package com.cris.misListas.print;

import java.util.Iterator;

import com.cris.misListas.bean.Persona;
import com.cris.misListas.error.FueraDeRangoException;
import com.cris.misListas.negocio.ListaPersonas;

public class ImprimirConsola {
	
	/**
	 * Metodo estatico que me permite imprimir sin que haya un objeto creado
	 * @param lista ListaPersonas a imprimir
	 */
	public static void imprimirListaPersonas(ListaPersonas lista) {
		
		System.out.println("\n\n**************");
		for(int i=0;i<lista.getElementos();i++) {
			
			// probamos que no haya errores e imprimimos la información
			try {
				
				Persona persona = lista.getPersona(i);
				imprimirPrivado(persona);	
			} 
			catch (FueraDeRangoException e) {
			}
			
		}
		
	}		
	
	
	//permite imprimir la lista pasandola entera o pasando su iterador
	/**		 * Imprime con un iterador
	 * @param lista iterador de Persona
	 */
	public static void imprimirListaPersonas(Iterator<Persona> lista) {
			
		System.out.println("\n\n**************");
		while (lista.hasNext()) {//pregunta si tiene elementos
			
			Persona persona =  lista.next();
			imprimirPrivado(persona);
			
		}
			
		// lista.next()  dice que le de el siguiente elemento
	}
		
		
		
	private static void imprimirPrivado(Persona persona) {
		System.out.println(persona.getNombre()+" > "+persona.getEdad()+" > "+persona.getPeso());
	}
}
