package graphic.view;

import javax.swing.JPanel;
import graphic.controller.FirstGUIController;
import javax.swing.JButton;
import java.awt.Color;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class FirstPanel extends JPanel {
	private FirstGUIController baseController;
	private JButton colorButton;
	private JButton randomButton;

	public FirstPanel(FirstGUIController baseController) {
		super();
		this.baseController = baseController;

		colorButton = new JButton("Color!");
		randomButton = new JButton("Random!");

		setupPanel();
		setupLayout();
		setupListeners();
	}

	// Put GUI Componenets in
	private void setupPanel() {
		this.setBackground(Color.YELLOW);
		this.add(colorButton);
		this.add(randomButton);
	}

	// Where to put them - centered horizontally by default
	private void setupLayout() {
		// button.setLocation(getMousePosition());
		// button.isVisible();
	}

	// Tells them how to act - anonymous instance of a listener - which has a
	// method called actionPerformed
	private void setupListeners() {
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
