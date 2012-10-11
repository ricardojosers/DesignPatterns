package creational.builder;

import javax.swing.JOptionPane;

public class TestaGeradorDeBoleto {
	public static void main(String[] args) {
		JOptionPane.showMessageDialog(null, "Builder\nObjetivo: Separar o processo de construção de um objeto de sua representação e permitir a sua \n" +
				"criação passo-a-passo.\n Diferentes tipos de objetos podem ser criados com implementações distintas de cada passo");
		BoletoBuilder boletoBuilder = new BBBoletoBuilder();
		GeradorDeBoleto geradorDeBoleto = new GeradorDeBoleto(boletoBuilder);
		Boleto boleto = geradorDeBoleto.geraBoleto();
		System.out.println(boleto);
	}
}