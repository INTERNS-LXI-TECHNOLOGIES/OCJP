package com.fintech;
  public class WardGovernanceHackathon {      
  record Citizen(             
  String id,
  String name,
  int age,
  String area     ) {}
  
  record Complaint(             
  String id,             
  String citizenId,             
  String category,             
  int priority,             
  String status     ) {}      
  
  record Project(             
  String id,             
  String name,             
  String department,             
  double budget,             
  String status     ) {} 
  }