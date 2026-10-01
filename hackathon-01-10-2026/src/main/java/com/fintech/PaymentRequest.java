package com.fintech;

import java.math.BigDecimal;

public record PaymentRequest(String transactionId,PaymentMethod paymentMethod,BigDecimal amount,Currency currency,RiskLevel riskLevel)implements Auditable{



public void auditTransaction(String transatcionId){
	
	System.out.println(transactionId);
	
}

public String toString(){
	
	return transactionId + " " + paymentMethod + " " + amount + " " + currency + " " + 
	
	riskLevel;
	
}

}