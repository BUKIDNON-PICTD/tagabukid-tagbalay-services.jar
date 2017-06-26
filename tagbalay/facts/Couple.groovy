package tagbalay.facts;

import java.util.Calendar;

public class Couple {
    
    TagBalay tagbalay;
    String objid; 
    String coupleid;
    String name;
			
    // String name;
    // String relation;
    // String classification;
    // String attributes;
    // String assessmenttype;
    
    /** Creates a new instance of HHM */
    public Couple() {
    }

    public Couple(def o) {
      
        this.objid = o.coupleid;
        this.coupleid = o.coupleid;
        this.name = o.name;
     
    }

    public void printInfo() {
        /*print lob*/
        println "Couples Fact"
        println "objid " + this.objid;
        println "coupleid " + this.coupleid;
        // println "assessment type " + this.assessmenttype;  
    }

}
