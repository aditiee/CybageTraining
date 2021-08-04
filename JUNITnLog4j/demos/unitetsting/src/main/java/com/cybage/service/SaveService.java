package com.cybage.service;

import com.cybage.db.DatabaseConnection;
import com.cybage.network.NetworkConnection;

public class SaveService {

	NetworkConnection nw;
	
	DatabaseConnection db;
	
		
	public void saveService() {
		nw.saveOnNetwork();
		db.saveOnDb();
		System.out.println("Inside service");
	}
}
