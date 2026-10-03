	package com.fintech;

	import java.math.BigDecimal;
	

	public class TransactionVerifier {

	
	public String verifyTransaction(Object obj) {
	
		
		if (obj instanceof PaymentRequest(String transactionId, BankTransferMethod(String IBAN, String swiftCode), BigDecimal amount, Currency currency, RiskLevel riskLevel)) {
		
			return "BankTransferMethod Verified";
		
		} else if (obj instanceof PaymentRequest(String transactionId, CreditCardMethod(String cardNumber, String issuer), BigDecimal amount, Currency currency, RiskLevel riskLevel)) {
		
			return "CreditCardMethod Verified";
		
		}else if (obj instanceof PaymentRequest(String transactionId, ThirdPartyGatewayMethod gm , BigDecimal amount, Currency currency, RiskLevel riskLevel)) {
		
			return "ThirdPartyGatewayMethod Verified";
		
		}
		
			return "Transaction Failed";
		
		
		
		}
	
	}


