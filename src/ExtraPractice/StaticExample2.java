package ExtraPractice;

public class StaticExample2 {
	
	static int count=0;
	
	
	StaticExample2(){
		count++;
	}
	
	void getCount() {
		System.out.println("Total count : "+count);
	}
	
	public static void main(String[] args) {
		StaticExample2 s1 = new StaticExample2();
		s1.getCount();
		StaticExample2 s2 = new StaticExample2();
		s2.getCount();
		StaticExample2 s3 = new StaticExample2();
		s3.getCount();
	}

}
