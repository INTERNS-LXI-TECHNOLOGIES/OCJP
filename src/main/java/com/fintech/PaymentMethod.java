package com.fintech;
public sealed interface PaymentMethod permits BankTransferMethod , CreditCardMethod , ThirdPartyGatewayMethod {
	public String getAccountIdentifier();
}