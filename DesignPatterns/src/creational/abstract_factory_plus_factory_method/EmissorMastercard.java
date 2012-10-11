package creational.abstract_factory_plus_factory_method;

public class EmissorMastercard implements Emissor {
	public void envia(String mensagem) {
		System.out.println(" Enviando a seguinte mensagem para a Mastercard :");
		System.out.println(mensagem);
	}
}
