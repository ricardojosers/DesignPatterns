package creational.singleton;

public class SingletonTest {

	/**
	 * @param args
	 */
	public static void main(String[] args)
	{
		LazySingleton lazySingleton = LazySingleton.getInstance();
		
		lazySingleton.doSomething();
		lazySingleton.doSomething();
		
		System.out.println();
		
		EarlySingleton earlySingleton = EarlySingleton.getInstance();
		
		earlySingleton.doSomething();
		earlySingleton.doSomething();
	}
}
