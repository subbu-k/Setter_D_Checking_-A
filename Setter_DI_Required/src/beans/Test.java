package beans;

import java.sql.Connection;
import java.sql.DriverManager;

import org.springframework.beans.factory.annotation.Required;

public class Test {
	private String driver;
	private String url;
	private String user;
	private String password;
	private String name;
	 
	public void setName(String name) {
		this.name = name;
	}
	@Required
	public void setDriver(String driver) {
		this.driver = driver;
	}
	@Required
	public void setUrl(String url) {
		this.url = url;
	}
	public void setUser(String user) {
		this.user = user;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public void PrintCon()throws Exception{
		
		Class.forName(driver);
		Connection con=DriverManager.getConnection(url,user,password);
		System.out.println(con);
		System.out.println(name);
	}
	
	
	
	
}
