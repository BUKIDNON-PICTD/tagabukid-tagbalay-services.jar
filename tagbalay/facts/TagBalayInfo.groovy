package tagbalay.facts;

public class TagBalayInfo {
    
    TagBalay tagbalay;
    String objid;
    Member member;
    String name;
    String stringvalue;
    int intvalue;
    boolean booleanvalue;
    double decimalvalue;
    int year;   //this is for late renewal support
    int qtr;    //this is for qtr support for LGUs who report qtr gross for new survey.
    
    /** Creates a new instance of TagBalayInfo */
    public TagBalayInfo() {
    }
    
    public TagBalayInfo(String datatype, Object value) {
        if(value == null) return;
        datatype = datatype.toLowerCase();
        if( datatype.equals("decimal") ) {
            setDecimalvalue( Double.parseDouble(value+"") );
        }
        else if(datatype.equals("integer")) {
            setIntvalue( Integer.parseInt(value+"") );
        }
        else if( datatype.equals("boolean")) {
            String v = value.toString().toLowerCase().trim();
            if(v.equals("1") || v.equals("true")) {
                v = "true";
            }
            else {
                v = "false";
            }
            setBooleanvalue( Boolean.parseBoolean(v));
        }
        else if(datatype.startsWith("string")) {
            setStringvalue( (String)value );
        } 
        
    }
    
    
    
}
