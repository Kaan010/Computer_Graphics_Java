package ceng497_lab5;

import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;


//Kaan KALAN
//201611032
//CENG497 Lab5
//Section 2


public class Gradient extends Frame{ 
	
	 //Constructor 
	 public Gradient() 
	 { 
		 addWindowListener(new MyFinishWindow());
	 } 
	 
	 public class MyFinishWindow extends WindowAdapter
	 {
	     public void windowClosing(WindowEvent e)
	     {
	    	 System.exit(0);
	     }
	 }
	 
	 public void paint(Graphics g) 
	 { 
		 String asd="naber";


		 int x = 25; //initial point of first rectangle
		 int y = 50;
		 int width = 400;
		 int height = 400;
		 
	 	 Graphics2D g2d = (Graphics2D) g;
		
	 	 GradientPaint gradPaint=new GradientPaint(125,150,Color.CYAN,325,350,Color.red,false);
	 	 g2d.setPaint(gradPaint);
		 g2d.fillRect(x, y, width, height);
		
		 
		 GradientPaint gradPaint2=new GradientPaint(675,50,Color.darkGray,675,85,Color.WHITE,true);
		 g2d.setPaint(gradPaint2);
		 x += width+50;		
		 g2d.fillRect(x, y, width, height);
			
	
		 // A square to be filled by color interpolation without repetition. 
		 // Choose two colors you like for the gradient paint. 
		 // The first gradient should be parallel to the diagonal of the 
		 // square to be filled. The color gradient is not repeated so that the 
		 // the upper left part of the square is one color and the lower right part is 
		 // the other. 
		 // A second square to be filled by repeated color interpolation. 
		 // The color gradient is defined in the same way as for the first square. 
		 // Choose two different colors that you like. 
		 // However, this time the color gradient is applied repeatedly. 
		
	 } 
	 public static void main(String[] args) 
	 { 
		 Gradient f=new Gradient();
		 f.setTitle("Color Gradient Lab5");
		 f.setSize(900, 500);
		 f.setVisible(true);
	 }

}
