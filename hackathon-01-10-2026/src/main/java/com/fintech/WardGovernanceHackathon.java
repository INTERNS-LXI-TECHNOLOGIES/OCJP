package com.fintech;
import java.util.*;
import java.util.stream.*;
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
)implements Comparable<Project> {
	
	
	@Override
	public int compareTo(Project other){
		
		
		return this.id().compareTo(other.id());
		
		
	}
	
	
	
	
}

// my class 
public static class AgeComparator implements Comparator<Citizen>{

@Override
public int compare(Citizen one,Citizen two){
	
	
	return Integer.compare(one.age,two.age);
		
}

}



// my class 
public static class HighestProjectComparator implements Comparator<Project>{
	
	
	
	@Override
	public int compare(Project one,Project two){
		
		
		return Double.compare(one.budget,two.budget);
		
		
		
		
	}
	
	
	
	
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
	
	   System.out.println("**************  Question 13 — Skills Unique to Ravi  ************ ");
	
Set<String> sureshSkills = volunteerSkills.get("Suresh");
	
	Set<String> raviUniqueSkills  = new HashSet<>(raviSkills);
	
	
raviUniqueSkills.removeAll(sureshSkills);
	
	
System.out.println("Skills unique to Ravi: " + raviUniqueSkills );
	
	
	
	//Question 14 — Volunteers With First Aid
	
	 System.out.println("**************  Question 14 — Volunteers With First Aid  ************ ");
	
	
	List<String> volunteer =  volunteerSkills.entrySet()
	                .stream()
					.filter(n -> n.getValue().contains("FIRST_AID"))
					.map(n -> n.getKey())
					.toList();
	
	
	                          
	System.out.println(volunteer);
	
	
	
	//Question 15 — Citizens Ordered by Age
	 System.out.println("**************  Question 15 — Citizens Ordered by Age  ************ ");
	 
	 
	 
	 TreeSet<Citizen>  treeSetAgeByOrder   = new TreeSet<>(new AgeComparator());
	 
	 for(Citizen c : citizens){

       treeSetAgeByOrder.add(c);
		 
		 
		 
	 }
	 
	 System.out.println(treeSetAgeByOrder);
	
	
	
	
	//Question 16 — Citizen Lookup
	 System.out.println("**************  Question 16 — Citizen Lookup  ************ ");
	
	
	Map<String,Citizen> accesByIdKey = new HashMap<>(); 
	
	
	Citizen cc1 = citizens.get(0);
    Citizen cc2 = citizens.get(1);
    Citizen cc3 = citizens.get(2);
    Citizen cc4 = citizens.get(3);		
		 
		 
		 
		
	
	
	accesByIdKey.put("c001",cc1);
	accesByIdKey.put("c002",cc2);
	accesByIdKey.put("c003",cc3);
	accesByIdKey.put("c004",cc4);
	
	System.out.println(accesByIdKey.get("c001"));
	
	
	
	
	
	
	
	//Question 17 — Check Citizen Existence
	System.out.println("**************  Question 17 — Check Citizen Existence  ************ ");
	
	
   System.out.println(accesByIdKey.containsKey("c009"));
	





//Question 18 — Count Complaints by Category
System.out.println("**************  Question 18 — Count Complaints by Category  ************ ");



for(Complaint c : complaints){
	
	
	
	
	
	
}






//Question 19 — Count Using Streams

System.out.println("**************  Question 19 — Count Using Streams  ************ ");


Map<String,Long> complaintsCount = complaints.stream()
                                              .collect(Collectors.groupingBy(n -> n.category(),Collectors.counting()));





	  
    

complaintsCount.forEach((category,count) -> System.out.println(category + " : "  + count)); 





//Question 20 — Group Complaints by Category

System.out.println("**************  Question 20 — Group Complaints by Category  ************ ");

Map<String,List<Complaint>> categoryComplaint =  complaints.stream()
                                                          .collect(Collectors.groupingBy( n -> n.category()));
														   



														   


categoryComplaint.forEach((category,list) -> {
	
	System.out.println(category);
	
	list.forEach(c -> System.out.println("  " + c.id()));
	
	
});


System.out.println("**************  Question 21 — Group Complaints by Citizen  ************ ");
//Question 21 — Group Complaints by Citizen


Map<String,List<Complaint>> groupComplaintsByCitizen = complaints.stream()
                                                                 .collect(Collectors.groupingBy(n ->n.citizenId()));
																 
																 
																 
																 
groupComplaintsByCitizen.forEach((citizen,listTwo)  ->{
	
	
	
	System.out.println(citizen);
	listTwo.forEach(c -> System.out.println( c.category()));
	
	
	
	
	
	
});

System.out.println("**************  Question 22 — Project Lookup  ************ ");
//Question 22 — Project Lookup

Map<String,Project> lookup = new HashMap<>();


/*
List<Project> projects = List.of(
new Project(
"P001",
"East Colony Road",
"ENGINEERING",
850000,
"ONGOING"
),

*/

Project p1 = projects.get(0);


lookup.put("P001",p1);

System.out.println(lookup.get("P001"));


System.out.println("**************  Question 23 — Projects by Department  ************ ");
//Question 23 — Projects by Department




           Map<String,List<Project>>  projectsByDepartment =    projects.stream()
			          .collect(Collectors.groupingBy(n -> n.department()));



projectsByDepartment.forEach((department,list) -> {
	
	
	System.out.println(department);
	
	
	list.forEach(n -> System.out.println(n.name()));
	
	
	
	
});

System.out.println("**************  Question 24 — Projects by Status  ************ ");

//Question 24 — Projects by Status


Map<String,Long>  projectsbyStatus = projects.stream()
                                             .collect(Collectors.groupingBy( n -> n.status(),Collectors.counting()));
											 
											
											
projectsbyStatus.forEach((Project,count) -> System.out.println(Project + " : " + count));




//Question 25 — Highest-Budget Project
System.out.println("**************  Question 25 — Highest-Budget Project  ************ ");

        Project  highBudegetProject =   projects.stream()
		           .max(Comparator.comparing(n -> n.budget()))
				   .orElseThrow();
				   
				System.out.println(highBudegetProject);
                




//Question 26 — Projects by Budget
System.out.println("**************  Question 26 — Projects by Budget  ************ ");

Set<Project> projectsByBudget = new TreeSet<>(new HighestProjectComparator());



for(Project p : projects){
	
	
	projectsByBudget.add(p);
	
	
}


System.out.println(projectsByBudget);

//Question 27 — Department-wise Budget

System.out.println("**************  Question 27 — Department-wise Budget  ************ ");


Map<String,Double> deptWiseBudget = projects.stream()
                                                   .collect(Collectors.groupingBy(n -> n.department(),Collectors.summingDouble(n -> n.budget())))
												   ;

deptWiseBudget.forEach((dept, total) -> System.out.println(dept + " : " + total));



//Question 28 — Sorted Project Registry
System.out.println("**************  Question 28 — Sorted Project Registry  ************ ");


Map<String,Project>  sortedProjectRegistry = new TreeMap<>();



for(Project p : projects){
	
	sortedProjectRegistry.put(p.id(),p );
	
}


System.out.println(sortedProjectRegistry);



//Question 29 — Project Registration Order
System.out.println("**************  Question 29 — Project Registration Order  ************ ");


Map<String,Project> registrationOrder = new LinkedHashMap<>();
	
	
	
	for(Project p : projects){
	
	registrationOrder.put(p.id(),p );
	
}
	
	
	System.out.println(registrationOrder);
	
	










//close	
}
}


