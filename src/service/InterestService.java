package service;

import java.security.InvalidParameterException;

public interface InterestService {
	
	double getInterestRate();
	
	default double payment (double amount, int months) {
		
		if(months < 1) {
			throw new InvalidParameterException("Os meses tem que ser maior que 0");
		}
		return amount * Math.pow(1.0 + getInterestRate() / 100.0, months);
}
}
