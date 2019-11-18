package pokemonlevelup;

public class Pokemon
{
	//Eigenschaften
	private int currentXp;
	private int currentLevel;
	private int toNextLevel;

	//Konstruktoren
	public Pokemon(int currentXp)
	{
		this.currentXp = currentXp;
		this.setCurrentLevel(currentXp);
		this.setToNextLevel(this.getCurrentLevel());
	}

	//Getter Setter
	public int getToNextLevel()
	{
		return toNextLevel;
	}

	
	public void setToNextLevel(int level)
	{
		//level--;
		Model model = new Model();
		this.toNextLevel = Integer.parseInt(model.getLeveldaten().get(level).toString());
	}

	public int getCurrentXp()
	{
		return currentXp;
	}

	public void setCurrentXp(int currentXp)
	{
		this.currentXp = currentXp;
	}

	public void setCurrentLevel(int currentXp)
	{
		int level = 0;
		int i = 0;
		Model model = new Model();

		i = Integer.parseInt(model.getLeveldaten().get((int) level).toString());

		while (i <= currentXp)
		{
			level++;
			i = Integer.parseInt(model.getLeveldaten().get((level)).toString());
		}

		this.currentLevel = level;
	}

	public int getCurrentLevel()
	{
		return currentLevel;
	}

	//Methoden
	public void  levelPokemon(int days, int bonusXp)
	{
		int i = 0;
		this.setCurrentLevel(currentXp);
		this.setToNextLevel(currentLevel);
		
		while (i < days)
		{
			i++;
			if(currentLevel == 1 && bonusXp == 0)
			{
				currentXp++;
				System.out.println("Current XP: "+currentXp);
			}
			else if(currentLevel == 1 && bonusXp > 0)
			{
				currentXp = currentXp + currentLevel + bonusXp;
				System.out.println("Current XP: "+currentXp);
			}
			else
			{
				currentXp = currentXp + (currentLevel/2)+bonusXp;
				System.out.println("Current XP: "+currentXp);
			}
			
			if(currentXp >= toNextLevel)
			{
				this.setCurrentLevel(currentXp);
				this.setToNextLevel(currentLevel);
			}
		}		
	}
}
