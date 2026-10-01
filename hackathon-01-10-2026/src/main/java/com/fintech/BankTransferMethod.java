package com.fintech;
public final record BankTransferMethod(String iban,String swiftCode)implements  PaymentMethod{



@Override 
public String accountIdentifier(){
	
	
	return iban + " " + swiftCode;
	
	
}

}