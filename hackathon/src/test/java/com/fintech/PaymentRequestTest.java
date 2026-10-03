	package com.fintech;

	import org.junit.jupiter.api.Test;

	import static org.junit.jupiter.api.Assertions.*;
	
	import java.math.BigDecimal;

	class PaymentRequestTest {



		@Test
		void testPaymentRequest() {
		
		
			CreditCardMethod c = new CreditCardMethod("2345","TK");
			BankTransferMethod b = new BankTransferMethod("S123","SBI");
			ThirdPartyGatewayMethod t = new ThirdPartyGatewayMethod("RazorPay");
		
		
			PaymentRequest p = new PaymentRequest("1", c , new BigDecimal("1000"), Currency.INR, new LowRisk("application crashes"));
			assertEquals("1",p.transactionId());
			assertEquals(new BigDecimal("1000"),p.amount());
			assertEquals(Currency.INR, p.currency());
			assertEquals(new LowRisk("application crashes"),p.riskLevel());
																																														
			
			
		}
		
			
		@Test
		void testTransactionVerifier() {
			
			BankTransferMethod b = new BankTransferMethod("F345","HDFC");
			PaymentRequest p = new PaymentRequest("2", b, new BigDecimal("2000"), Currency.USD, new HighRisk("robbery"));
			TransactionVerifier tv1 = new TransactionVerifier();
			assertEquals("BankTransferMethod Verified",tv1.verifyTransaction(p));
			
			System.out.println(p);
			
			
			
			CreditCardMethod c = new CreditCardMethod("3456","FS");
			PaymentRequest p2 = new PaymentRequest("3", c ,new BigDecimal("2500"), Currency.CHF, new MediumRisk("hacked"));
			TransactionVerifier tv2 = new TransactionVerifier();
			assertEquals("CreditCardMethod Verified", tv2.verifyTransaction(p2));
			
			ThirdPartyGatewayMethod t = new ThirdPartyGatewayMethod("G-Pay");
			PaymentRequest p3 = new PaymentRequest("4", t, new BigDecimal("100"), Currency.GBP, new LowRisk("Payment not recieved"));
			TransactionVerifier tv3 = new TransactionVerifier();
			assertEquals("ThirdPartyGatewayMethod Verified", tv3.verifyTransaction(p3));
			
			
			
			
			
			
		}








		
			
			
		

	   
	}