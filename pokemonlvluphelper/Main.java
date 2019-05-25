package newpokemonlvlup;

import java.nio.file.*;
import java.nio.*;

public class Main
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		Control cont = new Control();
		
		Pokemon pkm = new Pokemon(0);
		pkm.levelPokemon(20, 5);
		
		FileSystem fs = FileSystems.getDefault();
		
	}

}
