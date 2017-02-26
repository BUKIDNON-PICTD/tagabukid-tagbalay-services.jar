package iss.facts;

public class HHMember {
    
    BPApplication application;
    String objid; 			
    String hhmemberid;			
    String name;
    String classification;
    String attributes;
    String assessmenttype;
    
    /** Creates a new instance of HHMember */
    public HHMember() {
    }

    public HHMember(def o) {
        this.objid = o.hhmemberid;
        this.hhmemberid = o.hhmemberid;
        this.assessmenttype = o.assessmenttype;  
    }

    public void printInfo() {
        /*print lob*/
        println "Member Fact"
        println "objid " + this.objid;
        println "hhmemberid " + this.hhmemberid;
        println "assessment type " + this.assessmenttype;  
    }

}
