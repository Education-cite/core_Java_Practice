package ExtraPractice.UpcastingAndDowncasting;

public class Cat extends Animal{
	
	@Override
	public void eat() {
		System.out.println("Cat is eating-----Child Class");
	}
	
	public void maw() {
		System.out.println("Cat is mawing-----Child Class");
	}

}
