


			// Author Tinsae Belay
			
			
			
			import java.awt.*;
			import javax.swing.*;
			import java.awt.event.*;
			
			
			public class MyRainbow{
				
				
				
				JFrame window;
				JPanel panel;
				JButton button;
				
				Graphics2D graphics;
				
				int x1 = 100;
				int y1 = 100;
				
				int x2 = 100;
				int y2 = 0;
				
				boolean decX = true;
				boolean decY = false;
				boolean finished = false;
				
				
				
				public MyRainbow(){
					
					button = new JButton("Draw");
						
						button.addActionListener( new ActionListener(){
							
							
						
						} );
					
					
					
					panel = new JPanel();
							
							panel.setBackground( Color.WHITE  );
							panel.add(button);
					
					window = new JFrame("Rainbow Example");
					
					
						
						window.add(panel);
						window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
						window.setSize(500,400);
						window.setVisible(true);
					
					
					
				}
				
				
				
				public static void main(String[] s){
					
				MyRainbow m = new MyRainbow();	
					
				}
			}