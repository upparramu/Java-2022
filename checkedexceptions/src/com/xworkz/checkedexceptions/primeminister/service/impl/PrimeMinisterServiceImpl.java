package com.xworkz.checkedexceptions.primeminister.service.impl;

import com.xworkz.checkedexception.InvalidNameException;
import com.xworkz.checkedexceptions.primeminister.dao.PrimeMinisterDAO;
import com.xworkz.checkedexceptions.primeminister.service.PrimeMinisterService;

public class PrimeMinisterServiceImpl implements PrimeMinisterService {

	private PrimeMinisterDAO dao;

	public PrimeMinisterServiceImpl(PrimeMinisterDAO dao) {
		this.dao = dao;

	}

	public boolean validateAndSave(String primeMinisterName) throws InvalidNameException {
		if (primeMinisterName != null && primeMinisterName.length() > 3 && primeMinisterName.length() < 50) {
			if (this.dao.check(primeMinisterName)) {
				System.out.println("Prime Minister Already Exists");
				throw new InvalidNameException("name is already there");
			} else {
				System.out.println("Prime Minister not Exists");
				return this.dao.save(primeMinisterName);
			}
		} else {
			throw new InvalidNameException("Invalid");
		}

	}
}
