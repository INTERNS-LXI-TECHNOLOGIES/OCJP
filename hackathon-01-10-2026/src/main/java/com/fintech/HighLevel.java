
package com.fintech;
public final record HighLevel(String reason) implements RiskLevel{




public String reason(){
	
	return "Payment: High Level";
	
}




}