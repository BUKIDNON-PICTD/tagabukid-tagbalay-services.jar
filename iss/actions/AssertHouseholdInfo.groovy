package iss.actions;

import com.rameses.rules.common.*;
import iss.facts.*;

public class AssertHouseholdInfo extends AbstractHouseholdInfoAction implements RuleActionHandler {

	def request;
	def comparator;

	public void execute(def params, def drools) {
		def household_member = params.household_member;
		def attrid = params.attribute.key;
		def val = params.value;
		def facts = request.facts;

		//check if fact already exists
		def info = getInfo( request.entity, request.newinfos, household_member, attrid, val, request.phase );
		if(info!=null) {
			def dtype = info.attribute.datatype;
			def f = new HouseholdInfo(dtype, info.value);
			f.objid = info.objid;
			f.name = info.attribute.name;
			f.household_member = household_member;
			facts << f;
		}
	}
}

