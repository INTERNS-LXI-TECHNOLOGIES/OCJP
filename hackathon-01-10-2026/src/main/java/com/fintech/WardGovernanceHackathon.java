package com.fintech;

import java.util.*;
import java.util.stream.*;
public class WardGovernanceHackathon {
	
	
	
// enum  1
public enum AgeGroup{
	
	
	CHILD(0,17),YOUTH(18,35),ADULT(36,55),SENIOR(56,100);
	
	 private final int min;
     private final int max;
	
	
	
	AgeGroup(int min, int max){
		
		this.min = min;
		this.max = max;
		
	}
	
public int getMin(){
	
	return min;
	
}
public int geMax(){
	
	return max;
	
}

public static  AgeGroup fromAge(int age){
	
	if(age < 18)return CHILD;
	if(age <= 35) return YOUTH;
	if(age <= 55) return ADULT;
	
	
	return SENIOR;
		
	
	
	
}



	
}	
	
		
	
record Citizen  (
String id,
String name,
int age,
String area,
AgeGroup ageGroup

) {
	
	
	public Citizen(String id, String name, int age, String area) {
        this(id, name, age, area, AgeGroup.fromAge(age));
	
	
}
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





// my class 

public static class AreaPopulationOrder implements Comparator<Map.Entry<String, Long>> {

    @Override
    public int compare(Map.Entry<String, Long> one, Map.Entry<String, Long> two) {
       
        int countCompare = two.getValue().compareTo(one.getValue());

        if (countCompare != 0) {
            return countCompare;
        }

        return one.getKey().compareTo(two.getKey());
    }
}
	

// my class 
/*
public static  class AgeByOrdering implements Comparator<Citizen>{


public int compare(Citizen one,Citizen two){
	

	
	
	
	
}

*/


public static class PriortyComparator implements Comparator<Complaint>{
	
	
	
	@Override
	public int compare(Complaint one,Complaint two){
		
		return Integer.compare(one.priority(),two.priority());
		
	}
	
	
	
}

	
	







public static void main(String[] args) {
	
	                 
List<Citizen> citizens = List.of(
new Citizen("C010", "Aarav", 10, "East Colony"),
new Citizen("C011", "Ananya", 15, "West Colony"),
new Citizen("C012", "Diya", 7, "Temple Road"),
new Citizen("C001", "Ravi", 42, "East Colony"),
new Citizen("C001", "Ravi", 42, "East Colony"),
new Citizen("C002", "Anitha", 35, "West Colony"),
new Citizen("C003", "Suresh", 67, "Temple Road"),
new Citizen("C004", "Meena", 28, "East Colony"),
new Citizen("C005", "Joseph", 74, "Market Road"),
new Citizen("C006", "Lakshmi", 51, "Temple Road"),
new Citizen("C007", "Arun", 22, "West Colony"),
new Citizen("C008", "Bindu", 45, "Market Road"),
new Citizen("C009", "Thomas", 39, "East Colony"),
new Citizen("C010", "Leela", 63, "Temple Road"),
new Citizen("C011", "George", 31, "West Colony"),
new Citizen("C012", "Devika", 58, "Market Road")

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
"P006",
"Streetlight Upgrade pathiripala",
"ELECTRICITY",
10000,
"ONGOING"),

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
	
	
	
	//HACKATHON 2 
	
	System.out.println("$$$$$$$$$$   HACKATHON 2   $$$$$$$$$$$ ");
	
	
	
		System.out.println("$$$$$$$$$$ QUESTION 1 — Citizen Index   $$$$$$$$$$$ ");
	
	//QUESTION 1 — Citizen Index
	
	Map<String,Citizen> frequentlyReceives = new HashMap<>();
	
	for(Citizen c : citizens){
		
		
		frequentlyReceives.put(c.id,c);
		
		
	}
	
	
	Citizen data  = frequentlyReceives.get("C008");
	
	
	System.out.println(data);
	
	
		//QUESTION 2 — Citizens by Area
	
		System.out.println("$$$$$$$$$$ QUESTION 2 — Citizens by Area   $$$$$$$$$$$ ");
	
        Map<String,List<Citizen>> wardBase =   citizens.stream()
		
		                                   .collect(Collectors.groupingBy(n -> n.area()));
	  
	  
	  
	  wardBase.forEach((area , citicens)  ->{
		  
		  
		  System.out.println("Area : " + area);
		  
		  citicens.forEach( n -> System.out.println(n.name()));
		  
		  
		  
		  
	  });
	  
	  
	  
	  //QUESTION 3 — Area Population Ranking
	  System.out.println("$$$$$$$$$$ QUESTION 3 — Area Population Ranking   $$$$$$$$$$$ ");
	  
	  

	  
      	   Map<String,Long> areaBase = citizens.stream()
		
		                                       .collect(Collectors.groupingBy(n -> n.area(),Collectors.counting()));
	                                      


	    

	  areaBase.entrySet().stream()
        .sorted(new AreaPopulationOrder())
        .forEach(entry -> System.out.println("Area : " + entry.getKey() + " : " + entry.getValue()));
	  
	  
	 
      //QUESTION 4 — Citizen Age Groups
	 	  System.out.println("$$$$$$$$$$ QUESTION 4 — Citizen Age Groups   $$$$$$$$$$$ ");


         Map<AgeGroup,List<Citizen>>  ageBySort = new TreeMap<>();

           
             ageBySort = citizens.stream()
			           .collect(Collectors.groupingBy(n -> AgeGroup.fromAge(n.age()))); 
			   
			   
			   
	System.out.println(ageBySort.get(AgeGroup.CHILD));
	
	
	
	//QUESTION 5 — Complaint Index by Citizen
	 	  System.out.println("$$$$$$$$$$  QUESTION 5 — Complaint Index by Citizen  $$$$$$$$$$$ ");
	      
		
		 System.out.println(getAllComplaints(complaints,"C001"));







//QUESTION 6 — Open Complaint Work Queue
System.out.println("$$$$$$$$$$  QUESTION 6 — Open Complaint Work Queue  $$$$$$$$$$$ ");




	      

 
Queue<Complaint> processingQueue = complaints.stream()
        .filter(n -> "OPEN".equals(n.status()) )
        .collect(Collectors.toCollection(() -> new PriorityQueue<>(new PriortyComparator())));



while (!processingQueue.isEmpty()) {
    Complaint nextComplaint = processingQueue.poll();
    System.out.println(nextComplaint);
}



System.out.println("$$$$$$$$$$  QUESTION 7 — Highest Priority Complaint  $$$$$$$$$$$ ");
//QUESTION 7 — Highest Priority Complaint
System.out.println(processingQueue.peek());



//QUESTION 8 — Complaint Category × Status

/*

new Complaint("CMP001", "C001", "Road", 2, "OPEN"),


record Complaint(
String id,
String citizenId,
String category,
int priority,
String status
) {
	

	
	
	}
*/

System.out.println("$$$$$$$$$$  QUESTION 8 — Complaint Category × Status  $$$$$$$$$$$ ");


Map<String,Map<String,Long>> status = complaints.stream()
                                                 .collect(Collectors.groupingBy(n -> n.category(),Collectors.groupingBy(n -> n.status(),  Collectors.counting())));



// QUESTION 9 — Complaint Resolution Rate
System.out.println("$$$$$$$$$$ QUESTION 9 — Complaint Resolution Rate  $$$$$$$$$$$ ");


long totalResolved = status.get("Water").get("RESOLVED");

long totalOpened = status.get("Water").get("OPEN");

		System.out.println("totalResolved : " + totalResolved);
		System.out.println("totalOpened : " +totalOpened);
long totalComplaints = totalResolved + totalOpened;

double percentage = (totalComplaints == 0) ? 0.0  : ((double) totalResolved / totalComplaints) * 100;

System.out.println("Percentage Of Resolved % " + percentage);



//QUESTION 10 — Categories Requiring Attention
System.out.println("$$$$$$$$$$ QUESTION 10 — Categories Requiring Attention  $$$$$$$$$$$ ");



for(Map.Entry<String,Map<String ,Long>>  outerMap : status.entrySet()){
	
	
Map<String ,Long>  innerMap = outerMap.getValue();


long open = innerMap.getOrDefault("OPEN", 0L);

    if (open >= 2) {
        
        System.out.println(outerMap.getKey());
    }
	
	
}

//QUESTION 11 — Unique Categories in Encounter Order

System.out.println("$$$$$$$$$$ QUESTION 11 — Unique Categories in Encounter Order  $$$$$$$$$$$ ");


Map<String,Complaint> uniquesCategory = new LinkedHashMap();



   for(Complaint c : complaints){
	   
	   
	   uniquesCategory.put(c.id(),c);
	   
	   
	   System.out.println(uniquesCategory);
	   
	   
   }   
//QUESTION 12 — Project IndexQUESTION 12 — Project Index
System.out.println("$$$$$$$$$$  QUESTION 12 — Project Index  $$$$$$$$$$$ ");
 
      System.out.println(giveMeProject(projects,"P005"));



//QUESTION 13 — Projects by Department
System.out.println("$$$$$$$$$$  QUESTION 13 — Projects by Department  $$$$$$$$$$$ ");




Map<String,List<Project>> projectsbyDepartment = projects.stream()
					                                     .collect(Collectors.groupingBy(n -> n.department()));



projectsByDepartment.get("ELECTRICITY")
                     .forEach(p -> System.out.println(p.department() + " = " + p.id() + " : " + p.name()));





//QUESTION 14 — Department Budget
System.out.println("$$$$$$$$$$  QUESTION 14 — Department Budget  $$$$$$$$$$$ ");
/*
record Project(
String id,
String name,
String department,
double budget,
String status
*/

//
Map<String,Double> projectsbyDepartmentCalculate  =  projects.stream()
					                                     .collect(Collectors.groupingBy(n -> n.department(),
														 Collectors.summingDouble(n -> n.budget())));



System.out.println(projectsbyDepartmentCalculate);





//QUESTION 15 — Largest Project per Department
System.out.println("$$$$$$$$$$  QUESTION 15 — Largest Project per Department  $$$$$$$$$$$ ");

Map<String,Optional<Project>> largestProjectperDepartment = projects.stream()
        .collect(Collectors.groupingBy(n -> n.department(),Collectors.maxBy(Comparator.comparing(n ->n.budget))));


largestProjectperDepartment.forEach((dept, optionalProject) -> {
    optionalProject.ifPresent(p -> 
        System.out.println(dept + " | " + p.id() + " : " + p.name() + " (Budget: " + p.budget() + ")")
    );
});
	
	





}//close main method 


		
   public static List<Complaint> getAllComplaints(List<Complaint> complaints,String citizenId){
	
			 
   Map<String,List<Complaint>>   onePersonComplaint = complaints.stream()
                                         .collect(Collectors.groupingBy(n -> n.citizenId()));

    		 
			onePersonComplaint.computeIfAbsent(citizenId , k -> new ArrayList());
			
		    return  onePersonComplaint.get(citizenId);	
		
		 }






public static Project giveMeProject(List<Project> projects,String projectId){
	
	
	Map<String,Project>  companyProjects = new HashMap<>();
	
	
	
	for(Project p : projects){
		
		
		
		companyProjects.put(p.id(),p);
		
		
		
	}
	
	
	return companyProjects.get(projectId);
	
	
}





} // main class close 



