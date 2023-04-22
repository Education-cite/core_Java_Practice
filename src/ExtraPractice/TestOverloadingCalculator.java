package ExtraPractice;

public class TestOverloadingCalculator {
public static void main(String[] args) {
	OverLoading_Calsulator c = new OverLoading_Calsulator();
	System.err.println(	"Addition of two number : "+c.doAddition(12, 33));
	System.err.println("Addition of two number : "+c.doAddition(12, 12));
	c.doAddition(12, 12, 12, 12);
	c.doAddition(12, 15.0);;
	c.doAddition(12.0, 123);
}
}
