
package com.example;

import java.time.LocalDate;
import java.util.*;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {

        record Citizen(
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
                String status,
                LocalDate registeredOn
        ) {
        }

        record Project(
                String id,
                String name,
                String department,
                double budget,
                String status,
                LocalDate startDate
        ) {
        }


        record Activity(
                LocalDate date,
                String type,
                String description
        ) {
        }

        List<Complaint> complaints = List.of(
                new Complaint("CMP002", "C003", "Water", 1, "OPEN",
                        LocalDate.of(2025, 12, 13)),
                new Complaint("CMP003", "C002", "Road", 3, "RESOLVED",
                        LocalDate.of(2025, 12, 14)),
                new Complaint("CMP004", "C007", "Streetlight", 2, "OPEN",
                        LocalDate.of(2025, 12, 15)),
                new Complaint("CMP005", "C004", "Waste", 3, "OPEN",
                        LocalDate.of(2025, 12, 16)),
                new Complaint("CMP006", "C005", "Water", 1, "RESOLVED",
                        LocalDate.of(2025, 12, 17)),
                new Complaint("CMP007", "C001", "Road", 1, "OPEN",
                        LocalDate.of(2025, 12, 18)),
                new Complaint("CMP008", "C008", "Streetlight", 3, "RESOLVED",
                        LocalDate.of(2025, 12, 19)),
                new Complaint("CMP009", "C006", "Waste", 2, "OPEN",
                        LocalDate.of(2025, 12, 20)),
                new Complaint("CMP010", "C003", "Water", 3, "OPEN",
                        LocalDate.of(2025, 12, 21))
        );


        List<Citizen> citizens = List.of(
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


        //1

        Map<String, Citizen> mapcitizen = citizens.stream().collect(Collectors.toMap(Citizen::id, c -> c));
        System.out.println("Citizen Index: " + mapcitizen.get("C008"));

//2
        Map<String, List<Citizen>> area = citizens.stream().collect(Collectors.groupingBy(c -> c.area()));
        System.out.println("Citizens by Area : " + area);

//3

        Map<String, Long> population = citizens.stream().collect(Collectors.groupingBy(Citizen::area, Collectors.counting()));
        System.out.println("Calculate population by area. : " + population);

        //4
        Map<String, List<Citizen>> byage = citizens.stream().collect(Collectors.groupingBy(a -> {
            if (a.age() < 18)
                return "CHILD";
            else if (a.age() >= 18 && a.age() <= 35)
                return "YOUTH";
            else if (a.age() >= 36 && a.age() <= 59)
                return "ADULT";
            else
                return "SENIOR";
        }));
        System.out.println("YOUTH : " + byage.get("YOUTH"));
        System.out.println("ADULT : " + byage.get("ADULT"));
        System.out.println("SENIOR : " + byage.get("SENIOR"));


        //5

        Map<String, List<Complaint>> complaint = new HashMap<>();
        for (Complaint c : complaints) {
            complaint.computeIfAbsent(c.citizenId(), k -> new ArrayList<>()).add(c);

        }

        System.out.println("Complaint Index by Citizen : " + complaint);
        System.out.println("Complaint of C003 :  " + complaint.get("C003"));


//6
        List<Complaint> status = complaints.stream().filter(c -> c.status().equals("OPEN")).toList();

        PriorityQueue<Complaint> pq = new PriorityQueue<>(Comparator.comparingInt(Complaint::priority).thenComparing(Complaint::registeredOn));
        pq.addAll(status);

        while (pq.isEmpty()) {
            Complaint c = pq.poll();
            System.out.println("Priority complaint order : " + c);
        }

   //7

        System.out.println("Highest Priority Complaint: "+ pq.peek());


    }
}



