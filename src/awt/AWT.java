/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package awt;

/**
 *
 * @author LAB-212
 */
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class AWT extends JFrame implements ActionListener
{
      JLabel ql; 
      JButton lg;
      ButtonGroup bg;
      JRadioButton rb[] = new JRadioButton[5];
      int running = 0;
      int count = 0;
      
      
    
	AWT()
	{
		//Frame f = new Frame();
		setSize(500,500);
		setTitle("OOPL Lab II");
		setLayout(null);
		setVisible(true);
                setLocation(250,100);
                
                Button btn = new Button("University of Information Technology and Sciences - UITS");
                btn.setBounds(50,50,400,40);
                add(btn);
                
                Button btn1 = new Button("Departmeny of Information Technology  - IT");
                btn1.setBounds(90,100,300,40);
                add(btn1);
                
                Label l1 = new Label("Your Name: ");
                l1.setBounds(100,150, 100, 30);
                add(l1);
                
                Label l2 = new Label("Your SID: ");
                l2.setBounds(100,180, 100, 30);
                add(l2);
                
                Label l3 = new Label("UITS");
                l3.setBounds(200,150, 100, 30);
                add(l3);
                
                Label l4 = new Label("123456789");
                l4.setBounds(200,180, 100, 30);
                add(l4);
                
                ql = new JLabel();
                add(ql);
                
                bg = new ButtonGroup();
                
                for(int i=0;i<5;i++)  
                {
                    rb[i] = new JRadioButton();
                    add(rb[i]);
                    bg.add(rb[i]);
                }
                
                rb[0].setBounds(200,250,100,20);
                rb[1].setBounds(200,280,100,20);
                rb[2].setBounds(200,310,100,20);
                rb[3].setBounds(200,340,100,20);
                
                
                
                
              
                
                lg = new JButton("Next");
                lg.setBounds(230,370,70,40);
                add(lg);
                
                lg.addActionListener(this);
                
                
                Label db = new Label("Developed by UITS Lab");
                db.setBounds(180,410, 200, 30);
                add(db);
                
                setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	        
                set();
                
        }
        
        public void actionPerformed(ActionEvent e)
        {
           if(e.getSource()==lg)
           {
              if(check())
              {
                 count = count+1; 
              }
              running++;
              set();
              
              if(running ==1)
              { 
                  lg.setText("Result");
              }
           }
           
           if(e.getActionCommand().equals("Result"))
           {
               if(check())
               {
                   count =count+1;
               }
               running++;
             
                JOptionPane.showMessageDialog(this,"Correct Answer :" + count);
                System.exit(0);
           }
        }
        
        void set()
        {
            rb[4].setSelected(true);
            
            if (running ==0)
            {
               ql.setText("Find the number which one is less than three.");
               rb[0].setText("15");
               rb[1].setText("5");
               rb[2].setText("2");
               rb[3].setText("10");
            }
            
            if (running ==1)
            {
               ql.setText("Find the number which one is greater than three.");
               rb[0].setText("15");
               rb[1].setText("3");
               rb[2].setText("2");
               rb[3].setText("1");
            }
            ql.setBounds(200,220,400,20);
        }
        
        boolean check()
        {
            if(running == 0)
            {
                return(rb[2].isSelected());
            }
            if(running == 1)
            {
                return(rb[0].isSelected());
            }
            
            return false;
        }
  
        
	
	public static void main(String []args)
	{
		AWT awt = new AWT();
	}
	
}
