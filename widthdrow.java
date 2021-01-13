import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;


public class widthdrow
{
 public void get()
 {
  //createjframe
  JFrame widthdrowf = new JFrame("WITHDRAW");
  widthdrowf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
  widthdrowf.setSize(400,300);
  widthdrowf.setLocationRelativeTo(null);

 Container widthcon = widthdrowf.getContentPane();
 widthcon.setBackground(Color.GRAY);
 widthcon.setLayout(null);

 JLabel widthjl = new JLabel("Enter the amount do you want widthdrow  : ");
 widthjl.setBounds(25,50,300,50);
 widthcon.add(widthjl);

 Font widthfn = new Font("Arial",Font.PLAIN,15);
 widthjl.setFont(widthfn);



JTextField jtext = new JTextField();
jtext.setBounds(100,100,150,20);
widthcon.add(jtext);

JButton widthenter = new JButton("ENTER");
widthenter.setBounds(250,125,100,30);
widthcon.add(widthenter);

JButton widthreset = new JButton("RESET");
widthreset.setBounds(150,125,100,30);
widthcon.add(widthreset);

JButton widthexit = new JButton("EXIT");
widthexit.setBounds(280,230,100,30);
widthcon.add(widthexit);

JButton widthback = new JButton("BACK");
widthback.setBounds(280,200,100,30);
widthcon.add(widthback);


      widthdrowf.setVisible(true);


     widthenter.addActionListener(new ActionListener()
        {
              public void actionPerformed(ActionEvent e) 
             {
               int widthvalue = Integer.parseInt(jtext.getText());

                  BufferedReader br = null;
          
               try
                {
                   br = new BufferedReader(new FileReader("account.txt"));
                   String accountb;

                     while((accountb=br.readLine())!=null)
                      {
                           int accountb1 = Integer.parseInt(accountb);
                             
                              if(accountb1>widthvalue)
                                {
                                     int accountnew = accountb1-widthvalue;
                                     JOptionPane.showMessageDialog(null,"widthdrow is completed  !!! your current account balance is "+accountnew);

                                     PrintWriter  writer= new PrintWriter("account.txt");
                                     writer.println(accountnew);
                                     writer.close();
                                }

                              else
                               {
                                 JOptionPane.showMessageDialog(null,"your account balance is low");}
                                }
                  }
               catch(IOException egs){}

          }
      });
 

 
       widthreset.addActionListener(new ActionListener ()
        {
           public void actionPerformed(ActionEvent e)
          {
            jtext.setText(" ");
          }
        });


      widthexit.addActionListener(new ActionListener ()
        {
          public void actionPerformed(ActionEvent e)
          {
            System.exit(0);
         }
          });

  
  


        widthback.addActionListener(new ActionListener()
          {
                public void actionPerformed(ActionEvent e)
            {
               atmnew atmObj = new atmnew();
               atmObj.login();
               widthdrowf.setVisible(false); 
            }
          });
 }


}


