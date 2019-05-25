package newpokemonlvlup;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JComboBox;
import javax.swing.JSeparator;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Toolkit;

public class Gui extends JFrame
{

	private JPanel contentPane;
	private JLabel lblTrainersCommand;
	private JComboBox comboBoxTrainersCommand;
	private JSeparator separator;
	private JLabel lblPkmLvl;
	private JLabel lblPkmXp;
	private JTextField textPkmXp;
	private JLabel lblDaysTraining;
	private JTextField textDaysTraining;
	private JSeparator separator2;
	private JLabel lblPkmFinalLevel;
	private JLabel lblPkmFinalXp;
	private JLabel labelDisplayFinalLevel;
	private JLabel labelDisplayFinalXp;
	private JLabel lblCreatedBySchattennarr;
	private JLabel lblBonusXp;
	private JLabel labelDisplayBonusXP;
	private JButton btnRun;
	private JLabel labelDisplayPokemonLevel;

	/**
	 * Create the frame.
	 */
	public Gui()
	{
		setIconImage(Toolkit.getDefaultToolkit().getImage(Gui.class.getResource("/pokemonlevelup/icon.png")));
		setTitle("Pokemon Level Up");
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 320, 320);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		contentPane.add(getLblTrainersCommand());
		contentPane.add(getComboBoxTrainersCommand());
		contentPane.add(getSeparator());
		contentPane.add(getLblPkmLvl());
		contentPane.add(getLblPkmXp());
		contentPane.add(getTextPkmXp());
		contentPane.add(getLblDaysTraining());
		contentPane.add(getTextDaysTraining());
		contentPane.add(getSeparator2());
		contentPane.add(getLblPkmFinalLevel());
		contentPane.add(getLblPkmFinalXp());
		contentPane.add(getLabelDisplayFinalLevel());
		contentPane.add(getLabelDisplayFinalXp());
		contentPane.add(getLblCreatedBySchattennarr());
		contentPane.add(getLblBonusXp());
		contentPane.add(getLabelDisplayBonusXP());
		contentPane.add(getBtnRun());
		contentPane.add(getLabelDisplayPokemonLevel());
	}

	JLabel getLblTrainersCommand()
	{
		if (lblTrainersCommand == null)
		{
			lblTrainersCommand = new JLabel("Trainers Command:");
			lblTrainersCommand.setBounds(12, 13, 115, 16);
		}
		return lblTrainersCommand;
	}

	JComboBox getComboBoxTrainersCommand()
	{
		if (comboBoxTrainersCommand == null)
		{
			comboBoxTrainersCommand = new JComboBox();

			comboBoxTrainersCommand.setBounds(149, 13, 53, 22);
		}
		return comboBoxTrainersCommand;
	}

	JSeparator getSeparator()
	{
		if (separator == null)
		{
			separator = new JSeparator();
			separator.setBounds(22, 65, 280, 2);
		}
		return separator;
	}

	JLabel getLblPkmLvl()
	{
		if (lblPkmLvl == null)
		{
			lblPkmLvl = new JLabel("Pokemon Level:");
			lblPkmLvl.setBounds(12, 80, 115, 16);
		}
		return lblPkmLvl;
	}

	JLabel getLblPkmXp()
	{
		if (lblPkmXp == null)
		{
			lblPkmXp = new JLabel("Pokemon XP:");
			lblPkmXp.setBounds(12, 109, 115, 16);
		}
		return lblPkmXp;
	}

	JTextField getTextPkmXp()
	{
		if (textPkmXp == null)
		{
			textPkmXp = new JTextField();
			textPkmXp.setBounds(149, 106, 53, 22);
			textPkmXp.setColumns(10);
		}
		return textPkmXp;
	}

	JLabel getLblDaysTraining()
	{
		if (lblDaysTraining == null)
		{
			lblDaysTraining = new JLabel("Days of Training:");
			lblDaysTraining.setBounds(12, 138, 115, 16);
		}
		return lblDaysTraining;
	}

	JTextField getTextDaysTraining()
	{
		if (textDaysTraining == null)
		{
			textDaysTraining = new JTextField();
			textDaysTraining.setBounds(149, 135, 53, 22);
			textDaysTraining.setColumns(10);
		}
		return textDaysTraining;
	}

	JSeparator getSeparator2()
	{
		if (separator2 == null)
		{
			separator2 = new JSeparator();
			separator2.setBounds(12, 173, 290, 2);
		}
		return separator2;
	}

	JLabel getLblPkmFinalLevel()
	{
		if (lblPkmFinalLevel == null)
		{
			lblPkmFinalLevel = new JLabel("Pokemon Final Level:");
			lblPkmFinalLevel.setBounds(12, 188, 143, 16);
		}
		return lblPkmFinalLevel;
	}

	JLabel getLblPkmFinalXp()
	{
		if (lblPkmFinalXp == null)
		{
			lblPkmFinalXp = new JLabel("Pokemon Final XP:");
			lblPkmFinalXp.setBounds(12, 209, 129, 16);
		}
		return lblPkmFinalXp;
	}

	JLabel getLabelDisplayFinalLevel()
	{
		if (labelDisplayFinalLevel == null)
		{
			labelDisplayFinalLevel = new JLabel("");
			labelDisplayFinalLevel.setBounds(149, 188, 56, 16);
		}
		return labelDisplayFinalLevel;
	}

	JLabel getLabelDisplayFinalXp()
	{
		if (labelDisplayFinalXp == null)
		{
			labelDisplayFinalXp = new JLabel("");
			labelDisplayFinalXp.setBounds(149, 209, 56, 16);
		}
		return labelDisplayFinalXp;
	}

	JLabel getLblCreatedBySchattennarr()
	{
		if (lblCreatedBySchattennarr == null)
		{
			lblCreatedBySchattennarr = new JLabel("Created by Schattennarr");
			lblCreatedBySchattennarr.setBounds(159, 256, 143, 16);
		}
		return lblCreatedBySchattennarr;
	}

	JLabel getLblBonusXp()
	{
		if (lblBonusXp == null)
		{
			lblBonusXp = new JLabel("Bonus XP:");
			lblBonusXp.setBounds(12, 36, 66, 16);
		}
		return lblBonusXp;
	}

	JLabel getLabelDisplayBonusXP()
	{
		if (labelDisplayBonusXP == null)
		{
			labelDisplayBonusXP = new JLabel("");
			labelDisplayBonusXP.setBounds(146, 36, 56, 16);
		}
		return labelDisplayBonusXP;
	}

	JButton getBtnRun()
	{
		if (btnRun == null)
		{
			btnRun = new JButton("Run!");
			btnRun.setBounds(214, 138, 88, 16);
		}
		return btnRun;
	}

	JLabel getLabelDisplayPokemonLevel()
	{
		if (labelDisplayPokemonLevel == null)
		{
			labelDisplayPokemonLevel = new JLabel("");
			labelDisplayPokemonLevel.setBounds(149, 80, 56, 16);
		}
		return labelDisplayPokemonLevel;
	}
}
