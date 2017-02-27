package iss.facts;

public class HouseholdMember {
    
    BPApplication application;
    String objid; 			
    String householdmemberid;			
    String name;
    String classification;
    String attributes;
    String assessmenttype;
    
    /** Creates a new instance of HouseholdMember */
    public HouseholdMember() {
    }

    public HouseholdMember(def o) {
        this.objid = o.householdmemberid;
        this.householdmemberid = o.householdmemberid;
        this.assessmenttype = o.assessmenttype;  
    }

    public void printInfo() {
        /*print lob*/
        println "Member Fact"
        println "objid " + this.objid;
        println "householdmemberid " + this.householdmemberid;
        println "assessment type " + this.assessmenttype;  
    }

}
