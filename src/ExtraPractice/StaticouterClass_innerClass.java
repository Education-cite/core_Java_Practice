package ExtraPractice;

public class StaticouterClass_innerClass {
 static int a = 10;
 
  static class inner{
	 static void msg() {
		 System.out.println("value of a "+a);
	 }
	 
	
	 
 }
 
 
 public static void main(String[] args) {
//	 StaticouterClass_innerClass.inner s = new StaticouterClass_innerClass.inner();
//	 s.msg();
	 StaticouterClass_innerClass.inner.msg();
}
 
 
 
 
 
 
 
}
