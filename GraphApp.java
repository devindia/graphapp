


/*
 * 
 * GraphApp demonstrates basic graph drawing process using awt,swing libraries 
 * Instead of using drawLine() method I prefer to use drawOval() method to paint every 
 * single points . prefix integer arguments before variable x is put to adjust the clarity 
 * of the graph . 
 * 
 * designed by Debasish Roy .
 *  
 *  
 */






import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import javax.swing.JComboBox;
import javax.swing.JFrame;


public class GraphApp extends JFrame {
	
	int x,y;
	int ax,by;
	JComboBox cb,cb1;
	String s="deba";
	String se ="deba";
	 
	public GraphApp(){ 
		
		setTitle("Graph App");
		setSize(900,700);
		String[] graphs = {"select..","parabola","ax^2+bx+c","ax^3","y=mx","y=mx+c","sin(x)","cos(x)","tan(x)","sinc function","signum(x)","X-graph","cubic function","sin+cos unequal amp","sin^3","cos^3","sin^3+cos^3","Amplitude Modulation"};
		cb = new JComboBox(graphs);
		
		cb.setBounds(700, 100, 120, 25);
		add(cb);
		cb.setEditable(true);
		String[] select = {"Draw graph","Erase"};
		cb1 = new JComboBox(select);
		
		cb1.setBounds(700, 150, 120, 25);
		add(cb1);
		cb1.setEditable(true);
		
		setLayout(null); //add it its very important otherwise Combo Box will occupy the whole screen.
		
		setVisible(true);
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		x = 30; //x=200;
		y = 300;
		
		
		
	}
	
	
	public void paint(Graphics g){
		g.setColor(Color.BLACK);
		g.drawString("Design by ..", 700, 400);
		g.drawString("Debasish Roy", 700, 420);
		g.drawString("Y", 310, 40);
		g.drawString("Y'", 310, 600);
		g.drawString("X", 30, 314);
		g.drawString("X'", 600, 314);
		if(x==300&&y==300){
			g.drawString("Origin(0,0)", 310, 314);
		}
		g.drawString("Select Graphs", 710, 100);
		g.drawLine(300, 30, 300, 600);
		g.drawLine(30,300,600,300);
		if(x>599||y<40){
			//g.drawString((String) cb.getSelectedItem(), 200, 200);
			s= (String) cb.getSelectedItem();
			se = (String) cb1.getSelectedItem();
			x=30;
			y=300;
			
		}
		
		if(s.equals("parabola")&& se.equals("Draw graph")){
			g.setColor(Color.GREEN);
			run1();
		}
		else if(se.equals("Erase")&& s.equals("parabola")){
			g.setColor(new Color(223,237,238));
			run1E();
		}
		
		else if(s.equals("ax^2+bx+c")&& se.equals("Draw graph")){
			g.setColor(Color.RED);
			run2();
		}
		else if(se.equals("Erase")&& s.equals("ax^2+bx+c")){
			g.setColor(new Color(223,237,238));
			run2E();
		}
		else if(s.equals("ax^3")&& se.equals("Draw graph")){
			g.setColor(Color.RED);
			run3();
		}
		else if(se.equals("Erase")&& s.equals("ax^3")){
			g.setColor(new Color(223,237,238));
			run3E();
		}
		else if(s.equals("y=mx")&& se.equals("Draw graph")){
			g.setColor(Color.BLUE);
			run4();
		}
		else if(se.equals("Erase")&& s.equals("y=mx")){
			g.setColor(new Color(223,237,238));
			run4E();
		}
		else if(s.equals("y=mx+c")&& se.equals("Draw graph")){
			g.setColor(Color.DARK_GRAY);
			run5();
		}
		else if(se.equals("Erase")&& s.equals("y=mx+c")){
			g.setColor(new Color(223,237,238));
			run5E();
		}
		else if(s.equals("sin(x)")&& se.equals("Draw graph")){
			g.setColor(Color.GREEN);
			run6();
		}
		else if(se.equals("Erase")&& s.equals("sin(x)")){
			g.setColor(new Color(223,237,238));
			run6E();
		}
		else if(s.equals("cos(x)")&& se.equals("Draw graph")){
			g.setColor(Color.PINK);
			run7();
		}
		else if(se.equals("Erase")&& s.equals("cos(x)")){
			g.setColor(new Color(223,237,238));
			run7E();
		}
		else if(s.equals("tan(x)")&& se.equals("Draw graph")){
			g.setColor(Color.RED);
			run8();
		}
		else if(se.equals("Erase")&& s.equals("tan(x)")){
			g.setColor(new Color(223,237,238));
			run8E();
		}
		else if(s.equals("sinc function")&& se.equals("Draw graph")){
			g.setColor(Color.RED);
			run9();
		}
		else if(se.equals("Erase")&& s.equals("sinc function")){
			g.setColor(new Color(223,237,238));
			run9E();
		}
		else if(s.equals("signum(x)")&& se.equals("Draw graph")){
			g.setColor(Color.RED);
			run10();
		}
		else if(se.equals("Erase")&& s.equals("signum(x)")){
			g.setColor(new Color(223,237,238));
			run10E();
		}
		else if(s.equals("X-graph")&& se.equals("Draw graph")){
			g.setColor(Color.BLUE);
			run11();
		}
		else if(se.equals("Erase")&& s.equals("X-graph")){
			g.setColor(new Color(223,237,238));
			run11E();
		}
		else if(s.equals("cubic function")&& se.equals("Draw graph")){
			g.setColor(Color.RED);
			run12();
		}
		else if(se.equals("Erase")&& s.equals("cubic function")){
			g.setColor(new Color(223,237,238));
			run12E();
		}
		else if(s.equals("sin+cos unequal amp")&& se.equals("Draw graph")){
			g.setColor(Color.RED);
			run13();
		}
		else if(se.equals("Erase")&& s.equals("sin+cos unequal amp")){
			g.setColor(new Color(223,237,238));
			run13E();
		}
		else if(s.equals("sin^3")&& se.equals("Draw graph")){
			g.setColor(Color.GREEN);
			run14();
		}
		else if(se.equals("Erase")&& s.equals("sin^3")){
			g.setColor(new Color(223,237,238));
			run14E();
		}
		else if(s.equals("cos^3")&& se.equals("Draw graph")){
			g.setColor(Color.YELLOW);
			run15();
		}
		else if(se.equals("Erase")&& s.equals("cos^3")){
			g.setColor(new Color(223,237,238));
			run15E();
		}
		else if(s.equals("sin^3+cos^3")&& se.equals("Draw graph")){
			g.setColor(Color.BLUE);
			run16();
		}
		else if(se.equals("Erase")&& s.equals("sin^3+cos^3")){
			g.setColor(new Color(223,237,238));
			run16E();
		}
		else if(s.equals("Amplitude Modulation")&& se.equals("Draw graph")){
			g.setColor(Color.BLUE);
			run17();
		}
		else if(se.equals("Erase")&& s.equals("Amplitude Modulation")){
			g.setColor(new Color(223,237,238));
			run17E();
		}
		else{
			g.setColor(Color.white);
			run();
		}
		g.fillOval(x, y, 3, 3);
		
		
        
		
		repaint();
		
	}
	
	public void run(){
		try{
			Thread.sleep(1);
			
			
			if(x<600&&y>30&&y!=600){
				
				 ax = x-300;
				 by = y-300;
			      ax++;
				
			     // by = (int) (40*(1+1*Math.cos(.2*ax/3.14))*Math.cos(ax/3.14)+40*(40*Math.sin(.2*ax/3.14))/ax); // AM+sinc(x) function
				x=300+ax;
				y=300-by;
				
				
			}
			
			
			
		}catch(Exception e){
			System.out.println("ERROR");
		}
	}
	public void run1(){
		try{
			Thread.sleep(10);
			
			
			if(x<600&&y>30&&y!=600){
				
				 ax = x-300;
				 by = y-300;
			      ax++;
				
			      by=ax*ax/500; // parabola 
				x=300+ax;
				y=300-by;
				
				
			}
			
			
			
		}catch(Exception e){
			System.out.println("ERROR");
		}
	}
	public void run1E(){
		try{
			Thread.sleep(10);
			
			
			if(x<600&&y>30&&y!=600){
				
				 ax = x-300;
				 by = y-300;
			      ax++;
				
			      by=ax*ax/500; // parabola
				x=300+ax;
				y=300-by;
				
				
			}
			
			
			
		}catch(Exception e){
			System.out.println("ERROR");
		}
	}
	public void run2(){
		try{
			Thread.sleep(10);
			
			
			if(x<600&&y>30&&y!=600){
				
				 ax = x-300;
				 by = y-300;
			      ax++;
				
			      by = (int) (.095*(2*Math.pow(ax,2)/60+3*ax+1)); // ax^2+bx+c
				x=300+ax;
				y=300-by;
				
				
			}
			
			
			
		}catch(Exception e){
			System.out.println("ERROR");
		}
	}
	public void run2E(){
		try{
			Thread.sleep(10);
			
			
			if(x<600&&y>30&&y!=600){
				
				 ax = x-300;
				 by = y-300;
			      ax++;
				
			      by = (int) (.095*(2*Math.pow(ax,2)/60+3*ax+1)); // ax^2+bx+c
				x=300+ax;
				y=300-by;
				
				
			}
			
			
			
		}catch(Exception e){
			System.out.println("ERROR");
		}
	}
	public void run3(){
		try{
			Thread.sleep(10);
			
			
			if(x<600&&y>30&&y!=600){
				
				 ax = x-300;
				 by = y-300;
			      ax++;
				
			      by = ax*ax*ax/5000; // x^3
				x=300+ax;
				y=300-by;
				
				
			}
			
			
			
		}catch(Exception e){
			System.out.println("ERROR");
		}
	}
	public void run3E(){
		try{
			Thread.sleep(10);
			
			
			if(x<600&&y>30&&y!=600){
				
				 ax = x-300;
				 by = y-300;
			      ax++;
				
			      by = ax*ax*ax/5000; // x^3
				x=300+ax;
				y=300-by;
				
				
			}
			
			
			
		}catch(Exception e){
			System.out.println("ERROR");
		}
	}
	public void run4(){
		try{
			Thread.sleep(10);
			
			
			if(x<600&&y>30&&y!=600){
				
				 ax = x-300;
				 by = y-300;
			      ax++;
				
			      by = ax; //y=mx
				x=300+ax;
				y=300-by;
				
				
			}
			
			
			
		}catch(Exception e){
			System.out.println("ERROR");
		}
	}
	public void run4E(){
		try{
			Thread.sleep(10);
			
			
			if(x<600&&y>30&&y!=600){
				
				 ax = x-300;
				 by = y-300;
			      ax++;
				
			      by = ax; //y=mx
				x=300+ax;
				y=300-by;
				
				
			}
			
			
			
		}catch(Exception e){
			System.out.println("ERROR");
		}
	}
	public void run5(){
		try{
			Thread.sleep(10);
			
			
			if(x<600&&y>30&&y!=600){
				
				 ax = x-300;
				 by = y-300;
			      ax++;
				
			      by = ax+30; //y = mx+c
				x=300+ax;
				y=300-by;
				
				
			}
			
			
			
		}catch(Exception e){
			System.out.println("ERROR");
		}
	}
	public void run5E(){
		try{
			Thread.sleep(10);
			
			
			if(x<600&&y>30&&y!=600){
				
				 ax = x-300;
				 by = y-300;
			      ax++;
				
			      by = ax+30; //y = mx+c
				x=300+ax;
				y=300-by;
				
				
			}
			
			
			
		}catch(Exception e){
			System.out.println("ERROR");
		}
	}
	public void run6(){
		try{
			Thread.sleep(10);
			
			
			if(x<600&&y>30&&y!=600){
				
				 ax = x-300;
				 by = y-300;
			      ax++;
				
			      by = (int) (40*Math.sin(.2*ax/3.14)); // beautiful sine function 
				x=300+ax;
				y=300-by;
				
				
			}
			
			
			
		}catch(Exception e){
			System.out.println("ERROR");
		}
	}
	public void run6E(){
		try{
			Thread.sleep(10);
			
			
			if(x<600&&y>30&&y!=600){
				
				 ax = x-300;
				 by = y-300;
			      ax++;
				
			      by = (int) (40*Math.sin(.2*ax/3.14)); // beautiful sine function 
				x=300+ax;
				y=300-by;
				
				
			}
			
			
			
		}catch(Exception e){
			System.out.println("ERROR");
		}
	}
	public void run7(){
		try{
			Thread.sleep(10);
			
			
			if(x<600&&y>30&&y!=600){
				
				 ax = x-300;
				 by = y-300;
			      ax++;
				
			      by = (int) ((40*Math.cos(.5*ax/3.14))); //beautiful cosine function
				x=300+ax;
				y=300-by;
				
				
			}
			
			
			
		}catch(Exception e){
			System.out.println("ERROR");
		}
	}
	public void run7E(){
		try{
			Thread.sleep(10);
			
			
			if(x<600&&y>30&&y!=600){
				
				 ax = x-300;
				 by = y-300;
			      ax++;
				
			      by = (int) ((40*Math.cos(.5*ax/3.14))); //beautiful cosine function
				x=300+ax;
				y=300-by;
				
				
			}
			
			
			
		}catch(Exception e){
			System.out.println("ERROR");
		}
	}
	public void run8(){
		try{
			Thread.sleep(10);
			
			
			if(x<600&&y>30&&y!=600){
				
				 ax = x-300;
				 by = y-300;
			      ax++;
				
			      by = (int) (10*Math.tan(.2*ax/3.14)); //tan(x)
				x=300+ax;
				y=300-by;
				
				
			}
			
			
			
		}catch(Exception e){
			System.out.println("ERROR");
		}
	}
	public void run8E(){
		try{
			Thread.sleep(10);
			
			
			if(x<600&&y>30&&y!=600){
				
				 ax = x-300;
				 by = y-300;
			      ax++;
				
			      by = (int) (10*Math.tan(.2*ax/3.14)); //tan(x)
				x=300+ax;
				y=300-by;
				
				
			}
			
			
			
		}catch(Exception e){
			System.out.println("ERROR");
		}
	}
	public void run9(){
		try{
			Thread.sleep(10);
			
			
			if(x<600&&y>30&&y!=600){
				
				 ax = x-300;
				 by = y-300;
			      ax++;
				
			      by = (int) (40*(40*Math.sin(.2*ax/3.14)/ax)); // sinc(x) function
				x=300+ax;
				y=300-by;
				
				
			}
			
			
			
		}catch(Exception e){
			System.out.println("ERROR");
		}
	}
	public void run9E(){
		try{
			Thread.sleep(10);
			
			
			if(x<600&&y>30&&y!=600){
				
				 ax = x-300;
				 by = y-300;
			      ax++;
				
			      by = (int) (40*(40*Math.sin(.2*ax/3.14)/ax)); // sinc(x) function
				x=300+ax;
				y=300-by;
				
				
			}
			
			
			
		}catch(Exception e){
			System.out.println("ERROR");
		}
	}
	public void run10(){
		try{
			Thread.sleep(10);
			
			
			if(x<600&&y>30&&y!=600){
				
				 ax = x-300;
				 by = y-300;
			      ax++;
				
			      by = (int) (50*Math.signum(ax)); //signum function
				x=300+ax;
				y=300-by;
				
				
			}
			
			
			
		}catch(Exception e){
			System.out.println("ERROR");
		}
	}
	public void run10E(){
		try{
			Thread.sleep(10);
			
			
			if(x<600&&y>30&&y!=600){
				
				 ax = x-300;
				 by = y-300;
			      ax++;
				
			      by = (int) (50*Math.signum(ax)); //signum function
				x=300+ax;
				y=300-by;
				
				
			}
			
			
			
		}catch(Exception e){
			System.out.println("ERROR");
		}
	}
	public void run11(){
		try{
			Thread.sleep(10);
			
			
			if(x<600&&y>30&&y!=600){
				
				 ax = x-300;
				 by = y-300;
			      ax++;
				
			      by = (int) (500*Math.sin(3.14*ax)); // x- letter generate 
				x=300+ax;
				y=300-by;
				
				
			}
			
			
			
		}catch(Exception e){
			System.out.println("ERROR");
		}
	}
	public void run11E(){
		try{
			Thread.sleep(10);
			
			
			if(x<600&&y>30&&y!=600){
				
				 ax = x-300;
				 by = y-300;
			      ax++;
				
			      by = (int) (500*Math.sin(3.14*ax)); // x- letter generate 
				x=300+ax;
				y=300-by;
				
				
			}
			
			
			
		}catch(Exception e){
			System.out.println("ERROR");
		}
	}
	public void run12(){
		try{
			Thread.sleep(10);
			
			
			if(x<600&&y>30&&y!=600){
				
				 ax = x-300;
				 by = y-300;
			      ax++;
				
			      by = (int) (2*Math.pow(ax,2)*ax/400+3*ax+1); //cubic function
				x=300+ax;
				y=300-by;
				
				
			}
			
			
			
		}catch(Exception e){
			System.out.println("ERROR");
		}
	}
	public void run12E(){
		try{
			Thread.sleep(10);
			
			
			if(x<600&&y>30&&y!=600){
				
				 ax = x-300;
				 by = y-300;
			      ax++;
				
			      by = (int) (2*Math.pow(ax,2)*ax/400+3*ax+1); //cubic function
				x=300+ax;
				y=300-by;
				
				
			}
			
			
			
		}catch(Exception e){
			System.out.println("ERROR");
		}
	}
	public void run13(){
		try{
			Thread.sleep(10);
			
			
			if(x<600&&y>30&&y!=600){
				
				 ax = x-300;
				 by = y-300;
			      ax++;
				
			      by = (int) ((40*Math.cos(.5*ax/3.14))+(40*Math.sin(.2*ax/3.14))); // sine + cosine function beautiful when both are unequal amplitude;
				x=300+ax;
				y=300-by;
				
				
			}
			
			
			
		}catch(Exception e){
			System.out.println("ERROR");
		}
	}
	public void run13E(){
		try{
			Thread.sleep(10);
			
			
			if(x<600&&y>30&&y!=600){
				
				 ax = x-300;
				 by = y-300;
			      ax++;
				
			      by = (int) ((40*Math.cos(.5*ax/3.14))+(40*Math.sin(.2*ax/3.14))); // sine + cosine function beautiful when both are unequal amplitude;
				x=300+ax;
				y=300-by;
				
				
			}
			
			
			
		}catch(Exception e){
			System.out.println("ERROR");
		}
	}
	public void run14(){
		try{
			Thread.sleep(10);
			
			
			if(x<600&&y>30&&y!=600){
				
				 ax = x-300;
				 by = y-300;
			      ax++;
				
			      by = (int) (40*Math.pow((Math.sin(.2*ax/3.14)),3)); //sin cube beautiful 
				x=300+ax;
				y=300-by;
				
				
			}
			
			
			
		}catch(Exception e){
			System.out.println("ERROR");
		}
	}
	public void run14E(){
		try{
			Thread.sleep(10);
			
			
			if(x<600&&y>30&&y!=600){
				
				 ax = x-300;
				 by = y-300;
			      ax++;
				
			      by = (int) (40*Math.pow((Math.sin(.2*ax/3.14)),3)); //sin cube beautiful 
				x=300+ax;
				y=300-by;
				
				
			}
			
			
			
		}catch(Exception e){
			System.out.println("ERROR");
		}
	}
	public void run15(){
		try{
			Thread.sleep(10);
			
			
			if(x<600&&y>30&&y!=600){
				
				 ax = x-300;
				 by = y-300;
			      ax++;
				
			      by = (int) (40*Math.pow((Math.cos(.2*ax/3.14)),3)); //cos cube function
				x=300+ax;
				y=300-by;
				
				
			}
			
			
			
		}catch(Exception e){
			System.out.println("ERROR");
		}
	}
	public void run15E(){
		try{
			Thread.sleep(10);
			
			
			if(x<600&&y>30&&y!=600){
				
				 ax = x-300;
				 by = y-300;
			      ax++;
				
			      by = (int) (40*Math.pow((Math.cos(.2*ax/3.14)),3)); //cos cube function
				x=300+ax;
				y=300-by;
				
				
			}
			
			
			
		}catch(Exception e){
			System.out.println("ERROR");
		}
	}
	public void run16(){
		try{
			Thread.sleep(10);
			
			
			if(x<600&&y>30&&y!=600){
				
				 ax = x-300;
				 by = y-300;
			      ax++;
				
			      by = (int) ((40*Math.pow((Math.cos(.2*ax/3.14)),3))+(40*Math.pow((Math.sin(.2*ax/3.14)),3))); //sin^3+cos^3
				x=300+ax;
				y=300-by;
				
				
			}
			
			
			
		}catch(Exception e){
			System.out.println("ERROR");
		}
	}
	public void run16E(){
		try{
			Thread.sleep(10);
			
			
			if(x<600&&y>30&&y!=600){
				
				 ax = x-300;
				 by = y-300;
			      ax++;
				
			      by = (int) ((40*Math.pow((Math.cos(.2*ax/3.14)),3))+(40*Math.pow((Math.sin(.2*ax/3.14)),3))); //sin^3+cos^3
				x=300+ax;
				y=300-by;
				
				
			}
			
			
			
		}catch(Exception e){
			System.out.println("ERROR");
		}
	}
	public void run17(){
		try{
			Thread.sleep(10);
			
			
			if(x<600&&y>30&&y!=600){
				
				 ax = x-300;
				 by = y-300;
			      ax++;
				
			      by = (int) (40*(1+1*Math.cos(.2*ax/3.14))*Math.cos(ax/3.14)); // Amplitude Modulation
				x=300+ax;
				y=300-by;
				
				
			}
			
			
			
		}catch(Exception e){
			System.out.println("ERROR");
		}
	}
	public void run17E(){
		try{
			Thread.sleep(10);
			
			
			if(x<600&&y>30&&y!=600){
				
				 ax = x-300;
				 by = y-300;
			      ax++;
				
			      by = (int) (40*(1+1*Math.cos(.2*ax/3.14))*Math.cos(ax/3.14)); // Amplitude Modulation
				x=300+ax;
				y=300-by;
				
				
			}
			
			
			
		}catch(Exception e){
			System.out.println("ERROR");
		}
	}

	public static void main(String[] args){
		new GraphApp();
		
		Thread t1 = new Thread();
		t1.start();
	}
}

