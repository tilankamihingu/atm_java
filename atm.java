import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;

public class atm
{
public static void main(String args[])
{
   //loginframe
   JFrame login = new JFrame("ATM");
   login.setSize(400,300);
   login.setLocationRelativeTo(null);
   login.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
   
   
   //createcontainer
   Container con = login.getContentPane();
   con.setBackground(Color.GRAY);
   con.setLayout(null);

  //createjlables
   JLabel jlabel = new JLabel("LOGIN ACCOUNT");
   JLabel jlabel2 = new JLabel("Enter your Password");
   
  Font atmfn = new Font("Arial",Font.PLAIN,15);
  jlabel.setFont(atmfn);
  jlabel2.setFont(atmfn);


   //jlablesetbounds
   jlabel2.setBounds(15,75,150,30);
   jlabel.setBounds(100,20,200,30);

   //addjlable
   con.add(jlabel);
   con.add(jlabel2);

   
  //createjbuttons
  JPasswordField jpf = new JPasswordField(7);
  JButton loginjb = new JButton("LOGIN");
  JButton resetjb = new JButton("RESET");

  //jbuttonsetbounds
  resetjb.setBounds(130,130,100,30);
  jpf.setBounds(180,80,150,20);
  loginjb.setBounds(240,130,100,30);
 
  //addjbuttons
  con.add(resetjb);
  con.add(loginjb);
  con.add(jpf);


 

  
  


           //resetbuttonaddaction
           resetjb.addActionListener(new ActionListener()
           {
              public void actionPerformed(ActionEvent e)
              {
                jpf.setText(" "); 
              }
           });






         //loginbuttonaddaction
         loginjb.addActionListener(new ActionListener()
         {
            public void actionPerformed(ActionEvent e)
              {
                 String password=jpf.getText();
               BufferedReader br = null;
                try
                 {
                   br = new BufferedReader(new FileReader("password.txt"));
                   String pin;
                     while((pin=br.readLine())!=null)
                     {
                        if(password.equals(pin))
                           {  atmnew atmnObj = new atmnew();
                              atmnObj.login();
                              login.setVisible(false); 
                        
                           }

                        else
                          {
                           JOptionPane.showMessageDialog(null,"Incorrect Password","Error",JOptionPane.ERROR_MESSAGE);
                            }

                     }
                   }catch(IOException args)
                         {
                             JOptionPane.showMessageDialog(null,"Incorrect Password","Error",JOptionPane.ERROR_MESSAGE);    }
                     
                
               
              }
         });


 login.setVisible(true);

}

}