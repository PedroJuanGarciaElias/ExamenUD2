package es.oretania;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.BorderLayout;
import javax.swing.JTextField;
import javax.swing.JRadioButton;
import javax.swing.JCheckBox;
import javax.swing.JList;
import javax.swing.JComboBox;
import javax.swing.JSpinner;
import javax.swing.JTextArea;
import javax.swing.JButton;

public class FormulariodeRegistro {

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FormulariodeRegistro window = new FormulariodeRegistro();
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
	public FormulariodeRegistro() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 550);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Nombre:");
		lblNewLabel.setBounds(30, 69, 46, 14);
		frame.getContentPane().add(lblNewLabel);
		
		textField = new JTextField();
		textField.setBounds(116, 66, 151, 20);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(116, 104, 151, 20);
		frame.getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("Edad:");
		lblNewLabel_1.setBounds(30, 107, 46, 14);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Sexo:");
		lblNewLabel_2.setBounds(30, 159, 46, 14);
		frame.getContentPane().add(lblNewLabel_2);
		
		JRadioButton rdbtnNewRadioButton = new JRadioButton("Masculino");
		rdbtnNewRadioButton.setBounds(93, 155, 109, 23);
		frame.getContentPane().add(rdbtnNewRadioButton);
		
		JRadioButton rdbtnNewRadioButton_1 = new JRadioButton("Femenino");
		rdbtnNewRadioButton_1.setBounds(192, 155, 109, 23);
		frame.getContentPane().add(rdbtnNewRadioButton_1);
		
		JLabel lblNewLabel_3 = new JLabel("Intereses:");
		lblNewLabel_3.setBounds(30, 197, 92, 14);
		frame.getContentPane().add(lblNewLabel_3);
		
		JCheckBox chckbxNewCheckBox = new JCheckBox("Deporte");
		chckbxNewCheckBox.setBounds(105, 193, 97, 23);
		frame.getContentPane().add(chckbxNewCheckBox);
		
		JCheckBox chckbxNewCheckBox_1 = new JCheckBox("Música");
		chckbxNewCheckBox_1.setBounds(192, 193, 97, 23);
		frame.getContentPane().add(chckbxNewCheckBox_1);
		
		JCheckBox chckbxNewCheckBox_2 = new JCheckBox("Lectura");
		chckbxNewCheckBox_2.setBounds(276, 193, 97, 23);
		frame.getContentPane().add(chckbxNewCheckBox_2);
		
		JLabel lblNewLabel_4 = new JLabel("País:");
		lblNewLabel_4.setBounds(30, 235, 46, 14);
		frame.getContentPane().add(lblNewLabel_4);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(93, 231, 139, 22);
		frame.getContentPane().add(comboBox);
		
		JLabel lblNewLabel_5 = new JLabel("Año nacimiento:");
		lblNewLabel_5.setBounds(30, 276, 92, 14);
		frame.getContentPane().add(lblNewLabel_5);
		
		JSpinner spinner = new JSpinner();
		spinner.setBounds(132, 273, 117, 20);
		frame.getContentPane().add(spinner);
		
		JLabel lblNewLabel_6 = new JLabel("Descripción:");
		lblNewLabel_6.setBounds(30, 321, 103, 14);
		frame.getContentPane().add(lblNewLabel_6);
		
		JTextArea txtrVehculoPropio = new JTextArea();
		txtrVehculoPropio.setText("Vehículo propio");
		txtrVehculoPropio.setBounds(116, 316, 246, 68);
		frame.getContentPane().add(txtrVehculoPropio);
		
		JButton btnNewButton = new JButton("Enviar");
		btnNewButton.setBounds(93, 425, 89, 23);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Limpiar");
		btnNewButton_1.setBounds(192, 425, 89, 23);
		frame.getContentPane().add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("Salir");
		btnNewButton_2.setBounds(291, 425, 89, 23);
		frame.getContentPane().add(btnNewButton_2);
	}
}
