	package com.ward;
	
	import static org.junit.jupiter.api.Assertions.*;
	
	import java.util.*;
	
	import org.junit.jupiter.api.Test;
	
	
	public class Level1QuestionsTest {
	
		@Test
		void testAddRemoveCitizen() {
		
			List<WardGovernanceHackathon.Citizen> citizens = new ArrayList<>();
			
				citizens.add(new WardGovernanceHackathon.Citizen("C001", "Ravi", 42, "East Colony"));       
				citizens.add(new WardGovernanceHackathon.Citizen("C002", "Anitha", 35, "West Colony"));    
				citizens.add(new WardGovernanceHackathon.Citizen("C003", "Suresh", 67, "Temple Road"));     
				citizens.add(new WardGovernanceHackathon.Citizen("C004", "Meena", 28, "East Colony"));       
				citizens.add(new WardGovernanceHackathon.Citizen("C005", "Joseph", 74, "Market Road"));      
				citizens.add(new WardGovernanceHackathon.Citizen("C006", "Lakshmi", 51, "Temple Road"));     
				citizens.add(new WardGovernanceHackathon.Citizen("C007", "Arun", 22, "West Colony"));      
				citizens.add(new WardGovernanceHackathon.Citizen("C008", "Bindu", 45, "Market Road"));
				citizens.add(new WardGovernanceHackathon.Citizen("C009", "Thomas", 39, "Hill Road"));
				
		
				//before removing
				assertEquals(9, citizens.size());
				
				//removing C004
				citizens.remove(3);
		
				//after removing 
				assertEquals(8, citizens.size());
				
				//checking C004 was removed 
				assertEquals("C005", citizens.get(3).id());
				
				
		
		

		
		}
		
		
		@Test
		void testFindCitizen() {
			
			
			
			List<WardGovernanceHackathon.Citizen> citizens = new ArrayList<>();
			
				citizens.add(new WardGovernanceHackathon.Citizen("C001", "Ravi", 42, "East Colony"));       
				citizens.add(new WardGovernanceHackathon.Citizen("C002", "Anitha", 35, "West Colony"));    
				citizens.add(new WardGovernanceHackathon.Citizen("C003", "Suresh", 67, "Temple Road"));     
				citizens.add(new WardGovernanceHackathon.Citizen("C004", "Meena", 28, "East Colony"));       
				citizens.add(new WardGovernanceHackathon.Citizen("C005", "Joseph", 74, "Market Road"));      
				citizens.add(new WardGovernanceHackathon.Citizen("C006", "Lakshmi", 51, "Temple Road"));     
				citizens.add(new WardGovernanceHackathon.Citizen("C007", "Arun", 22, "West Colony"));      
				citizens.add(new WardGovernanceHackathon.Citizen("C008", "Bindu", 45, "Market Road"));
				citizens.add(new WardGovernanceHackathon.Citizen("C009", "Thomas", 39, "Hill Road"));
				
				
				assertEquals("C001", citizens.get(0).id());
				
				assertEquals("C004", citizens.get(3).id());
				
				assertEquals("C009", citizens.getLast().id());
			
			
				
		}
	
	
	
	
		@Test
		void testEmergencyActivity() {
			
			
			List<String> visits = new ArrayList<>();
			
				visits.add("Road inspection");        
				visits.add("Anganwadi visit");      
				visits.add("Water tank inspection"); 
				visits.add("School visit");            
				visits.add("Health centre visit"); 
				
				
				visits.addFirst("Flooding inspection");
				
				visits.addLast("Market sanitation inspection");
				
				
				
				assertEquals("Flooding inspection", visits.getFirst());
				
				assertEquals("Market sanitation inspection", visits.getLast());
			
			
				assertEquals(
						List.of(
						
							"Market sanitation inspection",
							"Health centre visit",
							"School visit",
							"Water tank inspection",
							"Anganwadi visit",
							"Road inspection",
							"Flooding inspection"
						),
						
						visits.reversed()
						
				);		
			
			
			
			
				visits.removeIf(activity ->
								
									activity.toLowerCase().contains("inspection")
									
								);
								
				assertEquals(3, visits.size());

				assertFalse(visits.contains("Market sanitation inspection"));
				assertFalse(visits.contains("Water tank inspection"));
				assertFalse(visits.contains("Road inspection"));
				assertFalse(visits.contains("Flooding inspection"));
				
				assertTrue(visits.contains("Health centre visit"));
				assertTrue(visits.contains("School visit"));
				assertTrue(visits.contains("Anganwadi visit"));

			
			
			
			
			
			
			
			
				
				List<WardGovernanceHackathon.Citizen> citizens = new ArrayList<>();
				
					citizens.add(new WardGovernanceHackathon.Citizen("C001", "Ravi", 42, "East Colony"));       
					citizens.add(new WardGovernanceHackathon.Citizen("C002", "Anitha", 35, "West Colony"));    
					citizens.add(new WardGovernanceHackathon.Citizen("C003", "Suresh", 67, "Temple Road"));     
					citizens.add(new WardGovernanceHackathon.Citizen("C004", "Meena", 28, "East Colony"));       
					citizens.add(new WardGovernanceHackathon.Citizen("C005", "Joseph", 74, "Market Road"));      
					citizens.add(new WardGovernanceHackathon.Citizen("C006", "Lakshmi", 51, "Temple Road"));     
					citizens.add(new WardGovernanceHackathon.Citizen("C007", "Arun", 22, "West Colony"));      
					citizens.add(new WardGovernanceHackathon.Citizen("C008", "Bindu", 45, "Market Road"));
					citizens.add(new WardGovernanceHackathon.Citizen("C009", "Thomas", 39, "Hill Road"));
					
			
			
			
			
				List<WardGovernanceHackathon.Citizen> eastColonyCitizen = citizens.stream()
													  .filter(citizen -> citizen.area().equals("East Colony"))
													  .toList();
			
				assertEquals(2, eastColonyCitizen.size());
				
				assertEquals("C001", citizens.get(0).id());
				assertEquals("C004", citizens.get(3).id());
			
			
			
			
			
			
			
			
			
			
			
			
			
		}
	
	
	
	
	}