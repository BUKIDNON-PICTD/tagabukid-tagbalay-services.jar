package iss.facts;

public class HHM {
    
    HouseholdSurvey householdsurvey;
    String objid; 
    String hhmid;
    String name;
    String relation;			
    			
    // String name;
    // String relation;
    // String classification;
    // String attributes;
    // String assessmenttype;
    
    /** Creates a new instance of HHM */
    public HHM() {
    }

    public HHM(def o) {
        this.objid = o.hhmid;
        this.hhmid = o.hhmid;
        // this.assessmenttype = o.assessmenttype;  
    }

    public void printInfo() {
        /*print lob*/
        println "Member Fact"
        println "objid " + this.objid;
        println "hhmid " + this.hhmid;
        // println "assessment type " + this.assessmenttype;  
    }

}
