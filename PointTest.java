


			import java.awt.*;
			import javax.swing.*;
			import java.awt.event.*;
			import java.util.Random;
			
			
			public class PointTest{
			
					JFrame frame;
					JPanel panel;
					
					Random random;
					
					Graphics d;
					
					public PointTest(){
						
						random = new Random();
						panel = new JPanel();
						frame = new JFrame("Random points");
						
						frame.add( panel );
						
						frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
						frame.setSize( 500,500 );
						frame.setVisible(true);
						
						JButton t = new JButton("Start");
								panel.add(t);
						
						t.addActionListener( new ActionListener(){
							
							
							@Override
							public void actionPerformed(ActionEvent event){
							
								
									d = panel.getGraphics();
									
									d.setColor( new Color( random.nextInt(255),  random.nextInt(255),  random.nextInt(255) ) );
									d.fillOval( random.nextInt(500),random.nextInt(500),30,30 );
									frame.repaint();
									frame.validate();
								
							
								}
							
							
							
							
							
						} );
						
					}
					
					public static void main(String[] f){
						
						new PointTest();
						
					}
			
			}