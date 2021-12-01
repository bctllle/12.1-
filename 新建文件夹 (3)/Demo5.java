package TanChiShe;

import java.awt.Container;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Demo5 {
JFrame f=new JFrame();
Container c;//主容器
void creatFrame(){
	c=f.getContentPane();
	c.setLayout(new GridBagLayout());
	f.setSize(800, 600);
    f.setLocationRelativeTo(null);
    f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
}
  void init() {
	 GridBagConstraints g1 =new GridBagConstraints();
	 g1.gridx=0;
	 g1.gridy=0;
	 c.add(new JButton("组件1"),g1);
	 GridBagConstraints g2 =new GridBagConstraints();
	 g2.gridx=1;
	 g2.gridy=1;
	 c.add(new JButton("组件2"),g2);
	 GridBagConstraints g3 =new GridBagConstraints();
	 g3.gridx=3;
	 g3.gridy=3;
	 c.add(new JButton("组件3"),g3);
  }
  
  
  void creatButton() {
	  for(int i=0;i<9;i++) {
		GridBagConstraints g1 =new GridBagConstraints();
			 g1.gridx=i;
			 g1.gridy=0;
			 c.add(new JButton("组件"),g1);
			 
			 GridBagConstraints g2 =new GridBagConstraints();
			 g2.gridx=0;
			 g2.gridy=i;
			 c.add(new JButton("组件"),g2);
	  }
  }
  void init2() { 
	  GridBagConstraints g1 =new GridBagConstraints();
	 g1.gridx=1;
	 g1.gridy=1;
	 c.add(new JButton("组件1"),g1);
	 GridBagConstraints g2 =new GridBagConstraints();
	 g2.gridx=2;
	 g2.gridy=2;
	 g2.gridheight=2;
	 g2.gridwidth=1;
	 c.add(new JButton("组件2"),g2);
	 GridBagConstraints g3 =new GridBagConstraints();
	 g3.gridx=3;
	 g3.gridy=3;
	 g3.gridheight=2;
	 g3.gridwidth=2;
	 c.add(new JButton("组件3"),g3);
	  
  }
  void init3() {
	  GridBagConstraints g1 =new GridBagConstraints();
		 g1.gridx=1;
		 g1.gridy=1;
		 g1.gridheight=2;
		 g1.gridwidth=2;

		 c.add(new JButton("none"),g1);
		 GridBagConstraints g2 =new GridBagConstraints();
		 g2.gridx=2;
		 g2.gridy=2;
		 g2.gridheight=2;
		 g2.gridwidth=2;
		 g2.fill=GridBagConstraints.HORIZONTAL;
		 c.add(new JButton("HORIZONTAL"),g2);
		 
		 
		 GridBagConstraints g3 =new GridBagConstraints();
		 g3.gridx=5;
		 g3.gridy=1;
		 g3.gridheight=2;
		 g3.gridwidth=2;
         g3.fill=GridBagConstraints.VERTICAL;//垂直填充
		 c.add(new JButton("VERTICAL"),g3);
		 
		 GridBagConstraints g4 =new GridBagConstraints();
		 g4.gridx=7;
		 g4.gridy=1;
		 g4.gridheight=2;
		 g4.gridwidth=2;
         g4.fill=GridBagConstraints.BOTH;//垂直填充
		 c.add(new JButton("BOTH"),g4);
		  
  }
  void init4() {
	  GridBagConstraints g1 =new GridBagConstraints();
		 g1.gridx=1;
		 g1.gridy=1;
		 g1.gridheight=2;
		 g1.gridwidth=2;
		 g1.anchor=GridBagConstraints.NORTH;
		 c.add(new JButton ("@"),g1);
		 g1.fill=GridBagConstraints.BOTH;
		 g1.anchor=GridBagConstraints.CENTER;
		 JPanel p=new JPanel();
  }
  void init5() {
	  GridBagConstraints g1 =new GridBagConstraints();
		 g1.gridx=1;
		 g1.gridy=1;
		 g1.gridheight=2;
		 g1.gridwidth=2;
		 g1.insets=new Insets(5,10,5,10);
		 c.add(new JButton("@"),g1);
  }
  void init6() {
	  GridBagConstraints g1 =new GridBagConstraints();
		 g1.gridx=1;
		 g1.gridy=1;
		 g1.ipadx=10;
		 g1.ipady=10;
		 c.add(new JButton("组1"),g1);
		 GridBagConstraints g2 =new GridBagConstraints();
		 g2.gridx=2;
		 g2.gridy=2;
		 g2.ipadx=-10;
		 g2.ipady=-10;
		 c.add(new JButton("组件2"),g2);
  }
   void init7(){
	   GridBagConstraints g1 =new GridBagConstraints();
		 g1.gridx=2;
		 g1.gridy=2;
		 g1.weightx=10;
		 g1.weighty=10;
		 c.add(new JButton("组"),g1);
   }
public static void main(String[] args) {
	
	Demo5 d=new Demo5();
	d.creatFrame();
	d.creatButton();
	d.init7();
	d.f.setVisible(true);
}
}
