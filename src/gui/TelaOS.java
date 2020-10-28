package gui;

import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.ParseException;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JDialog;
import javax.swing.JFormattedTextField;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSeparator;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import javax.swing.text.MaskFormatter;

import negocio.entidades.enums.StatusServico;
import java.awt.Choice;
import com.toedter.calendar.JDateChooser;

public class TelaOS extends JDialog {

	private final JPanel contentPanel = new JPanel();
	private JTextField txtCodOS;
	private JTextField txtEndereco;
	private JTextField txtNomeCliente;
	private JTextField txtEnderecoCliente;
	private JTextField txtEmailCliente;
	private JTextField txtCodPeca;
	private JTextField txtTipoServico;
	private JTextField txtValorServico;
	private JTextField txtValorTotal;
	private JTextField txtAdiantamento;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			TelaOS dialog = new TelaOS();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public TelaOS() {
		
		setModal(true);
		setBounds(100, 100, 729, 729);
		getContentPane().setLayout(null);
		contentPanel.setBounds(0, 0, 713, 320);
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel);
		contentPanel.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 79, 713, 106);
		contentPanel.add(panel);
		panel.setLayout(null);
		JLabel lblCodOS = new JLabel("Cod. Ordem de Servi\u00E7o:");
		lblCodOS.setBounds(20, 11, 135, 14);
		panel.add(lblCodOS);
		
		txtCodOS = new JTextField();
		txtCodOS.setBounds(162, 5, 166, 20);
		panel.add(txtCodOS);
		txtCodOS.setColumns(10);
		
				
		JLabel lblDataEntrada = new JLabel("Data de entrada:");
		lblDataEntrada.setBounds(20, 42, 132, 14);
		panel.add(lblDataEntrada);
		
		/*MaskFormatter maskData = null;
		try {
			maskData = new MaskFormatter("##/##/####");
			maskData.setPlaceholderCharacter('_');
		} catch (ParseException e1) {
			e1.printStackTrace();
		}
		fTxtDataEntrada = new JFormattedTextField(maskData);*/
		//JFormattedTextField TexFieldData = new JFormattedTextField(maskData);
		
		
		
		
		JLabel lblDataSaida = new JLabel("Data de saida:");
		lblDataSaida.setBounds(20, 76, 135, 14);
		panel.add(lblDataSaida);
		
		
		JLabel lblColaborador = new JLabel("Colaborador:");
		lblColaborador.setBounds(409, 11, 79, 14);
		panel.add(lblColaborador);
		
		txtEndereco = new JTextField();
		txtEndereco.setColumns(10);
		txtEndereco.setBounds(498, 8, 166, 20);
		panel.add(txtEndereco);
		
		/*
		 * Combobox Status
		 */
		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(498, 34, 166, 22);
		panel.add(comboBox);
		comboBox.setModel(new DefaultComboBoxModel<>(StatusServico.values()));
		
		
		
		JLabel lblStatus = new JLabel("Status:");
		lblStatus.setBounds(409, 42, 70, 14);
		panel.add(lblStatus);
		
		JDateChooser dateChooserEntrada = new JDateChooser();
		dateChooserEntrada.setBounds(162, 36, 166, 20);
		panel.add(dateChooserEntrada);
		
		JDateChooser dateChooserSaida = new JDateChooser();
		dateChooserSaida.setBounds(162, 70, 166, 20);
		panel.add(dateChooserSaida);
		
		JLabel lblOS = new JLabel("Ordem de Servi\u00E7o");
		lblOS.setFont(new Font("Tahoma", Font.PLAIN, 17));
		lblOS.setBounds(265, 11, 190, 29);
		contentPanel.add(lblOS);
		
		JLabel lblNomeCliente = new JLabel("Nome:");
		lblNomeCliente.setBounds(18, 196, 80, 14);
		contentPanel.add(lblNomeCliente);
		
		txtNomeCliente = new JTextField();
		txtNomeCliente.setColumns(10);
		txtNomeCliente.setBounds(162, 196, 166, 20);
		contentPanel.add(txtNomeCliente);
		
		JLabel lblEndereco = new JLabel("Endere\u00E7o:");
		lblEndereco.setBounds(18, 230, 80, 14);
		contentPanel.add(lblEndereco);
		
		JLabel lblEmail = new JLabel("E-mail:");
		lblEmail.setBounds(18, 258, 80, 14);
		contentPanel.add(lblEmail);
		
		txtEmailCliente = new JTextField();
		txtEmailCliente.setColumns(10);
		txtEmailCliente.setBounds(162, 261, 166, 20);
		contentPanel.add(txtEmailCliente);
		
		txtEnderecoCliente = new JTextField();
		txtEnderecoCliente.setBounds(162, 227, 166, 20);
		contentPanel.add(txtEnderecoCliente);
		txtEnderecoCliente.setColumns(10);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(0, 185, 713, 20);
		contentPanel.add(separator);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setBounds(0, 300, 713, 20);
		contentPanel.add(separator_1);
		
		JLabel lblCodPeca = new JLabel("Cod. pe\u00E7a:");
		lblCodPeca.setBounds(20, 333, 80, 14);
		getContentPane().add(lblCodPeca);
		
		txtCodPeca = new JTextField();
		txtCodPeca.setColumns(10);
		txtCodPeca.setBounds(162, 330, 166, 20);
		getContentPane().add(txtCodPeca);
		
		JLabel lblTipoServico = new JLabel("Tipo de servi\u00E7o:");
		lblTipoServico.setBounds(20, 364, 132, 14);
		getContentPane().add(lblTipoServico);
		
		txtTipoServico = new JTextField();
		txtTipoServico.setColumns(10);
		txtTipoServico.setBounds(162, 361, 166, 20);
		getContentPane().add(txtTipoServico);
		
		JLabel lblDescricao = new JLabel("Descricao do servi\u00E7o:");
		lblDescricao.setBounds(20, 389, 132, 14);
		getContentPane().add(lblDescricao);
		
		JTextArea txtArea = new JTextArea();
		txtArea.setWrapStyleWord(true);
		txtArea.setBounds(162, 392, 346, 100);
		getContentPane().add(txtArea);
		
		JSeparator separator_1_1 = new JSeparator();
		separator_1_1.setBounds(0, 550, 713, 20);
		getContentPane().add(separator_1_1);
		
		JLabel lblPrecoServico = new JLabel("Valor do Servi\u00E7o:");
		lblPrecoServico.setBounds(20, 506, 102, 14);
		getContentPane().add(lblPrecoServico);
		
		txtValorServico = new JTextField();
		txtValorServico.setColumns(10);
		txtValorServico.setBounds(162, 503, 166, 20);
		getContentPane().add(txtValorServico);
		
		txtValorTotal = new JTextField();
		txtValorTotal.setColumns(10);
		txtValorTotal.setBounds(162, 569, 166, 20);
		getContentPane().add(txtValorTotal);
		
		JLabel lblValorTotal = new JLabel("Valor total:");
		lblValorTotal.setBounds(20, 572, 102, 14);
		getContentPane().add(lblValorTotal);
		
		txtAdiantamento = new JTextField();
		txtAdiantamento.setColumns(10);
		txtAdiantamento.setBounds(162, 609, 166, 20);
		getContentPane().add(txtAdiantamento);
		
		JLabel lblAdiantamento = new JLabel("Adiantamento:");
		lblAdiantamento.setBounds(20, 612, 102, 14);
		getContentPane().add(lblAdiantamento);
		
		
		
		
		{
			JPanel buttonPane = new JPanel();
			buttonPane.setBounds(0, 657, 713, 33);
			buttonPane.setLayout(new FlowLayout(FlowLayout.RIGHT));
			getContentPane().add(buttonPane);
			{
				JButton btnSalva = new JButton("Salvar");
				btnSalva.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						
						
					}
				});
				btnSalva.setActionCommand("OK");
				buttonPane.add(btnSalva);
				getRootPane().setDefaultButton(btnSalva);
			}
			{
				JButton cancelButton = new JButton("Cancel");
				cancelButton.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent arg0) {
						dispose();
					}
				});
				cancelButton.setActionCommand("Cancel");
				buttonPane.add(cancelButton);
				
			}
		}
	}
}
