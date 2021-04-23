package ceng497_lab3;

//Kaan KALAN
//201611032
//CENG497 Lab3
//Section 2


import java.awt.*;
import java.awt.event.*;

public class AWTDemo extends Frame implements ActionListener, MouseListener{
	
	private int x=200;
	private int y=200;
	
	
	public AWTDemo(int a) {
		addWindowListener(new MyFinishWindow()); //Allows the closing window(I think)
		if(a == 1 ) { 
			 setTitle("Lab 3A"); 
		} 
		else if (a == 2) { 
			setTitle("Lab 3B"); 
			 // mouse event handler 
			addMouseListener(this);
		}
		
		
	}
	public void mouseClicked(MouseEvent arg0) {
		int nx = arg0.getX();
		int ny = arg0.getY();
		System.out.println("Coordinates :["+nx+" , "+ny+"]");
		
		x=nx;
		y=ny;
		repaint();
	}
	
	public class MyFinishWindow extends WindowAdapter{
	     public void windowClosing(WindowEvent e){
	       System.exit(0);
	     }
	}
	
	public void paint(Graphics g){
		Graphics2D g2d = (Graphics2D) g;		
		drawCircle(g2d, x-50,y-50,50);  
		drawCircle(g2d, x+75,y+75,100);
	}	
	
	private void drawCircle(Graphics2D g2d, int x, int y, int r) {
		g2d.drawOval(x - r, y - r, 2*r, 2*r);
	}
	
	public static void main(String[] argv)
	{
		AWTDemo f = new AWTDemo(1);
		f.setSize(500,500);
		f.setVisible(true);
		
		AWTDemo f2 = new AWTDemo(2);
		f2.setSize(500,500);
		f2.setVisible(true);
		
	}
	
	

	public void mouseEntered(MouseEvent arg0) {
		// TODO Auto-generated method stub
	}
	public void mouseExited(MouseEvent arg0) {
		// TODO Auto-generated method stub
	}
	public void mousePressed(MouseEvent arg0) {
		// TODO Auto-generated method stub
	}
	public void mouseReleased(MouseEvent arg0) {
		// TODO Auto-generated method stub
	}
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
	}
}
