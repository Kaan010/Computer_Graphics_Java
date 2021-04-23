package ceng497_lab4;

//Kaan KALAN
//201611032
//CENG497 Lab4
//Section 2


import java.awt.*;
import java.awt.event.*;

public class Mickey extends Frame implements ActionListener,MouseListener{
	 static final int windowWidth = 800;
	 static final int windowHeight = 800;
	 int r0=10; 	//radius
	 int x = 400;	//initial values
	 int y = 400;
	 public static void main(String[] args) {
	     Mickey mic =new Mickey();
		 mic.setSize(windowWidth,windowHeight);
		 mic.setVisible(true);
		 mic.setBackground(Color.red);
	 }
	 public Mickey() {
		
		setTitle("Mickey");
		MenuBar menu_bar = new MenuBar();
		
		Menu def = new Menu("File");
		def.add(new MenuItem("Set Default"));
		def.addActionListener(this);
		menu_bar.add(def);
		setMenuBar(menu_bar);
		
		//https://www.javatpoint.com/java-awt-panel
		Panel panel=new Panel();  
		panel.setBounds(0,40,windowWidth ,40);  
		
		//https://beginnersbook.com/2015/06/java-awt-tutorial/
		Button button_s = new Button();
		button_s.setLabel("Smaller");
		button_s.addActionListener(this);
		Button button_b = new Button();
		button_b.addActionListener(this);
		button_b.setLabel("Bigger");
		
		panel.add(button_s);
		panel.add(button_b);
		
		panel.setBackground(Color.black); 
		add(panel);
		setLayout(null);
		addWindowListener(new MyFinishWindow());
		addMouseListener(this);

	 }
	 
	 public void paint(Graphics g) {
		 Graphics2D g2d = (Graphics2D) g;
		 drawCircle(g2d,(x-10*r0),(y-10*r0),5*r0);
		 drawCircle(g2d,x,y,10*r0);
		 drawCircle(g2d,(x+10*r0),(y-10*r0),5*r0);
	 }
	 
	 private void drawCircle(Graphics2D g2d, int x, int y, int r) {	
			g2d.fillOval(x - r, y - r, 2*r, 2*r);
	 }
	 
	 public class MyFinishWindow extends WindowAdapter{
	     public void windowClosing(WindowEvent e)
	     {
	       System.exit(0);
	     }
	   }

	 public void actionPerformed(ActionEvent e) {
			String str = e.getActionCommand();
			if(str.equals("Set Default")) {
				r0=10;
				x=400;
				y=400;
				repaint();
			}
			else if(str.equals("Smaller")) {
				System.out.println("Button 1 clicked.");	
				r0-=2;
				repaint();
			}
			else if(str.equals("Bigger")) {
				System.out.println("Button 2 clicked.");	
				r0+=2;
				repaint();
			}
	 } 
	 
	 public void mouseClicked(MouseEvent e) {
		 	
	        int xe=e.getX();
	        int ye=e.getY();
	        /*System.out.println(xe);
			System.out.println(ye);*/
			x=xe;
			y=ye;
			repaint();

	    }
	 
	 
	 
	 public void mousePressed(MouseEvent e) {
			// TODO Auto-generated method stub
		}

		public void mouseReleased(MouseEvent e) {
			// TODO Auto-generated method stub	
		}

		public void mouseEntered(MouseEvent e) {
			// TODO Auto-generated method stub
		}

		public void mouseExited(MouseEvent e) {
			// TODO Auto-generated method stub	
		}
}
