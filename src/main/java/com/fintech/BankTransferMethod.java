package com.fintech;
public final record BankTransferMethod (String IBAN , String swiftCode) implements PaymentMethod{
	public String getAccountIdentifier(){
		return IBAN+" "+swiftCode;
	}
	
}