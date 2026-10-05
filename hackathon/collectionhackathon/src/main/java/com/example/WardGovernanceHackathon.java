package com.example;

import java.util.*;
import java.util.SequencedCollection;
import java.util.stream.Collectors;

public class WardGovernanceHackathon {

    record Citizen(
            String id,
            String name,
            int age,
            String area
    ) {
        @Override
        public String toString() {
            return "id: " + id + " name :" + name + " age :" + age + " area :" + area + "\n";
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
    ) {
    }

    public static void main(String[] args) {

        List<Citizen> citizens = List.of(
                new Citizen("C001", "Ravi", 42, "East Colony"),
                new Citizen("C002", "Anitha", 35, "West Colony"),
                new Citizen("C003", "Suresh", 67, "Temple Road"),
                new Citizen("C004", "Meena", 28, "East Colony"),
                new Citizen("C005", "Joseph", 74, "Market Road"),
                new Citizen("C006", "Lakshmi", 51, "Temple Road"),
                new Citizen("C007", "Arun", 22, "West Colony"),
                new Citizen("C008", "Bindu", 45, "Market Road")

        );

        List<String> visits = List.of(
                "Road inspection",
                "Anganwadi visit",
                "Water tank inspection",
                "School visit",
                "Health centre visit"
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


//1
        List<Citizen> moreCitizens = new ArrayList<>(citizens);
        moreCitizens.add(new Citizen("C009", "jeni", 28, "chokkath Road"));
//moreCitizens.remove(new Citizen("C004", "Meena", 28, "East Colony"));
        moreCitizens.removeIf(c -> c.id().equals("C004"));
        System.out.println(moreCitizens);


//2

        System.out.println("1st citizen using get index :" + moreCitizens.get(0));
        System.out.println("4th citizen :" + moreCitizens.get(3));

        System.out.println("1st citizen :" + moreCitizens.getFirst());
        System.out.println("Last citizen :" + moreCitizens.getLast());


//3
        SequencedCollection<String> v = new ArrayList<>(visits);
        v.addFirst("Flooding Inspection");
        v.addLast("Market sanitation inspection ");

        System.out.println("" + v);


//4

        System.out.println("reversed list : " + v.reversed());

//5
        v.removeIf(d -> d.toLowerCase().contains("inspection"));
        System.out.println("Removed Inspection :" + v);

//6
        List<Citizen> result = citizens.stream().filter(e -> e.area().contains("East Colony")).toList();
        System.out.println("EAST COLONY :" + result);

        //7

        ArrayList<Citizen> arrayList = new ArrayList<>();
        LinkedList<Citizen> linkedList = new LinkedList<>();

         /*I would choose ArrayList because the application frequently accesses citizens by index,
        and ArrayList provides efficient random access with O(1) time complexity.
         Since new citizens are usually added at the end, ArrayList is also efficient for append operations.
         LinkedList has O(n) index-based access, so it is less suitable for this use case.*/

// LEVEL 2 QUESTIONS(SET)

        //8
        Set<String> setCategories = new HashSet<>(complaintCategories);
        System.out.println("Unique Complaint Categories: " + setCategories);


        //9
        Set<String> linkedSet = new LinkedHashSet<>(complaintCategories);
        System.out.println(" Unique Categories in First-Seen Order :" + linkedSet);


        //10
        SortedSet<String> treeSet = new TreeSet<>(linkedSet);
        System.out.println("Sorted Complaint Categories  :" + treeSet);


        //11

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
        System.out.println("Duplicate Complaint IDs :" + duplicates);


//12
        Set<String> ravi = volunteerSkills.get("Ravi");
        Set<String> arun = volunteerSkills.get("Arun");
        Set<String> mutableSet = new HashSet<>(ravi);
        mutableSet.retainAll(arun);

        System.out.println("Common Skill :" + mutableSet);

//13

        Set<String> ravi1 = volunteerSkills.get("Ravi");
        Set<String> suresh = volunteerSkills.get("Suresh");

        Set<String> uniqueSkill = new HashSet<>(ravi1);
        uniqueSkill.removeAll(suresh);

        System.out.println("Skills Unique to Ravi :" + uniqueSkill);

//14


        for (Map.Entry<String, Set<String>> s : volunteerSkills.entrySet()) {
            String setkey = s.getKey();
            Set<String> skill = s.getValue();

            if (skill.contains("FIRST_AID")) {
                System.out.println("Volunteers With First Aid : " + setkey);
            }


        }

//15
        TreeSet<Citizen> citizenSet = new TreeSet<>(Comparator.comparingInt(Citizen::age).thenComparing(Citizen::name));
        citizenSet.addAll(citizens);

      System.out.println("Citizens Ordered by Age" + citizenSet);



    //16
         Map<String,Citizen> mapCitizen=new HashMap<>();
 for(Citizen c:citizens){
     mapCitizen.put(c.id(),c);
 }
 System.out.println("Citizen stored in map :"+mapCitizen);
 System.out.println("Retrieved citizen :"+mapCitizen.get("C005"));


 //17
       System.out.println( mapCitizen.containsKey("C007"));
        System.out.println(  mapCitizen.containsKey("C099"));


//18

        Map<String,Integer> categoryCount=new HashMap<>();
for(String category:complaintCategories){
    categoryCount.merge(category,1,Integer::sum);
}        System.out.println(categoryCount);

//19

Map<String,Long> count=complaintCategories.stream().collect(Collectors.groupingBy(c->c,Collectors.counting()));

System.out.println("Count Using Streams     ;"+count);

//20
        Map<String,List<Complaint>> ml=new HashMap<>();
        for(Complaint c:complaints){
           String category= c.category();
           ml.computeIfAbsent(category,key->new ArrayList<>())
                   .add(c);


        }

        System.out.println("Group Complaints by Category:"+ml);



        //21

        Map<String, List<Complaint>> complaintsByCitizen = new HashMap<>();

        for (Complaint c : complaints) {
            complaintsByCitizen
                    .computeIfAbsent(c.citizenId(), key -> new ArrayList<>())
                    .add(c);
        }

        System.out.println("Complaints By Citizen :"+complaintsByCitizen);

        //22

        Map<String, Project> projectMap = new HashMap<>();

        for (Project p : projects) {
            projectMap.put(p.id(), p);
        }

        System.out.println("Retrieved Project: " + projectMap.get("P003"));



        //23
        Map<String, List<Project>> projectsByDepartment = new HashMap<>();

        for (Project p : projects) {
            projectsByDepartment
                    .computeIfAbsent(p.department(), key -> new ArrayList<>())
                    .add(p);
        }

        System.out.println("Projects By Department: " + projectsByDepartment);


//24
        Map<String, Long> projectsByStatus = projects.stream()
                .collect(Collectors.groupingBy(
                        Project::status,
                        Collectors.counting()
                ));


        System.out.println("Projects By Status: " + projectsByStatus);


  //25
        Optional<Project> highestBudget = projects.stream()
                .max(Comparator.comparingDouble(Project::budget));

        System.out.println("Highest Budget Project: " + highestBudget.get());



   //26
        List<Project> sortedProjects = projects.stream()
                .sorted(Comparator.comparingDouble(Project::budget))
                .toList();

        System.out.println("Projects by Budget: " + sortedProjects);


//27
        Map<String, Double> budgetByDepartment = projects.stream()
                .collect(Collectors.groupingBy(
                        Project::department,
                        Collectors.summingDouble(Project::budget)
                ));

        System.out.println("Budget By Department: " + budgetByDepartment);

//28
        Map<String, Project> projectRegistry = new TreeMap<>();

        for (Project p : projects) {
            projectRegistry.put(p.id(), p);
        }

        System.out.println("Sorted Project Registry: " + projectRegistry);

       /* Ask:
 Which Map implementation guarantees sorted keys?
        answer : TreeMap */

        //29

        Map<String, Project> projectRegistry1 = new LinkedHashMap<>();

        for (Project p : projects) {
            projectRegistry1.put(p.id(), p);
        }

        System.out.println("Project Registration Order: " + projectRegistry1);
    }

}