package creational.abstract_factory_plus_factory_method;

public class EmissorVisa implements Emissor {
	public void envia(String mensagem) {
		System.out.println(" Enviando a seguinte mensagem para a Visa :");
		System.out.println(mensagem);
	}
}
