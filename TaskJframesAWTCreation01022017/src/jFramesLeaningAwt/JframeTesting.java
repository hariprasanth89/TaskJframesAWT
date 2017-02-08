package jFramesLeaningAwt;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import java.awt.CardLayout;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import javax.swing.JSlider;
import java.awt.TextArea;
import java.awt.Toolkit;
import javax.swing.JTextField;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;      
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;
import javax.swing.JSpinner;
import java.awt.Font;

public class JframeTesting extends JFrame {
	private JTextField textField;
	private JTextField textField_1;
	private JLabel lblA;
	private JTextField textFieldAns;
	private JButton btnMultiple;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JframeTesting frame = new JframeTesting();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public JframeTesting() {
		setIconImage(Toolkit.getDefaultToolkit().getImage("/Users/thirukarthi/Downloads/IMG_1712.jpg"));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		getContentPane().setLayout(null);
		
		textField = new JTextField();
		textField.setBounds(26, 20, 197, 50);
		getContentPane().add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(235, 20, 186, 50);
		getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		JButton btnSubmitBtm = new JButton("SumOf");
		btnSubmitBtm.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				int num,num1,ans;
				try {
					
					num = Integer.parseInt(textField.getText());
					num1 = Integer.parseInt(textField_1.getText());
					
					ans = num+num1;
					textFieldAns.setText(Integer.toString(ans));
					
				} catch (Exception e2) {
					// TODO: handle exception
						
					JOptionPane.showMessageDialog(null, "Please Enter The valid Number DTO,Bean,Entity.");
					
				}
				
			}
		});
		btnSubmitBtm.setBounds(51, 539, 117, 39);
		getContentPane().add(btnSubmitBtm);
		
		lblA = new JLabel("The Answer is :");
		lblA.setForeground(Color.RED);
		lblA.setToolTipText("Ans");
		lblA.setFont(new Font("Arial", lblA.getFont().getStyle(), lblA.getFont().getSize()));
		lblA.setBounds(41, 184, 107, 29);
		getContentPane().add(lblA);
		
		textFieldAns = new JTextField();
		textFieldAns.setBounds(222, 178, 156, 39);
		getContentPane().add(textFieldAns);
		textFieldAns.setColumns(10);
		
		btnMultiple = new JButton("Multiple");
		btnMultiple.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				int multiple1,multiple2,ansmul;
				
				try {
					multiple1  = Integer.parseInt(textField.getText());
					multiple2 = Integer.parseInt(textField_1.getText());
					
					ansmul = multiple1*multiple2;
					textFieldAns.setText(Integer.toString(ansmul));
					
					
				} catch (Exception e2) {
					// TODO: handle exception
					JOptionPane.showMessageDialog(null, "Please Enter The valid Number.");
				}
				
				
			}
		});
		btnMultiple.setBounds(245, 90, 117, 39);
		getContentPane().add(btnMultiple);
	}
}
