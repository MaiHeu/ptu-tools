package pokemonlevelup;

import javax.swing.JOptionPane;

public class Trainer
{
	private int skillCommand;
	private int bonusXp;

	public Trainer(int skillCommand, boolean isCheckboxChecked)
	{
		this.skillCommand = skillCommand;
		this.setBonusXp(isCheckboxChecked);
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

	private void setBonusXp(boolean isCheckboxChecked)
	{
		if (this.skillCommand <= 2)
		{
			this.bonusXp = 0;
		} else if (this.skillCommand <= 4)
		{
			this.bonusXp = 5;
		} else if (this.skillCommand <= 6)
		{
			this.bonusXp = 10;
		} else
		{
			this.bonusXp = 15;
		}

		if (isCheckboxChecked == true)
		{
			if (this.skillCommand > 4)
			{
				bonusXp = bonusXp + 5;
			} else
			{
				System.out.println("Skill Command lower 5");
				JOptionPane.showMessageDialog(null,
						"Your Skill Command is lower than five, you can't have this edge. Please recheck your input",
						"Error", JOptionPane.ERROR_MESSAGE);

			}
		}
	}

}
