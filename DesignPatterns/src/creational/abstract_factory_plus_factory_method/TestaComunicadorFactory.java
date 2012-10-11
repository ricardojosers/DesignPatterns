package creational.abstract_factory_plus_factory_method;

import javax.swing.JOptionPane;

public class TestaComunicadorFactory {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		JOptionPane.showMessageDialog(null,
				"FactoryMethod\nObjetivo: Encapsular a escolha da classe concreta a ser utilizada na cria��o de objetos de um determinado tipo.\n" +
				"Abstract Factory\nObjetivo: Encapsular a escolha das classes concretas a serem utilizadas na cria��o dos objetos de diversas fam�lias.\n" +
			    "* Podemos combinar os dois padr�es vistos anteriormente. As implementa��es da Abstract Factory podem acionar os FactoryMethods para criar os emissores e receptores *");
		TestaVisaComunicadorFactory.main(args);
		System.out.println();
		TestaMastercardComunicadorFactory.main(args);
	}

}
