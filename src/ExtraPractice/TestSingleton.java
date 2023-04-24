package ExtraPractice;

public class TestSingleton {
	public static void main(String[] args) {
		EggarLaziation e =  EggarLaziation.getObject();
		System.out.println(e.name);
		LazyinilizeSingleton l = LazyinilizeSingleton.getobj();
		System.out.println(l.name);
	}
}
