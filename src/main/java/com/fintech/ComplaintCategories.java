package com.fintech;
import java.util.*;
import java.util.stream.Collectors;

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
		  
		  System.out.println("--------------------------------------------------------------------");
		    List<String> complaintCategories4 = List.of( 
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
		  Map<String,Integer> categories = new HashMap<>();
		  
		  for(String complaintCategory : complaintCategories4){
			  categories.merge(complaintCategory,1,Integer::sum);
		  }
		  
		  System.out.println(categories);
		  
		  System.out.println("--------------------------------------------------------------------");
		  
		  Map<String,Long> complaints1 = complaintCategories4.stream()
		  .collect(Collectors.groupingBy(complaintcategory -> complaintcategory,Collectors.counting()));
		  
		  System.out.println(complaints1);
		  
		  
		  System.out.println("--------------------------------------------------------------------");
		  
		   List<WardGovernanceHackathon.Complaint> complaints = new ArrayList<>(List.of( 
                new WardGovernanceHackathon.Complaint("CMP001", "C001", "Road", 2, "OPEN"), 
                new WardGovernanceHackathon.Complaint("CMP002", "C003", "Water", 1, "OPEN"), 
                new WardGovernanceHackathon.Complaint("CMP003", "C002", "Road", 3, "RESOLVED"), 
                new WardGovernanceHackathon.Complaint("CMP004", "C007", "Streetlight", 2, "OPEN"), 
                new WardGovernanceHackathon.Complaint("CMP005", "C004", "Waste", 3, "OPEN"), 
                new WardGovernanceHackathon.Complaint("CMP006", "C005", "Water", 1, "RESOLVED"), 
                new WardGovernanceHackathon.Complaint("CMP007", "C001", "Road", 1, "OPEN"), 
                new WardGovernanceHackathon.Complaint("CMP008", "C008", "Streetlight", 3, "RESOLVED"), 
                new WardGovernanceHackathon.Complaint("CMP009", "C006", "Waste", 2, "OPEN"), 
                new WardGovernanceHackathon.Complaint("CMP010", "C003", "Water", 3, "OPEN") )); 
				
			Map<String,List<String>> complaintsByCategories = new HashMap<>();
			
			for(WardGovernanceHackathon.Complaint complaint : complaints){
				complaintsByCategories.computeIfAbsent(complaint.category(),key -> new ArrayList<>())
				.add(complaint.id());
			}
				
				System.out.println(complaintsByCategories);
				
					
	}
} 
