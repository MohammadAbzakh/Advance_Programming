package strategy;

public class Context {
	private Strategyop strategy;

	public Context(Strategyop strategy) {
		this.strategy = strategy;
	}

	public int executeStrategy(int n1, int n2, int n3, int n4, int n5, int n6) {
		return strategy.doOperation(n1, n2, n3, n4, n5, n6);
	}
}
