package gui;
import Logic.aplicacion;
import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.SwingConstants;
import java.awt.Button;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JTextField;
import javax.swing.JButton;

public class VentanaOperaciones extends JFrame implements ActionListener {

	private JPanel PanelPrincipal;
	private JTextField textFieldInput;
	private JButton btnConverter;
	private JComboBox comboBoxSelectorIn;
	private JComboBox comboBoxSelectorOut;

	    public VentanaOperaciones() {
		
		setTitle("Conversor de monedas");
		setLocationRelativeTo(null);	
		setResizable(false);
		
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 990, 624);
		PanelPrincipal = new JPanel();
		PanelPrincipal.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(PanelPrincipal);
		PanelPrincipal.setLayout(null);
		
		
		
		JLabel lblTitle = new JLabel("Conversor de monedas");
		lblTitle.setHorizontalAlignment(SwingConstants.CENTER);
		lblTitle.setFont(new Font("Segoe Print", Font.PLAIN, 31));
		lblTitle.setBounds(286, 10, 363, 35);
		PanelPrincipal.add(lblTitle);
		
	    comboBoxSelectorIn = new JComboBox();
		comboBoxSelectorIn.setModel(new DefaultComboBoxModel(new String[] {"Real", "Peso", "Dolar", "Euro", "Yen"}));
		comboBoxSelectorIn.setFont(new Font("Segoe Print", Font.PLAIN, 26));
		comboBoxSelectorIn.setBounds(265, 122, 131, 63);
		PanelPrincipal.add(comboBoxSelectorIn);
		
		textFieldInput = new JTextField();
		textFieldInput.setHorizontalAlignment(SwingConstants.CENTER);
		textFieldInput.setFont(new Font("Segoe Print", Font.PLAIN, 26));
		textFieldInput.setBounds(20, 122, 232, 63);
		PanelPrincipal.add(textFieldInput);
		textFieldInput.setColumns(10);
		
	    comboBoxSelectorOut = new JComboBox();
		comboBoxSelectorOut.setModel(new DefaultComboBoxModel(new String[] {"Real", "Peso", "Dolar", "Euro", "Yen"}));
		comboBoxSelectorOut.setFont(new Font("Segoe Print", Font.PLAIN, 26));
		comboBoxSelectorOut.setBounds(614, 122, 131, 63);
		PanelPrincipal.add(comboBoxSelectorOut);
		
		btnConverter = new JButton("Convertir");
		btnConverter.setFont(new Font("Segoe Print", Font.PLAIN, 28));
		btnConverter.setBounds(360, 405, 244, 63);
		PanelPrincipal.add(btnConverter);
		btnConverter.addActionListener(this);
		
		JLabel lblImport = new JLabel("Importe");
		lblImport.setHorizontalAlignment(SwingConstants.CENTER);
		lblImport.setFont(new Font("Segoe Print", Font.PLAIN, 31));
		lblImport.setBounds(20, 77, 232, 35);
		PanelPrincipal.add(lblImport);
		
		JLabel lblDe = new JLabel("De :");
		lblDe.setHorizontalAlignment(SwingConstants.CENTER);
		lblDe.setFont(new Font("Segoe Print", Font.PLAIN, 31));
		lblDe.setBounds(265, 77, 131, 35);
		PanelPrincipal.add(lblDe);
		
		JLabel lblA = new JLabel("A :");
		lblA.setHorizontalAlignment(SwingConstants.CENTER);
		lblA.setFont(new Font("Segoe Print", Font.PLAIN, 31));
		lblA.setBounds(613, 77, 132, 35);
		PanelPrincipal.add(lblA);
	}


		@Override
		public void actionPerformed(ActionEvent e) {
		 if (btnConverter == e.getSource()) {
		 float importe = Float.parseFloat(textFieldInput.getText()); 
		 aplicacion conversor = new aplicacion();
		 float resultado = conversor.converter(comboBoxSelectorIn.getSelectedIndex(),comboBoxSelectorOut.getSelectedIndex() , importe );
		 JOptionPane.showMessageDialog(null,resultado);
		 
		 }	
			
		}

	

}

	

