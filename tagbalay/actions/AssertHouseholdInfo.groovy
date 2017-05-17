package tagbalay.actions;

import com.rameses.rules.common.*;
import tagbalay.facts.*;

public class AssertHouseholdInfo extends AbstractHouseholdInfoAction implements RuleActionHandler {

	def request;
	def comparator;

	public void execute(def params, def drools) {
		def hhm = params.hhm;
		def attrid = params.attribute.key;
		def val = params.value;
		def facts = request.facts;

		//check if fact already exists
		def info = getInfo( request.entity, request.newinfos, hhm, attrid, val, request.phase );
		if(info!=null) {
			def dtype = info.attribute.datatype;
			def f = new HouseholdInfo(dtype, info.value);
			f.objid = info.objid;
			f.name = info.attribute.name;
			f.hhm = hhm;
			facts << f;
		}
	}
}

