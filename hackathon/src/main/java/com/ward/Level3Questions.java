	package com.ward;

	import java.util.*;
	import java.util.stream.Collectors;
	
	public class Level3Questions {
	
		public static void main (String[] args) {
		
		
			Map<String, WardGovernanceHackathon.Citizen> citizenLookup = new HashMap<>();
			
			citizenLookup.put("C001", new WardGovernanceHackathon.Citizen("C001", "Ravi", 42, "East Colony"));
			citizenLookup.put("C002", new WardGovernanceHackathon.Citizen("C002", "Anitha", 35, "West Colony"));
			citizenLookup.put("C003", new WardGovernanceHackathon.Citizen("C003", "Suresh", 67, "Temple Road"));
			citizenLookup.put("C004", new WardGovernanceHackathon.Citizen("C004", "Meena", 28, "East Colony"));
			citizenLookup.put("C005", new WardGovernanceHackathon.Citizen("C005", "Joseph", 74, "Market Road"));
			citizenLookup.put("C006", new WardGovernanceHackathon.Citizen("C006", "Lakshmi", 51, "Temple Road"));     
			citizenLookup.put("C007", new WardGovernanceHackathon.Citizen("C007", "Arun", 22, "West Colony"));       
			citizenLookup.put("C008", new WardGovernanceHackathon.Citizen("C008", "Bindu", 45, "Market Road"));
		
		// Question 16
		
			WardGovernanceHackathon.Citizen citizen = citizenLookup.get("C005");
			
			System.out.println(citizen);
		
		
		
		// Question 17 
		
			System.out.println(citizenLookup.containsKey("C007"));
			System.out.println(citizenLookup.containsKey("C009"));
			
		
		
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
				
				count.merge(category, 1, Integer::sum); // If the category exists, increase its count by 1; otherwise, create it with count 1.
				
			}
		
			System.out.println(count);
		
		
		
			// Question 19 
			
				Map<String, Long> CategoryCount =
					complaintCategories.stream()
									   .collect(Collectors.groupingBy(
											category -> category,
											Collectors.counting()
									   
									    ));
									
				System.out.println(CategoryCount);
		
		
		
		
		
		
		
		
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
		
				System.out.println(grouped);
		
		
		
		
			// Question 21
			
			for (Map.Entry<String, List<WardGovernanceHackathon.Complaint>> entry : grouped.entrySet()) {
				
				System.out.println(entry.getKey() + " -> ");
				
				
				for (WardGovernanceHackathon.Complaint complaint : entry.getValue()) {
					
					System.out.print(complaint.id() + " ");
					
				}
				
				System.out.println();
				
			}
		
		
		
		
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
			
			System.out.println(project);
		
		
		
		
		
			// Question 23

			
			Map<String, List<WardGovernanceHackathon.Project>> projectsByDepartment = new HashMap<>();
			
			for (WardGovernanceHackathon.Project projectDepartment : projects) {
				
				projectsByDepartment.computeIfAbsent(
					projectDepartment.department(),
					key -> new ArrayList<>()
				).add(projectDepartment);
				
				
			}
		
			for (Map.Entry<String, List<WardGovernanceHackathon.Project>> entry : projectsByDepartment.entrySet()) {
				
				System.out.print(entry.getKey() + " -> ");
				
				for(WardGovernanceHackathon.Project projectDepartment : entry.getValue()) {
					
					System.out.print(projectDepartment.id() +" ");
					
				}
				
				System.out.println();
				
			}
		
		
		
		
		
			// Question 24
			
			Map<String, Long> projectsByStatus = projects.stream()
														 .collect(Collectors.groupingBy(
															projectStatus -> projectStatus.status(),
															Collectors.counting()
														 ));
		
			System.out.println(projectsByStatus);	
		
		
		
		
			// Question 25
			
			Optional<WardGovernanceHackathon.Project> highestBudget = projects.stream()
																			  .max(Comparator.comparingDouble(
																				projectBudget -> projectBudget.budget()
																			  ));
																			  
			System.out.println(highestBudget.get());																  
		
		
		
		
			// Question 26
			
				projects.stream()
					    .sorted(Comparator.comparingDouble(
							projectBudget -> projectBudget.budget()
						))
						.forEach(System.out::println);  //prints each project one by one. & it is a method reference
		
		
		
		
			// Question 27
			
			Map<String, Double> budgetByDepartment = projects.stream()
															 .collect(Collectors.groupingBy(
																	projectBudgetDepartment -> projectBudgetDepartment.department(),
																	Collectors.summingDouble(
																		projectBudgetDepartment -> projectBudgetDepartment.budget()
																	)
															
															 ));
				System.out.println(budgetByDepartment);
		
		
		
		
		
		
			
			
			// Question 28
			
				Map<String, WardGovernanceHackathon.Project> projectsById = new TreeMap<>();
				
				for (WardGovernanceHackathon.Project projectId : projects) {
					
					projectsById.put(projectId.id(), project);
					
				}
		
				System.out.println(projectsById);
		
		
		
		
			// Question 29
			
			
				
			Map<String, WardGovernanceHackathon.Project> projectsBy29 = new LinkedHashMap<>();
			
			for (WardGovernanceHackathon.Project project29 : projects) {
					
					projectsBy29.put(project29.id(), project29);
				
			
			
				
				System.out.println(project29.id() + " " + project29);
				
			}
			
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		}
	
	
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
