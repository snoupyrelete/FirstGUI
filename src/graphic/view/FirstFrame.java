package graphic.view;

import javax.swing.JFrame;
import graphic.controller.FirstGUIController;
import java.awt.Dimension;


public class FirstFrame extends JFrame
{
	private FirstGUIController baseController;
	//private JFrame frame;
	
	public FirstFrame(FirstGUIController baseController)
	{
		super();
		this.baseController = baseController;
		
		setupFrame();
	}
	
	//Mr H's go-to GUI helper method
	private void setupFrame()
	{
		this.setSize(new Dimension(500, 500));
		this.setVisible(true);
		//this.setIconImage(chatbot.png);
	}
}
