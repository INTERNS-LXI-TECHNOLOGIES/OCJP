
package com.example;

import java.time.LocalDate;
import java.time.YearMonth;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {

    record Activity(
            LocalDate date,
            String type,
            String description
    ) {
    }

    static List<Activity> activities = List.of(
            new Activity(LocalDate.of(2026, 7, 10), "MEETING", "Ward meeting"),
            new Activity(LocalDate.of(2026, 7, 5), "CLEANUP", "Road cleaning"),
            new Activity(LocalDate.of(2026, 7, 10), "INSPECTION", "Road inspection"),
            new Activity(LocalDate.of(2026, 7, 15), "MEETING", "Project review"),
            new Activity(LocalDate.of(2026, 7, 5), "REPAIR", "Streetlight repair"),
            new Activity(LocalDate.of(2026, 8, 1), "CLEANUP", "Park cleaning")


    );


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

        List<Project> projects = List.of(
                new Project("P001", "East Colony Road", "ENGINEERING", 850000,
                        "ONGOING", LocalDate.of(2026, 7, 10)),

                new Project("P002", "Water Tank Renovation", "WATER", 450000,
                        "COMPLETED", LocalDate.of(2026, 6, 15)),

                new Project("P003", "Streetlight Upgrade", "ELECTRICITY", 275000,
                        "ONGOING", LocalDate.of(2026, 8, 5)),

                new Project("P004", "School Toilet", "EDUCATION", 325000,
                        "PROPOSED", LocalDate.of(2026, 7, 10)),

                new Project("P005", "Waste Collection Point", "SANITATION", 180000,
                        "COMPLETED", LocalDate.of(2026, 9, 1))
        );


        Map<String, Set<String>> volunteerSkills = Map.of(
                "Ravi", Set.of("DRIVING", "FIRST_AID", "ELECTRICAL"),
                "Anitha", Set.of("TEACHING", "FIRST_AID"),
                "Suresh", Set.of("DRIVING", "ELECTRICAL"),
                "Meena", Set.of("TEACHING", "FIRST_AID", "COUNSELLING"),
                "Arun", Set.of("DRIVING", "ELECTRICAL", "FIRST_AID")
        );
        //1

        Map<String, Citizen> mapcitizen = citizens.stream().collect(Collectors.toMap(Citizen::id, c -> c));
        System.out.println("1.Citizen Index: " + mapcitizen.get("C008"));

//2
        Map<String, List<Citizen>> area = citizens.stream().collect(Collectors.groupingBy(c -> c.area()));
        System.out.println("2.Citizens by Area : " + area);

//3

        Map<String, Long> population = citizens.stream().collect(Collectors.groupingBy(Citizen::area, Collectors.counting()));
        System.out.println("3.Calculate population by area. : " + population);

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
        System.out.println("4.YOUTH : " + byage.get("YOUTH"));
        System.out.println("4.ADULT : " + byage.get("ADULT"));
        System.out.println("4.SENIOR : " + byage.get("SENIOR"));


        //5

        Map<String, List<Complaint>> complaint = new HashMap<>();
        for (Complaint c : complaints) {
            complaint.computeIfAbsent(c.citizenId(), k -> new ArrayList<>()).add(c);

        }

        System.out.println("5.Complaint Index by Citizen : " + complaint);
        System.out.println("5.Complaint of C003 :  " + complaint.get("C003"));


//6
        List<Complaint> status = complaints.stream().filter(c -> c.status().equals("OPEN")).toList();

        PriorityQueue<Complaint> pq = new PriorityQueue<>(Comparator.comparingInt(Complaint::priority).thenComparing(Complaint::registeredOn));
        pq.addAll(status);

        while (pq.isEmpty()) {
            Complaint c = pq.poll();
            System.out.println("6.Priority complaint order : " + c);
        }

        //7

        System.out.println("7.Highest Priority Complaint: " + pq.peek());


        //8
        Map<String, Map<String, List<Complaint>>> nestedmap = new HashMap<>();
        Map<String, Map<String, List<Complaint>>> cs = complaints.stream().collect(Collectors.groupingBy(Complaint::category, Collectors.groupingBy(Complaint::status)));

        System.out.println("8.Complaint Category × Status :" + cs);

//9
        Map<String, Long> totalCount = complaints.stream().collect(Collectors.groupingBy(Complaint::category, Collectors.counting()));
        Map<String, Long> resolvedCount = complaints.stream().filter(c -> c.status().equals("RESOLVED")).collect(Collectors.groupingBy(Complaint::category, Collectors.counting()));

        for (String category : totalCount.keySet()) {
            long total = totalCount.get(category);
            long resolved = resolvedCount.getOrDefault(category, 0L);
            double rate = (resolved * 100.0) / total;
            System.out.println("9." + category + " : " + rate + "%");
        }

//10

        Set<Complaint> s = new HashSet<>(complaints);
        Map<String, Long> d = s.stream().filter(c -> c.status().equals("OPEN")).collect(Collectors.groupingBy(Complaint::category, Collectors.counting()));
        Set<String> ca = d.entrySet().stream().filter(e -> e.getValue() >= 2).map(Map.Entry::getKey).collect(Collectors.toSet());
        System.out.println("10.Categories Requiring Attention:" + ca);


//11
        List<String> unique = complaintCategories.stream()
                .distinct()
                .toList();

        System.out.println("11." + unique);


        //12
        Map<String, Project> projectIndex = projects.stream()
                .collect(Collectors.toMap(Project::id, p -> p));

        System.out.println("12." + projectIndex.get("P006"));


//13

        Map<String, List<Project>> byDepartment = projects.stream()
                .collect(Collectors.groupingBy(
                        Project::department,
                        TreeMap::new,
                        Collectors.toList()
                ));

        System.out.println("13." + byDepartment);

//14
        Map<String, Double> budget = projects.stream()
                .collect(Collectors.groupingBy(
                        Project::department,
                        TreeMap::new,
                        Collectors.summingDouble(Project::budget)
                ));

        System.out.println("14." + budget);

        //15
        Map<String, Optional<Project>> largest = projects.stream()
                .collect(Collectors.groupingBy(
                        Project::department,
                        TreeMap::new,
                        Collectors.maxBy(Comparator.comparingDouble(Project::budget))
                ));

        largest.forEach((department, project) ->
                System.out.println("15." + department + " : " + project.orElse(null)));


//16

        Map<String, Long> statusCount = projects.stream()
                .collect(Collectors.groupingBy(Project::status, Collectors.counting()));

        long total = projects.size();

        statusCount.forEach((statuss, count) -> {
            double percentage = count * 100.0 / total;
            System.out.println("16." + status + " : " + count + " : " + percentage + "%");
        });

//17
        List<Project> ranking = projects.stream()
                .sorted(Comparator.comparingDouble(Project::budget)
                        .reversed()
                        .thenComparing(Project::id))
                .toList();

        ranking.forEach(System.out::println);


        //18
        Map<LocalDate, List<Project>> timeline = projects.stream()
                .collect(Collectors.groupingBy(
                        Project::startDate,
                        TreeMap::new,
                        Collectors.toList()
                ));

        System.out.println("18." + timeline.get(LocalDate.of(2026, 7, 1)));


        //19
        NavigableMap<LocalDate, List<Project>> timelinee = projects.stream()
                .collect(Collectors.groupingBy(
                        Project::startDate,
                        TreeMap::new,
                        Collectors.toList()
                ));

        NavigableMap<LocalDate, List<Project>> range = timelinee.subMap(
                LocalDate.of(2026, 7, 1), true,
                LocalDate.of(2026, 9, 1), true
        );

        System.out.println("19." + range);

//20
        System.out.println("20.Latest date: " + timelinee.lastKey());
        System.out.println("20.Latest projects: " + timelinee.lastEntry().getValue());


//21
        Set<String> volSkills = volunteerSkills.values()
                .stream()
                .flatMap(Set::stream)
                .collect(Collectors.toSet());

        System.out.println("21.Volunteer Skill Universe :" + volSkills);


        //22

        List<String> b = volunteerSkills.entrySet().stream().
                filter(k -> k.getValue().contains("FIRST_AID") && k.getValue().contains("ELECTRICAL"))
                .map(Map.Entry::getKey)
                .collect(Collectors.toList());
        System.out.println("22.Volunteer Capability Search :" + b);

//23
        Map<String, Set<String>> reverseMap = new HashMap<>();
        for (Map.Entry<String, Set<String>> m : volunteerSkills.entrySet()) {
            String volunteersName = m.getKey();
            Set<String> skills = m.getValue();

            for (String skill : skills) {
                reverseMap.computeIfAbsent(skill, n -> new HashSet<>())
                        .add(volunteersName);
            }
        }
        System.out.println("23.Reverse Skill Index :" + reverseMap);

//24
        Set<String> raviSkills = volunteerSkills.get("Ravi");
        Set<String> arunSkills = volunteerSkills.get("Arun");
        Set<String> commonSkills = raviSkills.stream()
                .filter(p -> arunSkills.contains(p))
                .collect(Collectors.toSet());
        System.out.println("24.Common Skills :" + commonSkills);

        //25
        TreeMap<LocalDate, List<Activity>> datewiseActivity = activities.stream()
                .collect(Collectors.groupingBy(Activity::date, TreeMap::new, Collectors.toList()));
        System.out.println("25.Activity Timeline" + datewiseActivity);


        //26 method call
        System.out.println("26. Latest Activities: " + latestActivities(activities, 3));


        //27
        Map<YearMonth,Map<String,Long>> activityCount= activities.stream()
                .filter(m->m.type().equals("MEETING") || m.type().equals("CLEANUP") || m.type().equals("INSPECTION"))
        .collect(Collectors.groupingBy(x->YearMonth.from(x.date()),Collectors.groupingBy(Activity::type,Collectors.counting())));
System.out.println("27.Activity Type × Month  :"+activityCount);

//28
        Map<String, Long> categoryCount = complaints.stream()
                .collect(Collectors.groupingBy(
                        Complaint::category,
                        Collectors.counting()
                ));

        List<Map.Entry<String, Long>> topThree = categoryCount.entrySet()
                .stream()
                .sorted(Map.Entry.<String, Long>comparingByValue()
                        .reversed()
                        .thenComparing(Map.Entry::getKey))
                .limit(3)
                .toList();

        System.out.println("28. Top Three Complaint Categories: " + topThree);


 //29

        Map<String, Integer> riskIndex = complaints.stream()
                .collect(Collectors.groupingBy(
                        Complaint::category,
                        Collectors.summingInt(c ->
                                (c.status().equalsIgnoreCase("OPEN") ? 2 : 0)
                                        + (c.priority() == 3 ? 3 : 0)
                        )
                ));

        List<Map.Entry<String, Integer>> riskRanking = riskIndex.entrySet()
                .stream()
                .sorted(Map.Entry.<String, Integer>comparingByValue()
                        .reversed()
                        .thenComparing(Map.Entry::getKey))
                .toList();

        System.out.println("29. Governance Risk Index: " + riskRanking);






    }

    //26

    static List<Activity> latestActivities(List<Activity> activities, int n) {

        List<Activity> x = activities.stream()
                .sorted(Comparator.comparing(Activity::date).reversed())
                .limit(n)
                .toList();
        return x;




    }


}







