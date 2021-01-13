import javax.swing.*;
import java.awt.*;
import java.io.*;
import java.awt.event.*;

public class deposit
{
 public void money()
  {
      JFrame depositf = new JFrame("DEPOSITE");
  depositf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
  depositf.setSize(400,300);
 depositf.setLocationRelativeTo(null);

 Container depositcon = depositf.getContentPane();
 depositcon.setBackground(Color.GRAY);
 depositcon.setLayout(null);

 JLabel  depositjl = new JLabel("Enter the amount do you want deposit : ");
  depositjl.setBounds(25,50,300,50);
  depositcon.add( depositjl);

 Font  depositfn = new Font("Arial",Font.PLAIN,15);
  depositjl.setFont( depositfn);



JTextField jtext = new JTextField();
jtext.setBounds(100,100,150,20);
 depositcon.add(jtext);

JButton  depositenter = new JButton("ENTER");
 depositenter.setBounds(250,125,100,30);
 depositcon.add( depositenter);

JButton  depositreset = new JButton("RESET");
 depositreset.setBounds(150,125,100,30);
 depositcon.add( depositreset);

JButton  depositexit = new JButton("EXIT");
 depositexit.setBounds(280,230,100,30);
 depositcon.add( depositexit);

JButton  depositback = new JButton("BACK");
 depositback.setBounds(280,200,100,30);
 depositcon.add( depositback);


       depositf.setVisible(true);


      depositenter.addActionListener(new ActionListener()
        {
              public void actionPerformed(ActionEvent e) 
             {
               int  depositvalue = Integer.parseInt(jtext.getText());

                  BufferedReader br = null;
          
               try
                {
                   br = new BufferedReader(new FileReader("account.txt"));
                   String accountb;

                     while((accountb=br.readLine())!=null)
                      {
                           int accountb1 = Integer.parseInt(accountb);
                             
                            
                                     int accountnew = accountb1+ depositvalue;
                                     JOptionPane.showMessageDialog(null," Deposit is completed  !!! your current account balance is "+accountnew);

                                     PrintWriter  writer= new PrintWriter("account.txt");
                                     writer.println(accountnew);
                                     writer.close();
                             
                               
                       }
                  }
               catch(IOException egs){}

          }
      });
 

 
       depositreset.addActionListener(new ActionListener ()
        {
           public void actionPerformed(ActionEvent e)
          {
            jtext.setText(" ");
          }
        });


      depositexit.addActionListener(new ActionListener ()
        {
          public void actionPerformed(ActionEvent e)
          {
            System.exit(0);
         }
          });

  
  


        depositback.addActionListener(new ActionListener()
          {
                public void actionPerformed(ActionEvent e)
            {
               atmnew atmObj = new atmnew();
               atmObj.login();
                depositf.setVisible(false); 
            }
          });



   }







}