package iss.actions;

import com.rameses.rules.common.*;
import iss.facts.*;

public class AskHouseholdInfo extends AbstractHouseholdInfoAction implements RuleActionHandler {

	def request;

	public void execute(def params, def drools) {
	
		def household_member = params.household_member;
		def attrid = params.attribute.key;
		def defvalue = params.defaultvalue;
		def entity = request.entity;
		def newinfos = request.newinfos;
		def info = getInfo( entity, newinfos, household_member, attrid, null, request.phase );
		if(info) info.defaultvalue = defvalue;
	}

}

