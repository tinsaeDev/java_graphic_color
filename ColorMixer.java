

			import java.awt.*;
			import javax.swing.*;
			import java.awt.event.*;

			public class ColorMixer{
				
				
				int red;
				int blue;
				int green;
				
				public ColorMixer(){
					
					
					JFrame frame = new JFrame("Color Mixer");
					
					JPanel panel = new JPanel();
					
							panel.setBackground( new Color(red,green,blue) );
					
					
					JTextField redField = new JTextField(5);
					JTextField greenField = new JTextField(5);
					JTextField blueField = new JTextField(5);
					
					JButton viewButton = new JButton("View");
							viewButton.addActionListener( new ActionListener(){
								
								
								@Override
								
							public void actionPerformed(ActionEvent event){
								
								
								String rs =   redField.getText();
								String gs =	  greenField.getText();
								String bs =   blueField.getText();
								
								int r = Integer.parseInt( rs );
								int g  = Integer.parseInt( gs );
								int b = Integer.parseInt( bs );

								panel.setBackground( new Color(r,g,b) );
								
							}
								
								
							} );
					
					
					panel.setLayout( new GridLayout(6,1) );
					
					panel.add(redField);
					panel.add(greenField);
					panel.add(blueField);
					panel.add(viewButton);
					
					
					frame.add(panel);
					
					
					
					
					frame.setSize(500,500);
					frame.setVisible(true);
					frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
					
				}
				
				public static void main(String[] dd){
					
					
					new ColorMixer();
					
				}
				
			}