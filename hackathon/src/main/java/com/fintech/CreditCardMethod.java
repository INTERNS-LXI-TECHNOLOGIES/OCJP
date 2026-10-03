	package com.fintech;

	public final record CreditCardMethod (String cardNumber, String issuer) implements PaymentMethod {


		public CreditCardMethod {
		
			if (cardNumber == null || cardNumber.isBlank()) {
			
				throw new IllegalArgumentException ("Card Number is Null Or Blank");
			
			}
		
		}

		
		@Override
		public String getAccountIdentifier() {
		
			return cardNumber +" "+ issuer ;
		
		}
		


	}