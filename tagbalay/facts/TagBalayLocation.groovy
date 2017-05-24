package tagbalay.facts;

public class TagBalayLocation {
	
	String type;
	String barangayid;

	public TagBalayLocation() {
	}

	public TagBalayLocation(a) {
		this.type = a.type;
		if(a.type == 'local') type = 'owned';
		if(a.barangay) {
			barangayid = a.barangay.objid	
		}
	}

}