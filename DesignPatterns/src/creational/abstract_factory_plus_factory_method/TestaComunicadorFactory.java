package creational.abstract_factory_plus_factory_method;

import javax.swing.JOptionPane;

public class TestaComunicadorFactory {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		JOptionPane.showMessageDialog(null,
				"FactoryMethod\nObjetivo: Encapsular a escolha da classe concreta a ser utilizada na criação de objetos de um determinado tipo.\n" +
				"Abstract Factory\nObjetivo: Encapsular a escolha das classes concretas a serem utilizadas na criação dos objetos de diversas famílias.\n" +
			    "* Podemos combinar os dois padrões vistos anteriormente. As implementações da Abstract Factory podem acionar os FactoryMethods para criar os emissores e receptores *");
		TestaVisaComunicadorFactory.main(args);
		System.out.println();
		TestaMastercardComunicadorFactory.main(args);
	}

}
