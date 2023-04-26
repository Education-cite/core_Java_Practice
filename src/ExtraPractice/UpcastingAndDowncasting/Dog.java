package ExtraPractice.UpcastingAndDowncasting;

public class Dog extends Animal{
	
	
	@Override
	public void eat() {
		System.out.println("Dog is eating-----Child Class");
	}
	
	public void barking() {
		System.out.println("Dog is barking-----Child Class");
	}

}
