package oldProjects;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;


public class testCalculator extends JPanel implements ActionListener {
	
	private static final int SUBTRACT_OPERATION = 2;
	private static final int ADD_OPERATION = 1;
	private static final int MULTIPLY_OPERATION = 3;
	private static final int DIVIDE_OPERATION = 4;

	
	private static final JButton CLEAR_BUTTON = new JButton("C");
	private static final JButton NEGATIVE_BUTTON = new JButton("+/-");
	private static final JButton DIV_BUTTON = new JButton("/");
	private static final JButton MULTI_BUTTON = new JButton("*");
	private static final JButton SUB_BUTTON = new JButton("-");
	private static final JButton ADD_BUTTON = new JButton("+");
	private static final JButton EQUALS_BUTTON = new JButton("=");
	private static final JButton DOT_BUTTON = new JButton(".");
	
	public static final int WIDTH = 320;
	public static final int HEIGHT = 480;
	
	private GridBagLayout layout;
	private GridBagConstraints gbc;
	
	private JButton[] numberButtons;
	private JButton[] opButtons;
	
	private JTextField field;
	
	private List<Double> nums;
	private List<Integer> operations;
	
	private int op; 
	
	// [0] = gridx, [1] = gridy, [2] = gridwidth, [3] = gridheight
	private int[][] numConstraints = new int[][] {
			{0, 5, 2, 1},
			{0, 4, 1, 1},
			{1, 4, 1, 1},
			{2, 4, 1, 1},
			{0, 3, 1, 1},
			{1, 3, 1, 1},
			{2, 3, 1, 1},
			{0, 2, 1, 1},
			{1, 2, 1, 1},
			{2, 2, 1, 1},
	};
	
	private int[][] opConstraints = new int[][] {
			{2, 5, 1, 1},
			{3, 4, 1, 2},
			{3, 3, 1, 1},
			{3, 2, 1, 1},
			{3, 1, 1, 1},
			{2, 1, 1, 1},
			{1, 1, 1, 1},
			{0, 1, 1, 1},
	};
	
	public testCalculator() {
		setPreferredSize(new Dimension(WIDTH, HEIGHT));
	
		layout = new GridBagLayout();
		layout.columnWidths = new int[] {80, 80, 80, 80};
		layout.rowHeights = new int[] {80, 80, 80, 80, 80, 80};
		setLayout(layout);
		
		gbc = new GridBagConstraints();
		
		numberButtons = new JButton[10];
		for(int i = 0; i < numberButtons.length; i++) {
			numberButtons[i] = new JButton("" + i);
			numberButtons[i].addActionListener(this);
			
			gbc.gridx = numConstraints[i][0];
			gbc.gridy = numConstraints[i][1];
			gbc.gridwidth = numConstraints[i][2];
			gbc.gridheight = numConstraints[i][3];
			gbc.fill = GridBagConstraints.BOTH;
			gbc.insets = new Insets(2, 2, 2, 2);
			
			add(numberButtons[i], gbc);
		}
		
		opButtons = new JButton[8];
		
		opButtons[0] = DOT_BUTTON;
		opButtons[1] = EQUALS_BUTTON;
		opButtons[2] = ADD_BUTTON;
		opButtons[3] = SUB_BUTTON;
		opButtons[4] = MULTI_BUTTON;
		opButtons[5] = DIV_BUTTON;
		opButtons[6] = NEGATIVE_BUTTON;
		opButtons[7] = CLEAR_BUTTON;
		
		for(int i = 0; i < opButtons.length; i++) {
			gbc.gridx = opConstraints[i][0];
			gbc.gridy = opConstraints[i][1];
			gbc.gridwidth = opConstraints[i][2];
			gbc.gridheight = opConstraints[i][3];
			
			opButtons[i].addActionListener(this);
			
			add(opButtons[i], gbc);
		}
		
		field = new JTextField();
		field.setHorizontalAlignment(JTextField.TRAILING);
		field.setBorder(BorderFactory.createLineBorder(Color.BLACK));
		field.setEditable(false);
		field.setFont(new Font("Arial", Font.PLAIN, 24));
		gbc.gridx = 0;
		gbc.gridy = 0;
		gbc.gridwidth = 4;
		gbc.gridheight = 1;
	
		add(field, gbc);
		
		nums=new ArrayList<>();
		operations=new ArrayList<>();
	}
	
	public static void main(String[] args) {
		JFrame frame = new JFrame("Calculator");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setResizable(false);
		frame.setLayout(new BorderLayout());
		frame.add(new testCalculator(), BorderLayout.CENTER);
		frame.pack();
		frame.setLocationRelativeTo(null);
		frame.setVisible(true);
	}
	
	private String currentNumber="";

	public void actionPerformed(ActionEvent e) {
		for(int i = 0; i < numberButtons.length; i++) {
			if(e.getSource() == numberButtons[i]) {
				field.setText(field.getText() + i);
				currentNumber=currentNumber+i;
				return;
			}
		}
		
		
		
		if(e.getSource() == DOT_BUTTON && !field.getText().contains(".")) {
			field.setText(field.getText() + ".");
			currentNumber=currentNumber+".";
			return;
		}
		
		if(e.getSource() == NEGATIVE_BUTTON) {
			field.setText("" + (-1 * Double.parseDouble(field.getText())));
			if(currentNumber.startsWith("-"))
				currentNumber=currentNumber.substring(1);
			else
				currentNumber="-"+currentNumber;
			return;
		}
		
		if(e.getSource() == CLEAR_BUTTON) {
			clear();
			return;
		}
		
		nums.add(Double.parseDouble(currentNumber));
		currentNumber="";
		
		if(e.getSource() == ADD_BUTTON) {
			operations.add(ADD_OPERATION);
			field.setText(field.getText()+"+");
		}
		
		if(e.getSource() == SUB_BUTTON) {
			operations.add(SUBTRACT_OPERATION);
			field.setText(field.getText()+"-");
		}
		
		if(e.getSource() == MULTI_BUTTON) {
			operations.add(MULTIPLY_OPERATION);

			field.setText(field.getText()+"*");
		}
		
		if(e.getSource() == DIV_BUTTON) {
			operations.add(DIVIDE_OPERATION);
			field.setText(field.getText()+"/");
		}
		
		if(e.getSource() == EQUALS_BUTTON) {
			calculate();
			nums.clear();
			operations.clear();
			
			field.setText(currentNumber);
			
		}
		
		
		
	}

	private void calculate() {
		double result=0d;
		
		for(int i=0;i<nums.size();i++) {
			Double num=nums.get(i);
						
			
			if(i==0) {
				result+=nums.get(i);
				continue;
			}
			
			int op=operations.get(i-1);
			
						
			switch(op) {
			case ADD_OPERATION:
				result+=num;
				
				break;
			case SUBTRACT_OPERATION:
				result-=num;
				break;
			case MULTIPLY_OPERATION:
				result*=num;
				break;
			case DIVIDE_OPERATION:
				result/=num;
				break;
				
			}
		}
		
		
		
		currentNumber=String.valueOf(result);
		
	}

	private void clear() {
		field.setText("");
		currentNumber="";
		nums.clear();
		operations.clear();
	}


	
	
}