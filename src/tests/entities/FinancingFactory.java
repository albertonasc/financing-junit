package tests.entities;

import entities.Financing;

public class FinancingFactory {
	
	public static Financing createValidateFinancing() {
		return new Financing(100000.0, 2000.0, 80);
	}

	
	public static Financing createNotValidateFinancing() {
		return new Financing(100000.0, 2000.0, 20);
	}
	
}
