package V1.DIO.gof;

import V1.DIO.gof.facade.Facade;
import V1.DIO.gof.singleton.SingletonEager;
import V1.DIO.gof.singleton.SingletonLazy;
import V1.DIO.gof.singleton.SingletonLazyHolder;
import V1.DIO.gof.strategy.Comportamento;
import V1.DIO.gof.strategy.ComportamentoAgressivo;
import V1.DIO.gof.strategy.ComportamentoDefensivo;
import V1.DIO.gof.strategy.ComportamentoNormal;
import V1.DIO.gof.strategy.Robo;

public class Test {

	public static void main(String[] args) {
		
		// Singleton
		
		SingletonLazy lazy = SingletonLazy.getInstancia();
		System.out.println(lazy);
		lazy = SingletonLazy.getInstancia();
		System.out.println(lazy);
		
		SingletonEager eager = SingletonEager.getInstancia();
		System.out.println(eager);
		eager = SingletonEager.getInstancia();
		System.out.println(eager);
		
		SingletonLazyHolder lazyHolder = SingletonLazyHolder.getInstancia();
		System.out.println(lazyHolder);
		lazyHolder = SingletonLazyHolder.getInstancia();
		System.out.println(lazyHolder);
		
		// Strategy
		
		Comportamento defensivo = new ComportamentoDefensivo();
		Comportamento normal = new ComportamentoNormal();
		Comportamento agressivo = new ComportamentoAgressivo();
		
		Robo robo = new Robo();
		robo.setComportamento(normal);
		robo.mover();
		robo.mover();
		robo.setComportamento(defensivo);
		robo.mover();
		robo.setComportamento(agressivo);
		robo.mover();
		robo.mover();
		robo.mover();
		
		// Facade
		
		Facade facade = new Facade();
		facade.migrarCliente("Arlison", "38410492");
	}

}
