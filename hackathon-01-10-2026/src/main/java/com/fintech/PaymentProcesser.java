package com.fintech;
import java.math.BigDecimal;

public class PaymentProcesser{

public String processTransaction(Object obj){

BigDecimal warningAmound = new BigDecimal(10000.00);


String data = switch(obj){

case  PaymentRequest(String id ,CreditCardMethod(String cardNumber,String issuer),BigDecimal amount,Currency currency,HighLevel (String reason)) 

when amount.compareTo(warningAmound) >0 && 

currency == Currency.USD -> { 


yield "fruad transaction found Card Id : " + cardNumber + " Issuer is : " + issuer  + "Reason : " + reason;


}



case PaymentRequest(String id, PaymentMethod paymentMethod ,BigDecimal amount,Currency currency,HighLevel(String reason)) -> {

		
	yield "This transaction  is a High Risk Transaction currency is : " + currency.getSymbol() + " Reason is :" + reason;
	
}


case PaymentRequest(String id,BankTransferMethod(String iban,String swiftCode),BigDecimal amount,Currency currency,LowLevel(String reason)) 

 ->{
	
	

	yield  "Auto Aprove | swift code :  " + swiftCode + "Iban : " + iban + "Currency Is : " + currency.getSymbol();
	
}


case PaymentRequest(String id,ThirdPartyGatewayMethod tpgm,BigDecimal amount,Currency currency,RiskLevel riskLevel)  -> {
	   
	   
	  
	yield "ThirdPartyGatewayMethod  Account Identifier : " +  tpgm.accountIdentifier() + "Currency : " + currency.getSymbol();
	
	
	
}

case null -> "Reject Your  Null Request !!!! ";



default -> "no data found";


};



return "payment processing " + data;

}



}







