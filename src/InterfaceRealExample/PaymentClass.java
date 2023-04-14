package InterfaceRealExample;

public class PaymentClass implements AmarPay{

	@Override
	public void bikashPayment(double Payment) {

		System.out.println("Payment submitted by Bikash " +Payment);
	}

	@Override
	public void RocketPayment(double Payment) {
		System.out.println("Payment submitted by Rocket " +Payment);
		
	}

	@Override
	public void NogodPayment(double Payment) {
		System.out.println("Payment submitted by Nogod " +Payment);
		
	}

	@Override
	public void nexusPayment(double Payment) {
		System.out.println("Payment submitted by Nexus " +Payment);
		
	}

}
