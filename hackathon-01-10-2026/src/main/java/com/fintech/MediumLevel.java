
package com.fintech;
public final record MediumLevel(String reason) implements RiskLevel{



public String reason(){
	
	return "Payment : Medium Level";
	
}






}