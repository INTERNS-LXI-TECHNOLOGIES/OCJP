package com.fintech;

public final record CreditCardMethod(String cardNumber,String issuer) implements PaymentMethod{

public CreditCardMethod{
	
	if(cardNumber == null && issuer == null){
	
	
	throw new IllegalArgumentException("Card number and issuer cannot both be null");
	
}

}

@Override 
public String accountIdentifier(){
	
	return cardNumber + " " + issuer;
	
}





}