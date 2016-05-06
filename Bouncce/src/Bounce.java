import java.awt.*;
import javax.swing.*;
public class Bounce extends Canvas
	{

		private static final long	serialVersionUID	= 1L;
		static boolean bounce=true;
		static boolean continueBouncing=true;
		public static void main(String[] args)
			{
				Bounce canvas=new Bounce();
				JFrame frame= new JFrame("Java Challenges One");
				frame.setSize(400,400);
				frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				frame.getContentPane().add(canvas).setBackground(Color.white);
				frame.setLocationRelativeTo(null);
				frame.setResizable(false);
				frame.setVisible(true);

			}

		public void paint(Graphics graphics)
		{
			while(continueBouncing)
				{
			if(bounce)
				{
			for(int i=0; i<=350; i++)
				{
			graphics.setColor(Color.black);
			graphics.fillRect(i, 150, 50, 50);
			delay();
			graphics.setColor(Color.white);
			graphics.fillRect(i,  150, 50, 50);
			if(i==350)
				{
					bounce=false;
				}
				}
				}
			else
				{
			for(int i=350; i>=0; i--)
				{
			graphics.setColor(Color.black);
			graphics.fillRect(i, 150, 50, 50);
			delay();
			graphics.setColor(Color.white);
			graphics.fillRect(i,  150, 50, 50);
			if(i==0)
				{
					bounce=true;
				}
				}
				}
				}
		}
		public void delay()
			{
	        try
					{
					Thread.sleep(10);
					} catch (InterruptedException e)
					{
					e.printStackTrace();
					}
			}
	}
