	package com.fintech;

	import org.junit.jupiter.api.Test;

	import static org.junit.jupiter.api.Assertions.*;

	class RiskLevelTest {



		@Test
		void testGetSymbol() {
		
			LowRisk l = new LowRisk("Server failure");
			assertEquals("Server failure", l.reason());
		
			MediumRisk m = new MediumRisk("Insecure Application code or API's");
			assertEquals("Insecure Application code or API's", m.reason());
			
			HighRisk h = new HighRisk("Robbery");
			assertEquals("Robbery", h.reason());
		  
			
		}

	   
	}