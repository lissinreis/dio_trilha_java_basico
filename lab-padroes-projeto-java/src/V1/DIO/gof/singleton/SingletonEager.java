package V1.DIO.gof.singleton;

/**
 * Singleton "apressado".
 * 
 * @author Arlison
 */
public class SingletonEager {

	private static SingletonEager instancia = new SingletonEager();
	
	private SingletonEager() {
		super();
	}
	
	public static SingletonEager getInstancia() {
		return instancia;
	}
}
