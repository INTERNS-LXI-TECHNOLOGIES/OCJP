package com.fintech;
import java.util.*;

public class WardGovernanceHackathon {
	
	
	
record Citizen  (
String id,
String name,
int age,
String area
) {
	
	
}
record Complaint(
String id,
String citizenId,
String category,
int priority,
String status
) {
	
	
	}
	
	




record Project(
String id,
String name,
String department,
double budget,
String status
) {
	
}



public static void main(String[] args) {
	
	
List<Citizen> citizens = List.of(
new Citizen("C001", "Ravi", 42, "East Colony"),
new Citizen("C001", "Ravi", 42, "East Colony"),
new Citizen("C002", "Anitha", 35, "West Colony"),
new Citizen("C003", "Suresh", 67, "Temple Road"),
new Citizen("C004", "Meena", 28, "East Colony"),
new Citizen("C005", "Joseph", 74, "Market Road"),
new Citizen("C006", "Lakshmi", 51, "Temple Road"),
new Citizen("C007", "Arun", 22, "West Colony"),
new Citizen("C008", "Bindu", 45, "Market Road")
);




List<String> visits = new ArrayList<>(List.of("Road inspection",
"Anganwadi visit",
"Water tank inspection",
"School visit",
"Health centre visit"));



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
new Complaint("CMP010", "C003", "Water", 3, "OPEN"),
new Complaint("CMP010", "C003", "Water", 3, "OPEN"),
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



//Question 1 
List<Citizen> citizensList = new ArrayList<>();
 
 
 for(Citizen c : citizens ){
	 
	 citizensList.add(c); 
	 
	 
 }
 
 

 Citizen c3 = new Citizen("C006", "Ravi Don", 42, "East Colony west");
 
 
citizensList.add(c3);

citizensList.remove(c3);

citizensList.removeIf(n -> n.id().equals("C001"));

System.out.println(citizensList);


System.out.println("My Size : " + citizensList.size());


//Question 2

System.out.println("************** QUESTION 2 OUT PUT  ************ ");

System.out.println("Get : " + citizensList.get(0));
System.out.println("Get First : " + citizensList.getFirst());
System.out.println("Get Last : " + citizensList.getLast());



//Question 3 — Emergency Activity
System.out.println("************** Question 3 — Emergency Activity   ************ ");

System.out.println("Befor api call Result : " + visits);
visits.addFirst("Flooding inspection");
	
visits.addLast("Market sanitation inspection");	
	
	System.out.println("After Api call Result " + visits);
	
	
	
	
	//Question 4 — Reverse Activity Timeline
	
	System.out.println("************** Question 4 — Reverse Activity Timeline   ************ ");
	
		System.out.println(	"REVERSED");
	System.out.println(visits.reversed());
	
	
	
	//Question 5 — Remove Inspection Activities
	
	
	System.out.println("**************  Question 5 — Remove Inspection Activities   ************ ");
	
	



visits.removeIf(n -> n.toLowerCase().contains("inspection"));
		 
		 
		 
		 System.out.println(visits);

   
   
   
   //Question 6 — Citizens of an Area
   
   System.out.println("**************  Question 6 — Citizens of an Area   ************ ");


List<Citizen> east = citizens.stream()
        .filter(n -> n.area().equals("East Colony"))
        .toList();		

System.out.println(east);
System.out.println(east.size());
   
   
   //Question 7 — ArrayList vs LinkedList
   System.out.println("**************  Question 7 — ArrayList vs LinkedList   ************ ");
   
   
   List<Citizen>  arList = new ArrayList<>();

   
   //Question 8 — Unique Complaint Categories
      System.out.println("**************  Question 8 — Unique Complaint Categories   ************ ");
   
   Set<String> complaintsSet = new HashSet<>();
   
   
   for(Complaint c : complaints){
	   
	   
	   
	   complaintsSet.add(c.category());
	   
	   
	   
	   
	   
	   
   }
   
   
   System.out.println(complaintsSet);
   
   
     //Question 9 — Unique Categories in First-Seen Order
   
   
    System.out.println("**************  Question 9 — Unique Categories in First-Seen Order   ************ ");
 
   Set<String> maintainTheOrder = new LinkedHashSet<>(); 
   
    for(Complaint c : complaints){
		
	
     maintainTheOrder.add(c.category());
	
		
	}
   
   
   System.out.println("Maintine Order : " + maintainTheOrder);
   
   
   
   //Question 10 — Sorted Complaint Categories
   
   System.out.println("**************  Question 10 — Sorted Complaint Categories   ************ ");
   
   
   
   Set<String> alphabaticalOrderSorting = new   TreeSet<>();
   
   
   for(Complaint c : complaints){
	   
	   
	   
	   alphabaticalOrderSorting.add(c.category());
	   
	   
	   
	   
	   
   }
   
   
   System.out.println("AlPhabatical Sorting :" + alphabaticalOrderSorting);
   
   
   
   
   
   //Question 11 — Duplicate Complaint IDs
   
   System.out.println("**************  Question 11 — Duplicate Complaint IDs   ************ ");
   
   
   
  Set<String> seen = new HashSet<>();
List<String> duplicates = new ArrayList<>();

for (Complaint c : complaints) {

    if (!seen.add(c.id())) {
        duplicates.add(c.id());
    }
}

System.out.println("Duplicate IDs found: " + duplicates);

   


//Question 12 — Common Volunteer Skills
     System.out.println("**************  Question 12 — Common Volunteer Skills  ************ ");
   
  

  

   


   Set<String> arunSkills = volunteerSkills.get("Arun");
   Set<String> raviSkills = volunteerSkills.get("Ravi");
   
   Set<String> commonSkills = new HashSet<>(raviSkills);
   
  commonSkills.retainAll(arunSkills);
    
	System.out.println("CommonSkills : " + commonSkills);
	
	
	
	
	
	
	//Question 13 — Skills Unique to Ravi
	
Set<String> sureshSkills = volunteerSkills.get("Suresh");
	
	Set<String> raviUniqueSkills  = new HashSet<>(raviSkills);
	
	
raviUniqueSkills.removeAll(sureshSkills);
	
	
System.out.println("Skills unique to Ravi: " + raviUniqueSkills );
	
	
}





}


