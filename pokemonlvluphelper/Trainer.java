package newpokemonlvlup;

public class Trainer
{
	private int skillCommand;
	private int bonusXp;
	
	public Trainer(int skillCommand)
	{
		this.skillCommand = skillCommand;
		this.setBonusXp();
	}

	public int getSkillCommand()
	{
		return skillCommand;
	}

	public void setSkillCommand(int skillCommand)
	{
		this.skillCommand = skillCommand;
	}

	public int getBonusXp()
	{
		return bonusXp;
	}

	private void setBonusXp()
	{
		if(this.skillCommand <= 2)
		{
			this.bonusXp = 0;
		}
		else if (this.skillCommand <= 4)
		{
			this.bonusXp = 5;
		}
		else if(this.skillCommand <= 6)
		{
			this.bonusXp = 10;
		}
		else
		{
			this.bonusXp = 15;
		}
	}
	
	
	
	

}
