
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

    }
}
