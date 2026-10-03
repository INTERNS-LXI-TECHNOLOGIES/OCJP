package com.fintech;
import java.util.*;


public class ComplaintCategories{
	public static void main (String [] args){
		  Set<String> complaintCategories = new HashSet<>(List.of( 
		  "Road",
		  "Water",
		  "Road",
		  "Streetlight",
		  "Water",
		  "Waste",
		  "Road",
		  "Streetlight",
		  "Waste",
		  "Water" ));
		  
		  
		System.out.println(complaintCategories);
		
		System.out.println("--------------------------------------------------------------------");
		
		Set<String> complaintCategories2 = new LinkedHashSet<>(List.of( 
		  "Road",
		  "Water",
		  "Road",
		  "Streetlight",
		  "Water",
		  "Waste",
		  "Road",
		  "Streetlight",
		  "Waste",
		  "Water" ));
		  
		  System.out.println(complaintCategories2);
		  
		  System.out.println("--------------------------------------------------------------------");
		  
		  
		SortedSet<String> complaintCategories3 = new TreeSet<>(List.of( 
		  "Road",
		  "Water",
		  "Road",
		  "Streetlight",
		  "Water",
		  "Waste",
		  "Road",
		  "Streetlight",
		  "Waste",
		  "Water" ));
		  
		  System.out.println(complaintCategories3);
		  
		  System.out.println("--------------------------------------------------------------------");
		  
		  List<String> complaintIds = List.of(
		  "CMP001",
		  "CMP002",
		  "CMP003",
		  "CMP001",
		  "CMP004",
		  "CMP002",
		  "CMP005" );
		  
		  
		  Set<String> seen = new HashSet<>();
		 Set<String> duplicates = new HashSet<>();
		 
		 for(String complaintId : complaintIds){
			 if(!seen.add(complaintId)){
				 duplicates.add(complaintId);
				 
			 }
		 }
		 System.out.println(duplicates);
		 
		 System.out.println("--------------------------------------------------------------------");
		 
		  Map<String, Set<String>> volunteerSkills = new HashMap<>(Map.of(                 
		  "Ravi",new HashSet<>( Set.of("DRIVING", "FIRST_AID", "ELECTRICAL")),
		  "Anitha",new HashSet<>( Set.of("TEACHING", "FIRST_AID")),  
		  "Suresh",new HashSet<>( Set.of("DRIVING", "ELECTRICAL")),  
		  "Meena",new HashSet<>( Set.of("TEACHING", "FIRST_AID", "COUNSELLING")), 
		  "Arun",new HashSet<>( Set.of("DRIVING", "ELECTRICAL", "FIRST_AID")))); 
			
	      Set<String> raviSkills = volunteerSkills.get("Ravi");
		  Set<String> arunSkills = volunteerSkills.get("Arun");
		  
		  raviSkills.retainAll(arunSkills);
		  
		  System.out.println(raviSkills);
		  
		  System.out.println("--------------------------------------------------------------------");
		 
		  Set<String> sureshSkills = volunteerSkills.get("Suresh");
		  
		  raviSkills.removeAll(sureshSkills);
		  
		  System.out.println(raviSkills);
		  
		  System.out.println("--------------------------------------------------------------------");
		  
		  for(Map.Entry<String, Set<String>> entry : volunteerSkills.entrySet()){
			  if(entry.getValue().contains("FIRST_AID")){
				  System.out.println(entry.getKey());
			  }
		  }
		  
		  
	}
}