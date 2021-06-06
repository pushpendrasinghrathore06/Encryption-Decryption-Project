package ALED;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class Main extends JFrame implements ActionListener{
	
	//Compoenents
	JTextArea f;
	JTextArea f1;
	JButton btn;
	JButton btn1;
	JTextField area;
	JTextArea area1;
	Main(){
		setTitle("Encryption/Decryption");
		setResizable(false);
		JTabbedPane pane = new JTabbedPane();
		JPanel panel1 = new JPanel();
		panel1.setBounds(0, 0, 530, 430);
		panel1.setLayout(null);
		JPanel panel2 = new JPanel();
		panel2.setBounds(0, 0, 590, 490);
		panel2.setLayout(null);
		pane.addTab("Encryption",panel1);
		pane.addTab("Decryption",panel2);
		
		//Adding Labels
		JLabel label = new JLabel("ENTER DATA ");
		label.setBounds(30,21,200,30);
		label.setFont(new Font("Times New Roman",Font.BOLD,20));
		panel1.add(label);
		
		JLabel label1_1 = new JLabel("ENTER DATA ");
		label1_1.setBounds(30,21,200,30);
		label1_1.setFont(new Font("Times New Roman",Font.BOLD,20));
		panel2.add(label1_1);
		
		
		//Adding textboxes
		f = new JTextArea();
		f.setBounds(30,50,400,80);
		f.setFont(new Font("Times New Roman",Font.ITALIC,20));
		panel1.add(f);
		
		f1 = new JTextArea();
		f1.setBounds(30,50,400,80);
		f1.setFont(new Font("Times New Roman",Font.ITALIC,20));
		panel2.add(f1);
		
		//Adding Buttons
		btn = new JButton("Encrypt");
		btn.setBounds(30, 135, 100, 30);
		btn.setBackground(new Color(220,80,80));
		btn.setForeground(new Color(255,255,255));
		btn.setFont(new Font("Times New Roman",Font.BOLD,15));
		btn.addActionListener(this);
		panel1.add(btn);
		
		btn1 = new JButton("Decrypt");
		btn1.setBounds(30, 135, 100, 30);
		btn1.setBackground(new Color(220,80,80));
		btn1.setForeground(new Color(255,255,255));
		btn1.setFont(new Font("Times New Roman",Font.BOLD,15));
		btn1.addActionListener(this);
		panel2.add(btn1);
		
		//Show widgets
		JLabel label1 = new JLabel("ENCRYPTED DATA");
		label1.setBounds(30,170,200,30);
		label1.setFont(new Font("Times New Roman",Font.BOLD,20));
		panel1.add(label1);
		area = new JTextField();
		area.setBounds(30, 200, 400, 80);
		area.setFont(new Font("Times New Roman",Font.BOLD,20));
		panel1.add(area);
		
		JLabel label2 = new JLabel("DECRYPTED DATA");
		label2.setBounds(30,170,200,30);
		label2.setFont(new Font("Times New Roman",Font.BOLD,20));
		panel2.add(label2);
		area1= new JTextArea();
		area1.setBounds(30, 200, 400, 80);
		area1.setFont(new Font("Times New Roman",Font.BOLD,20));
		panel2.add(area1);
		
		//designing panels
		panel1.setBackground(new Color(60,222,169));
		panel2.setBackground(new Color(60,222,169));
		
		add(pane);
		setBounds(500,270,600,400);
		setVisible(true);
		setLayout(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	//Task Performing
	public void actionPerformed(ActionEvent e) {
		String var1;
		String var2;
		String source = e.getActionCommand();
		if(source =="Encrypt") {
			var1 = f.getText();
			char [] myarr= var1.toCharArray();
			int size = var1.length();
			int key = 39;
			for(int i=0;i<size;i++){
		            myarr[i]=(char)(myarr[i]-key);
		       }
			String result = "";
			for(int i =0 ;i<size;i++) {
				result += myarr[i]+"";
			}
			area.setText(result);
		}
		else if(source == "Decrypt") {
			var2 = f1.getText();
			char [] myarr= var2.toCharArray();
			int size = var2.length();
			int key = 39;
			for(int i=0;i<size;i++){
		            myarr[i]=(char)(myarr[i]+key);
		       }
			String result = "";
			for(int i =0 ;i<size;i++) {
				result += myarr[i]+"";
			}
			area1.setText(result);
		}
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Main();
	}

}
