package singleton;


public class Singletonmain {

	public static void main(String[] args) {
		
		Singleton S = Singleton.getInstance();
		Singleton S1 = Singleton.getInstance();
		Singleton S2 = Singleton.getInstance();

		S.writingToTheFile("Hello everyone to my singleton: ");
		S1.writingToTheFile("..........write here.......... ");
		S2.writingToTheFile("..........write here.......... ");

	}

}
