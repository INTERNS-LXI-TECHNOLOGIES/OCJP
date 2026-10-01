
package com.fintech;

import java.math.BigDecimal;
 
public class TransactionVerifier{

public String verifyTransaction(Object obj){

if(obj instanceof PaymentRequest(String transactionId,BankTransferMethod(String iban,String swiftCode),BigDecimal amount,Currency currency,RiskLevel riskLevel)){
	

	
  return "Bank transfer is verified using BankTransferMethod";

}else if(obj instanceof PaymentRequest(String transactionId,CreditCardMethod(String cardNumber,String issuer),BigDecimal amount,Currency currency,RiskLevel riskLevel) ){
	
	return "Bank transfer is verified using CreditCardMethod";
	
}else if(obj instanceof PaymentRequest(String transactionId,ThirdPartyGatewayMethod tpgm,BigDecimal amount,Currency currency,RiskLevel riskLevel)){
	
	return "Bank transfer is verified using ThirdPartyGatewayMethod";
	
}


 return "Unable to verify transaction";

}

}