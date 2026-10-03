	package com.ward;
	
	import java.util.*;
	
	public class Level2Questions {
	
	
		public static void main (String[] args) {
		
		
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
			
			
			
			// Question 8
			
			
			Set<String> uniqueComplaintCategories = new HashSet<>();

			
			for (String category : complaintCategories) {
				
				uniqueComplaintCategories.add(category);
				
			}
		
		
			System.out.println(uniqueComplaintCategories);
		
		
		
		
			// Question 9
			
			Set<String> orderComplaintCategories = new LinkedHashSet<>();
			
			for (String category : complaintCategories) {
				
				orderComplaintCategories.add(category);
				
			}
		
			System.out.println(orderComplaintCategories);
		
		
		
		
			// Question 10
			
			Set<String> sortedComplaintCategories = new TreeSet<>();
			
			for (String category : complaintCategories) {
				
				sortedComplaintCategories.add(category);
				
			}
	
			System.out.println(sortedComplaintCategories);
		
		
		
		
		
			// Question 11
			
				List<String> complaintIds = List.of(
					"CMP001",
					"CMP002",
					"CMP003",
					"CMP001",
					"CMP004",
					"CMP002",
					"CMP005"
				);


				Set<String> seen = new HashSet<>();
				Set<String> duplicates = new HashSet<>();
				
				for (String id : complaintIds) {
					
					if (!seen.add(id)) {
						
						duplicates.add(id);
						
					}
					
					
				}
		
				System.out.println(duplicates);
		
		
		
		
		}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}