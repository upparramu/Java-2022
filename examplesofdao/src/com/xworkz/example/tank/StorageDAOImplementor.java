package com.xworkz.example.tank;

public abstract class StorageDAOImplementor implements FuelStorageDAO {

	private String[] storages=new String[5];

	public boolean storageMaterial(String storage) {
		for (int tank = 0; tank < storages.length; tank++) {
			if(storages[tank]==null) {
				storages[tank]= storage;
				return true;
			}
		}
		return false;
	}



}
