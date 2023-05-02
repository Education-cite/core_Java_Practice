package ExtraPractice.UpcastingAndDowncasting;

public class TestUpcastingAndDownCasting {
public static void main(String[] args) {
//	
//	//upcasting------------------
//	System.err.println("upcasting----------------------");
//	Animal a = new Cat();
//	a.eat();
//	a= new Dog();
//	a.eat();
//	a=new Cow();
//	a.eat();
//	
//	//DownCasting------------------------
//	System.err.println("DownCasting----------------------");
//	
//	Animal a1 = new Cat();
//	
//	if(a1 instanceof Cat) {
//		Cat c = (Cat)a1;
//		c.eat();
//		
//	}else if(a1 instanceof Dog) {
//		Dog c = (Dog)a1;
//		c.eat();
//		
//	}else if(a1 instanceof Cow) {
//		Cow c = (Cow)a1;
//		c.eat();
//		
//	}
	
		Animal aa = new Animal();
		Cow cow = new Cow();
		Dog dog = new Dog();
		Cat cat = new Cat();
	
	AnimalCall c = new AnimalCall();
	c.callAnimal(aa);
	c.callAnimal(cow);
	c.callAnimal(cat);
	c.callAnimal(dog);
	
	
}
}
