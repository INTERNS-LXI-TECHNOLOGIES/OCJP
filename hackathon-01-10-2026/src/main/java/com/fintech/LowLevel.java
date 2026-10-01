package com.fintech;

public final record LowLevel(String reason) implements  RiskLevel{
	
	
public String reason(){
	
	return "Payment : Low Level Risk";
	
}







}