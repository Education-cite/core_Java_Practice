package ExtraPractice.UpcastingAndDowncasting;

public class AnimalCall {
	
	public void callAnimal(Animal a) {
		
		System.err.println("UpCasting----------------------");	
		
		a.eat();
		a.move();
		
		
		
		System.err.println("DownCasting----------------------");
		
		if(a instanceof Cat) {
			Cat c = (Cat)a;
			c.eat();
			c.maw();
		
		}else if(a instanceof Dog) {
			Dog d = (Dog)a;
			d.eat();
			
		}else if(a instanceof Cow) {
			Cow w = (Cow)a;
			w.eat();
			
		}else if(a instanceof Animal) {
			Animal ww = (Animal)a;
			ww.eat();
			
		}		
		
		
	}

}
