package readPropertyData;

import java.io.FileInputStream;
//import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ReadPropertydata {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		FileInputStream fis = new FileInputStream("./data/config.properties");
		
		//read the data from property file
		Properties prop = new Properties();
		
		//make the property file for read
		prop.load(fis);
		
		String name = prop.getProperty("username");
		System.out.println(name);

	}

}
