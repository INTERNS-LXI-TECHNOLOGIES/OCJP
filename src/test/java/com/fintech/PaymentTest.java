package com.fintech;
import java.math.BigDecimal;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class PaymentTest {


    @Test
    void testPaymentRequest() {
		CreditCardMethod cm = new CreditCardMethod("12345678","Ramesh");
		BankTransferMethod bm = new BankTransferMethod("8129anand","SBI987");
		ThirdPartyGatewayMethod tm = new ThirdPartyGatewayMethod("RazorPay");
	
		PaymentRequest pr = new PaymentRequest("1",cm,new BigDecimal("10000"),Currency.USD,new LowRisk("server down"));
		
		assertEquals("1" , pr.transactionId());
		
    }
	
}