




			import java.awt.*;
			import javax.swing.*;
			import java.awt.event.*;

			public class Diamond extends JLabel{
				
				
				Graphics2D graphics;
				
				int x1 = 100;
				int y1 = 100;
				
				int x2 = 100;
				int y2 = 0;
				
				boolean decX = true;
				boolean decY = false;
				boolean finished = false;
				
				
					@Override
							public void paintComponent(Graphics gra){
								
								
								super.paintComponent(gra);
								
								finished = false;
								
								graphics = (Graphics2D) gra;
								graphics.setColor( Color.RED );
								
								
								
									
						
		
								while( !( finished )  ){
									
									graphics.drawLine( x1,y1,x2,y2);
									graphics.setColor( new Color(y2,x2,y2) );
									
										System.out.println("Inside while ");
									
													  if( decX && !(decY) ){
														  
														  x2--;
														  y2++;
														  
														  if( y2 <= 0 ){
															  
															  decY=false;
														  }
														  
														  else if( y2>=200 ){
															  
															  decY = true;
															  
														  }
														  
														  if( x2 <=0 ){
															  
															  decX =false;
															  
														  }
														  
														    else if( x2>=200 ){
															  
															  decX = true;
															  
														  }

														  }
													  
													  else if( !(decX) && !(decY) ){
														  
														  
														  y2++;
														  x2++;
														  
														  if( y2 <= 0 ){
															  
															  decY=false;
														  }
														  
														  else if( y2>=200 ){
															  
															  decY = true;
															  
														  }
														  
														  if( x2 <=0 ){
															  
															  decX =false;
															  
														  }
														  
														    else if( x2>=200 ){
															  
															  decX = true;
															  
														  }
														  
														  
														  
													  }
													  
													  else if( !(decX) && decY ){
														  
														  
														  x2++;
														  y2--;
														  
														  if( y2 <= 0 ){
															  
															  decY=false;
														  }
														  
														  else if( y2>=200 ){
															  
															  decY = true;
															  
														  }
														  
														  if( x2 <=0 ){
															  
															  decX =false;
															  
														  }
														  
														    else if( x2>=200 ){
															  
															  decX = true;
															  
														  }
														  
														  
														  
													  }
													  													  
													  else if( decX && decY ){
														
													
														
														x2--;
														y2--;
														
														  if( y2 <= 0 ){
															  
															  decY=false;
														  }
														  
														  else if( y2>=200 ){
															  
															  decY = true;
															  
														  }
														  
														  if( x2 <=0 ){
															  
															  decX =false;
															  
														  }
														  
														    else if( x2>=200 ){
															  
															  decX = true;
															  
														  }
																	
																if( y2<=1 || x2<=100){
																	
																	finished = true;
																	
																}
				
																	
													  }
														

			
								
							}
										
						        	}
						 	
							
							
				
			}