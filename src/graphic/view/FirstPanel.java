package graphic.view;

import javax.swing.JPanel;
import graphic.controller.FirstGUIController;
import javax.swing.JButton;
import javax.swing.SpringLayout;
import java.awt.Color;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class FirstPanel extends JPanel {
	private FirstGUIController baseController;
	private JButton colorButton;
	private JButton randomButton;
	private SpringLayout baseLayout;
	
	public FirstPanel(FirstGUIController baseController) {
		super();
		this.baseController = baseController;

		colorButton = new JButton("Color!");
		randomButton = new JButton("Random!");
		baseLayout = new SpringLayout();
		baseLayout.putConstraint(SpringLayout.EAST, colorButton, -10, SpringLayout.EAST, this);
		baseLayout.putConstraint(SpringLayout.EAST, randomButton, 0, SpringLayout.EAST, colorButton);
		baseLayout.putConstraint(SpringLayout.NORTH, colorButton, 30, SpringLayout.NORTH, this);
		baseLayout.putConstraint(SpringLayout.WEST, colorButton, 358, SpringLayout.WEST, this);
		baseLayout.putConstraint(SpringLayout.NORTH, randomButton, 89, SpringLayout.NORTH, this);
		
		setupPanel();
		setupLayout();
		setupListeners();
	}

	// Put GUI Componenets in
	private void setupPanel() 
	{
		this.setLayout(baseLayout);
		this.setBackground(Color.YELLOW);
		this.add(colorButton);
		this.add(randomButton);
	}

	// Where to put them - centered horizontally by default garbage dump helper constraint method
	private void setupLayout() 
	{
	}

	// Tells them how to act - anonymous instance of a listener - which has a
	// method called actionPerformed
	private void setupListeners() 
	{
		colorButton.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent click) 
			{
				System.out.println("You clicked colorButton!");
				setBackground(Color.RED);
			}
		});

		randomButton.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent click)
			{
				System.out.println("You clicked randomButton!");
			}
		});
	}

}
