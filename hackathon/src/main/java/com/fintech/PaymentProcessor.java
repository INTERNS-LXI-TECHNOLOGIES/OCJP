	package com.fintech;

	import java.math.BigDecimal;

	public class PaymentProcessor {

		public String ProcessTransaction(Object obj){
		

			return switch(obj) {
			
				case PaymentRequest(String transactionId, CreditCardMethod(String cardNumber, String issuer) , BigDecimal amount, Currency currency, HighRisk  hr)
					when amount.compareTo(new BigDecimal("10000")) <= 0 && currency == Currency.USD  -> {

					yield "Fraud Transaction"+" "+"transactionId: "+transactionId+" "+"cardNumber: "+cardNumber+" "+"issuer: "+issuer+"reason: "+ hr.reason();

					}
					
					
				case PaymentRequest (String transactionId, BankTransferMethod(String IBAN, String swiftCode), BigDecimal amount, Currency currency, HighRisk hr) -> {
					
					yield "High Risk Transaction"+" "+"Currency: "+" "+currency.getSymbol()+" "+"reason: "+hr.reason();
					
				}
					
				
				case PaymentRequest(String transactionId, BankTransferMethod(String IBAN, String swiftCode), BigDecimal amount, Currency currency, LowRisk lr) -> {
					
					yield "Auto Approval"+" "+"SwiftCode :"+swiftCode+" "+"IBAN Code: "+IBAN+" "+"Currency: "+currency.getSymbol();			
				}
					
				
				case PaymentRequest(String transactionId, ThirdPartyGatewayMethod gatewayName, BigDecimal amount, Currency currency, MediumRisk mr) -> {
					
					yield "Thirdparty rooted"+" "+"Account Identifier: "+ gatewayName.getAccountIdentifier() +" "+"Currency: "+currency.getSymbol();
				}
					
				
					
				case null ->"Rejected, Null Request";

			
				default -> "Unknown Transaction";
				
			
			
			};
			
		
	

	
		}
	
	
	}

	