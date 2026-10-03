package com.fintech;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class RiskLevelTest {


    @Test
    void testRisk() {
		LowRisk l = new LowRisk ("server down");
        assertEquals("server down" , l.reason());
        MediumRisk m = new MediumRisk ("server crashes");
        assertEquals("server crashes" , m.reason());
		HighRisk h = new HighRisk ("machine crashed");
        assertEquals("machine crashed" , h.reason());
    }
	
}