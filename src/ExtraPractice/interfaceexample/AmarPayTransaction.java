package ExtraPractice.interfaceexample;

public class AmarPayTransaction implements AmarPay {

	@Override
	public void rocket(double payment) {
		// TODO Auto-generated method stub
		System.out.println("payment successfully by rocket "+payment);
	}

	@Override
	public void bikash(double payment) {
		// TODO Auto-generated method stub
		System.out.println("payment successfully by bikash "+payment);
	}

	@Override
	public void Nogod(double payment) {
		// TODO Auto-generated method stub
		System.out.println("payment successfully by Nogod "+payment);
	}

	@Override
	public void nexus(double payment) {
		// TODO Auto-generated method stub
		System.out.println("payment successfully by nexus "+payment);
	}

	@Override
	public void evely(double payment) {
		// TODO Auto-generated method stub
		System.out.println("payment successfully by evely "+payment);
	}

}
