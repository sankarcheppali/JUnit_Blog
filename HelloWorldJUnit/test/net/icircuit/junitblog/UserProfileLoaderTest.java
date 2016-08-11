package net.icircuit.junitblog;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import static org.hamcrest.CoreMatchers.*; 
import static org.mockito.Mockito.*;

public class UserProfileLoaderTest {
	@Mock private Http http;
	@InjectMocks private UserProfileLoader userProfileLoader;
	
	@Before
	public void createLoader(){
		userProfileLoader=new UserProfileLoader();
		MockitoAnnotations.initMocks(this);
	}
	@Test
	public void getUserLoadsUserProfile() {
		when(http.get(contains("jUnit"))).thenReturn("jUnit");
		
		UserProfile userProfile=userProfileLoader.getUser("jUnit");
		
		assertThat(userProfile.getUserName(),equalTo("jUnit"));
	}

}
