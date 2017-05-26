package tagbalay.facts;

public class Member {
    
    TagBalay tagbalay;
    String objid; 
    String memberid;
    String name;
    String relation;			
    			
    // String name;
    // String relation;
    // String classification;
    // String attributes;
    // String assessmenttype;
    
    /** Creates a new instance of HHM */
    public Member() {
    }

    public Member(def o) {
        this.objid = o.memberid;
        this.memberid = o.memberid;
        this.name = o.name;
        this.relation = o.relation;
        // this.assessmenttype = o.assessmenttype;  
    }

    public void printInfo() {
        /*print lob*/
        println "Member Fact"
        println "objid " + this.objid;
        println "memberid " + this.memberid;
        // println "assessment type " + this.assessmenttype;  
    }

}
