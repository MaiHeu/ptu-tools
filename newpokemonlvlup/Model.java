package newpokemonlvlup;

import java.io.FileNotFoundException;
import java.io.InputStreamReader;
import java.io.IOException;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class Model
{
	private JSONArray leveldaten;
	
	public Model()
	{
		initLeveldaten();
		
		
	}
	
	
	public void initLeveldaten()
	{
		try
		{
			JSONParser parser = new JSONParser();
			//TODO: Pfad in relativen Pfad
			Object file = parser.parse(new InputStreamReader(getClass().getResourceAsStream("levelup.json")));
			JSONObject temp = (JSONObject) file;
			setLeveldaten((JSONArray) temp.get("XP"));
		} catch (FileNotFoundException e)
		{
			System.out.println("Die Leveldaten konnten nicht gefunden werden werden");
		} catch (IOException e)
		{
			e.printStackTrace();
		} catch (ParseException e)
		{
			e.printStackTrace();
		}
	}


	public JSONArray getLeveldaten()
	{
		return leveldaten;
	}


	public void setLeveldaten(JSONArray leveldaten)
	{
		this.leveldaten = leveldaten;
	}
}
