import java.util.*;

public class WardGovernanceHackathon {

        record Citizen(String id, String name, int age, String area) {
        }

        record Complaint(String id, String citizenId, String category, int priority, String status) {
        }

        record Project(String id, String name, String department, double budget, String status) {
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
                                new Citizen("C008", "Bindu", 45, "Market Road"));

                List<String> visits = List.of(
                                "Road inspection",
                                "Anganwadi visit",
                                "Water tank inspection",
                                "School visit",
                                "Health centre visit");

                List<String> complaintCategories = List.of(
                                "Road", "Water", "Road", "Streetlight", "Water",
                                "Waste", "Road", "Streetlight", "Waste", "Water");

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
                                new Complaint("CMP010", "C003", "Water", 3, "OPEN"));

                List<Project> projects = List.of(
                                new Project("P001", "East Colony Road", "ENGINEERING", 850000, "ONGOING"),
                                new Project("P002", "Water Tank Renovation", "WATER", 450000, "COMPLETED"),
                                new Project("P003", "Streetlight Upgrade", "ELECTRICITY", 275000, "ONGOING"),
                                new Project("P004", "School Toilet", "EDUCATION", 325000, "PROPOSED"),
                                new Project("P005", "Waste Collection Point", "SANITATION", 180000, "COMPLETED"));

                Map<String, Set<String>> volunteerSkills = Map.of(
                                "Ravi", Set.of("DRIVING", "FIRST_AID", "ELECTRICAL"),
                                "Anitha", Set.of("TEACHING", "FIRST_AID"),
                                "Suresh", Set.of("DRIVING", "ELECTRICAL"),
                                "Meena", Set.of("TEACHING", "FIRST_AID", "COUNSELLING"),
                                "Arun", Set.of("DRIVING", "ELECTRICAL", "FIRST_AID")); // ← semicolon here, not after }
                // Q1
                List<Citizen> citizen = new ArrayList<>(citizens);
                citizen.add(new Citizen("C009", "Thomas", 39, "Hill Road"));// O(1)
                citizen.removeIf(c -> c.id().equals("C004"));

                // Q2
                Citizen fourthCitizen = citizen.get(3);
                Citizen firstCitizen = citizen.getFirst();
                Citizen lastCitizen = citizen.getLast();

                List<Visit> vists = new ArrayList<>(visits);
                // Q3
                vists.addFirst("Flooding inspection");
                vists.addLast("Market sanitation inspection");

                // Q4
                vists.removeIf(c -> c.toLowerCase().contains("inspection"));
                String lastVisits = citizen.reversed();

                // Q5

                // Q6
                List<String> filteredList = citizen.stream()
                                .filter(c -> c.contains("EastColony"))
                                .toList();
                Lisr<String> category = new HashSet<>("complaintCategories");
                // Q7

                ArrayList<Citizen> arrayList = new ArrayList<>();
                LinkedList<Citizen> linkedList = new LinkedList<>();
                // Q8
                set<String> uniqueCategories = new HashSet<>(complaintCategories);

                System.out.println(uniqueCategories);
                // Q9
                set<String> uniqueCategorie = new LinkedHashSet<>(complaintCategories);

                // 10
                set<String> categories = new TreeSet<>(complaintCategories);
                // 11
                set<String> seen = new HashSet<>();
                set<String> dupli = new HashSet<>();
                for (String id : complaints) {
                        if (!seen.add(id)) {
                                dupli.add(id);
                        }
                }

                System.out.println(dupli);

                // 12
                Set<String> raviSkills = new HashSet<>(volunteerSkills.get("Ravi"));
                set<String> arunSkills = volunteerSkills.get("Arun");

                raviSkills.retainAll(arunSkills);
                System.out.println(raviSkills);

                // 13
                Set<String> raviSkils = new HashSet<>(volunteerSkills.get("Ravi"));
                Set<String> sureshSkills = volunteerSkills.get("Suresh");

                raviSkils.removeAll(sreshSkills);

                // 14
                for (Map.Entry<String, set<String>> entry : volunteerSkills.entrySet()) {
                        if (entry.getVlue().contains("firstAid")) {
                                System.out.println(entry.getKey());
                        }
                }

                // 15
                set<Citizen> citizenAge = new TreeSet<>(
                                comparator.comparingInt(citizen::age)
                                                .thenComparing(citizen::id)

                );

                citizenAge.addAll(citizenRegistry);

                for (Citizen citizeens : citizenAge) {
                        System.out.println(citizeen.name() + citizeen.age());

                }

                // 16
                Map<String, Citizen> citizenLook = new HashMap<>();
                for (Citizen citizenss : citizenRegistry) {
                        citizenLook.put(citizenss.id(), citizen);
                }

                Citizen citizzen = citizenLook.get("C005")

                //17 
                System.out.println(citizenLook.containsKey("C007"));
                                System.out.println(citizenLook.containsKey("C099"));

                                //18
                                Map<String, Integer> complaintCount = new HashMap<>();
                                for(Complaint complaint : complaints ){
                                        complaintCount.merge(complaint.category()),
                                        1,
                                        Integer::sum
                                };

                                System.out.println(complaintCount);


                }

}

}