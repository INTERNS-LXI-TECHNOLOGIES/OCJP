	package com.ward;

	import java.util.*;
	 
	public class WardGovernanceHackathon { 
	
	record Citizen(            
		String id, 
		String name,          
		int age,           
		String area    
		) {} 

	record Complaint(      
		String id,   
		String citizenId,   
		String category,       
		int priority,      
		String status    
		) {}     

	record Project(        
		String id,          
		String name,      
		String department,          
		double budget,         
		String status   
		) {}    


		public static void main(String[] args) {         

			List<Citizen> citizens = List.of(           
				
				new Citizen("C001", "Ravi", 42, "East Colony"),       
				new Citizen("C002", "Anitha", 35, "West Colony"),     
				new Citizen("C003", "Suresh", 67, "Temple Road"),     
				new Citizen("C004", "Meena", 28, "East Colony"),       
				new Citizen("C005", "Joseph", 74, "Market Road"),      
				new Citizen("C006", "Lakshmi", 51, "Temple Road"),     
				new Citizen("C007", "Arun", 22, "West Colony"),        
				new Citizen("C008", "Bindu", 45, "Market Road")     

			);   

			
			List<String> visits = List.of(    

				"Road inspection",        
				"Anganwadi visit",        
				"Water tank inspection",   
				"School visit",            
				"Health centre visit"      
				
				);       

				
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


			List<Complaint> complaints = List.of(      

				new Complaint("CMP001", "C001", "Road", 2, "OPEN"),  
				new Complaint("CMP002", "C003", "Water", 1, "OPEN"), 
                new Complaint("CMP003", "C002", "Road", 3, "RESOLVED"), 
                new Complaint("CMP004", "C007", "Streetlight", 2, "OPEN"),     
				new Complaint("CMP005", "C004", "Waste", 3, "OPEN"),          
				new Complaint("CMP006", "C005", "Water", 1, "RESOLVED"),        
				new Complaint("CMP007", "C001", "Road", 1, "OPEN"),            
				new Complaint("CMP008", "C008", "Streetlight", 3, "RESOLVED"), 
                new Complaint("CMP009", "C006", "Waste", 2, "OPEN"),            
				new Complaint("CMP010", "C003", "Water", 3, "OPEN")    

			);      


			List<Project> projects = List.of(      

				new Project( 
				
					"P001",                      
					"East Colony Road",      
					"ENGINEERING",                     
					850000,                      
					"ONGOING"             

				),             

				new Project(        

					"P002",     
                    "Water Tank Renovation",     
                    "WATER",                     
					450000,                      
					"COMPLETED"           

				),      

				new Project(       

					"P003",   
					"Streetlight Upgrade",   
					"ELECTRICITY",            
					275000,                   
					"ONGOING"             

				),               


				new Project(               

					"P004",               
					"School Toilet",     
                    "EDUCATION",          
					325000,               
					"PROPOSED"           

				),                

				new Project(             

					"P005",               
					"Waste Collection Point",     
                    "SANITATION",                 
					180000,                      
					"COMPLETED"            

				)       

	
			);    



			Map<String, Set<String>> volunteerSkills = Map.of(       

				"Ravi", Set.of("DRIVING", "FIRST_AID", "ELECTRICAL"),            
				"Anitha", Set.of("TEACHING", "FIRST_AID"),              
				"Suresh", Set.of("DRIVING", "ELECTRICAL"),               
				"Meena", Set.of("TEACHING", "FIRST_AID", "COUNSELLING"),    
				"Arun", Set.of("DRIVING", "ELECTRICAL", "FIRST_AID")       

			);        



		} 
		
		
	}  