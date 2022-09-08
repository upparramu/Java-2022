package com.xworkz.example.implementor;

import com.xworkz.example.dao.LakeDAO;

public class LakeDAOImplementor implements LakeDAO {
	
	  private String[] lakeNames=new String[10];

	@Override
	public boolean save(String lakeName) 
	{
		System.out.println("<<---saving lake names--->>>");
		for (int r= 0;  r< lakeNames.length; r++) 
		{
			if(lakeNames[r] == null) 
			{
				lakeNames[r] = lakeName;
				return true;
			}
		}
		return false;
	}

	@Override
	public void printAllLakes() {

		for (int r = 0; r < lakeNames.length; r++) {
			System.out.println(lakeNames[r]);
		}
	}

	  
}
