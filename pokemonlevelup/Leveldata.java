package pokemonlevelup;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class Leveldata
{
	private JSONArray leveldaten;
	
	public Leveldata()
	{
		initLeveldata();
	}
	
	
	public void initLeveldata()
	{
		try
		{
			JSONParser parser = new JSONParser();
			Object file = parser.parse(new InputStreamReader(getClass().getResourceAsStream("levelup.json")));			JSONObject temp = (JSONObject) file;
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
