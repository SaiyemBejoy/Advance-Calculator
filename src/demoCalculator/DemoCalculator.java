package demoCalculator;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;


public class DemoCalculator {

	private JFrame frame;
	private JTextField resultField;
	
	private double firstNum;
	private double secondNum;
	private double result;
	private String operations;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					DemoCalculator window = new DemoCalculator();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public DemoCalculator() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 345, 534);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		resultField = new JTextField();
		resultField.setHorizontalAlignment(SwingConstants.RIGHT);
		resultField.setFont(new Font("Tahoma", Font.BOLD, 25));
		resultField.setBounds(10, 11, 309, 46);
		frame.getContentPane().add(resultField);
		resultField.setColumns(10);

		
		//==================ROW 1============================
			
		JButton btnBackspace = new JButton("\uF0E7");
		btnBackspace.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if(resultField.getText().length()>0) {
					String backspace =null;
					
					StringBuilder strB = new StringBuilder(resultField.getText());
					strB.deleteCharAt(resultField.getText().length()-1);
					backspace = strB.toString();
					resultField.setText(backspace);
				}
				
			}
		});
		btnBackspace.setFont(new Font("Wingdings", Font.BOLD, 30));
		btnBackspace.setBounds(10, 80, 70, 70);
		frame.getContentPane().add(btnBackspace);
		
		JButton btnClear = new JButton("C");
		btnClear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				resultField.setText(null);
				
			}
		});
		btnClear.setFont(new Font("Tahoma", Font.BOLD, 40));
		btnClear.setBounds(90, 80, 70, 70);
		frame.getContentPane().add(btnClear);
		
		JButton btnModulus = new JButton("%");
		btnModulus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				firstNum = Double.parseDouble(resultField.getText());
				resultField.setText("");
				operations = "%";
				
			}
		});
		btnModulus.setFont(new Font("Tahoma", Font.BOLD, 30));
		btnModulus.setBounds(170, 80, 70, 70);
		frame.getContentPane().add(btnModulus);
		
		JButton btnPlus = new JButton("+");
		btnPlus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				firstNum = Double.parseDouble(resultField.getText());
				resultField.setText("");
				operations = "+";
				
			}
		});
		btnPlus.setFont(new Font("Tahoma", Font.BOLD, 40));
		btnPlus.setBounds(250, 80, 70, 70);
		frame.getContentPane().add(btnPlus);
		
		
		//==================ROW 2============================
			
		JButton btn7 = new JButton("7");
		btn7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String EnterValue = resultField.getText() + btn7.getText();
				resultField.setText(EnterValue);
			}
		});
		btn7.setFont(new Font("Tahoma", Font.BOLD, 40));
		btn7.setBounds(10, 161, 70, 70);
		frame.getContentPane().add(btn7);
		
		JButton btn8 = new JButton("8");
		btn8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String EnterValue = resultField.getText() + btn8.getText();
				resultField.setText(EnterValue);
			}
		});
		btn8.setFont(new Font("Tahoma", Font.BOLD, 40));
		btn8.setBounds(90, 161, 70, 70);
		frame.getContentPane().add(btn8);
		
		JButton btn9 = new JButton("9");
		btn9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String EnterValue = resultField.getText() + btn9.getText();
				resultField.setText(EnterValue);
			}
		});
		btn9.setFont(new Font("Tahoma", Font.BOLD, 40));
		btn9.setBounds(170, 161, 70, 70);
		frame.getContentPane().add(btn9);
		
		JButton btnMinus = new JButton("-");
		btnMinus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				firstNum = Double.parseDouble(resultField.getText());
				resultField.setText("");
				operations = "-";
				
			}
		});
		btnMinus.setFont(new Font("Tahoma", Font.BOLD, 40));
		btnMinus.setBounds(250, 161, 70, 70);
		frame.getContentPane().add(btnMinus);

		
		//==================ROW 3============================
			
		JButton btn4 = new JButton("4");
		btn4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String EnterValue = resultField.getText() + btn4.getText();
				resultField.setText(EnterValue);
			}
		});
		btn4.setFont(new Font("Tahoma", Font.BOLD, 40));
		btn4.setBounds(9, 242, 70, 70);
		frame.getContentPane().add(btn4);
		
		JButton btn5 = new JButton("5");
		btn5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String EnterValue = resultField.getText() + btn5.getText();
				resultField.setText(EnterValue);
			}
		});
		btn5.setFont(new Font("Tahoma", Font.BOLD, 40));
		btn5.setBounds(89, 242, 70, 70);
		frame.getContentPane().add(btn5);
		
		JButton btn6 = new JButton("6");
		btn6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String EnterValue = resultField.getText() + btn6.getText();
				resultField.setText(EnterValue);
			}
		});
		btn6.setFont(new Font("Tahoma", Font.BOLD, 40));
		btn6.setBounds(169, 242, 70, 70);
		frame.getContentPane().add(btn6);
		
		JButton btnMultiply = new JButton("X");
		btnMultiply.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				firstNum = Double.parseDouble(resultField.getText());
				resultField.setText("");
				operations = "X";
				
			}
		});
		btnMultiply.setFont(new Font("Tahoma", Font.BOLD, 40));
		btnMultiply.setBounds(249, 242, 70, 70);
		frame.getContentPane().add(btnMultiply);

		
		//==================ROW 4============================
			
		JButton btn1 = new JButton("1");
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String EnterValue = resultField.getText() + btn1.getText();
				resultField.setText(EnterValue);
			}
		});
		btn1.setFont(new Font("Tahoma", Font.BOLD, 40));
		btn1.setBounds(10, 323, 70, 70);
		frame.getContentPane().add(btn1);
		
		JButton btn2 = new JButton("2");
		btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String EnterValue = resultField.getText() + btn2.getText();
				resultField.setText(EnterValue);
			}
		});
		btn2.setFont(new Font("Tahoma", Font.BOLD, 40));
		btn2.setBounds(90, 323, 70, 70);
		frame.getContentPane().add(btn2);
		
		JButton btn3 = new JButton("3");
		btn3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String EnterValue = resultField.getText() + btn3.getText();
				resultField.setText(EnterValue);
			}
		});
		btn3.setFont(new Font("Tahoma", Font.BOLD, 40));
		btn3.setBounds(170, 323, 70, 70);
		frame.getContentPane().add(btn3);
		
		JButton btnDivide = new JButton("/");
		btnDivide.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				firstNum = Double.parseDouble(resultField.getText());
				resultField.setText("");
				operations = "/";
				
			}
		});
		btnDivide.setFont(new Font("Tahoma", Font.BOLD, 40));
		btnDivide.setBounds(250, 323, 70, 70);
		frame.getContentPane().add(btnDivide);

		
		//==================ROW 5============================
			
		JButton btn0 = new JButton("0");
		btn0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String EnterValue = resultField.getText() + btn0.getText();
				resultField.setText(EnterValue);
			}
		});
		btn0.setFont(new Font("Tahoma", Font.BOLD, 40));
		btn0.setBounds(10, 404, 70, 70);
		frame.getContentPane().add(btn0);
		
		JButton btnDot = new JButton(".");
		btnDot.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String EnterValue = resultField.getText() + btnDot.getText();
				resultField.setText(EnterValue);
			}
		});
		btnDot.setFont(new Font("Tahoma", Font.BOLD, 40));
		btnDot.setBounds(90, 404, 70, 70);
		frame.getContentPane().add(btnDot);
		
		JButton btnPM = new JButton("\u00B1");
		btnPM.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				double plusminus = 	Double.parseDouble(String.valueOf(resultField.getText()));
				plusminus = plusminus * (-1);
				resultField.setText(String.valueOf(plusminus));
				
			}
		});
		btnPM.setFont(new Font("Tahoma", Font.BOLD, 40));
		btnPM.setBounds(170, 404, 70, 70);
		frame.getContentPane().add(btnPM);
		
		JButton btnEqual = new JButton("=");
		btnEqual.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				String answer;
				secondNum = Double.parseDouble(resultField.getText());
				
				if(operations=="+") {
					result = firstNum + secondNum;
					answer = String.format("%.2f", result);
					resultField.setText(answer);
				}else if(operations=="-") {
					result = firstNum - secondNum;
					answer = String.format("%.2f", result);
					resultField.setText(answer);
				}else if(operations=="X") {
					result = firstNum * secondNum;
					answer = String.format("%.2f", result);
					resultField.setText(answer);
				}else if(operations=="/") {
					result = firstNum / secondNum;
					answer = String.format("%.2f", result);
					resultField.setText(answer);
				}else if(operations=="%") {
					result = firstNum % secondNum;
					answer = String.format("%.2f", result);
					resultField.setText(answer);
				}
				
			}
		});
		btnEqual.setFont(new Font("Tahoma", Font.BOLD, 40));
		btnEqual.setBounds(250, 404, 70, 70);
		frame.getContentPane().add(btnEqual);
	}
}
