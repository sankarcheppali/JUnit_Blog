package net.icircuit.junitblog;

public class UserProfileLoader {

	private Http http;
	public UserProfile getUser(String userName){
		//assume this returns username if user is present on the server,else null
		 userName=http.get("http://icircuit.net/users"+userName);
		 return new UserProfile(userName);
	}
	public Http getHttp() {
		return http;
	}
	public void setHttp(Http http) {
		this.http = http;
	}
}
