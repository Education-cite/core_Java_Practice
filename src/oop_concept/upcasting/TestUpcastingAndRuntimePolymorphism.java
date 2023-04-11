package oop_concept.upcasting;

public class TestUpcastingAndRuntimePolymorphism {
	
public static void main(String[] args) {
	
	//upcasting-------------
	
	Animal a = new Cat();
	a.eat();
	
	a = new Dog();
	a.eat();
	
	
	a = new Cow();
	a.eat();
	
	//Downcasting--------------
	
	Animal a1 = new Cat();
	Cat c = (Cat)a1;
	c.maw();
	
	
	Animal a2 = new Dog();
	
	
	Animal a3 = new Cow();

	
	//Best practice-----------
	
	if(a2 instanceof Dog) {
		Dog d1 = (Dog)a2;
		d1.eat();
	}
	
	
	
	
	
}	

}
