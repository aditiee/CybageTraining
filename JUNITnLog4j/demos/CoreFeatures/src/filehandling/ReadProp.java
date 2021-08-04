package filehandling;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class ReadProp {

	public static void main(String[] args) throws IOException {
		
		File file=new File(".\\driver.properties");
		FileReader reader=new FileReader(file);
		
		Properties prop=new Properties();
		prop.load(reader);
		System.out.println("Driver Name is: "+prop.getProperty("driver"));
		System.out.println("Port is: "+prop.getProperty("port"));
		
		
	}
}
