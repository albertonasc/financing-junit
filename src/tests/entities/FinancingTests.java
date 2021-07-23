package tests.entities;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import entities.Financing;

public class FinancingTests {

	@Test
	public void financingShouldCreateFinancingDataWhenValidateFinancing() {
		Financing financing = FinancingFactory.createValidateFinancing();
		
		Assertions.assertNotNull(financing);
	}
	
	@Test
	public void financingShouldThrowExceptionWhenNotValidateFinancing() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			FinancingFactory.createNotValidateFinancing();
		});
	}
	
	@Test
	public void entryShouldCalculateEntryValue() {
		double expectedValue = 20000.0;		
		Financing financing = FinancingFactory.createValidateFinancing();	
		double result = financing.entry();
		
		Assertions.assertEquals(expectedValue, result);
	}
	
	@Test
	public void quotaShouldCalculateQuotaValue() {
		double expectedValue = 1000.0;
		Financing financing = FinancingFactory.createValidateFinancing();		
		double result = financing.quota();
		
		Assertions.assertEquals(expectedValue, result);
	}
	
}
