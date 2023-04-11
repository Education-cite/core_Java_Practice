package java_project.singleton;

public class SingletonLazyPattern {
	
	private static SingletonLazyPattern singletonLazyPattern;
	
	String address="Ullapara";
	
	private SingletonLazyPattern() {
		
	}
	
	
	//thread safe lazypattern
	
//	public static synchronized SingletonLazyPattern getLazyInstance() {
//		
//		if(singletonLazyPattern==null) {
//			singletonLazyPattern = new SingletonLazyPattern();
//		}
//		
//		return singletonLazyPattern;
//	}
	
	//double check locking principal
	 
	public static  SingletonLazyPattern getLazyInstance() {
		
		if(singletonLazyPattern==null) {
			
			synchronized (SingletonLazyPattern.class) {
				if(singletonLazyPattern==null) {
					singletonLazyPattern = new SingletonLazyPattern();

				}
			};
		}
		
		return singletonLazyPattern;
	}

}
