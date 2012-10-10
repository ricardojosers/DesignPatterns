package creational.singleton;

// Lazy instantiation using double locking mechanism.
// In this case case the singleton instance is created when the getInstance() method is called for the first time. 
// This is called lazy instantiation and it ensures that the singleton instance is created only when it is needed
class LazySingleton 
{
	private static LazySingleton instance;

	private LazySingleton() 
	{
		System.out.println("LazySingleton(): Initializing Instance");
	}

	public static LazySingleton getInstance() 
	{
		if (instance == null)
		{
			synchronized (LazySingleton.class)
			{
				if (instance == null) 
				{
					System.out.println("getInstance(): First time getInstance was invoked!");
					instance = new LazySingleton();
				}
			}
		}

		return instance;
	}

	public void doSomething() 
	{
		System.out.println("doSomething(): LazySingleton does something!");
	}
}
