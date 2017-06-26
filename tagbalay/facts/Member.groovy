package tagbalay.facts;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Member {
    
    TagBalay tagbalay;
    String objid; 
    String memberid;
    String name;
    String relation;	
    Date birthdate		
    int age;	
    boolean isdead;	
    Date dateofdeath;	
    // String name;
    // String relation;
    // String classification;
    // String attributes;
    // String assessmenttype;
    
    /** Creates a new instance of HHM */
    public Member() {
    }

    public Member(def o) {
        Calendar birthDay = Calendar.getInstance();
        Calendar dateofdeath = Calendar.getInstance();
        Calendar now = Calendar.getInstance();

        
        SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd");
        this.isdead = o.isdead;
        this.dateofdeath = (o.dateofdeath == null ? null : df.parse( o.dateofdeath ));
     

        birthDay.setTime(o.member.birthdate);

        int year1 = now.get(Calendar.YEAR);
        int year2 = birthDay.get(Calendar.YEAR);
        this.age = year1-year2;

        this.objid = o.memberid;
        this.memberid = o.memberid;
        this.name = o.name;
        this.relation = o.relation;
        this.birthdate = o.birthdate;

    }

    public void printInfo() {
        /*print lob*/
        println "Member Fact"
        println "objid " + this.objid;
        println "memberid " + this.memberid;
        // println "assessment type " + this.assessmenttype;  
    }

}
