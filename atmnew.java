import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class atmnew
{
 public  void login()
{

    //
   JFrame  loginf = new JFrame("MENU");
   loginf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
   loginf.setSize(400,300);
   loginf.setLocationRelativeTo(null);

   Container con = loginf.getContentPane();
   con.setLayout(null);
   con.setBackground(Color.GRAY);

  //createjlabel
  JLabel jl1 = new JLabel("1.Deposit money");
  JLabel jl2 = new JLabel(" 2.Withdraw money");
  JLabel jl3 = new JLabel("3.Cheak Account balance ");


 //jlablesetbounds
  jl1.setBounds(20,60,180,30);
  jl2.setBounds(20,110,180,30);
  jl3.setBounds(20,160,180,30);
  
  
  //jlabeladdcontainer
  con.add(jl1);
  con.add(jl2);
  con.add(jl3);

 
  
 //jbuttons
  JButton deposit = new JButton("Deposit");
  JButton accountbalance = new JButton("Account Balance");
  JButton withdrow = new JButton("Withdraw");

JButton exit = new JButton("EXIT");
exit.setBounds(280,200,100,30);
con.add(exit);

  
  //jbuttonsetbounds
  deposit.setBounds(200,60,100,30);
  withdrow.setBounds(200,110,100,30);
  accountbalance.setBounds(200,160,130,30);

 
  //jubttonaddcontainer
  con.add(accountbalance);
  con.add(withdrow);
  con.add(deposit);

  //fontstyle
  Font fn= new Font("Airal",Font.PLAIN,15);

  //addfont
  jl1.setFont(fn);
  jl2.setFont(fn);
  jl3.setFont(fn);

 

  




  loginf.setVisible(true);

  accountbalance.addActionListener(new ActionListener ()
  {
    public void actionPerformed(ActionEvent e)
   {
    accountbalance accObj = new accountbalance();
    accObj.balance();
    loginf.setVisible(false);
   }
   
  });

 withdrow.addActionListener(new ActionListener()
 {
  public void actionPerformed(ActionEvent e)
  {
  widthdrow widthObj = new widthdrow();
  widthObj.get();
  
  }
 });
  exit.addActionListener(new ActionListener ()
        {
          public void actionPerformed(ActionEvent e)
          {
            System.exit(0);
         }
          });


deposit.addActionListener(new ActionListener()
{
public void actionPerformed(ActionEvent e)
 {
    deposit depositObj = new deposit();
    depositObj.money();
    loginf.setVisible(false);
  }
});

 
   
}  

}