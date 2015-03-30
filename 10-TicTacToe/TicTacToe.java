import java.awt.*;
import java.awt.event.*;
import javax.swing.*;





public class TicTacToe implements ActionListener

{

         JFrame game = new JFrame("Tic Tac Toe");      
    
         JLabel l2=new JLabel("<html><font color='blue'>TICTACTOE </font></html>");
         
         JLabel l3=new JLabel("<html><font color='blue'>BY GROUP</Verdana></html>");
         JLabel l4=new JLabel("<html><font color='red'> AVENGERS 1.1</Verdana></html>");
         JLabel l5=new JLabel("<html><font color='red'>  PLAYER</font></html>");
         JLabel l7=new JLabel("<html><font color='black'> X' TURN</font></html>");
         JLabel l6=new JLabel("<html><font color='red'>  </font></html>");
        
		JButton button1 = new JButton("");

	
		JButton button2 = new JButton("");
	
         JButton button3 = new JButton("");
         JButton button4 = new JButton("");
         JButton button5 = new JButton("");
         JButton button6 = new JButton("");
         JButton button7 = new JButton("");
         JButton button8 = new JButton("");
         JButton button9 = new JButton("");     
        JLabel l1=new JLabel("");
         JButton button10 = new JButton("Play Again");
         JLabel l10=new JLabel("");
         JLabel l11=new JLabel("<html><font color='red'> .......................................(^_^)</font></html>");
         JButton button23 = new JButton("Exit");
         JLabel l13=new JLabel("<html><font color='red'>(^_^).......................................</font></html>");
        

         String letter = "";
         
         String letter1 = "";

         int count = 0;

         boolean win = false;
         Font  font = new Font ("Verdana", Font .BOLD, 50);
         Font  font1 = new Font ("Verdana", Font .BOLD, 20);
         



        public TicTacToe()

        {
   
        
        game.setSize(450, 600);
       
        game.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        game.setLayout(new GridLayout(7, 3));
        game.setLocation(500, 100);
        
		l2.setFont(font1);
		
		game.add(l2);
		l3.setFont(font1);
		game.add(l3);
		l4.setFont(font1);
		game.add(l4);
		l5.setFont(font1);
		game.add(l5);
		l7.setFont(font1);
		game.add(l7);
		
		game.add(l6);
		

        game.add(button1);
        game.add(button2);
        game.add(button3);
        
        game.add(button4);
        game.add(button5);
        game.add(button6);
        game.add(button7);
        game.add(button8);
        game.add(button9); 
        	l1.setBackground(Color.DARK_GRAY);
        game.add(l1);
        game.add(button10);
        game.add(l10);
        
        game.add(l11);
        game.add(button23);
        game.add(l13);
       




        button1.addActionListener(this);
        button2.addActionListener(this);
        button3.addActionListener(this);
        button4.addActionListener(this);
        button5.addActionListener(this);
        button6.addActionListener(this);
        button7.addActionListener(this);
        button8.addActionListener(this);
        button9.addActionListener(this);
        button10.addActionListener(this);
        button23.addActionListener(this);
        
        game.setVisible(true);
       

        }


        public void actionPerformed(ActionEvent z)

        {
              count++;
			
                if (count == 1 || count == 3 || count == 5 || count == 7 || count == 9)

                {
                	l7.setText("O' Turn");
                	//letter aka use wenne inside buttons
                        letter = "<html><font color='red'>X</font></html>";
                        //letter1 use wenne winner show ka msg box akata
                        letter1="X";
                        
                }

                else if (count == 2 || count == 4 || count == 6 || count == 8 || count == 10)
                {
                	l7.setText("X 'Turn");
                        letter = "<html><font color='blue'>O</font></html>";
                        letter1="O";
                }

                if (z.getSource() == button1)
                {
                	button1.setFont(font);
                	
                        button1.setText(letter);
                        //button akak click kalama aka disable karanna bellow line
                        button1.setEnabled(false);

                }

                else if (z.getSource() == button2)
                {
                	button2.setFont(font);
                
                        button2.setText(letter);
                        button2.setEnabled(false);
                }

                else if (z.getSource() == button3)
                {
                	button3.setFont(font);
                        button3.setText(letter); 
                        	button3.setEnabled(false);                      
                }

                else if (z.getSource() == button4)
                {
                	button4.setFont(font);
                        button4.setText(letter);
                        button4.setEnabled(false);                       
                }

                else if (z.getSource() == button5)

                {
                	button5.setFont(font);
                        button5.setText(letter);   
                        	button5.setEnabled(false);                    
                }

                else if (z.getSource() == button6)
                {
                	button6.setFont(font);
                        button6.setText(letter); 
                        	button6.setEnabled(false);                      
                }

                else if (z.getSource() == button7)
                {
                	button7.setFont(font);
                        button7.setText(letter);  
                        	button7.setEnabled(false);                      

                }

                else if (z.getSource() == button8)
                {
                	button8.setFont(font);

                        button8.setText(letter);
                        button8.setEnabled(false);                      
                }

                else if (z.getSource() == button9)

                {
                	button9.setFont(font);
                        button9.setText(letter);  
                        	button9.setEnabled(false);                     

                }

                else if (z.getSource() == button10)

                {
                // aluth gui aka ganna,new tictactoe gaththama wenama akak enne araka udin
                //kalin click kalama disable una nisa again enable karannath ona buttons
                	 letter="";
                		button1.setText(letter);
                		button1.setEnabled(true);
                		button2.setText(letter);
                		button2.setEnabled(true);
                		button3.setText(letter);
                		button3.setEnabled(true);
                		button4.setText(letter);
                		button4.setEnabled(true);
                		button5.setText(letter);
                		button5.setEnabled(true);
                		button6.setText(letter);
                		button6.setEnabled(true);
                		button7.setText(letter);
                		button7.setEnabled(true);
                		button8.setText(letter);
                		button8.setEnabled(true);
                		button9.setText(letter);
                		button9.setEnabled(true);
                		count=0;
                
                }
              else if (z.getSource() == button23)

                {
                System.exit(0);
                	 
                
                }

                if (button1.getText() == button2.getText() && button2.getText() == button3.getText() && button1.getText() != "")

                {

                        win = true;

                }

                else if (button4.getText() == button5.getText() && button5.getText() == button6.getText() && button4.getText() != "")

                {

                        win = true;

                }

                else if (button7.getText() == button8.getText() && button8.getText() == button9.getText() && button7.getText() != "")

                {

                        win = true;

                }


                

                else if (button1.getText() == button4.getText() && button4.getText() == button7.getText() && button1.getText() != "")

                {

                        win = true;

                }

                else if (button2.getText() == button5.getText() && button5.getText() == button8.getText() && button2.getText() != "")

                {

                        win = true;

                }

                else if (button3.getText() == button6.getText() && button6.getText() == button9.getText() && button3.getText() != "")

                {

                        win = true;

                }


           

                else if (button1.getText() == button5.getText() && button5.getText() == button9.getText() && button1.getText() != "")

                {

                        win = true;

                }

                else if (button3.getText() == button5.getText() && button5.getText() == button7.getText() && button3.getText() != "")

                {

                        win = true;

                }

                else

                {

                        win = false;

                }


                
                if (win == true && count<10)

                {

                        JOptionPane.showMessageDialog(null,"Congratulations Player   "+ letter1 +"   " + "Wins!");
                       // game aka over unama aluth 1k enna,nathnam play karapu akamai,so play again gannama ona 
                       //kalin click kalama disable una nisa again enable karannath ona buttons
                         letter="";
                		button1.setText(letter);
                		button1.setEnabled(true);
                		button2.setText(letter);
                		button2.setEnabled(true);
                		button3.setText(letter);
                		button3.setEnabled(true);
                		button4.setText(letter);
                		button4.setEnabled(true);
                		button5.setText(letter);
                		button5.setEnabled(true);
                		button6.setText(letter);
                		button6.setEnabled(true);
                		button7.setText(letter);
                		button7.setEnabled(true);
                		button8.setText(letter);
                		button8.setEnabled(true);
                		button9.setText(letter);
                		button9.setEnabled(true);
                		count=0;

                }

                if (count == 9 && win == false )

                {

                        JOptionPane.showMessageDialog(null, "It's a tie !!! Lets try again  ^_^ ");

                }


        }


        public static void main(String args[])

        {
        	      JOptionPane.showMessageDialog(null,"Welcome to TicTacToe****Ready to Have Some Fun ?  :D :D :D");
        	      


                 TicTacToe tictactoe1 = new TicTacToe();
                 

        }

}
