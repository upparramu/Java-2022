package com.xworkz.checkedexception.main;

import com.xworkz.checkedexception.InvalidIndexException;
import com.xworkz.checkedexception.InvalidNameException;
import com.xworkz.checkedexceptions.primeminister.dao.PrimeMinisterDAO;
import com.xworkz.checkedexceptions.primeminister.dao.impl.PrimeMinisterDAOImpl;
import com.xworkz.checkedexceptions.primeminister.service.PrimeMinisterService;
import com.xworkz.checkedexceptions.primeminister.service.impl.PrimeMinisterServiceImpl;

public class PrimeMinisterRunner {

	public static void main(String[] args) {
		
		PrimeMinisterDAO dao = new PrimeMinisterDAOImpl();
		PrimeMinisterService service=new PrimeMinisterServiceImpl(dao);
		try {
			service.validateAndSave("Jawahar Lal Nehru");
			service.validateAndSave("Lal Bahadur Shastri");
			service.validateAndSave("Indira Gandhi");
			service.validateAndSave("Rajiv Gandhi");
			service.validateAndSave("P. V. Narasimha Rao");
		}
		catch(InvalidIndexException iie) {
			System.err.println(iie.getMessage());
		}
		catch(InvalidNameException ine){
			System.out.println(ine.getMessage());
			
		}

	}

}
