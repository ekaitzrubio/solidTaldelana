package srp;

public class VAT {
	
	private static final float EHUNEKOA=18;
	

	public float calculate(float amount, String code) {
		
		if(code.equals("0")) {
			return 0;
		}
		
		return (amount * EHUNEKOA)/100 ;
	}
}
