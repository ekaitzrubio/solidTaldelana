package dip;

import java.util.Date;

public class Bill {
	public String code;
	public Date billDate;
	public float billAmount;
	public float VAT;
	public float billDeduction;
	public float billTotal;
	public int deductionPercentage;
	
	private IDeduction deductionService;
    private IVAT vatService;
    
    public Bill(IDeduction deductionService, IVAT vatService) {
        this.deductionService = deductionService;
        this.vatService = vatService;
    }

// Fakturaren totala kalkulatzen duen metodoa.
	public void totalCalc() {
		
		// Dedukzioa kalkulatu
		billDeduction = deductionService.deduction(billAmount,billDeduction);
		
		// VAT kalkulatzen dugu
		VAT = vatService.calculate(billAmount, code);
		
		// Totala kalkulatzen dugu
		billTotal = (billAmount - billDeduction) + VAT;
	}
}