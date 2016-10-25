package testing;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import javax.swing.JFrame;

public class ControllerInput extends JFrame {

	public static void main(String[] args)
	{
		
		ControllerInput ci = new ControllerInput();
		ci.setSize(200,200);
		ci.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e)
			{
				System.out.println(e.getExtendedKeyCode());
				System.out.println(e.getKeyCode());
				System.out.println(e.getKeyLocation());
				System.out.println("==============");
				
			}
		});
		ci.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		ci.setVisible(true);
		
		
	}
	
}
