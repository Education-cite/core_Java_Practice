package ExtraPractice;

public class EggarLaziation {
	String name = "enamul";
	private static EggarLaziation obj;
	
	
	private EggarLaziation() {
		
	}
	
	public static EggarLaziation getObject() {
		obj = new EggarLaziation();
		
		return obj;
	}
	
	
	

}
