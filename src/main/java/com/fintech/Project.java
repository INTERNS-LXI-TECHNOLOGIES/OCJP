package com.fintech;
import java.util.*;
import java.util.stream.Collectors;

public class Project{
public static void main (String [] args){
	
 Map<String,String> projects1= new HashMap<>();
				
				projects1.put("P001", "East Colony Road");
				projects1.put("P002", "Water Tank Renovation");
				projects1.put("P003", "Streetlight Upgrade");
				projects1.put("P004", "School Toilet");
				projects1.put("P005", "Waste Collection Point");
				
				System.out.println(projects1.get("P003"));
				
				System.out.println("--------------------------------------------------------------------");
				
				
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
                        "COMPLETED" ));
						
				Map<String,List<WardGovernanceHackathon.Project>> projects2 = new HashMap<>();
				
				for(WardGovernanceHackathon.Project project:projects){ 
					projects2.computeIfAbsent(project.department(),key -> new ArrayList<>())
						.add(project);
						
					
					System.out.println(projects2);
				}
				
				System.out.println("--------------------------------------------------------------------");
				
				Map<String,Long> projectsByStatus = projects.stream()
				.collect(Collectors.groupingBy(project -> project.status(),Collectors.counting()));
				
				System.out.println(projectsByStatus);
				
				System.out.println("--------------------------------------------------------------------");
				
					Optional<WardGovernanceHackathon.Project> highestBudgetProject = projects.stream()
					.max(Comparator.comparingDouble(project -> project.budget()));
					
					System.out.println(highestBudgetProject);
					
					System.out.println("--------------------------------------------------------------------");
					
					projects.stream()
					.sorted(Comparator.comparingDouble(project -> project.budget()))
					.forEach(System.out::println);
					
					System.out.println("--------------------------------------------------------------------");
					
					Map<String,Double> departmentWiseBudget = projects.stream()
					.collect(Collectors.groupingBy(project -> project.department(),Collectors.summingDouble(project -> project.budget())));
					System.out.println(departmentWiseBudget);
					
					System.out.println("--------------------------------------------------------------------");
					
					Map<String,String> sortedProjects= new TreeMap<>();
				
				sortedProjects.put("P001", "East Colony Road");
				sortedProjects.put("P002", "Water Tank Renovation");
				sortedProjects.put("P003", "Streetlight Upgrade");
				sortedProjects.put("P004", "School Toilet");
				sortedProjects.put("P005", "Waste Collection Point");
				
				System.out.println(sortedProjects);
				
				System.out.println("--------------------------------------------------------------------");
				
				Map<String,String> projectRegistrationOrder = new LinkedHashMap<>();
				
				projectRegistrationOrder.put("P001", "East Colony Road");
				projectRegistrationOrder.put("P002", "Water Tank Renovation");
				projectRegistrationOrder.put("P003", "Streetlight Upgrade");
				projectRegistrationOrder.put("P004", "School Toilet");
				projectRegistrationOrder.put("P005", "Waste Collection Point");
				
				System.out.println(projectRegistrationOrder);
				
}
}