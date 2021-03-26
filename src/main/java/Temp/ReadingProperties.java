package Temp;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ReadingProperties {

	public static void main(String[] args) throws FileNotFoundException {
	
		
		String path = System.getProperty("user.dir")+"//src//test//resources//Project.properties";
		
		Properties prop = new Properties();
		
		FileInputStream fs =new FileInputStream(path);
		
		try {
			prop.load(fs);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println(prop.getProperty("url"));
		System.out.println(prop.getProperty("login_submit"));

	}

}
