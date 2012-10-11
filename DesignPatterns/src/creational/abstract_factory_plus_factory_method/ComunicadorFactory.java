package creational.abstract_factory_plus_factory_method;

public interface ComunicadorFactory {
	Emissor createEmissor();

	Receptor createReceptor();
}
