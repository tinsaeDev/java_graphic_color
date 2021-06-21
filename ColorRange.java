

			import java.awt.*;
			import javax.swing.*;
			import java.awt.event.*;



				public class ColorRange extends JPanel{
				
				
				
				public ColorRange(){
					
					
					JFrame frame = new JFrame("Red Color Range");
					
					frame.add( this );
					
					frame.setSize(400,600);
					frame.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
					frame.setVisible( true );
					
				}
				
				@Override
				public void paintComponent(Graphics ff){
					
					super.paintComponent(ff);
					
					Graphics2D g = (Graphics2D) ff;
					
					int x = 0;
					int xlen = 4;
					
					for(int i=0;i<255;i++){
						
						g.setColor( new Color(i,0,0) );
						g.fillRect( x,0,xlen,500);
						x+=4;
						xlen+=4;
						
						
						if( x%10==0 ){
							
							g.setColor( Color.BLACK );
							g.drawString(""+i,x,510);
						}
						
						
					}
					
					
				}
				
				
				public static void main(String[] arsg){
				
						new ColorRange();
				
				}
				
				}