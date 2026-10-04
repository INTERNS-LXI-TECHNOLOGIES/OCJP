	package com.ward;
		
		import java.util.*;
		
		import java.util.stream.Collectors;
		
		import static org.junit.jupiter.api.Assertions.*;
		
		import org.junit.jupiter.api.Test;
		
		
		public class Level3QuestionsTest {
		
			
			@Test 
			void testCitizenLookup() {
			
				Map<String, WardGovernanceHackathon.Citizen> citizenLookup = new HashMap<>();
			
					citizenLookup.put("C001", new WardGovernanceHackathon.Citizen("C001", "Ravi", 42, "East Colony"));
					citizenLookup.put("C002", new WardGovernanceHackathon.Citizen("C002", "Anitha", 35, "West Colony"));
					citizenLookup.put("C003", new WardGovernanceHackathon.Citizen("C003", "Suresh", 67, "Temple Road"));
					citizenLookup.put("C004", new WardGovernanceHackathon.Citizen("C004", "Meena", 28, "East Colony"));
					citizenLookup.put("C005", new WardGovernanceHackathon.Citizen("C005", "Joseph", 74, "Market Road"));
					citizenLookup.put("C006", new WardGovernanceHackathon.Citizen("C006", "Lakshmi", 51, "Temple Road"));     
					citizenLookup.put("C007", new WardGovernanceHackathon.Citizen("C007", "Arun", 22, "West Colony"));       
					citizenLookup.put("C008", new WardGovernanceHackathon.Citizen("C008", "Bindu", 45, "Market Road"));
				
				
					WardGovernanceHackathon.Citizen citizen = citizenLookup.get("C005");
					
					
					assertNotNull(citizen);
					assertEquals("Joseph", citizen.name());
					assertEquals("C005", citizen.id());
			
			
			
				// Question 17
				
				assertTrue(citizenLookup.containsKey("C007"));
				assertFalse(citizenLookup.containsKey("C009"));
			
			
			
			
				// Question 18 
		
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

				
				Map<String, Integer> count = new HashMap<>();
				
				for (String category : complaintCategories) {
					
					count.merge(category, 1, Integer::sum); 
					
				}
		
				assertEquals(3, count.get("Road"));
				assertEquals(3, count.get("Water"));

				// do the remaining too
				
				
				
				
				
				// Question 19 
				
					Map<String, Long> categoryCount =
								complaintCategories.stream()
												   .collect(Collectors.groupingBy(
														category -> category,
														Collectors.counting()
												   
													));
										
					
					assertEquals(3L, categoryCount.get("Road"));
					assertEquals(3L, categoryCount.get("Water"));
					
			
		
		
			 
			 
			 
				// Question 20 
							
				
				List<WardGovernanceHackathon.Complaint> complaints = List.of(      

					new WardGovernanceHackathon.Complaint("CMP001", "C001", "Road", 2, "OPEN"),  
					new WardGovernanceHackathon.Complaint("CMP002", "C003", "Water", 1, "OPEN"), 
					new WardGovernanceHackathon.Complaint("CMP003", "C002", "Road", 3, "RESOLVED"), 
					new WardGovernanceHackathon.Complaint("CMP004", "C007", "Streetlight", 2, "OPEN"),     
					new WardGovernanceHackathon.Complaint("CMP005", "C004", "Waste", 3, "OPEN"),          
					new WardGovernanceHackathon.Complaint("CMP006", "C005", "Water", 1, "RESOLVED"),        
					new WardGovernanceHackathon.Complaint("CMP007", "C001", "Road", 1, "OPEN"),            
					new WardGovernanceHackathon.Complaint("CMP008", "C008", "Streetlight", 3, "RESOLVED"), 
					new WardGovernanceHackathon.Complaint("CMP009", "C006", "Waste", 2, "OPEN"),            
					new WardGovernanceHackathon.Complaint("CMP010", "C003", "Water", 3, "OPEN")    

				);      
			
				Map<String, List<WardGovernanceHackathon.Complaint>> grouped = new HashMap<>();
		
				for (WardGovernanceHackathon.Complaint complaint : complaints) {
					
					grouped.computeIfAbsent(
							complaint.category(),
							key -> new ArrayList<>()
					).add(complaint);
					
				}
				
				assertEquals(4, grouped.size());
				
				assertEquals(3, grouped.get("Road").size());
			
			
			
			
				// Question 21
			
				assertEquals(3, grouped.get("Road").size());
				assertEquals("CMP001", grouped.get("Road").get(0).id());
				assertEquals("CMP003", grouped.get("Road").get(1).id()); 
				assertEquals("CMP007", grouped.get("Road").get(2).id());
				
				assertEquals(3, grouped.get("Water").size()); 
				assertEquals("CMP002", grouped.get("Water").get(0).id());
				assertEquals("CMP006", grouped.get("Water").get(1).id()); 
				assertEquals("CMP010", grouped.get("Water").get(2).id());
			
			
			
				// Question 22
				
				
				List<WardGovernanceHackathon.Project> projects = List.of(      

					new WardGovernanceHackathon.Project( 
					
						"P001",                      
						"East Colony Road",      
						"ENGINEERING",                     
						850000,                      
						"ONGOING"             

					),             

					new WardGovernanceHackathon.Project(        

						"P002",     
						"Water Tank Renovation",     
						"WATER",                     
						450000,                      
						"COMPLETED"           

					),      

					new WardGovernanceHackathon.Project(       

						"P003",   
						"Streetlight Upgrade",   
						"ELECTRICITY",            
						275000,                   
						"ONGOING"             

					),               


					new WardGovernanceHackathon.Project(               

						"P004",               
						"School Toilet",     
						"EDUCATION",          
						325000,               
						"PROPOSED"           

					),                

					new WardGovernanceHackathon.Project(             

						"P005",               
						"Waste Collection Point",     
						"SANITATION",                 
						180000,                      
						"COMPLETED"            

					)       

		
				);    
				
				
				Map<String, WardGovernanceHackathon.Project> projectLookup = new HashMap<>();
				
				for(WardGovernanceHackathon.Project project : projects) {
					
					projectLookup.put(project.id(), project);
					
				}
			
				WardGovernanceHackathon.Project project = projectLookup.get("P003");
				
				
			
				assertNotNull(project);
				assertEquals("P003", project.id());
				assertEquals("Streetlight Upgrade", project.name());
			
			
			
			
			// Question 23
			
				Map<String, List<WardGovernanceHackathon.Project>> projectsByDepartment = new HashMap<>();
			
					for (WardGovernanceHackathon.Project projectDepartment : projects) {
						
						projectsByDepartment.computeIfAbsent(
							projectDepartment.department(),
							key -> new ArrayList<>()
						).add(projectDepartment);
						
						
					}
			
			
				assertEquals(5, projectsByDepartment.size());
			
				assertEquals(1, projectsByDepartment.get("ENGINEERING").size()); 
				assertEquals(1, projectsByDepartment.get("WATER").size());
				assertEquals(1, projectsByDepartment.get("EDUCATION").size());
				
				assertEquals("P001", projectsByDepartment.get("ENGINEERING").get(0).id());
				assertEquals("P003", projectsByDepartment.get("ELECTRICITY").get(0).id());
				
			
			
			
			// Question 24
			
			
			Map<String, Long> projectsByStatus = projects.stream()
														 .collect(Collectors.groupingBy(
															projectStatus -> projectStatus.status(),
															Collectors.counting()
														 ));
		
			assertEquals(2L, projectsByStatus.get("ONGOING"));
			
			
			
			
			// Question 25
			
			Optional<WardGovernanceHackathon.Project> highestBudget = projects.stream()
																			  .max(Comparator.comparingDouble(
																				projectBudget -> projectBudget.budget()
																			  ));
				
			assertTrue(highestBudget.isPresent());
			assertEquals("P001", highestBudget.get().id());
		
			
			
			// Question 26
			
			
			List<WardGovernanceHackathon.Project> sortedProjects = projects.stream()
																			.sorted(Comparator.comparingDouble(
																					projectBudget -> projectBudget.budget()
																			))
																			.toList();
			
			assertEquals("P005", sortedProjects.get(0).id());
			assertEquals("P003", sortedProjects.get(1).id());
			assertEquals("P004", sortedProjects.get(2).id());
			
			
			
			// Question 27
			
			
			Map<String, Double> budgetByDepartment = projects.stream()
															 .collect(Collectors.groupingBy(
																	projectBudgetDepartment -> projectBudgetDepartment.department(),
																	Collectors.summingDouble(
																		projectBudgetDepartment -> projectBudgetDepartment.budget()
																	)
															
															 ));
				
					assertEquals(850000.0, budgetByDepartment.get("ENGINEERING"));
					assertEquals(450000.0, budgetByDepartment.get("WATER"));
					assertEquals(275000.0, budgetByDepartment.get("ELECTRICITY"));
					assertEquals(325000.0, budgetByDepartment.get("EDUCATION"));
					assertEquals(180000.0, budgetByDepartment.get("SANITATION"));
		
			
			
			// Question 28
			
			Map<String, WardGovernanceHackathon.Project> projectsById = new TreeMap<>();
				
				for (WardGovernanceHackathon.Project projectId : projects) {
					
					projectsById.put(projectId.id(), project);
					
				}
		
			assertEquals(
					List.of("P001", "P002", "P003", "P004", "P005"),
					new ArrayList<>(projectsById.keySet())
			);



			
			
			// Question 29
			
			Map<String, WardGovernanceHackathon.Project> projectsBy29 = new LinkedHashMap<>();
			
			for (WardGovernanceHackathon.Project project29 : projects) {
					
					projectsBy29.put(project29.id(), project29);
				
			}
			
			  assertEquals(
						List.of("P001", "P002", "P003", "P004", "P005"),
						new ArrayList<>(projectsBy29.keySet())
				);
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		}