	package com.ward;

	import java.util.*;
	
	public class Level1Questions {
	
	
		public static void main (String[] args) {
		
		
		// Question 1
		
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
				
				System.out.println(citizens);
				
				citizens.remove(3);
				
				System.out.println(citizens);
				
				
				
			// Question 2

				System.out.println(citizens.get(0));
		
				System.out.println(citizens.get(3));
				
				System.out.println(citizens.getLast());
				
				
				
				
				
			// Question 3



			List<String> visits = new ArrayList<>();  

				visits.add("Road inspection");        
				visits.add("Anganwadi visit");      
				visits.add("Water tank inspection"); 
				visits.add("School visit");            
				visits.add("Health centre visit");      
				
				
				System.out.println(visits);
				
				
				visits.addFirst("Flooding inspection");
				
				System.out.println(visits);
				
				
				visits.addLast("Market sanitation inspection");
				
				System.out.println(visits);




			// Question 4
			
				System.out.println(visits.reversed());
				
				
				
				
				
			// Question 5


				visits.removeIf(activity ->
							
								activity.toLowerCase().contains("inspection")
								
							);

				System.out.println(visits);




			
			// Question 6
			
			
			List<WardGovernanceHackathon.Citizen> eastColonyCitizen = citizens.stream()
													  .filter(citizen -> citizen.area().equals("East Colony"))
													  .toList();
			
				System.out.println("East Colony: ");
				System.out.println(eastColonyCitizen);
			
			
			
			
			
			// Question 7
			
			List<WardGovernanceHackathon.Citizen> arrayList = new ArrayList<>();
			
			List<WardGovernanceHackathon.Citizen> linkedList = new LinkedList<>();
			
			
			
			
			
			
			
			
			
			
			
			
			
			
		
		
		}
	
	

	
	}