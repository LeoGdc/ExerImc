package br.senai.sp.jandira;

import java.awt.Button;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

import br.senai.sp.jandira.model.Conta;

public class tela {
	public void criarTela() {
		// jFrame
		JFrame minhaTela = new JFrame();
		minhaTela.setSize(500, 700);
		minhaTela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		minhaTela.setTitle("Calculo do IMC");
		minhaTela.setLayout(null);
		minhaTela.setBackground(new Color(42, 89, 161));

		// Jlabel imc
		JLabel lblImc = new JLabel();
		lblImc.setText("Cálculo Imc");
		lblImc.setFont(new Font("Arial Black", Font.PLAIN, 30));
		lblImc.setForeground(new Color(69, 32, 214));
		lblImc.setBounds(20, 20, 200, 30);
		// jLabel Peso
		JLabel lblPeso = new JLabel();
		lblPeso.setText("Peso:");
		lblPeso.setFont(new Font("Arial", Font.PLAIN, 20));
		lblPeso.setBounds(20, 90, 200, 30);
		// Jlabel Altura
		JLabel lblAltura = new JLabel();
		lblAltura.setText("Altura:");
		lblAltura.setFont(new Font("Arial", Font.PLAIN, 20));
		lblAltura.setBounds(20, 150, 200, 30);
		// Jlabel Resultados
		JLabel lblResultados = new JLabel();
		lblResultados.setText("Resultado:");
		lblResultados.setBounds(20, 350, 200, 30);
		lblResultados.setFont(new Font("Arial Black", Font.PLAIN, 26));
		// Jlabel Valor Imc
		JLabel lblValorIMC = new JLabel();
		lblValorIMC.setText("Valor IMC:");
		lblValorIMC.setBounds(20, 400, 200, 30);
		lblValorIMC.setFont(new Font("Arial", Font.PLAIN, 20));
		// Jlabel Estado Imc
		JLabel lblEstadoImc = new JLabel();
		lblEstadoImc.setText("Estado IMC:");
		lblEstadoImc.setBounds(20, 450, 200, 30);
		lblEstadoImc.setFont(new Font("Arial", Font.PLAIN, 20));

		// Jlabel Resultado Imc
		JLabel lblresultadoImc = new JLabel();
		lblresultadoImc.setBounds(200, 400, 200, 30);
		lblresultadoImc.setFont(new Font("Arial", Font.PLAIN, 20));
		// Jlabel ResultadoEstado
		JLabel lblresultadoEstado = new JLabel();
		lblresultadoEstado.setBounds(300, 450, 200, 30);
		lblresultadoEstado.setFont(new Font("Arial", Font.PLAIN, 20));

		// JTextField Peso
		JTextField tfPeso = new JTextField();
		tfPeso.setBounds(100, 90, 100, 30);
		// JTextField Altura
		JTextField tfAltura = new JTextField();
		tfAltura.setBounds(100, 150, 100, 30);
		// Button Calcular
		Button btnCalcular = new Button("Calcular");
		btnCalcular.setFont(new Font("arial", Font.PLAIN, 30));
		btnCalcular.setBounds(50, 200, 390, 60);
		btnCalcular.setBackground(new Color(166, 166, 166));

		minhaTela.getContentPane().setBackground(new Color(217, 217, 217));
		minhaTela.getContentPane().add(lblImc);
		minhaTela.getContentPane().add(lblPeso);
		minhaTela.getContentPane().add(lblAltura);
		minhaTela.getContentPane().add(tfPeso);
		minhaTela.getContentPane().add(tfAltura);
		minhaTela.getContentPane().add(btnCalcular);
		minhaTela.getContentPane().add(lblResultados);
		minhaTela.getContentPane().add(lblValorIMC);
		minhaTela.getContentPane().add(lblEstadoImc);
		minhaTela.getContentPane().add(lblresultadoImc);
		minhaTela.getContentPane().add(lblresultadoEstado);

		minhaTela.setVisible(true);

		btnCalcular.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				String StringPeso = tfPeso.getText();
				double peso = Double.parseDouble(StringPeso);

				String StringAltura = tfAltura.getText();
				double altura = Double.parseDouble(StringAltura);

				Conta conta = new Conta();
				conta.calcular(peso, altura);
				conta.Estado();

				lblresultadoImc.setText(Double.toString(conta.getResultado()));
				lblresultadoEstado.setText(conta.getEstado());
			}
		});

	}

}
