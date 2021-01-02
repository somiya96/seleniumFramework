package data;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;



public class LoadPropertiestest
{ 
	public static Properties userdata = 
			LoadProperties("C:\\Users\\SOMIYA\\Desktop\\tof\\userdata.properities");
	
	
	public static Properties LoadProperties(String path) throws IOException
	{
		Properties pro = new Properties();
	
		
		try {
			 FileInputStream stream = new FileInputStream(path);
			 pro.load(stream);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
		
		catch (NullPointerException e ) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return pro;
	}
	

}
