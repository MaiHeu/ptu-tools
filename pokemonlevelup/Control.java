package newpokemonlvlup;
//test
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Control implements ActionListener
{
	Gui frame;
	Model model;
	
	public Control()
	{
		frame = new Gui();
		initComboBoxTrainersCommand(frame);
		initialize();
		frame.setVisible(true);
	}
	
	public void initComboBoxTrainersCommand(Gui frame)
	{
		for(int i = 1; i < 7; i++)
		{
			frame.getComboBoxTrainersCommand().addItem(i);
		}
		
		frame.getComboBoxTrainersCommand().addItem(8);
	}

	public void displayTrainerBonusXp()
	{
		Trainer trainer = new Trainer((int) frame.getComboBoxTrainersCommand().getSelectedItem());
		frame.getLabelDisplayBonusXP().setText(String.valueOf(trainer.getBonusXp()));
	}
	
	public void displayPokemonStartLevel()
	{
		Pokemon pokemon = new Pokemon(Integer.parseInt(frame.getTextPkmXp().getText()));
		frame.getLabelDisplayPokemonLevel().setText(String.valueOf(pokemon.getCurrentLevel()));
	}
	
	public void calculateResult()
	{
		Pokemon pokemon = new Pokemon(Integer.parseInt(frame.getTextPkmXp().getText()));
		Trainer trainer = new Trainer((int) frame.getComboBoxTrainersCommand().getSelectedItem());
		
		pokemon.levelPokemon(Integer.parseInt(frame.getTextDaysTraining().getText().toString()), trainer.getBonusXp());
		frame.getLabelDisplayFinalLevel().setText(String.valueOf(pokemon.getCurrentLevel()));
		frame.getLabelDisplayFinalXp().setText(String.valueOf(pokemon.getCurrentXp()));
	}
	public void initialize()
	{
		frame.getBtnRun().addActionListener(e-> calculateResult());
		frame.getComboBoxTrainersCommand().addActionListener(e -> displayTrainerBonusXp());
		frame.getTextPkmXp().addActionListener(e -> displayPokemonStartLevel());
	}
	@Override
	public void actionPerformed(ActionEvent e)
	{
		// TODO Auto-generated method stub
	}

}
