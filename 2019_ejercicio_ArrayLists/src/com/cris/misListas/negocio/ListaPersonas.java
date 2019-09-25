package com.cris.misListas.negocio;

import java.util.ArrayList;
import java.util.Iterator;

import com.cris.amisListas.error.FueraDeRangoException;
import com.cris.misListas.bean.Persona;
import com.cris.misListas.negocio.ordenador.OrdenadorPersonas;

public class ListaPersonas{
	
	/*private ArrayList<Persona> datos = new ArrayList<Persona>();
	 * java lo convierte en lo de abajo
	 * declaro algo y luego lo utilizo
	*/
	
	/*Ejemplo de usar un vector de Persona (en este caso no pq manda un arrayList
		 private Persona[] listaInterna; */
		 
	//Usamos un arrayList internamente para funcionar 
	private ArrayList<Persona> listaInterna;
	
	
	//constructor
	public ListaPersonas() {
		
		listaInterna = new ArrayList<Persona>();
	}
	
	
	//La clase la documento para que la utilicen
	
	/**
	 * Esta operacion introduce un objeto Persona en la 
	 * ListaPersonas
	 * 
	 * @param persona Persona a insertar
	 */
	public void addPersona(Persona persona) {
		/*uso la lista interna y me ayudo de ella
		  lo unico que tengo que decirle es que añada a la persona*/
		listaInterna.add(persona);
	}
	
	
	
	/**
	 * Tamaño de la lista
	 * 
	 * @return el numero de elementos que posee la lista
	 */
	public int getElementos() {
		
		// decuelvo el tamanio de la lista
		return listaInterna.size();
	}
	
	
	/**
	 * Recoge la Persona indicada por el indice
	 * 
	 * @param index La posicion de la Persona solicitada
	 * @return El objeto Persona en esa posicion
	 * @throws FueraDeRangoException error producido
	 */
	public Persona getPersona(int index) throws FueraDeRangoException {
		 
		//mayor que 0 y menos que la longitud de la lista
		if((index>=0)&&(index<listaInterna.size())) {
			
			return listaInterna.get(index);	
		}
		
		/*creo un objeto fuera de la clase FueraDeRangoException 
		con su causa y cuando se recoge*/
		
		throw new FueraDeRangoException("Te has colado en el tamaño");
		
		}
	
	
	/*un iterador es una interfaz que es algo que tiene 
	operaciones que me facilitan mi trabajo*/
	/**
	 * Devuelve un iterador sobre los elementos de la lista
	 * 
	 * @return 
	 */
	public Iterator<Persona> getPersonas() {
		
		return listaInterna.iterator();
	}
	
	
	
	
	/*tira del arrayList para que se ordene, y necesita algo comparable, por lo que le paso mi clase 
	que como implementa el comparator sabe como comparar personas*/
	/**
	 * Ordenador de la lista que necesita un Comparator para poder ordenarse
	 * @param op Ordenador de personas que implementa el Comparator de java
	 */
	public void ordenar(OrdenadorPersonas op) {

		listaInterna.sort(op);
		
	}
	
	
	
	
	/*Lo mio (mal)
	
	private int longitud;
	
	ArrayList<Persona> datos = new ArrayList<Persona>();
	
	private void addPersona(Persona p) {
		datos.add(p); //añade al arraylist datos, la persona p que se le pasa como parametro al hacer una llamada a ese metodo
	}
	
	public double getLongitud() {
		longitud = datos.size();
		return longitud;
	}	
*/
	
}
