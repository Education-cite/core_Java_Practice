package ExtraPractice;

public class LazyinilizeSingleton {
	public String name = "tawhide";
	private static LazyinilizeSingleton obj;
	
	private LazyinilizeSingleton() {
		
	}
	
//	public static synchronized LazyinilizeSingleton getobj() {
//		
//		if(obj==null) {
//			obj=new LazyinilizeSingleton();
//		}
//		
//		return obj;
//	}
	
	
	
public static  LazyinilizeSingleton getobj() {
		
		if(obj==null) {
			synchronized(LazyinilizeSingleton.class) {
				if(obj==null) {
					obj=new LazyinilizeSingleton();

				}
			}
		}
		
		return obj;
	}
	
	
	

}
