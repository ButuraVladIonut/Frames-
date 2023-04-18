package proiect;

import javax.swing.*;
import javax.swing.border.Border;
import javax.swing.border.TitledBorder;
import javax.swing.event.*;


import java.awt.*;
import java.awt.event.*;

public class TestFrameuri {
	JDesktopPane desk;
	JInternalFrame frame1, frame2, frame3, frame4, frame5, frame6, frame7, frame8, frame9, frame10, frame11;
	JInternalFrame frame12, frame13, frame14, frame15, frame16, frame17, frame18, frame19, frame20, frame21;
	JInternalFrame frame22, frame23, frame24, frame25, frame26, frame27, frame28, frame29, frame30;
	JFrame frame;

	public static void main(String[] args) {
		TestFrameuri d = new TestFrameuri();
	}

	public TestFrameuri() {
		frame = new JFrame("PROIECT - Butura");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		desk = new JDesktopPane();
		
		//--------------------------------------------------------------------------------------------------
		// -------------------------------------FRAME 1 - EXERCITIUL 1------------------------------------
		frame1 = new JInternalFrame("Ex1Lab1", true, true, true, true);
		
		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[]{0, 0, 0, 0, 0, 0, 0, 0};
		gridBagLayout.rowHeights = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0};
		gridBagLayout.columnWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 1.0, Double.MIN_VALUE};
		gridBagLayout.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		frame1.getContentPane().setLayout(gridBagLayout);
		
		JLabel lblNewLabel = new JLabel("Ziua saptamanii(cifre)");
		GridBagConstraints gbc_lblNewLabel = new GridBagConstraints();
		gbc_lblNewLabel.anchor = GridBagConstraints.EAST;
		gbc_lblNewLabel.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel.gridx = 1;
		gbc_lblNewLabel.gridy = 1;
		frame1.getContentPane().add(lblNewLabel, gbc_lblNewLabel);
		
		JTextField textField = new JTextField();
		GridBagConstraints gbc_textField = new GridBagConstraints();
		gbc_textField.insets = new Insets(0, 0, 5, 0);
		gbc_textField.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField.gridx = 6;
		gbc_textField.gridy = 1;
		frame1.getContentPane().add(textField, gbc_textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("Ziua saptamanii(litere)");
		GridBagConstraints gbc_lblNewLabel_1 = new GridBagConstraints();
		gbc_lblNewLabel_1.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_1.gridx = 1;
		gbc_lblNewLabel_1.gridy = 3;
		frame1.getContentPane().add(lblNewLabel_1, gbc_lblNewLabel_1);
		
		JTextField textField_1 = new JTextField();
		textField_1.setEditable(false);
		GridBagConstraints gbc_textField_1 = new GridBagConstraints();
		gbc_textField_1.insets = new Insets(0, 0, 5, 0);
		gbc_textField_1.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_1.gridx = 6;
		gbc_textField_1.gridy = 3;
		frame1.getContentPane().add(textField_1, gbc_textField_1);
		textField_1.setColumns(10);
		
		JButton btnNewButton = new JButton("Transformare");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int nrZi; 

		        nrZi=Integer.parseInt(textField.getText());  

		        switch(nrZi) { 

		            case 1: textField_1.setText("Luni"); break; 

		            case 2: textField_1.setText("Marti"); break; 

		            case 3: textField_1.setText("Miercuri"); break; 

		            case 4: textField_1.setText("Joi"); break; 

		            case 5: textField_1.setText("Vineri"); break; 

		            case 6: textField_1.setText("Sambata"); break; 

		            case 7: textField_1.setText("Duminica"); break; 

		            default: textField_1.setText("Nu ati dat o zi a saptamanii valida! (1-7)"); break; 

		        } 
			}
		});
		
		GridBagConstraints gbc_btnNewButton = new GridBagConstraints();
		gbc_btnNewButton.insets = new Insets(0, 0, 5, 5);
		gbc_btnNewButton.gridx = 2;
		gbc_btnNewButton.gridy = 5;
		frame1.getContentPane().add(btnNewButton, gbc_btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Clear");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText("");
				textField_1.setText("");
			}
		});
		GridBagConstraints gbc_btnNewButton_1 = new GridBagConstraints();
		gbc_btnNewButton_1.insets = new Insets(0, 0, 5, 0);
		gbc_btnNewButton_1.gridx = 6;
		gbc_btnNewButton_1.gridy = 5;
		frame1.getContentPane().add(btnNewButton_1, gbc_btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("Exit");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0); 
			}
		});
		GridBagConstraints gbc_btnNewButton_2 = new GridBagConstraints();
		gbc_btnNewButton_2.gridx = 6;
		gbc_btnNewButton_2.gridy = 7;
		frame1.getContentPane().add(btnNewButton_2, gbc_btnNewButton_2);
		frame1.setBackground(Color.BLACK);
		frame1.setBounds(20, 200, 400, 400);
		frame1.setVisible(true);
		
		//--------------------------------------------------------------------------------------------------
		// -------------------------------------LABORATORUL 1 - EXERCITIUL 1------------------------------------
		
		
		//--------------------------------------------------------------------------------------------------
		// -------------------------------------LABORATORUL 1 - EXERCITIUL 2------------------------------------
		
		frame2 = new JInternalFrame("Exercitiul 2", true, true, true, true);
		
		SpringLayout springLayout = new SpringLayout();
		frame2.getContentPane().setLayout(springLayout);
		
		JPanel panelF2 = new JPanel();
		springLayout.putConstraint(SpringLayout.NORTH, panelF2, 48, SpringLayout.NORTH, frame2.getContentPane());
		springLayout.putConstraint(SpringLayout.WEST, panelF2, 49, SpringLayout.WEST, frame2.getContentPane());
		springLayout.putConstraint(SpringLayout.EAST, panelF2, 373, SpringLayout.WEST, frame2.getContentPane());
		String title = "A titled border";
		Border border = BorderFactory.createTitledBorder(title);
		panelF2.setBorder(border);
		frame2.getContentPane().add(panelF2);
		SpringLayout sl_panel = new SpringLayout();
		panelF2.setLayout(sl_panel);
		
		JLabel lblNewLabelF2 = new JLabel("Nr 1");
		sl_panel.putConstraint(SpringLayout.NORTH, lblNewLabelF2, 10, SpringLayout.NORTH, panelF2);
		sl_panel.putConstraint(SpringLayout.WEST, lblNewLabelF2, 10, SpringLayout.WEST, panelF2);
		panelF2.add(lblNewLabelF2);
		
		JLabel lblNewLabel_1F2 = new JLabel("Nr 2");
		sl_panel.putConstraint(SpringLayout.NORTH, lblNewLabel_1F2, 16, SpringLayout.SOUTH, lblNewLabelF2);
		sl_panel.putConstraint(SpringLayout.EAST, lblNewLabel_1F2, 0, SpringLayout.EAST, lblNewLabelF2);
		panelF2.add(lblNewLabel_1F2);
		
		JLabel lblNewLabel_2F2 = new JLabel("Rezultat");
		sl_panel.putConstraint(SpringLayout.NORTH, lblNewLabel_2F2, 6, SpringLayout.SOUTH, lblNewLabel_1F2);
		sl_panel.putConstraint(SpringLayout.WEST, lblNewLabel_2F2, 0, SpringLayout.WEST, lblNewLabelF2);
		panelF2.add(lblNewLabel_2F2);
		
		JTextField textFieldF2 = new JTextField();
		sl_panel.putConstraint(SpringLayout.NORTH, textFieldF2, 10, SpringLayout.NORTH, panelF2);
		sl_panel.putConstraint(SpringLayout.EAST, textFieldF2, -76, SpringLayout.EAST, panelF2);
		panelF2.add(textFieldF2);
		textFieldF2.setColumns(10);
		
		JTextField textField_1F2 = new JTextField();
		sl_panel.putConstraint(SpringLayout.NORTH, textField_1F2, 0, SpringLayout.NORTH, lblNewLabel_1F2);
		sl_panel.putConstraint(SpringLayout.WEST, textField_1F2, 0, SpringLayout.WEST, textFieldF2);
		panelF2.add(textField_1F2);
		textField_1F2.setColumns(10);
		
		JTextField textField_2F2 = new JTextField();
		textField_2F2.setEditable(false);
		sl_panel.putConstraint(SpringLayout.NORTH, textField_2F2, 10, SpringLayout.SOUTH, textField_1F2);
		sl_panel.putConstraint(SpringLayout.WEST, textField_2F2, 0, SpringLayout.WEST, textFieldF2);
		panelF2.add(textField_2F2);
		textField_2F2.setColumns(10);
		
		JButton btnNewButtonF2 = new JButton("+");
		springLayout.putConstraint(SpringLayout.NORTH, btnNewButtonF2, 168, SpringLayout.NORTH, frame2.getContentPane());
		springLayout.putConstraint(SpringLayout.SOUTH, panelF2, -6, SpringLayout.NORTH, btnNewButtonF2);
		btnNewButtonF2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				 float nr1,nr2,rezultat; 

			        nr1=Float.parseFloat(textFieldF2.getText()); 

			        nr2=Float.parseFloat(textField_1F2.getText()); 

			        rezultat=nr1+nr2; 

			        textField_2F2.setText(String.valueOf(rezultat)); 
			}
		});
		springLayout.putConstraint(SpringLayout.WEST, btnNewButtonF2, 52, SpringLayout.WEST, frame2.getContentPane());
		frame2.getContentPane().add(btnNewButtonF2);
		
		JButton btnNewButton_1F2 = new JButton("-");
		springLayout.putConstraint(SpringLayout.NORTH, btnNewButton_1F2, 168, SpringLayout.NORTH, frame2.getContentPane());
		btnNewButton_1F2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				float nr1,nr2,rezultat; 

		        nr1=Float.parseFloat(textFieldF2.getText()); 

		        nr2=Float.parseFloat(textField_1F2.getText()); 

		        rezultat=nr1-nr2; 

		        textField_2F2.setText(String.valueOf(rezultat));
			}
		});
		springLayout.putConstraint(SpringLayout.WEST, btnNewButton_1F2, 123, SpringLayout.WEST, frame2.getContentPane());
		springLayout.putConstraint(SpringLayout.EAST, btnNewButtonF2, -26, SpringLayout.WEST, btnNewButton_1F2);
		frame2.getContentPane().add(btnNewButton_1F2);
		
		JButton btnNewButton_2F2 = new JButton("*");
		springLayout.putConstraint(SpringLayout.NORTH, btnNewButton_2F2, 168, SpringLayout.NORTH, frame2.getContentPane());
		btnNewButton_2F2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				float nr1,nr2,rezultat; 

		        nr1=Float.parseFloat(textFieldF2.getText()); 

		        nr2=Float.parseFloat(textField_1F2.getText()); 

		        rezultat=nr1*nr2; 

		        textField_2F2.setText(String.valueOf(rezultat));
			}
		});
		springLayout.putConstraint(SpringLayout.WEST, btnNewButton_2F2, 187, SpringLayout.WEST, frame2.getContentPane());
		springLayout.putConstraint(SpringLayout.EAST, btnNewButton_2F2, -204, SpringLayout.EAST, frame2.getContentPane());
		springLayout.putConstraint(SpringLayout.EAST, btnNewButton_1F2, -19, SpringLayout.WEST, btnNewButton_2F2);
		springLayout.putConstraint(SpringLayout.NORTH, btnNewButton_2F2, 0, SpringLayout.NORTH, btnNewButtonF2);
		frame2.getContentPane().add(btnNewButton_2F2);
		
		JButton btnNewButton_3F2 = new JButton("/");
		springLayout.putConstraint(SpringLayout.NORTH, btnNewButton_3F2, 6, SpringLayout.SOUTH, panelF2);
		btnNewButton_3F2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				float nr1,nr2,rezultat; 

		        nr1=Float.parseFloat(textFieldF2.getText()); 

		        nr2=Float.parseFloat(textField_1F2.getText()); 

		        rezultat=nr1/nr2; 

		        textField_2F2.setText(String.valueOf(rezultat));
			}
		});
		springLayout.putConstraint(SpringLayout.WEST, btnNewButton_3F2, 17, SpringLayout.EAST, btnNewButton_2F2);
		springLayout.putConstraint(SpringLayout.EAST, btnNewButton_3F2, -142, SpringLayout.EAST, frame2.getContentPane());
		frame2.getContentPane().add(btnNewButton_3F2);
		
		JButton btnNewButton_4F2 = new JButton("^");
		springLayout.putConstraint(SpringLayout.NORTH, btnNewButton_4F2, 6, SpringLayout.SOUTH, panelF2);
		springLayout.putConstraint(SpringLayout.WEST, btnNewButton_4F2, 24, SpringLayout.EAST, btnNewButton_3F2);
		springLayout.putConstraint(SpringLayout.EAST, btnNewButton_4F2, -73, SpringLayout.EAST, frame2.getContentPane());
		btnNewButton_4F2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				 float nr1,nr2,rezultat; 

			        nr1=Float.parseFloat(textFieldF2.getText()); 

			        nr2=Float.parseFloat(textField_1F2.getText()); 

			        rezultat=1; 

//			        for(int i=1;i<=nr2;i++) 
//
//			        rezultat=rezultat*nr1; 
			        rezultat = (float) Math.pow(nr1, nr2);

			        textField_2F2.setText(String.valueOf(rezultat)); 
			}
		});
		frame2.getContentPane().add(btnNewButton_4F2);
		
		JButton btnNewButton_5F2 = new JButton("Clear");
		btnNewButton_5F2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textFieldF2.setText("");
				textField_1F2.setText("");
				textField_2F2.setText("");
			}
		});
		springLayout.putConstraint(SpringLayout.WEST, btnNewButton_5F2, 50, SpringLayout.WEST, frame2.getContentPane());
		springLayout.putConstraint(SpringLayout.SOUTH, btnNewButton_5F2, -10, SpringLayout.SOUTH, frame2.getContentPane());
		frame2.getContentPane().add(btnNewButton_5F2);
		frame2.setBackground(Color.BLACK);
		frame2.setBounds(20, 140, 400, 400);
		frame2.setVisible(true);
		
		//--------------------------------------------------------------------------------------------------
		// -------------------------------------LABORATORUL 1 - EXERCITIUL 2------------------------------------
		
		
		//--------------------------------------------------------------------------------------------------
		// -------------------------------------LABORATORUL 1 - EXERCITIUL 3------------------------------------
		
		frame3 = new JInternalFrame("Exercitiul 3", true, true, true, true);
		
		GridBagLayout gridBagLayout2F3 = new GridBagLayout();
		gridBagLayout2F3.columnWidths = new int[]{0, 0, 0, 0, 0, 0, 0};
		gridBagLayout2F3.rowHeights = new int[]{0, 0, 0, 0, 0};
		gridBagLayout2F3.columnWeights = new double[]{0.0, 1.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		gridBagLayout2F3.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		frame3.getContentPane().setLayout(gridBagLayout2F3);
		
		JTextField textFieldF3 = new JTextField();
		GridBagConstraints gbc_textFieldF3 = new GridBagConstraints();
		gbc_textFieldF3.insets = new Insets(0, 0, 5, 5);
		gbc_textFieldF3.fill = GridBagConstraints.HORIZONTAL;
		gbc_textFieldF3.gridx = 1;
		gbc_textFieldF3.gridy = 1;
		frame3.getContentPane().add(textFieldF3, gbc_textFieldF3);
		textFieldF3.setColumns(10);
		
		JLabel lblNewLabelF3 = new JLabel("Celsius");
		GridBagConstraints gbc_lblNewLabelF3 = new GridBagConstraints();
		gbc_lblNewLabelF3.insets = new Insets(0, 0, 5, 0);
		gbc_lblNewLabelF3.gridx = 5;
		gbc_lblNewLabelF3.gridy = 1;
		frame3.getContentPane().add(lblNewLabelF3, gbc_lblNewLabelF3);
		JLabel lblNewLabel_1F3 = new JLabel("Fahrenheit");
		
		JButton btnNewButtonF3 = new JButton("Convert");
		btnNewButtonF3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				 int temp;  

		            temp=(int)((Double.parseDouble(textFieldF3.getText()))*1.8+32); 
		            
		            lblNewLabel_1F3.setText(temp + "Fahrenheit"); 
			}
		}); 
		GridBagConstraints gbc_btnNewButtonF3 = new GridBagConstraints();
		gbc_btnNewButtonF3.insets = new Insets(0, 0, 0, 5);
		gbc_btnNewButtonF3.gridx = 1;
		gbc_btnNewButtonF3.gridy = 3;
		frame3.getContentPane().add(btnNewButtonF3, gbc_btnNewButtonF3);
		
		
		GridBagConstraints gbc_lblNewLabel_1F3 = new GridBagConstraints();
		gbc_lblNewLabel_1F3.gridx = 5;
		gbc_lblNewLabel_1F3.gridy = 3;
		frame3.getContentPane().add(lblNewLabel_1F3, gbc_lblNewLabel_1F3);
		frame3.setBackground(Color.BLACK);
		frame3.setBounds(20, 80, 400, 400);
		frame3.setVisible(true);
		
		
		//--------------------------------------------------------------------------------------------------
		// -------------------------------------LABORATORUL 1 - EXERCITIUL 3------------------------------------
		
		
		
		
		//--------------------------------------------------------------------------------------------------
		// -------------------------------------LABORATORUL 3 - EXERCITIUL 1------------------------------------
		
		frame5 = new JInternalFrame("Lab3Ex1", true, true, true, true);
		
		frame5.setResizable(false);
		frame5.getContentPane().add(new JLabel("Utilizare swing!"));
		frame5.setBackground(Color.BLACK);
		frame5.setBounds(20, 20, 400, 400);
		frame5.setVisible(true);
		
		//--------------------------------------------------------------------------------------------------
		// -------------------------------------LABORATORUL 3 - EXERCITIUL 1------------------------------------
		
		//--------------------------------------------------------------------------------------------------
		// -------------------------------------LABORATORUL 3 - EXERCITIUL 2------------------------------------
		
		frame6 = new JInternalFrame("Lab3Ex2", true, true, true, true);
		
		JComponent comp = new JLabel("Test label");
		JComponent comp2 = new JLabel("Second label");
		
		comp.setBorder(new TitledBorder("Titlu border"));
		comp2.setBorder(new TitledBorder("Titlu border 2"));
		frame6.getContentPane().add(comp);
		frame6.getContentPane().add(comp2);
		
		frame6.setBackground(Color.BLACK);
		frame6.setBounds(20, 20, 400, 400);
		frame6.setVisible(true);
		
		//--------------------------------------------------------------------------------------------------
		// -------------------------------------LABORATORUL 3 - EXERCITIUL 2------------------------------------
		
		//--------------------------------------------------------------------------------------------------
		// -------------------------------------LABORATORUL 3 - EXERCITIUL 3------------------------------------
		
		frame7 = new JInternalFrame("Lab3Ex3", true, true, true, true);
		
		Butoane panouButoane = new Butoane();
		CheckBoxuri panouCheckBoxuri = new CheckBoxuri();
		ButoaneRadio panouButoaneRadio = new ButoaneRadio();
		JPanel panou = new JPanel();
		panou.setLayout(new GridLayout(0, 1));
//aduagare obiecte la panou
		panou.add(panouButoane);
		panou.add(panouCheckBoxuri);
		panou.add(panouButoaneRadio);
//functii
		frame7.getContentPane().add(panou);
		frame7.setBackground(Color.BLACK);
		frame7.setBounds(20, 20, 400, 400);
		frame7.setVisible(true);
		
		//--------------------------------------------------------------------------------------------------
		// -------------------------------------LABORATORUL 3 - EXERCITIUL 3------------------------------------
		
		//--------------------------------------------------------------------------------------------------
		// -------------------------------------LABORATORUL 3 - EXERCITIUL 4------------------------------------
		
		frame8 = new JInternalFrame("Lab3Ex4", true, true, true, true);
		
		JButton b1 = new JButton("1");
		JButton b2 = new JButton("2");
		JButton b3 = new JButton("3");
		JButton b4 = new JButton("4");
		JButton b5 = new JButton("5");
		JButton b6 = new JButton("6");
		Container cp = frame8.getContentPane();
		cp.setLayout(new GridLayout());
		cp.add(b1);
		cp.add(b2);
		cp.add(b3);
		cp.add(b4);
		cp.add(b5);
		cp.add(b6);
		
		frame8.setBackground(Color.BLACK);
		frame8.setBounds(20, 20, 400, 400);
		frame8.setVisible(true);
		
		//--------------------------------------------------------------------------------------------------
		// -------------------------------------LABORATORUL 3 - EXERCITIUL 4------------------------------------
		
		//--------------------------------------------------------------------------------------------------
		// -------------------------------------LABORATORUL 3 - EXERCITIUL 5------------------------------------
		
		frame9 = new JInternalFrame("Lab3Ex5", true, true, true, true);
		
		Container cp2 = frame9.getContentPane();
		cp2.setLayout(new BorderLayout());
		cp2.add(new JButton("Nord"), BorderLayout.NORTH);
		cp2.add(new JButton("Sud"), BorderLayout.SOUTH);
		cp2.add(new JButton("Est"), BorderLayout.EAST);
		cp2.add(new JButton("Vest"), BorderLayout.WEST);
		cp2.add(new JButton("Centru"), BorderLayout.CENTER);
		
		frame9.setBackground(Color.BLACK);
		frame9.setBounds(20, 20, 400, 400);
		frame9.setVisible(true);
		
		//--------------------------------------------------------------------------------------------------
		// -------------------------------------LABORATORUL 3 - EXERCITIUL 5------------------------------------
		
		//--------------------------------------------------------------------------------------------------
		// -------------------------------------LABORATORUL 3 - EXERCITIUL 6------------------------------------
		
		frame10 = new JInternalFrame("Lab3Ex6", true, true, true, true);
		
		Container cp3 = frame10.getContentPane();
		JButton btn1 = new JButton("1");
		JButton btn2 = new JButton("2");
		JButton btn3 = new JButton("3");
		JButton btn4 = new JButton("4");
		JButton btn5 = new JButton("5");
		JButton btn6 = new JButton("6");
		JButton btn7 = new JButton("7");
		JButton btn8 = new JButton("8");
		JButton btn9 = new JButton("9");
		btn1.setBackground(Color.blue);
		btn2.setBackground(Color.green);
		btn3.setBackground(Color.red);
		btn4.setBackground(Color.black);
		btn5.setBackground(Color.yellow);
		btn6.setBackground(Color.orange);
		btn7.setBackground(Color.magenta);
		btn8.setBackground(Color.pink);
		btn9.setBackground(Color.cyan);
		btn1.setFocusable(false);
		btn2.setFocusable(false);
		btn3.setFocusable(false);
		btn4.setFocusable(false);
		btn5.setFocusable(false);
		btn6.setFocusable(false);
		btn7.setFocusable(false);
		btn8.setFocusable(false);
		btn9.setFocusable(false);
		cp3.setLayout(new GridLayout(3, 4));
		cp3.add(btn1);
		cp3.add(btn2);
		cp3.add(btn3);
		cp3.add(btn4);
		cp3.add(btn5);
		cp3.add(btn6);
		cp3.add(btn7);
		cp3.add(btn8);
		cp3.add(btn9);
		
		frame10.setBackground(Color.BLACK);
		frame10.setBounds(20, 20, 400, 400);
		frame10.setVisible(true);
		
		//--------------------------------------------------------------------------------------------------
		// -------------------------------------LABORATORUL 3 - EXERCITIUL 6------------------------------------
		
		//--------------------------------------------------------------------------------------------------
		// -------------------------------------LABORATORUL 3 - EXERCITIUL 7------------------------------------
		
		frame11 = new JInternalFrame("Lab3Ex7", true, true, true, true);
		
		Container cp4 = frame11.getContentPane();
		cp4.setLayout(new GridLayout(3, 2));
		cp4.add(new JButton("1"));
		cp4.add(new JButton("2"));
		cp4.add(new JButton("3"));
		cp4.add(new JButton("4"));
		cp4.add(new JButton("5"));
		cp4.add(new JButton("6"));
		
		cp4.add(new JButton("7"));
		cp4.add(new JButton("8"));
		if (!cp4.isValid())
			cp4.validate();
		
		frame11.setBackground(Color.BLACK);
		frame11.setBounds(20, 20, 400, 400);
		frame11.setVisible(true);
		
		//--------------------------------------------------------------------------------------------------
		// -------------------------------------LABORATORUL 3 - EXERCITIUL 7------------------------------------
		
		//--------------------------------------------------------------------------------------------------
		// -------------------------------------LABORATORUL 3 - EXERCITIUL 8------------------------------------
				
		frame12 = new JInternalFrame("Lab3Ex8", true, true, true, true);
		
		Butoane1 panouButoane1 = new Butoane1();
		CheckBoxuri1 panouCheckBoxuri1 = new CheckBoxuri1();
		ButoaneRadio1 panouButoaneRadio1 = new ButoaneRadio1();
		JPanel panou1 = new JPanel();
		panou1.setLayout(new GridLayout(0, 1));
//adaugare obiecte la panou
		panou1.add(panouButoane1);
		panou1.add(panouCheckBoxuri1);
		panou1.add(panouButoaneRadio1);
		
//functii
		frame12.getContentPane().add(panou1);
		frame12.pack();
// app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame12.show();
		frame12.setBackground(Color.BLACK);
		frame12.setBounds(20, 20, 400, 400);
		frame12.setVisible(true);
		
		//--------------------------------------------------------------------------------------------------
		// -------------------------------------LABORATORUL 3 - EXERCITIUL 8------------------------------------
		
		
		//--------------------------------------------------------------------------------------------------
		// -------------------------------------LABORATORUL 4 - EXERCITIUL 1------------------------------------
						
		frame13 = new JInternalFrame("Lab4Ex1", true, true, true, true);
	
		JPanel panelF5;
		JButton btnOKF5;
		JButton btnCancelF5;
		JLabel labelF5;
		GridLayout gLayoutF5; 
		JTextField textFieldF5;
		
		gLayoutF5 = new GridLayout(2,2);
		panelF5 = new JPanel();
		btnOKF5 = new JButton("Apasa OK");
		btnCancelF5 = new JButton("Apasa Cancel");
		textFieldF5 = new JTextField(20);
		labelF5 = new JLabel("Click buton cu eticheta ...");
		
		panelF5.setLayout(gLayoutF5);
		
		//frame13.setTitle("Exemplu cu doua actiuni pe butoane");
		//this.setSize(420, 420);
		//frame13.setLocation(200,200);
		panelF5.add(btnOKF5);
		panelF5.add(btnCancelF5);
		panelF5.add(labelF5);
		panelF5.add(textFieldF5);
		
		frame13.add(panelF5);
		frame13.setBackground(Color.BLACK);
		frame13.setBounds(20, 20, 400, 400);
		frame13.setVisible(true);
				
		//--------------------------------------------------------------------------------------------------
		// -------------------------------------LABORATORUL 4 - EXERCITIUL 1------------------------------------
				
		//--------------------------------------------------------------------------------------------------
		// -------------------------------------LABORATORUL 4 - EXERCITIUL 2------------------------------------
								
		frame14 = new JInternalFrame("Lab4Ex2", true, true, true, true);

		JMenuBar meniu = new JMenuBar();
		JMenu fileMenu = new JMenu("File");
		JMenu editMenu = new JMenu("Edit");
		JMenu quitMenu = new JMenu("Quit");
		// Meniul File: Open, Save, Close
		JMenuItem openItem = new JMenuItem("Open");
		JMenuItem saveItem = new JMenuItem("Save");
		JMenuItem closeItem = new JMenuItem("Close");
		//Meniul Edit: Cut, Copy, Paste, Find (Find, Replace)
		JMenuItem cutItem = new JMenuItem("Cut");
		JMenuItem copyItem = new JMenuItem("Copy");
		JMenuItem pasteItem = new JMenuItem("Paste");
		JSeparator separator1 = new JSeparator();
		JMenu findMenu= new JMenu("Find");
		JMenuItem findItem = new JMenuItem("Find");
		JMenuItem replaceItem = new JMenuItem("Replace");
		//Meniul Quit
		JMenuItem exitItem = new JMenuItem("Exit");
		JMenuItem aboutItem = new JMenuItem("About");
		fileMenu.add(openItem);
		fileMenu.add(saveItem);
		fileMenu.add(closeItem);
		editMenu.add(cutItem);
		editMenu.add(copyItem);
		editMenu.add(pasteItem);
		editMenu.add(separator1);
		findMenu.add(findItem);
		findMenu.add(replaceItem);
		editMenu.add(findMenu);
		editMenu.add(new JCheckBox("Alegeti optiunea"));
		quitMenu.add(exitItem);
		quitMenu.add(aboutItem);
		meniu.add(fileMenu);
		meniu.add(editMenu);
		meniu.add(quitMenu);
		
		frame14.setJMenuBar(meniu);

		frame14.setBackground(Color.BLACK);
		frame14.setBounds(20, 20, 400, 400);
		frame14.setVisible(true);
				
		//--------------------------------------------------------------------------------------------------
		// -------------------------------------LABORATORUL 4 - EXERCITIUL 2------------------------------------
		
		//--------------------------------------------------------------------------------------------------
		// -------------------------------------LABORATORUL 4 - EXERCITIUL 3------------------------------------
								
		frame15 = new JInternalFrame("Lab4Ex3", true, true, true, true);

		JMenuBar meniu2= new JMenuBar();
		JMenu fileMenu2 = new JMenu("File");
		JMenu editMenu2 = new JMenu("Edit");
		JMenu quitMenu2 = new JMenu("Quit");
		// Meniul File: Open, Save, Close
		JMenuItem openItem2 = new JMenuItem("Open");
		JMenuItem saveItem2 = new JMenuItem("Save");
		JMenuItem closeItem2 = new JMenuItem("Close");
		//Meniul Edit: Cut, Copy, Paste, Find (Find, Replace)
		JMenuItem cutItem2 = new JMenuItem("Cut");
		JMenuItem copyItem2 = new JMenuItem("Copy");
		JMenuItem pasteItem2 = new JMenuItem("Paste");
		JSeparator separator2 = new JSeparator();
		JMenu findMenu2 = new JMenu("Find");
		JMenuItem findItem2 = new JMenuItem("Find");
		JMenuItem replaceItem2 = new JMenuItem("Replace");
		//Meniul Quit
		JMenuItem exitItem2 = new JMenuItem("Exit");
		JMenuItem aboutItem2 = new JMenuItem("About");
		fileMenu2.add(openItem2);
		fileMenu2.add(saveItem2);
		fileMenu2.add(closeItem2);
		editMenu2.add(cutItem2);
		editMenu2.add(copyItem2);
		editMenu2.add(pasteItem2);
		editMenu2.add(separator2);
		findMenu2.add(findItem2);
		findMenu2.add(replaceItem2);
		editMenu2.add(findMenu2);
		editMenu2.add(new JCheckBox("Bifa"));
		quitMenu2.add(exitItem2);
		quitMenu2.add(aboutItem2);
		meniu2.add(fileMenu2);
		meniu2.add(editMenu2);
	    meniu2.add(quitMenu2);
	    
	    frame15.setJMenuBar(meniu2);

	    frame15.setBackground(Color.BLACK);
		frame15.setBounds(20, 20, 400, 400);
		frame15.setVisible(true);
				
		//--------------------------------------------------------------------------------------------------
		// -------------------------------------LABORATORUL 4 - EXERCITIUL 3------------------------------------
		
		//--------------------------------------------------------------------------------------------------
		// -------------------------------------LABORATORUL 4 - EXERCITIUL 4------------------------------------
								
		frame16 = new JInternalFrame("Lab4Ex4", true, true, true, true);

		JPanel panelF6 = new JPanel();
		
		JRadioButton r1_Yes = new JRadioButton("Yes  ?",true);
		JRadioButton r1_No = new JRadioButton("No  ?",false);
		ButtonGroup radioGroup1 = new ButtonGroup();
		ButtonGroup radioGroup2 = new ButtonGroup();
		panelF6.setLayout(null);
		panelF6.add(r1_Yes);
		panelF6.add(r1_No);
		radioGroup1.add(r1_Yes);
		radioGroup1.add(r1_No);
		r1_Yes.setBounds(10,10,60,60);
		r1_No.setBounds(80,30,60,20);
		JRadioButton buton1 = new JRadioButton("Buton1",true);
		JRadioButton buton2 = new JRadioButton("Buton2",false);
		panelF6.add(buton1);
		panelF6.add(buton2);
		radioGroup2.add(buton1);
		radioGroup2.add(buton2);
		buton1.setBounds(10,90,70,70);
		buton2.setBounds(80,90,70,70);
		
		frame16.add(panelF6);

		frame16.setBackground(Color.BLACK);
		frame16.setBounds(20, 20, 400, 400);
		frame16.setVisible(true);
				
		//--------------------------------------------------------------------------------------------------
		// -------------------------------------LABORATORUL 4 - EXERCITIUL 4------------------------------------
		
		
		//--------------------------------------------------------------------------------------------------
		// -------------------------------------LABORATORUL 4 - EXERCITIUL 5------------------------------------
								
		frame17 = new JInternalFrame("Lab4Ex5", true, true, true, true);

		JPanel panel3 = new JPanel();
		JRadioButton r1_Yes1 = new JRadioButton("Yes?",true);
		JRadioButton r1_No1 = new JRadioButton("No?",false);
		JRadioButton r2_Yes1 = new JRadioButton("Yes?",false);
		JRadioButton r2_No1 = new JRadioButton("No?",true);
		ButtonGroup radioGroup1a = new ButtonGroup();
		ButtonGroup radioGroup2a = new ButtonGroup();
	    panel3.setLayout(null);
	    panel3.add(r1_Yes1);
	    panel3.add(r1_No1);
	    panel3.add(r2_Yes1);
	    panel3.add(r2_No1);
		radioGroup1.add(r1_Yes1);
		radioGroup1.add(r1_No1);
		radioGroup2.add(r2_Yes1);
		radioGroup2.add(r2_No1);
		r1_Yes1.setBounds(10,10,60,60);
		r1_No1.setBounds(80,30,50,20);
		r2_Yes1.setBounds(10,50,60,60);
		r2_No1.setBounds(80,70,50,20);
		JRadioButton butona = new JRadioButton("Buton1",true);
		JRadioButton butonb = new JRadioButton("Buton2",false);
		JRadioButton butonc = new JRadioButton("Buton3",false);
		JRadioButton butond = new JRadioButton("Buton4",true);
		ButtonGroup radioGroup3 = new ButtonGroup();
		ButtonGroup radioGroup4 = new ButtonGroup();
		panel3.add(butona);
		panel3.add(butonb);
		panel3.add(butonc);
		panel3.add(butond);
		radioGroup3.add(butona);
		radioGroup3.add(butonb);
		radioGroup4.add(butonc);
		radioGroup4.add(butond);
		butona.setBounds(10,90,70,70);
		butonb.setBounds(80,90,70,70);
		butonc.setBounds(10, 130, 70, 70);
		butond.setBounds(80, 130, 70, 70);
		JRadioButton buton5 = new JRadioButton("Buton5",true);
		JRadioButton buton6 = new JRadioButton("Buton6",false);
		JRadioButton buton7 = new JRadioButton("Buton7",false);
		JRadioButton buton8 = new JRadioButton("Buton8",true);
		ButtonGroup radioGroup5 = new ButtonGroup();
		ButtonGroup radioGroup6 = new ButtonGroup();
		panel3.add(buton5);
		panel3.add(buton6);
		panel3.add(buton7);
		panel3.add(buton8);
		radioGroup5.add(buton5);
		radioGroup6.add(buton6);
		radioGroup5.add(buton7);
		radioGroup6.add(buton8);
		buton5.setBounds(200,10,70,70);
		buton6.setBounds(300,10,70,70);
		buton7.setBounds(200, 130, 70, 70);
		buton8.setBounds(300, 130, 70, 70);
		
		frame17.add(panel3);

		frame17.setBackground(Color.BLACK);
		frame17.setBounds(20, 20, 400, 400);
		frame17.setVisible(true);
				
		//--------------------------------------------------------------------------------------------------
		// -------------------------------------LABORATORUL 4 - EXERCITIUL 5------------------------------------
		
		
		//--------------------------------------------------------------------------------------------------
		// -------------------------------------LABORATORUL 5 - EXERCITIUL 1------------------------------------
								
		frame18 = new JInternalFrame("lab5Ex1", true, true, true, true);

		JLabel label;
		JLabel label1;
		JRadioButton butonRadio1;
		JRadioButton butonRadio2;
		JRadioButton butonRadio1_1;
		JRadioButton butonRadio2_1;
		ButtonGroup grup; 
		ButtonGroup grup1; 
		JButton buton_1;
		JButton buton_2;
		JTextField tf;
		JTextField tf1;
		
		 JLabel jlabelF7; 
		  ButtonGroup grupF7; 
		  JRadioButton [] butoaneRadio; 

		  JRadioButton b1F7; 
		    
		        Container contentPane = frame18.getContentPane(); 
		        jlabelF7 = new JLabel(); 
		        jlabelF7.setIcon(new ImageIcon("p1.jpg")); 
		        contentPane.add(jlabelF7); 
		        grupF7 = new ButtonGroup(); 
		        butoaneRadio = new JRadioButton[]{ 
		          new JRadioButton("a"), 
		          new JRadioButton("b"), 
		          new JRadioButton("c"), 
		        }; 
		        contentPane.setLayout(new FlowLayout()); 
		        for (int i = 0; i < butoaneRadio.length; ++i){ 
		          grupF7.add(butoaneRadio[i]); 
		          contentPane.add(butoaneRadio[i]); 
		          butoaneRadio[i].addItemListener(new ItemListener(){ 
		            public void itemStateChanged(ItemEvent e){ 
		            	 if (butoaneRadio[0].isSelected()) 
		                     jlabelF7.setIcon(new ImageIcon("p1.png")); 
		                    if (e.getItemSelectable() == butoaneRadio[1]) 
		                    if (butoaneRadio[1].isSelected()) 
		                     jlabelF7.setIcon(new ImageIcon("p2.png")); 
		                    if (e.getItemSelectable() == butoaneRadio[2]) 
		                    if (butoaneRadio[2].isSelected()) 
		                      jlabelF7.setIcon(new ImageIcon("p3.png"));  
		            } 
		          }); 
		        } 
		        butoaneRadio[0].setSelected(true);

		frame18.setBackground(Color.BLACK);
		frame18.setBounds(20, 20, 400, 400);
		frame18.setVisible(true);
				
		//--------------------------------------------------------------------------------------------------
		// -------------------------------------LABORATORUL 5 - EXERCITIUL 1------------------------------------
		
		
		//--------------------------------------------------------------------------------------------------
		// -------------------------------------LABORATORUL 5 - EXERCITIUL 2------------------------------------
								
		frame19 = new JInternalFrame("Lab5Ex2", true, true, true, true);

		JButton button1F8; 
	    JButton button2F8; 
	    JButton button3F8; 
	    JTextField textFieldF8 = new JTextField(20); 
	   // MyButtonListener listener = new MyButtonListener(); 

        button1F8 = new JButton("1"); 
        button1F8.setActionCommand("Ati pasat Button 1"); 
        button1F8.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				 String actionCommand = e.getActionCommand(); 
                 textFieldF8.setText(actionCommand); 
			}
        	
        }); 
        frame19.getContentPane().add(button1F8, BorderLayout.WEST); 
        button2F8 = new JButton("2"); 
        button2F8.setActionCommand("Ati pasat Button 2"); 
        button2F8.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				 String actionCommand = e.getActionCommand(); 
                 textFieldF8.setText(actionCommand); 
			}
        	
        }); 
        frame19.getContentPane().add(button2F8, BorderLayout.CENTER); 
        button3F8 = new JButton("3"); 
        button3F8.setActionCommand("Ati pasat Button 3"); 
        button3F8.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				 String actionCommand = e.getActionCommand(); 
                 textFieldF8.setText(actionCommand); 
			}
        	
        }); 
        frame19.getContentPane().add(button3F8, BorderLayout.EAST);          
//        textFieldF8 = new JTextField(20); 
        textFieldF8.addActionListener(new ActionListener() 
            { 
                public void actionPerformed(ActionEvent e) 
                { 
                    String text = ((JTextField)e.getSource()).getText(); 
                    button1F8.setText(text); 
                    button2F8.setText(text); 
                    button3F8.setText(text); 
                }            
            }); 
        frame19.getContentPane().add(textFieldF8, BorderLayout.NORTH);

        frame19.setBackground(Color.BLACK);
		frame19.setBounds(20, 20, 400, 400);
		frame19.setVisible(true);
				
		
		//--------------------------------------------------------------------------------------------------
		// -------------------------------------LABORATORUL 5 - EXERCITIUL 2------------------------------------
		//--------------------------------------------------------------------------------------------------
		// -------------------------------------LABORATORUL 5 - EXERCITIUL 3------------------------------------
								
		frame20 = new JInternalFrame("Lab5Ex3", true, true, true, true);

		JPanel mainPanel; 
	    JLabel xLabel; 
	    JLabel yLabel; 
	    JTextField xField; 
	    JTextField yField; 
	    JTextArea textArea; 
	    JButton button;
		
		mainPanel = new JPanel(new FlowLayout());  
	    xLabel = new JLabel("X size (width):"); 
		yLabel = new JLabel("Y size (height):"); 
		xField = new JTextField(6); //6 columns (characters) 
		yField = new JTextField(6); //6 columns (characters) 
		textArea = new JTextArea(10, 10); //10 columns, 10 rows 
		button = new JButton("Click me!"); 

		//adding components to panel 

	    mainPanel.add(xLabel); 
	    mainPanel.add(xField); 
        mainPanel.add(yLabel); 
        mainPanel.add(yField); 
        mainPanel.add(textArea); 
        mainPanel.add(button); 

		//adding scrollPane to frame 
		frame20.add(mainPanel); 

		// adding the listener to the button Component 

		button.addActionListener( new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				xField.setText(String.valueOf(frame20.getWidth())); 

			    yField.setText(String.valueOf(frame20.getHeight())); 

			    textArea.append("x"); 
			}
			
		}); 
		
		frame20.setBackground(Color.BLACK);
		frame20.setBounds(20, 20, 400, 400);
		frame20.setVisible(true);
				
		//--------------------------------------------------------------------------------------------------
		// -------------------------------------LABORATORUL 5 - EXERCITIUL 3------------------------------------
		//--------------------------------------------------------------------------------------------------
		// -------------------------------------LABORATORUL 5 - EXERCITIUL 4------------------------------------
								
		frame21 = new JInternalFrame("Lab5Ex4", true, true, true, true);

		ListBox1 panouLista = new ListBox1(); 
	    JTextArea consola = new JTextArea(); 
	    ListSelectionModel listSelectionModel = panouLista.getList().getSelectionModel(); 
	    listSelectionModel.addListSelectionListener( 
	            new SelectieLista(consola, panouLista.getList().getModel()));
	    JPanel panouF11 = new JPanel(); 
	    panouF11.setLayout(new GridLayout(0,1)); 
	    panouF11.add(panouLista); 
	    panouF11.add(new JScrollPane(consola)); 
	    panouF11.setBorder( 
	                BorderFactory.createEmptyBorder(20, 20, 20, 20)); 
	    frame21.getContentPane().add(panouF11); 
		frame21.setBackground(Color.BLACK);
		frame21.setBounds(20, 20, 400, 400);
		frame21.setVisible(true);
				
		//--------------------------------------------------------------------------------------------------
		// -------------------------------------LABORATORUL 5 - EXERCITIUL 4------------------------------------
		
		//--------------------------------------------------------------------------------------------------
		// -------------------------------------LABORATORUL 5 - EXERCITIUL 5------------------------------------
		
		frame22 = new JInternalFrame("Lab5Ex5", true, true, true, true);
		
		JLabel headerLabel; 
        JLabel statusLabel; 
        JPanel controlPanel; 
		
		frame22.setLayout(new GridLayout(3, 1)); 

	      headerLabel = new JLabel("",JLabel.CENTER ); 
	      statusLabel = new JLabel("",JLabel.CENTER);       
	      statusLabel.setSize(350,100); 
	      controlPanel = new JPanel();
	      controlPanel.setLayout(new FlowLayout()); 

	      frame22.add(headerLabel);
	      frame22.add(controlPanel); 
	      frame22.add(statusLabel); 
	      
	      JButton okButton = new JButton("OK"); 

	      JButton submitButton = new JButton("Submit"); 

	      JButton cancelButton = new JButton("Cancel"); 

	 

	      okButton.setActionCommand("OK"); 

	      submitButton.setActionCommand("Submit"); 

	      cancelButton.setActionCommand("Cancel"); 

	 

	      okButton.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				String command = e.getActionCommand();   
		         if( command.equals( "OK" ))  { 
		            statusLabel.setText("Ok Button clicked."); 
		         } 
		         else if( command.equals( "Submit" ) )  { 
		            statusLabel.setText("Submit Button clicked.");  
		         } 
		         else  { 
		            statusLabel.setText("Cancel Button clicked."); 
		         }  	 
			}
	    	  
	      });  

	      submitButton.addActionListener(new ActionListener() {

				@Override
				public void actionPerformed(ActionEvent e) {
					// TODO Auto-generated method stub
					String command = e.getActionCommand();   
			         if( command.equals( "OK" ))  { 
			            statusLabel.setText("Ok Button clicked."); 
			         } 
			         else if( command.equals( "Submit" ) )  { 
			            statusLabel.setText("Submit Button clicked.");  
			         } 
			         else  { 
			            statusLabel.setText("Cancel Button clicked."); 
			         }  	 
				}
				
		  });  

	      cancelButton.addActionListener(new ActionListener() {

				@Override
				public void actionPerformed(ActionEvent e) {
					// TODO Auto-generated method stub
					String command = e.getActionCommand();   
			         if( command.equals( "OK" ))  { 
			            statusLabel.setText("Ok Button clicked."); 
			         } 
			         else if( command.equals( "Submit" ) )  { 
			            statusLabel.setText("Submit Button clicked.");  
			         } 
			         else  { 
			            statusLabel.setText("Cancel Button clicked."); 
			         }  	 
				}
		    	  
		 });  

	     controlPanel.add(okButton); 
	     controlPanel.add(submitButton); 
	     controlPanel.add(cancelButton);
		
 
	    frame22.setBackground(Color.BLACK);
		frame22.setBounds(20, 20, 400, 400);
		frame22.setVisible(true);
				
		//--------------------------------------------------------------------------------------------------
		// -------------------------------------LABORATORUL 5 - EXERCITIUL 5------------------------------------
		
		//--------------------------------------------------------------------------------------------------
		// -------------------------------------LABORATORUL 5 - EXERCITIUL 6------------------------------------
	    //--------------------------------------------------------------------------------------------------				
		frame23 = new JInternalFrame("Lab5Ex6", true, true, true, true);
		
		Container cpF12 = frame23.getContentPane(); 

	    cpF12.setLayout(new FlowLayout()); 

		JPanel card1 = new JPanel(); 

	    card1.add(new JButton("Button 1 ")); 

	    card1.add(new JButton("Button 2 ")); 

	    card1.add(new JButton("Button 3 ")); 

	    card1.setBackground(new Color(255,255,0)); 

	    JButton buttonF12 = new JButton("Modifica fundal"); 

	    JButton button2F12 = new JButton("Modifica text"); 

	    buttonF12.setBackground(Color.yellow); 

	    buttonF12.setForeground(Color.black); 

	  

	    button2F12.setForeground(Color.orange); 
//
//	    Comutator control = new Comutator(); 
//
//	    Comutator1 control1 = new Comutator1(); 
//
//	    Comutator2 control2 = new Comutator2(); 

	    button.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				Component sursa = (Component)e.getSource(); 

			    Color prima = sursa.getForeground(); 

			    sursa.setBackground(Color.pink); 
			}
	    	
	    }); 

	    button2F12.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				Component sursa = (Component)e.getSource(); 

			    Color prima = sursa.getForeground(); 

			    sursa.setForeground(Color.lightGray); 
			}
	    	
	    	
	    }); 

	    

	    cpF12.add(buttonF12); 

	    cpF12.add(button2F12); 

	    frame23.setBackground(Color.BLACK);
		frame23.setBounds(20, 20, 400, 400);
		frame23.setVisible(true);
				
		//--------------------------------------------------------------------------------------------------
		// -------------------------------------LABORATORUL 5 - EXERCITIUL 6------------------------------------
		
		
		//--------------------------------------------------------------------------------------------------
		// -------------------------------------LABORATORUL 5 - EXERCITIUL 7------------------------------------
								
		frame24 = new JInternalFrame("Lab5Ex7", true, true, true, true);

		
		JButton buttonF13 = new JButton("Apasa", new ImageIcon("poze/Poza.jpg")); 
	    JTextField textF13 = new JTextField(30); 
	    JButton button1F13 = new JButton("Apasa", new ImageIcon("poze/Poza2.jpg")); 
	    JButton button2F13 = new JButton("Reset"); 
	    JTextField text1F13 = new JTextField(30); 
	    
	    Container cpF13 = frame24.getContentPane(); 
        cpF13.setLayout(new FlowLayout()); 
        cpF13.add(buttonF13); 
        cpF13.add(button2F13); 
        cpF13.add(textF13); 
        cpF13.add(text1F13); 

        buttonF13.addActionListener(new ActionListener() 
        { 
          public void actionPerformed(ActionEvent e) 
          { 
            textF13.setText("Ai apasat pe butonul 1"); 
             
          } 
        }); 

        cpF13.add(button1F13); 
         button1F13.addActionListener(new ActionListener(){ 
          public void actionPerformed(ActionEvent e) 
          { 
            text1F13.setText("Ai apasat pe butonul 2"); 
          } 
        }); 

        button2F13.addActionListener(new ActionListener(){ 
          public void actionPerformed(ActionEvent e) 
          { 
            text1F13.setText(""); 
            textF13.setText(""); 
          } 
        }); 

        buttonF13.setBounds(30,30,100,80); 
        textF13.setBounds(140,60,200,20); 
        button1F13.setBounds(30,130,90,70); 
        text1F13.setBounds(142,150,200,20); 
        button2F13.setBounds(130,210,90,60); 

        frame24.setLayout(null); 
		frame24.setBackground(Color.BLACK);
		frame24.setBounds(20, 20, 400, 400);
		frame24.setVisible(true);
				
		//--------------------------------------------------------------------------------------------------
		// -------------------------------------LABORATORUL 5 - EXERCITIUL 7------------------------------------
		
		
		desk.add(frame1);
		desk.add(frame2);
		desk.add(frame3);
		desk.add(frame5);
		desk.add(frame6);
		desk.add(frame7);
		desk.add(frame8);
		desk.add(frame9);
		desk.add(frame10);
		desk.add(frame11);
		desk.add(frame12);
		desk.add(frame13);
		desk.add(frame14);
		desk.add(frame15);
		desk.add(frame16);
		desk.add(frame17);
		desk.add(frame18);
		desk.add(frame19);
		desk.add(frame20);
		desk.add(frame21);
		desk.add(frame22);
		desk.add(frame23);
		desk.add(frame24);
		desk.setBackground(Color.BLACK);
		frame.add(desk);
		frame.setSize(1545,990);
		frame.setVisible(true);
		
		
	}
	
	
}

//lab 5 ex 5 //



//lab 5 ex 5 //



// lab 5 ex 4 //

class ListBox1 extends JScrollPane { 

	   private JList list; 

	   public JList getList() { 

	      return list;   } 

	   public ListBox1() { 

	      DefaultListModel listModel = new DefaultListModel(); 

	      listModel.addElement("Randul 1"); 

	      listModel.addElement("Randul 2"); 

	      listModel.addElement("Randul 3"); 

	      list = new JList(listModel); 

	      list.setVisibleRowCount(3); 

	      list.setSelectionMode(ListSelectionModel.SINGLE_SELECTION); 

	      list.setSelectedIndex(0); 

	      setViewportView(list); 
        }
} 

class SelectieLista implements ListSelectionListener { 

	   private JTextArea consola; 

	   ListModel listModel; 

	   public SelectieLista(JTextArea output, ListModel model) { 

	      super(); 

	      consola = output; 

	      listModel = model; 

	}
	   public void valueChanged(ListSelectionEvent e) {  

		      boolean isAdjusting = e.getValueIsAdjusting(); 
		      ListSelectionModel lsm = (ListSelectionModel)e.getSource(); 
		      if(!isAdjusting) {  
		            int primulel = e.getFirstIndex(); 
		            int ultimulel = e.getLastIndex(); 
		            for (int i = primulel; i<=ultimulel; i++) 
		                  if(lsm.isSelectedIndex(i)) 
		                        consola.append("\nDomnule student ati selectat : "+listModel.getElementAt(i)); 
		      } 
       }
}

//lab5ex4 //

//--------------------------------------------------------------------------------------------------
// -------------------------------------LABORATORUL 2 - EXERCITIUL 3------------------------------------

class Butoane extends JPanel {
	public Butoane() {
		JButton b1 = new JButton("ButonA");
		JButton b2 = new JButton("ButonB");
		this.setLayout(new GridLayout(1, 0));
		add(b1);
		add(b2);
	}
}

class CheckBoxuri extends JPanel {
	public CheckBoxuri() {
//cream butoane de tip checkBox
		JCheckBox cb1 = new JCheckBox("Optiune1");
		cb1.setSelected(true);// alegem ca primul buton sa fie bifat la pornire
		JCheckBox cb2 = new JCheckBox("Optiune2");
		JCheckBox cb3 = new JCheckBox("Optiune3");
		this.setLayout(new GridLayout(0, 1));// dispunere de tip Grid
		add(cb1);// adaugam butonul b1
		add(cb2);// adaugam butonul b2
		add(cb3);// adaugam butonul b3
	}
}

class ButoaneRadio extends JPanel {
	public ButoaneRadio() {
// Creare butoane radio
		JRadioButton butonAlb = new JRadioButton("Alb");
		butonAlb.setActionCommand("Alb");
		butonAlb.setSelected(true);
		JRadioButton butonRosu = new JRadioButton("Rosu");
		butonRosu.setActionCommand("Rosu");
		JRadioButton butonVerde = new JRadioButton("Verde");
		butonVerde.setActionCommand("Verde");
// Adaugarea butoanelor la grup
		ButtonGroup group = new ButtonGroup();
		group.add(butonAlb);
		group.add(butonRosu);
		group.add(butonVerde);
// Adaugarea butoanelor la Layout
		this.setLayout(new GridLayout(0, 1));
		add(butonAlb);
		add(butonRosu);
		add(butonVerde);
	}
}

//--------------------------------------------------------------------------------------------------
// -------------------------------------LABORATORUL 2 - EXERCITIUL 3------------------------------------

//--------------------------------------------------------------------------------------------------
//-------------------------------------LABORATORUL 3 - EXERCITIUL 8------------------------------------


class Butoane1 extends JPanel {
	public Butoane1() {
		JButton b1 = new JButton("A");
		JButton b2 = new JButton("B");
		JButton b3 = new JButton("C");
		this.setLayout(new GridLayout(1, 0));
		add(b1);
		add(b2);
		add(b3);
	}
}

class CheckBoxuri1 extends JPanel {
	public CheckBoxuri1() {
//cream butoane de tip checkBox
		JCheckBox cb1 = new JCheckBox("Optiune1");
		cb1.setSelected(true);// alegem ca primul buton sa fie bifat la pornire
		JCheckBox cb2 = new JCheckBox("Optiune2");
		this.setLayout(new GridLayout(0, 1));// dispunere de tip Grid
		add(cb1);// adaugam butonul b1
		add(cb2);// adaugam butonul b2
	}
}

class ButoaneRadio1 extends JPanel {
	public ButoaneRadio1() {
// Creare butoane radio
		JRadioButton butonFiat = new JRadioButton("Fiat");
		butonFiat.setActionCommand("Fiat");
		butonFiat.setSelected(true);
		JRadioButton butonSkoda = new JRadioButton("Skoda");
		butonSkoda.setActionCommand("Skoda");
		JRadioButton butonVolkswagen = new JRadioButton("Volkswagen");
		butonVolkswagen.setActionCommand("Volkswagen");
// Adaugarea butoanelor la grup
		ButtonGroup group = new ButtonGroup();
		group.add(butonFiat);
		group.add(butonSkoda);
		group.add(butonVolkswagen);
// Adaugarea butoanelor la Layout
		this.setLayout(new GridLayout(0, 1));
		add(butonFiat);
		add(butonSkoda);
		add(butonVolkswagen);
		
		// Creare butoane radio
				JRadioButton butonAlb = new JRadioButton("Alb");
				butonAlb.setActionCommand("Alb");
				butonAlb.setSelected(true);
				JRadioButton butonRosu = new JRadioButton("Rosu");
				butonRosu.setActionCommand("Rosu");
				JRadioButton butonVerde = new JRadioButton("Verde");
				butonVerde.setActionCommand("Verde");
		// Adaugarea butoanelor la grup
				ButtonGroup group1 = new ButtonGroup();
				group1.add(butonAlb);
				group1.add(butonRosu);
				group1.add(butonVerde);
		// Adaugarea butoanelor la Layout
				this.setLayout(new GridLayout(0, 1));
				add(butonAlb);
				add(butonRosu);
				add(butonVerde);
	}
}


//--------------------------------------------------------------------------------------------------
//-------------------------------------LABORATORUL 3 - EXERCITIUL 8------------------------------------


