package Utilities;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ConfigLoader {

	private Properties prop;

	{
		prop = new Properties();

		try {
			FileInputStream fis = new FileInputStream("config.properties");
			prop.load(fis);

		} catch (IOException e) {

			e.printStackTrace();
		}
	}

	public String getMyValue(String key) {

		
		String value = prop.getProperty(key);

		return value;

	}
	
}
