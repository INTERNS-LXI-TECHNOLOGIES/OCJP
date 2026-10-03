	package com.ward;
	
	import java.util.*;
	
	import static org.junit.jupiter.api.Assertions.*;
	
	import org.junit.jupiter.api.Test;
	
	
	public class Level2QuestionsTest {
	
	
	@Test
	void testUniqueComplaintCategories() {
	
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
		
		
			assertEquals(4,uniqueComplaintCategories.size());
			
			assertTrue(uniqueComplaintCategories.contains("Road"));
			assertTrue(uniqueComplaintCategories.contains("Water"));
			assertTrue(uniqueComplaintCategories.contains("Waste"));
	
			
			//Question 9
	
			Set<String> orderComplaintCategories = new LinkedHashSet<>();
			
			for (String category : complaintCategories) {
				
				orderComplaintCategories.add(category);
				
			}
	
			Iterator<String> iterator = orderComplaintCategories.iterator();

	
			assertEquals("Road", iterator.next());
			assertEquals("Water", iterator.next());
	
	
	
	

			// Question 10 
			
			Set<String> sortedComplaintCategories = new TreeSet<>();
			
			for(String category : complaintCategories) {
				
				sortedComplaintCategories.add(category);
				
			}
	
			Iterator<String> iterators = sortedComplaintCategories.iterator();
	
			assertEquals("Streetlight", iterator.next());
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}