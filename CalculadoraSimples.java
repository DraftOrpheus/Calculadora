import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.BorderLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import javax.swing.JTextPane;
import javax.swing.JLabel;
import javax.swing.JTextArea;

public class CalculadoraSimples {

	private JFrame frame;
	private JTextField txtResultado;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CalculadoraSimples window = new CalculadoraSimples();
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
	public CalculadoraSimples() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */double valor1,valor2;
		String sinal;
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 418, 508);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JButton btnNewButton = new JButton("New button");
		btnNewButton.setBounds(71, 446, 200, -6);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		frame.getContentPane().setLayout(null);
		frame.getContentPane().add(btnNewButton);
		
		JButton btn7 = new JButton("7");
		btn7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtResultado.setText(txtResultado.getText()+"7");
			}
		});
		btn7.setBounds(10, 404, 89, 54);
		frame.getContentPane().add(btn7);
		
		JButton btn4 = new JButton("4");
		btn4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtResultado.setText(txtResultado.getText()+"4");

			}
		});
		btn4.setBounds(10, 345, 89, 54);
		frame.getContentPane().add(btn4);
		
		JButton btn1 = new JButton("1");
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtResultado.setText(txtResultado.getText()+"1");
			}
		});
		btn1.setBounds(10, 280, 89, 54);
		frame.getContentPane().add(btn1);
		
		JButton btn2 = new JButton("2");
		btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtResultado.setText(txtResultado.getText()+"2");

			}
		});
		btn2.setBounds(105, 280, 89, 54);
		frame.getContentPane().add(btn2);
		
		JButton btn5 = new JButton("5");
		btn5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtResultado.setText(txtResultado.getText()+"5");

			}
		});
		btn5.setBounds(105, 345, 89, 54);
		frame.getContentPane().add(btn5);
		
		JButton btn8 = new JButton("8");
		btn8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtResultado.setText(txtResultado.getText()+"8");

			}
		});
		btn8.setBounds(105, 404, 89, 54);
		frame.getContentPane().add(btn8);
		
		JButton btn3 = new JButton("3");
		btn3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtResultado.setText(txtResultado.getText()+"3");

			}
		});
		btn3.setBounds(197, 280, 89, 54);
		frame.getContentPane().add(btn3);
		
		JButton btn6 = new JButton("6");
		btn6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtResultado.setText(txtResultado.getText()+"6");

			}
		});
		btn6.setBounds(197, 345, 89, 54);
		frame.getContentPane().add(btn6);
		
		JButton btn9 = new JButton("9");
		btn9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtResultado.setText(txtResultado.getText()+"9");

			}
		});
		btn9.setBounds(197, 404, 89, 54);
		frame.getContentPane().add(btn9);
		
		JButton btn0 = new JButton("0");
		btn0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtResultado.setText(txtResultado.getText()+"0");
			}
		});
		btn0.setBounds(292, 404, 89, 54);
		frame.getContentPane().add(btn0);
		
		JButton btnPonto = new JButton(".");
		btnPonto.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtResultado.setText(txtResultado.getText()+".");
				
			}
		});
		btnPonto.setBounds(292, 345, 89, 54);
		frame.getContentPane().add(btnPonto);
		
		JButton btnClear = new JButton("C");
		btnClear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				valor1 = 0;
				valor2 = 0;
			}
		});
		btnClear.setBounds(292, 150, 89, 54);
		frame.getContentPane().add(btnClear);
		
		JButton btnSoma = new JButton("+");
		btnSoma.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				valor1 = Double.parseDouble(txtResultado.getText()); //CONVERTENDO A STRING EM NUMERO
				sinal = "soma";
				txtResultado.setText("");
			}
		});
		btnSoma.setBounds(10, 215, 89, 54);
		frame.getContentPane().add(btnSoma);
		
		JButton btnSubtrc = new JButton("-");
		btnSubtrc.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				valor1 = Double.parseDouble(txtResultado.getText());
				sinal = "subtracao";
				txtResultado.setText("");
			}
		});
		btnSubtrc.setBounds(105, 215, 89, 54);
		frame.getContentPane().add(btnSubtrc);
		
		JButton btnMult = new JButton("*");
		btnMult.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				valor1 = Double.parseDouble(txtResultado.getText());
				sinal = "vezes";
				txtResultado.setText("");
				}
		});
		btnMult.setBounds(197, 215, 89, 54);
		frame.getContentPane().add(btnMult);
		
		JButton btnDivis = new JButton("/");
		btnDivis.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				valor1 = Double.parseDouble(txtResultado.getText());
				sinal = "divisao";
				txtResultado.setText("");
			}
		});
		btnDivis.setBounds(292, 215, 89, 54);
		frame.getContentPane().add(btnDivis);
		
		JButton btnTotal = new JButton("=");
		btnTotal.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				valor2 = Double.parseDouble(txtResultado.getText());
				if(sinal == "soma") {
					txtResultado.setText(String.valueOf(valor1+valor2));//CONVERTENDO DE NUMERO PARA STRING
				}
				if(sinal == "subtracao") {
					txtResultado.setText(String.valueOf(valor1-valor2));
				}
				if(sinal == "vezes") {
					txtResultado.setText(String.valueOf(valor1*valor2));
				}
				if(sinal == "divisao") {
					txtResultado.setText(String.valueOf(valor1/valor2));
				}
			}
		});
		btnTotal.setBounds(292, 280, 89, 54);
		frame.getContentPane().add(btnTotal);
		
		txtResultado = new JTextField();
		txtResultado.setBounds(21, 86, 360, 35);
		frame.getContentPane().add(txtResultado);
		txtResultado.setColumns(10);
		
		JButton btnCe = new JButton("CE");
		btnCe.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtResultado.setText("");
			}
		});
		btnCe.setBounds(197, 150, 89, 54);
		frame.getContentPane().add(btnCe);
	}
}