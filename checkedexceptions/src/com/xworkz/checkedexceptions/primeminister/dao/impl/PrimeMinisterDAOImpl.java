package com.xworkz.checkedexceptions.primeminister.dao.impl;

import com.xworkz.checkedexception.InvalidIndexException;
import com.xworkz.checkedexceptions.primeminister.dao.PrimeMinisterDAO;

public class PrimeMinisterDAOImpl implements PrimeMinisterDAO {

	private String[] store = new String[6];
	private int index = 0;

	public boolean save(String PrimeMinisterName) {
		if (this.index < store.length) {
			this.store[index] = PrimeMinisterName;
			System.out.println(PrimeMinisterName);
			this.index++;
			return true;
		} else {
			throw new InvalidIndexException("Invalid name found");
		}
	}

	public boolean check(String PrimeMinisterName) {
		for (String ref : store) {
			if (ref != null && ref.equals(PrimeMinisterName)) {
				return true;
			} else {
				return false;
			}

		}
		return false;
	}

}
