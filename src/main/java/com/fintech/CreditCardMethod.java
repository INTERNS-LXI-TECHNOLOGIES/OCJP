package com.fintech;
public final record CreditCardMethod(String cardNumber , String issuer) implements PaymentMethod {
	public CreditCardMethod {
		if (cardNumber == null || cardNumber.isBlank()){
			throw new IllegalArgumentException("invalid CardNumber"); 
		}
		if (issuer == null || issuer.isBlank()){
			throw new IllegalArgumentException("invalid Issuer");
		}
	}
	public String getAccountIdentifier(){
		return cardNumber +" "+issuer;
	}
	
}