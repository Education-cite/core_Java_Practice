package ExtraPractice.UpcastingAndDowncasting;

public class Cow extends Animal{

	@Override
	public void eat() {
		System.out.println("Cow is eating-----Child Class");
	}
	
	public void hambing() {
		System.out.println("Cow is hambing-----Child Class");
	}
}
