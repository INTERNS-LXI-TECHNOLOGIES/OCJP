package com.fintech;
public non-sealed class ThirdPartyGatewayMethod implements PaymentMethod{
	private String gatewayName;
	public ThirdPartyGatewayMethod(String gatewayName){
		this.gatewayName = gatewayName;
	}
	public String getGatewayName(){
		return gatewayName;
	}
	public String getAccountIdentifier(){
		return gatewayName;
	}
}