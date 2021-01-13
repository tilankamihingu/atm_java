import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;

public class accountbalance

{
 public void balance()
{

  

  BufferedReader br = null;
  try
   {
      br = new BufferedReader(new FileReader("account.txt"));
     String accountb;
       while((accountb=br.readLine())!= null)
         {
              int accountnew = Integer.parseInt(accountb);

                JFrame accountf = new JFrame("account");
                
                accountf.setSize(400,300);
                accountf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                accountf.setLocationRelativeTo(null);

              Container conacc = accountf.getContentPane();
              conacc.setLayout(null);
              conacc.setBackground(Color.GRAY);

              JLabel accjl = new JLabel("Cheaking");
              accjl.setBounds(70,80,150,20);
              conacc.add(accjl);

              JLabel accjl2 = new JLabel("Availble for widthdrawal");
              accjl2.setBounds(70,110,150,20);
              conacc.add(accjl2);

              JLabel accjl3 = new JLabel(":"+accountnew);
              accjl3.setBounds(250,80,150,20);
              conacc.add(accjl3);

              int avable = accountnew - 500;

              JLabel accj4 = new JLabel(":"+avable );
              accj4.setBounds(250,110,150,20);
              conacc.add(accj4);

             JLabel accj5 = new JLabel("Balance" );
             accj5.setBounds(250,55,150,20);
             conacc.add(accj5);

             JLabel accj6 = new JLabel("Please make a selection" );
             accj6.setBounds(110,165,200,20);

             Font fn = new Font("Arial",Font.PLAIN,15);
             accj6.setFont(fn);
             conacc.add(accj6);


             JButton jb = new JButton("BACK");
             jb.setBounds(250,220,100,30);
             conacc.add(jb);



             JButton jb1 = new JButton("PRINT");
             jb1.setBounds(150,220,100,30);
             conacc.add(jb1);


             jb.addActionListener(new ActionListener()
       {
            public void actionPerformed(ActionEvent e)
            {
               atmnew atmObj = new atmnew();
               atmObj.login();
               accountf.setVisible(false); 
            }
       });

        jb1.addActionListener(new ActionListener ()
        {
          public void actionPerformed(ActionEvent e)
          {
            System.exit(0);
         }
          });



              
                


               accountf.setVisible(true);
          
               
            }
    }catch(IOException e){}

                
     

  


}


}
