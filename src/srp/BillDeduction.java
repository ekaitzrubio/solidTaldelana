package srp;

public class BillDeduction {
	public float billDeduction;
	public float deductionPercentage;

	
	public float deduction(float billAmount, float deductionPercentage) {
		
		if (billAmount >50000) {
			
			billDeduction = (billAmount * deductionPercentage +5) / 100;
			 
		}else {
			
			billDeduction = (billAmount * deductionPercentage) / 100;
			
		}
		
		return billDeduction;
	}
}
