package Data;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.apache.commons.digester.plugins.strategies.LoaderSetProperties;

public class LoadData 
{
	
	//loading user data
	static String PropPath = System.getProperty("user.dir")+"\\src\\main\\java\\properties\\Data.properties" ;
	public static Properties userData  = loadproperties(PropPath);
	 
	//loading user data of saucelabs
		static String SaucePropPath = System.getProperty("user.dir")+"\\src\\main\\java\\properties\\saucelabsUser.properties" ;
		public static Properties SauceData  = loadproperties(SaucePropPath);
	
	
	private static Properties loadproperties(String path)  {
		
		
		
		Properties pro = new Properties() ;
		
		
		try {
			FileInputStream stream = new FileInputStream(path);
			pro.load(stream);

		} catch (FileNotFoundException e) {
			System.out.println("yogad error " + e.getMessage());		
		} catch (IOException e) {
			System.out.println("yogad error tany " + e.getMessage());	
		}
		return pro;
	}
	
	
	 


}
