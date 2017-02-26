package iss.facts;

public class HouseholdLocation {
	
	String type;
	String barangayid;

	public HouseholdLocation() {
	}

	public HouseholdLocation(a) {
		this.type = a.type;
		if(a.type == 'local') type = 'owned';
		if(a.barangay) {
			barangayid = a.barangay.objid	
		}
	}

}