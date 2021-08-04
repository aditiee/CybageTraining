package com.cybage.service;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.runners.MockitoJUnitRunner;

import com.cybage.db.DatabaseConnection;
import com.cybage.network.NetworkConnection;

@RunWith(MockitoJUnitRunner.class)
public class SaveServcieTest {

	@Mock
	NetworkConnection nw;
	
	@Mock
	DatabaseConnection db;
	
	@InjectMocks
	SaveService s;

	

	@Test
	public void test() {
		s.saveService();
		Mockito.when(db.saveOnDb()).thenReturn(true);
			
	}

}
