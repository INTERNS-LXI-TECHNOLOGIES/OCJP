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
			
			
			Set<String> uniqueComplaintCategories = new HashSet<>();

			
			for (String category : complaintCategories) {
				
				uniqueComplaintCategories.add(category);
				
			}
		
		
			System.out.println(uniqueComplaintCategories);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}