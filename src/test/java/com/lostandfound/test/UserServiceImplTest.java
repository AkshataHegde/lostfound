package com.lostandfound.test;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;

import com.lostandfound.Repository.UserRepository;
import com.lostandfound.bean.UserModel;
import com.lostandfound.services.UserServiceImpl;

public class UserServiceImplTest {
	
	private static final String REGISTRATION_SUCCESS_MESSAGE="User registered successfully";
	
	
	@Mock
	UserModel userModel;
	
	@Mock
	UserRepository userRepository;
	
	@InjectMocks
	UserServiceImpl userServiceImpl=new UserServiceImpl();

	@Before
	public void setUp() throws Exception {
		userModel=new UserModel();
		userModel.setName("Amulya");
		userModel.setEmailId("amulya@gmail.com");
		userModel.setPassword("amulya");
		userModel.setPhoneNumber("1234567890");
		userModel.setAddress("Mysore");
		
		
	}

	@Test
	public void testRegisterUser() throws Exception {
		
		try {
			
			setUp();

			assertEquals(REGISTRATION_SUCCESS_MESSAGE,userServiceImpl.registerUser(userModel));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	@Test
	public void testIsAdmin() {
		
	}

}
