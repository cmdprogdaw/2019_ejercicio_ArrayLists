package com.cris.misListas.error;

public class FueraDeRangoException extends Exception {

	//necesita un string para que se marque la causa
	public FueraDeRangoException(String causa) {
		//causa que teines que poner
		super(causa);
	}
}
