	package com.fintech;

	public final record BankTransferMethod (String IBAN, String swiftCode) implements PaymentMethod {

		
		
		@Override 
		public String getAccountIdentifier() {
		
			return IBAN +" "+ swiftCode ;
		
		}




	}