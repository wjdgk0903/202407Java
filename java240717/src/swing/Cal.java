package swing;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JPanel;

public class Cal extends JFrame{
	
	JLabel la1 = new JLabel("계산기");
	JLabel la2 = new JLabel("계산결과");
	JTextField tf1 = new JTextField();
	JTextField tf2 = new JTextField();
	JButton jb1 = new JButton("+");
	JButton jb2 = new JButton("-");
	JButton jb3 = new JButton("*");
	JButton jb4 = new JButton("/");
	
	Cal(){
		JPanel jp1 = new JPanel();
		JPanel jp2 = new JPanel();
		Container con = this.getContentPane();
	      con.setLayout(new FlowLayout());
	      
	      jp1.add(la1);
	      con.add(jp1, BorderLayout.NORTH);
	      jp2.add(la2);
	      con.add(jp2, BorderLayout.SOUTH);
//	      con.add(la1); con.add(tf1); con.add(tf2);
//	      con.add(jb1); con.add(jb2); con.add(jb3); con.add(jb4); 
//	      con.add(la2);
	      this.setLocation(1000, 200);
	      this.setSize(700, 500);
	      this.setVisible(true);
	      this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	public static void main(String[] args) {
		new Cal();
		

	}

}
