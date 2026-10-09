
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
        ) {}

        record Complaint(
                String id,
                String citizenId,
                String category,
                int priority,
                String status,
                LocalDate registeredOn
        ) {}

        record Project(
                String id,
                String name,
                String department,
                double budget,
                String status,
                LocalDate startDate
        ) {}


        record Activity(
                LocalDate date,
                String type,
                String description
        ) {}

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

        Map<String,Citizen> mapcitizen=citizens.stream().collect(Collectors.toMap(Citizen::id,c->c));
System.out.println("Citizen Index: "+mapcitizen.get("C008"));

//2
        Map<String,List<Citizen>> area=citizens.stream().collect(Collectors.groupingBy(c->c.area()));
        System.out.println("Citizens by Area : "+area);

//3

      Map<String ,Long> population=  citizens.stream().collect(Collectors.groupingBy(Citizen::area,Collectors.counting()));
        System.out.println("Calculate population by area. : "+population);

 //4
        Map<String,List<Citizen>> byage=citizens.stream().collect(Collectors.groupingBy(a->{
            if(a.age()<18)
                return "CHILD";
            else if(a.age()>=18 && a.age()<=35)
                return "YOUTH";
            else if(a.age()>=36 && a.age()<=59)
                return "ADULT";
            else
                return "SENIOR";
        }));
        System.out.println("YOUTH : "+byage.get("YOUTH"));
        System.out.println("ADULT : "+byage.get("ADULT"));
        System.out.println("SENIOR : "+byage.get("SENIOR"));


 //5




    }
}
