package com.xworkz.moviedataimpl;

import com.xworkz.moviedataDao.MovieDAO;
import com.xworkz.moviedataDto.MovieDTO;

public class MovieDAOimpl implements MovieDAO {
	
	private MovieDTO[] movies = new MovieDTO[14];
	private int index = 0;

	@Override
	public boolean create(MovieDTO dto) {

		this.movies[index] = dto;
		System.out.println("Movie is saved,"+dto +"into index"+this);
		this.index++;
		return true;
	}

}
