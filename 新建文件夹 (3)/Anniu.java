package TanChiShe;

import java.awt.Color;
import java.awt.Container;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class Anniu extends JFrame{
	public Anniu() {
		setBounds(100,100,500,300);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		Container c= getContentPane();

        c.setLayout(new GridLayout(3,2,5,5));
        JButton btn[]=new JButton[6];
        for(int i=0;i<btn.length;i++)
        {
        	btn[i]=new JButton();
        	c.add(btn[i]);
        }
        btn[0].setText("不可用");
        btn[0].setEnabled(false);
        btn[1].setText("aa");
        btn[1].setBackground(Color.BLACK);
        btn[2].setText("d");
        btn[2].setBorderPainted(false);
        btn[3].setText("i");
        btn[3].setBorder(BorderFactory.createLineBorder(Color.blue));
        
        Icon icon =new ImageIcon("");
        btn[4].setIcon(icon);
        btn[4].setToolTipText("图片按钮");
        
        btn[5].setText("可点击");
        btn[5].addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e){
        		JOptionPane.showMessageDialog(Anniu.this, "点击按钮");
        	}
        });
        setVisible(true);
        
}
	public static void main(String[] args) {
		new Anniu();
	}
}