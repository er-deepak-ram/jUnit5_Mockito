package com.deepak.jUnit5_Mockito;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
class ServiceTest {
	
	@Mock
	Database database;

	@Test
	void testQuery() {
		assertNotNull(database);
		when(database.isAvailable()).thenReturn(true);
		
		Service service = new Service(database);
//		System.out.println(service);
		boolean check = service.query("* from t");
		assertTrue(check);
	}

}
