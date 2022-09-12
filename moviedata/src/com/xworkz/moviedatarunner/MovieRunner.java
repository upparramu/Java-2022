package com.xworkz.moviedatarunner;

import com.xworkz.moviedataDao.MovieDAO;
import com.xworkz.moviedataDto.MovieDTO;
import com.xworkz.moviedataimpl.MovieDAOimpl;

public class MovieRunner {

	public static void main(String[] args) {
		
		MovieDTO dto = new MovieDTO();
		dto.setId(1);
		dto.setHeroname(">>  N.T.R  <<");
		dto.setHeroinename(">>  Alia Bath  <<");
		dto.setWwcollections(1125d);
		dto.setShootinglocations(">>  Delhi Forest  <<");
		String[] producers= {">>  Lyca Production  <<"};
		dto.setProducersname(producers);
		String[] actors= {">>  N.T.R  <<"};
		dto.setActors(actors);
		dto.setReviews(4.8f);
		dto.setYearofrelease(2021);
		dto.setDirectorname(">>  Rajamouli  <<");
		dto.setHeroshare(45d);
		dto.setHeroineshare(9d);
		dto.setNegativerolename(">>  RAY Stevenon  <<");
		dto.setAvailableinott(true);
		
		MovieDAO dao = new MovieDAOimpl();
		dao.create(dto);
		
		
		
		
		

	}

}
