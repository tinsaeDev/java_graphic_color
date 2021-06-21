


		    import java.awt.*;
			import javax.swing.*;
			import java.awt.event.*;
			
			
			public class DiamondTest{
				
				
				public DiamondTest(){
					
					JFrame frame = new JFrame("Testing Diamond");
					JPanel panel = new JPanel();
					
					Diamond d1 = new Diamond();
					Diamond d2 = new Diamond();
					Diamond d3 = new Diamond();
					Diamond d4 = new Diamond();
					
					panel.add(d1);
					panel.add(d2);
					panel.add(d3);
					panel.add(d4);
					
					frame.add( d2 );
					
					JOptionPane.showMessageDialog(frame,d1,"Here is your Diamond",JOptionPane.INFORMATION_MESSAGE);
					
					
					frame.setSize(500,300);
					frame.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
					frame.setVisible(true);
				}
				
				public static void main(String[] args){
					
					new DiamondTest();
					
				}
				
				
				
			}