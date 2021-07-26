package tests.entities;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import entities.Financing;

public class FinancingTests {

	@Test
	public void constructorShouldCreateObjectWhenValidData() {
		Financing financing = new Financing(100000.0, 2000.0, 80);
		
		Assertions.assertEquals(100000.0, financing.getTotalAmount());
		Assertions.assertEquals(2000.0, financing.getIncome());
		Assertions.assertEquals(80, financing.getMonths());
	}
	
	@Test
	public void constructorShouldThrowIllegalArgumentExceptionWhenInvalidData() {
		
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			Financing financing = new Financing(100000.0, 2000.0, 20);
		});		
	}
	
	@Test
	public void totalAmountShouldUpdateDataWhenValidData() {				
		Financing financing = new Financing(100000.0, 2000.0, 80);
		
		financing.setTotalAmount(90000.0);
		
		Assertions.assertEquals(90000.0, financing.getTotalAmount());
	}
	
	@Test
	public void totalAmountShouldThrowIllegalArgumentExceptionWhenInvalidData() {
		
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			Financing financing = new Financing(100000.0, 2000.0, 80);		
			financing.setTotalAmount(110000.0);
		});		
	}
	
	@Test
	public void incomeShouldUpdateDataWhenValidData() {				
		Financing financing = new Financing(100000.0, 2000.0, 80);
		
		financing.setIncome(2100.0);
		
		Assertions.assertEquals(2100.0, financing.getIncome());
	}
	
	@Test
	public void incomeShouldThrowIllegalArgumentExceptionWhenInvalidData() {
		
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			Financing financing = new Financing(100000.0, 2000.0, 80);		
			financing.setIncome(1900.0);
		});		
	}
	
	@Test
	public void monthsShouldUpdateDataWhenValidData() {				
		Financing financing = new Financing(100000.0, 2000.0, 80);
		
		financing.setMonths(85);
		
		Assertions.assertEquals(85, financing.getMonths());
	}
	
	@Test
	public void monthsShouldThrowIllegalArgumentExceptionWhenInvalidData() {
		
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			Financing financing = new Financing(100000.0, 2000.0, 80);		
			financing.setMonths(70);
		});		
	}
	
	@Test
	public void entryShouldCalculateEntryValue() {
		double expectedValue = 20000.0;		
		Financing financing = new Financing(100000.0, 2000.0, 80);
		double result = financing.entry();
		
		Assertions.assertEquals(expectedValue, result);
	}
	
	@Test
	public void quotaShouldCalculateQuotaValue() {
		double expectedValue = 1000.0;
		Financing financing = new Financing(100000.0, 2000.0, 80);		
		double result = financing.quota();
		
		Assertions.assertEquals(expectedValue, result);
	}
	
}
