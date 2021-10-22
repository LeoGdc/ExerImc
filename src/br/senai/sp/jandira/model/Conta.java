package br.senai.sp.jandira.model;

import br.senai.sp.jandira.tela;

public class Conta {
	private double resultado;

	public void calcular(double peso, double altura) {
		resultado = peso / (altura * altura);
	}

	public double getResultado() {
		return this.resultado;
	}

	private String estado;

	public void Estado() {
		if (resultado <= 18.5) {
			estado = "Abaixo do Peso";
		} else if (resultado >= 18.5 && resultado <= 24.9) {
			estado = "Peso Normal";
		} else if (resultado >= 25 && resultado <= 29.9) {
			estado = "Sobrepeso";
		} else if (resultado >= 30 && resultado <= 34.9) {
			estado = "Obesidade 1";
		} else if (resultado >= 35 && resultado <= 39.9) {
			estado = "Obesidade 2";
		} else {
			estado = "Obesidade Mórbida";
		}
	}

	public String getEstado() {
		return this.estado;
	}
}
