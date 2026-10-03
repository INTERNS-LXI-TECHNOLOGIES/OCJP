	package com.ward;
	
	import java.util.*;
	
	public class Level2Questions {
	
	
		public static void main (String[] args) {
		
		
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
			
			
			
			// Question 8
			
			
			Set<String> uniqueComplaintCategories = new HashSet<>();

			
			for (String category : complaintCategories) {
				
				uniqueComplaintCategories.add(category);
				
			}
		
		
			System.out.println(uniqueComplaintCategories);
		
		
		
		
			// Question 9
			
			Set<String> orderComplaintCategories = new LinkedHashSet<>();
			
			for (String category : complaintCategories) {
				
				orderComplaintCategories.add(category);
				
			}
		
			System.out.println(orderComplaintCategories);
		
		
		
		
			// Question 10
			
			Set<String> sortedComplaintCategories = new TreeSet<>();
			
			for (String category : complaintCategories) {
				
				sortedComplaintCategories.add(category);
				
			}
	
			System.out.println(sortedComplaintCategories);
		
		
		
		
		
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
					
					if (!seen.add(id)) {
						
						duplicates.add(id);
						
					}
					
					
				}
		
				System.out.println(duplicates);
		
		
		
		
		
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
				
				System.out.println(commonSkills);
				
				
			

			// Question 13
			
				Set<String> uniqueSkills = new HashSet<>(volunteerSkills.get("Ravi"));
				
				uniqueSkills.removeAll(volunteerSkills.get("Suresh"));
				
				System.out.println(uniqueSkills);
			
		
		
		
			// Question 14
			
			
				for (Map.Entry<String, Set<String>> entry : volunteerSkills.entrySet()) {
					
					
					if (entry.getValue().contains("FIRST_AID")) {
						
						System.out.println(entry.getKey());
						
					}
					
					
					
				}
				
				
				
				
			// Question 15

			
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
				
				System.out.println("Ordered by age:");

				
				for(WardGovernanceHackathon.Citizen citizen : sortedCitizens) {
					
					System.out.println(citizen.name());
			
					
				}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}