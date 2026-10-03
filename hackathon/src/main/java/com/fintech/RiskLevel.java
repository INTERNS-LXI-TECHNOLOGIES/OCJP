	package com.fintech;

	public sealed interface RiskLevel permits LowRisk, MediumRisk, HighRisk {

		
	public String reason() ;





	}