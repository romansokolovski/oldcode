package oldProjects;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class StudentDatabase implements ActionListener {

	JButton[] buttons1 = new JButton[7];
	JButton[] buttons2 = new JButton[1];
	JButton[] buttons3 = new JButton[1];
	JButton button1 = new JButton("Choose Student");
	JTextField[] display2 = new JTextField[3];
	
	public void mainInterface() {
		//Making main frame
		JFrame frame1 = new JFrame("Student Database");
		
		//Making buttons1

		
		buttons1[0] = new JButton("New Class");
		buttons1[0].setBounds(10,50,200,30);
		
		buttons1[1] = new JButton("New Student");
		buttons1[1].setBounds(10,90,200,30);
		
		buttons1[2] = new JButton("Remove Student");
		buttons1[2].setBounds(10,130,200,30);
		
		buttons1[3] = new JButton("Add Mark");
		buttons1[3].setBounds(10,170,200,30);
		
		buttons1[4] = new JButton("Remove Mark");
		buttons1[4].setBounds(10,210,200,30);
		
		buttons1[5] = new JButton("Edit Student");
		buttons1[5].setBounds(10,250,200,30);
		
		buttons1[6] = new JButton("Class Average");
		buttons1[6].setBounds(10,290,200,30);
		
		//Making labels1
		JLabel labels1 = new JLabel("Welcome to the student database program");
		labels1.setBounds(250,10,250,30);
		
		//Making textfield
		JTextField display1 = new JTextField("");
		display1.setBounds(220,50, 460,271);
		
		//Filling in frame
		for (int i=0; i<=6; i++){
			frame1.add(buttons1[i]);
			buttons1[i].addActionListener(this);
		}
		frame1.add(labels1);
		
		frame1.add(display1);
		display1.addActionListener(this);
		
		frame1.setSize(700,400);
		frame1.setLayout(new BorderLayout());
		frame1.setVisible(true);
		frame1.setResizable(false);
		frame1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	public void newClassFrame(){
		
		JFrame frame2 = new JFrame("New Class");
		
		JLabel[] labels2 = new JLabel[3];
		
		labels2[0] = new JLabel("Teacher's Last Name");
		labels2[0].setBounds(10,20,200,30);
		
		labels2[1] = new JLabel("Current Year");
		labels2[1].setBounds(10,60,200,30);
		
		display2[0] = new JTextField();
		display2[0].setBounds(140,20,120,30);
		
		display2[1] = new JTextField();
		display2[1].setBounds(140,60,120,30);
		
		buttons2[0] = new JButton("Create Class");
		buttons2[0].setBounds(75,100,120,30);
		buttons2[0].addActionListener(this);
		
		for (int q=0; q<=1; q++){
			frame2.add(labels2[q]);
			frame2.add(display2[q]);
			display2[q].addActionListener(this);
		}
			
		frame2.add(buttons2[0]);
		
		frame2.setSize(275,180);
		frame2.setLayout(new BorderLayout());
		frame2.setVisible(true);
		frame2.setResizable(false);
		
	}
	
	public void newStudentFrame(){
		
		//Making frame
		JFrame frame3 = new JFrame("New Student");
		
		//Making labels
		JLabel[] labels3 = new JLabel[6];
		
		labels3[0] = new JLabel("First Name");
		labels3[0].setBounds(10,10,200,30);
		
		labels3[1] = new JLabel("Last Name");
		labels3[1].setBounds(10,50,200,30);
		
		labels3[2] = new JLabel("Parent/Guardian 1");
		labels3[2].setBounds(10,90,200,30);
		
		labels3[3] = new JLabel("Parent/Guardian 2");
		labels3[3].setBounds(10,130,200,30);
		
		labels3[4] = new JLabel("Student Number");
		labels3[4].setBounds(10,170,200,30);
		
		labels3[5] = new JLabel("Address");
		labels3[5].setBounds(10,210,200,30);
		
		//Making textfields
		JTextField[] display3 = new JTextField[6];
		
		display3[0] = new JTextField();
		display3[0].setBounds(150,10,225,30);
		
		display3[1] = new JTextField();
		display3[1].setBounds(150,50,225,30);
		
		display3[2] = new JTextField();
		display3[2].setBounds(150,90,225,30);
		
		display3[3] = new JTextField();
		display3[3].setBounds(150,130,225,30);
		
		display3[4] = new JTextField();
		display3[4].setBounds(150,170,225,30);
		
		display3[5] = new JTextField();
		display3[5].setBounds(150,210,225,30);
		
		//Making submit button

		
		buttons3[0] = new JButton("Add Student");
		buttons3[0].setBounds(75,250,225,30);
		buttons3[0].addActionListener(this);
		
		//Filling in frame
		for (int i=0; i<=5; i++){
			frame3.add(labels3[i]);
			frame3.add(display3[i]);
			display3[i].addActionListener(this);
		}
		
		frame3.add(buttons3[0]);
		
		frame3.setSize(400,320);
		frame3.setLayout(new BorderLayout());
		frame3.setVisible(true);
		frame3.setResizable(false);
	}
	
	public void removeStudentFrame(){
		
		JFrame frame4 = new JFrame("Removing Student");
		
		JLabel labels4 = new JLabel("Select A Student To Remove");
		labels4.setBounds(165,3,200,30);
		
		JButton[] buttons4 = new JButton[30];
		
		int a =35;
		for(int i=0;i<10;i++){
			
			buttons4[i] = new JButton();
			buttons4[i].setBounds(10,a,150,25);
			a=a+35;
			
		}
		int q =35;
		for(int i=10;i<20;i++){
			
			buttons4[i] = new JButton();
			buttons4[i].setBounds(170,q,150,25);
			q=q+35;
			
			}
		int g =35;
		for(int i=20;i<30;i++){
			
			buttons4[i] = new JButton();
			buttons4[i].setBounds(330,g,150,25);
			g=g+35;
			
			}
		for (int b= 0; b<30; b++){
			
			frame4.add(buttons4[b]);
			
		}
		frame4.add(labels4);
		
		frame4.setSize(510,425);
		frame4.setLayout(new BorderLayout());
		frame4.setVisible(true);
		frame4.setResizable(true);
	}

	public void addMarkFrame(){
		JFrame frame5 = new JFrame("Add Marks");
		
		JLabel label1 = new JLabel();
		label1 = new JLabel("Add mark: ");
		label1.setBounds(10,10,100,30);
		
		JTextField textfield1 = new JTextField();
		textfield1.setBounds(100,10,50,30);
		button1.setBounds(10,50,150,20);
		button1.addActionListener(this);
		
		frame5.add(textfield1);
		frame5.add(label1);
		frame5.add(button1);
        
		
		frame5.setSize(200,120);
		frame5.setLayout(new BorderLayout());
		frame5.setVisible(true);
		frame5.setResizable(false);

		}
		
	public void addMarkFrameTwo(){

		JFrame frame6 = new JFrame("Select A Student");
		
		JLabel labels6 = new JLabel("Select A Student To Add Mark To");
		labels6.setBounds(160,3,200,30);
		
		JButton[] buttons6 = new JButton[30];
		
		int a =35;
		for(int i=0;i<10;i++){
			
			buttons6[i] = new JButton();
			buttons6[i].setBounds(10,a,150,25);
			a=a+35;
			
		}
		int q =35;
		for(int i=10;i<20;i++){
			
			buttons6[i] = new JButton();
			buttons6[i].setBounds(170,q,150,25);
			q=q+35;
			
			}
		int g =35;
		for(int i=20;i<30;i++){
			
			buttons6[i] = new JButton();
			buttons6[i].setBounds(330,g,150,25);
			g=g+35;
			
			}
		for (int b= 0; b<30; b++){
			
			frame6.add(buttons6[b]);
			}
		
		frame6.add(labels6);
			
			frame6.setSize(510,425);
			frame6.setLayout(new BorderLayout());
			frame6.setVisible(true);
			frame6.setResizable(false);
	}
	
	public void removeMarkFrame(){
		
		JFrame frame6 = new JFrame("Removing Student Marks");
				
		JLabel labels6 = new JLabel("Select A Student To Remove Marks");
		labels6.setBounds(147,3,200,30);
				
		JButton[] buttons6 = new JButton[30];
				
		int a =35;
		for(int i=0;i<10;i++){
					
			buttons6[i] = new JButton();
			buttons6[i].setBounds(10,a,150,25);
			a=a+35;
					
		}
		int q =35;
		for(int i=10;i<20;i++){
					
			buttons6[i] = new JButton();
			buttons6[i].setBounds(170,q,150,25);
			q=q+35;
					
			}
		int g =35;
		for(int i=20;i<30;i++){
					
			buttons6[i] = new JButton();
			buttons6[i].setBounds(330,g,150,25);
			g=g+35;
					
			}
		for (int b= 0; b<30; b++){
					
			frame6.add(buttons6[b]);
					
		}
		frame6.add(labels6);
				
		frame6.setSize(510,425);
		frame6.setLayout(new BorderLayout());
		frame6.setVisible(true);
		frame6.setResizable(false);
			}
	
	public void editStudentFrame(){
		
		JFrame frame7 = new JFrame("Select A Student");
		
		JLabel labels7 = new JLabel("Select A Student To Edit");
		labels7.setBounds(175,3,200,30);
		
		JButton[] buttons7 = new JButton[30];
		
		int a =35;
		for(int i=0;i<10;i++){
			
			buttons7[i] = new JButton();
			buttons7[i].setBounds(10,a,150,25);
			a=a+35;
			
		}
		int q =35;
		for(int i=10;i<20;i++){
			
			buttons7[i] = new JButton();
			buttons7[i].setBounds(170,q,150,25);
			q=q+35;
			
			}
		int g =35;
		for(int i=20;i<30;i++){
			
			buttons7[i] = new JButton();
			buttons7[i].setBounds(330,g,150,25);
			g=g+35;
			
			}
		for (int b= 0; b<30; b++){
			
			frame7.add(buttons7[b]);
			}
		
		frame7.add(labels7);
			
			frame7.setSize(510,425);
			frame7.setLayout(new BorderLayout());
			frame7.setVisible(true);
			frame7.setResizable(false);
			
	}
	
	public void classAverageFrame(){
		
		JFrame frame8 = new JFrame("Class Average");
		
		JLabel[] labels8 = new JLabel[2];
		
		labels8[0] = new JLabel("The Class Average Is:");
		labels8[0].setBounds(40,10,200,30);
		
		labels8[1] = new JLabel("[ " + "__" + " ]");
		labels8[1].setBounds(180,10,200,30);
		
		for (int i=0; i<=1; i++){
			frame8.add(labels8[i]);
		}
		
		frame8.setSize(250,80);
		frame8.setLayout(new BorderLayout());
		frame8.setVisible(true);
		frame8.setResizable(false);
		
	}
	
	public static void main(String[] args)throws IOException {
		StudentDatabase call = new StudentDatabase();
		call.mainInterface();
	}

	public void actionPerformed(ActionEvent arg0) {
		FileWriter fw = null;
		StudentDatabase call = new StudentDatabase();
		Object i = arg0.getSource();
		if (i== buttons1[0]){
			 call.newClassFrame();
		 }
		if(i== buttons1[1]){
			call.newStudentFrame();
		}
		if(i== buttons1[2]){
			call.removeStudentFrame();
		}
		if(i==buttons1[3]){
			call.addMarkFrame();
		}
		if(i==button1){
			call.addMarkFrameTwo();
		}
		if(i==buttons1[4]){
			call.removeMarkFrame();
		}
		if(i==buttons1[5]){
			call.editStudentFrame();
		}
		if(i==buttons1[6]){
			call.classAverageFrame();
		}
	}	
}
