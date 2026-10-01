package com.fintech;

public   sealed interface RiskLevel permits LowLevel,MediumLevel,HighLevel{



 public String reason();
 
	

}