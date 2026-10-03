	package com.ward;
	
	import java.util.*;
	
	import static org.junit.jupiter.api.Assertions.*;
	
	import org.junit.jupiter.api.Test;
	
	
	public class Level2QuestionsTest {
	
	
	@Test
	void testUniqueComplaintCategories() {
	
		List<String> complaintCategories = List.of(      

				"Road",     
				"Water",       
				"Road",            
				"Streetlight",     
				"Water",           
				"Waste",           
				"Road",            
				"Streetlight",    
				"Waste",          
				"Water"     

			);   
			
			Set<String> uniqueComplaintCategories = new HashSet<>();

			
			for (String category : complaintCategories) {
				
				uniqueComplaintCategories.add(category);
				
			}
		
		
			assertEquals(4,uniqueComplaintCategories.size());
			
			assertTrue(uniqueComplaintCategories.contains("Road"));
			assertTrue(uniqueComplaintCategories.contains("Water"));
			assertTrue(uniqueComplaintCategories.contains("Waste"));
	
			
			//Question 9
	
			Set<String> orderComplaintCategories = new LinkedHashSet<>();
			
			for (String category : complaintCategories) {
				
				orderComplaintCategories.add(category);
				
			}
	
			Iterator<String> iterator = orderComplaintCategories.iterator();

	
			assertEquals("Road", iterator.next());
			assertEquals("Water", iterator.next());
	
	
	
	

			// Question 10 
			
			Set<String> sortedComplaintCategories = new TreeSet<>();
			
			for(String category : complaintCategories) {
				
				sortedComplaintCategories.add(category);
				
			}
	
			Iterator<String> iterators = sortedComplaintCategories.iterator();
	
			assertEquals("Streetlight", iterator.next());
	
	
	
	
			// Question 11 
			
			List<String> complaintIds = List.of(
					"CMP001",
					"CMP002",
					"CMP003",
					"CMP001",
					"CMP004",
					"CMP002",
					"CMP005"
				);
				
				Set<String> seen = new HashSet<>();
				Set<String> duplicates = new HashSet<>();
				
				for (String id : complaintIds) {
					
					if (!seen.add(id) ) {
						
						
						duplicates.add(id);
						
					}
						
				}
	
			
			assertEquals(2, duplicates.size());
			
			assertTrue(duplicates.contains("CMP001"));
			assertTrue(duplicates.contains("CMP002"));
	
	
	
	
			// Question 12
		
		
		
				Map<String, Set<String>> volunteerSkills = Map.of(       

					"Ravi", Set.of("DRIVING", "FIRST_AID", "ELECTRICAL"),            
					"Anitha", Set.of("TEACHING", "FIRST_AID"),              
					"Suresh", Set.of("DRIVING", "ELECTRICAL"),               
					"Meena", Set.of("TEACHING", "FIRST_AID", "COUNSELLING"),    
					"Arun", Set.of("DRIVING", "ELECTRICAL", "FIRST_AID")       

				);        


				Set<String> commonSkills = new HashSet<>(volunteerSkills.get("Ravi"));
				
				commonSkills.retainAll(volunteerSkills.get("Arun"));
				
				assertEquals(3, commonSkills.size());
				
				assertTrue(commonSkills.contains("DRIVING"));
				assertTrue(commonSkills.contains("ELECTRICAL"));
				assertTrue(commonSkills.contains("FIRST_AID"));
	
	
	
	
			// Question 13 
			
				
				Set<String> uniqueSkills = new HashSet<>(volunteerSkills.get("Ravi"));
				
				uniqueSkills.removeAll(volunteerSkills.get("Suresh"));
				
				assertEquals(1, uniqueSkills.size());
				
				assertTrue(uniqueSkills.contains("FIRST_AID"));
				
				
				
				
		

			// Question 14 
			
			
				Set<String> volunteers = new HashSet<>();
				
				for (Map.Entry<String, Set<String>> entry : volunteerSkills.entrySet()) {
					
					
					if (entry.getValue().contains("FIRST_AID")) {
						
						volunteers.add(entry.getKey());
						
					}
						
					
				}
	
				assertEquals(4, volunteers.size());
				
				assertTrue(volunteers.contains("Ravi"));
				
				
				
				
				assertFalse(volunteers.contains("Suresh"));
	
	
	
	
	}
	
	
	
	
	
	@Test
	void testCitizensSortedByAge() {
		
		
		List<WardGovernanceHackathon.Citizen> citizens = List.of(           
				
				new WardGovernanceHackathon.Citizen("C001", "Ravi", 42, "East Colony"),       
				new WardGovernanceHackathon.Citizen("C002", "Anitha", 35, "West Colony"),     
				new WardGovernanceHackathon.Citizen("C003", "Suresh", 67, "Temple Road"),     
				new WardGovernanceHackathon.Citizen("C004", "Meena", 28, "East Colony"),       
				new WardGovernanceHackathon.Citizen("C005", "Joseph", 74, "Market Road"),      
				new WardGovernanceHackathon.Citizen("C006", "Lakshmi", 51, "Temple Road"),     
				new WardGovernanceHackathon.Citizen("C007", "Arun", 22, "West Colony"),        
				new WardGovernanceHackathon.Citizen("C008", "Bindu", 45, "Market Road")     

				);
				
				Set<WardGovernanceHackathon.Citizen> sortedCitizens = new TreeSet<>(
				
																		Comparator.comparingInt(WardGovernanceHackathon.Citizen:: age)
																				  .thenComparing(WardGovernanceHackathon.Citizen:: name)
				
																		);
		
				sortedCitizens.addAll(citizens);
				
			
			List<WardGovernanceHackathon.Citizen> result = new ArrayList<>(sortedCitizens);
			
			assertEquals("Arun", result.get(0).name());
			assertEquals("Meena", result.get(1).name());
			assertEquals("Anitha", result.get(2).name());
			assertEquals("Ravi", result.get(3).name());
			assertEquals("Bindu", result.get(4).name());
			assertEquals("Lakshmi", result.get(5).name());
			assertEquals("Suresh", result.get(6).name());
			assertEquals("Joseph", result.get(7).name()); 
			
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	