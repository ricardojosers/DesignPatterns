package creational.abstract_factory_plus_factory_method;

public class ReceptorVisa implements Receptor {
	public String recebe() {
		System.out.println(" Recebendo mensagem da Visa .");
		String mensagem = " Mensagem da Visa ";
		return mensagem;
	}
}
