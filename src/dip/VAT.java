package dip;

public class VAT implements IVAT{
	
	private float EHUNEKOA;
	
	public VAT() {
		EHUNEKOA = 18;
	}
	
	
	@Override
	public float calculate(float amount, String code) {
		
		if(code.equals("0")) {
			return 0;
		}
		
		return (amount * EHUNEKOA)/100 ;
	}
}
