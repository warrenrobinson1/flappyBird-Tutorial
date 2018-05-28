package flappyBird;

import java.awt.Graphics;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.Timer;

public class flappyBird implements ActionListener
{
	
	public static flappyBird flappyBird;
	public static int WIDTH= 800, HEIGHT = 800;
	public Renderer renderer;
	public flappyBird ()
	{
		JFrame JFrame = new JFrame ();
		Timer timer = new Timer(20, this);
		
		renderer = new Renderer();
		
		JFrame.add(renderer);
		JFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		JFrame.setSize(WIDTH, HEIGHT);
		JFrame.setResizable(false);
		JFrame.setVisible(true);
	}
		
	public void repaint(Graphics g)
	{		
}
	public static void main (String[] args) 
	{	
	
	
	flappyBird = new flappyBird();
    }
	
}