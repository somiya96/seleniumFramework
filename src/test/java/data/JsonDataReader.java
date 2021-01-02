package data;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import org.json.JSONArray;
import org.json.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class JsonDataReader
{
	
	

public 	String firstname ,lastname, email,password;
	
	
	public void JsonReader() throws FileNotFoundException, IOException, ParseException
	{
		
		String filepath = "C:\\Users\\SOMIYA\\Desktop\\tof\\src\\test\\java\\data\\UserData.json";
		
		File srcFile = new File(filepath);
		
		JSONParser parser = new JSONParser();
		JSONArray jarray =  (JSONArray)   parser.parse(new FileReader(srcFile));
		
		for (Object jsonobj : jarray )
		{
			JSONObject person = (JSONObject ) jsonobj;
			firstname = (String) person.get(firstname);
			
			lastname = (String) person.get(lastname);
			
			email = (String) person.get(email);
			
			password = (String) person.get(password);
			
			
			
			
		}
		
		
		
	}
	

}
