package com.fintech;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import com.fintech.LowLevel;
import com.fintech.MediumLevel;
import com.fintech.HighLevel;
import java.math.BigDecimal;


class TransactionTest{
	
    @Test
    void testTransactionMethods(){
		
	  CreditCardMethod  ccm = new CreditCardMethod("123","sunil");
	  BankTransferMethod bt = new BankTransferMethod("DE89370400440532013000","DBDE33XXX");
	  ThirdPartyGatewayMethod tpgm = new ThirdPartyGatewayMethod("razer pay");
	  
	  Currency  usd = Currency.USD;
	  Currency inr = Currency.INR;
	  Currency eur = Currency.EUR;
	  
	  
	  MediumLevel ml = new MediumLevel("medium level risk");
	  HighLevel hl = new HighLevel("High level risk");
	  LowLevel ll = new LowLevel("Low Level risk");
	  
	  BigDecimal bigDecimal = new BigDecimal("1500.50"); 
      BigDecimal bigDecimal1 = new BigDecimal("800.50"); 
      BigDecimal bigDecimal2 = new BigDecimal("5000.50");  	
      BigDecimal bigDecimal3 = new BigDecimal("10000.50");	  
	  
	  PaymentRequest pr1 = new PaymentRequest("123",ccm,bigDecimal,usd,ml);
	  PaymentRequest pr2 = new PaymentRequest("124",bt,bigDecimal1,inr,hl);
	  PaymentRequest  pr3 = new PaymentRequest("125",tpgm,bigDecimal2,eur,ml);
	  
	   
	  
	  
	  PaymentRequest pr4 = new PaymentRequest("126",ccm,bigDecimal3,usd,hl);
	  
	  PaymentRequest pr5 = new PaymentRequest("127",bt,bigDecimal1,usd,ll);
	  
	  
	  TransactionVerifier tv = new TransactionVerifier();
	  
	  String message = tv.verifyTransaction(pr2);
	  System.out.println("Message : " + message);
	 
       assertEquals("123 sunil",ccm.accountIdentifier());
	   assertEquals("DE89370400440532013000 DBDE33XXX",bt.accountIdentifier());
	   assertEquals("razer pay" ,tpgm.accountIdentifier());
	   
	   assertEquals("123" ,pr1.transactionId());
	   assertEquals("124" ,pr2.transactionId());
	   assertEquals("125" ,pr3.transactionId());
		
		
		// checking verifyTransaction method 
        assertEquals("Bank transfer is verified using BankTransferMethod",message);
        assertEquals("Bank transfer is verified using CreditCardMethod",tv.verifyTransaction(pr1));
		assertEquals("Bank transfer is verified using ThirdPartyGatewayMethod",tv.verifyTransaction(pr3));
		 
		 
		 PaymentProcesser pp = new PaymentProcesser();
		 
		 String processData = pp.processTransaction(pr3);
		 
		 System.out.println("Test the out put : " + processData);
		 
		 
		 // checking the Payment processing 
		 
		 //assertEquals("payment processing fruad transaction found Card Id : 123 Issuer is : sunilReason : Payment: High Level",
		 //processData);
		 
		 //assertEquals("payment processing This transaction  is a High Risk Transaction currency is : ? Reason is :Payment: High Level",
		 //processData);
		 
		 //assertEquals("payment processing Auto Aprove | swift code :  DBDE33XXXIban : DE89370400440532013000Currency Is : $",
		 //processData);
		 
		 assertEquals("payment processing ThirdPartyGatewayMethod  Account Identifier : razer payCurrency : ?",processData);
		 
		 
	   /*
        assertEquals("Im MediumLevel", ml.reason());
        assertEquals("Im HighLevel", hl.reason());
		
		*/
		
		
    }


}