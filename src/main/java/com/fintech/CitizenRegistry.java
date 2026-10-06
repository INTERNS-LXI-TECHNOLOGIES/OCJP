package com.fintech;
import java.util.*;

public class CitizenRegistry{
	public static void main( String [] args){
		
		 List<WardGovernanceHackathon.Citizen> citizens = new ArrayList<>(List.of(new WardGovernanceHackathon.Citizen("C001", "Ravi", 42, "East Colony"),
		 new WardGovernanceHackathon.Citizen("C002", "Anitha", 35, "West Colony"),
		 new WardGovernanceHackathon.Citizen("C003", "Suresh", 67, "Temple Road"),
		 new WardGovernanceHackathon.Citizen("C004", "Meena", 28, "East Colony"),
		 new WardGovernanceHackathon.Citizen("C005", "Joseph", 74, "Market Road"),
		 new WardGovernanceHackathon.Citizen("C006", "Lakshmi", 51, "Temple Road"),
		 new WardGovernanceHackathon.Citizen("C007", "Arun", 22, "West Colony"),
		 new WardGovernanceHackathon.Citizen("C008", "Bindu", 45, "Market Road"))); 
		 
		 citizens.add(new WardGovernanceHackathon.Citizen("C009", "Thomas" ,39, "Hill Road" ) );
		 citizens.remove(3);
		 
		 
		 System.out.println(citizens);
		 
		 System.out.println("--------------------------------------------------------------------");
		 
		 citizens.add(3,new WardGovernanceHackathon.Citizen("C004", "Meena", 28, "East Colony") );
		 System.out.println(citizens.getFirst());
		 System.out.println(citizens.get(3));
		 System.out.println(citizens.getLast());
		 
		 System.out.println("--------------------------------------------------------------------");
		 
		 
		  List<String> visits = new LinkedList<>(List.of(
		  "Road inspection",
		  "Anganwadi visit",
		  "Water tank inspection",
		  "School visit",
		  "Health centre visit"));
		  
		  visits.addFirst("Flooding inspection");
		  visits.addLast("Market sanitation inspection");
		  
		  System.out.println(visits);
		  
		  
		  System.out.println("--------------------------------------------------------------------");
		  
		  Collections.reverse(visits);
		  System.out.println(visits);
		  
		  System.out.println("--------------------------------------------------------------------");
		  
		  visits.removeIf(visit -> visit.contains("inspection"));
		  System.out.println(visits);
		  
		  System.out.println("--------------------------------------------------------------------");
		  
		  List<WardGovernanceHackathon.Citizen> result = citizens.stream()
		  .filter(citizen -> citizen.area().equals("East Colony"))
		  .toList();
		  
		  System.out.println(result);
		  System.out.println("--------------------------------------------------------------------");		  
		  
		  
		  citizens.sort(Comparator.comparingInt(WardGovernanceHackathon.Citizen::age)
		  .thenComparing(WardGovernanceHackathon.Citizen::name));
		  
		  citizens.forEach(citizen-> System.out.println(citizen.name()));	
		 
		 System.out.println("--------------------------------------------------------------------");
		 
		 Map <String,String> citizens1 = new HashMap<>();
		 citizens1.put("C001","Citizen Ravi");
		 citizens1.put("C002","Citizen Anitha");
		 citizens1.put("C003","Citizen Suresh");
		 citizens1.put("C004","Citizen Meena");
		 citizens1.put("C005","Citizen Joseph");
		 citizens1.put("C006","Citizen Lakshmi");
		 citizens1.put("C007","Citizen Arun");
		 citizens1.put("C008","Citizen Bindu");
		 
		 System.out.println(citizens1.get("C005"));
		 
		 System.out.println("--------------------------------------------------------------------");
		 
		 System.out.println(citizens1.containsKey("C007"));
		 System.out.println(citizens1.containsKey("C099"));
	}

}