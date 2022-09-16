package com.xworkz.checkedexceptions.primeminister.service;

import com.xworkz.checkedexception.InvalidNameException;

public interface PrimeMinisterService {
	
	boolean validateAndSave(String PrimeMinisterName) throws InvalidNameException;

}
