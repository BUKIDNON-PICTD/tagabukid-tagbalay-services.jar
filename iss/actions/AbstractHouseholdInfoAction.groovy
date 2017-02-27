package iss.actions;

import java.rmi.server.*;

public abstract class AbstractHouseholdInfoAction {
	
	def BV;
	String infotype;

	def getInfo( def entity, def newinfos, def household_member, def attrid, def val, def phase ) {
		//check first if info already exists. test is a list
		def test = null;
		if( !household_member ) {
			test = entity.infos.findAll{ it.household_member?.objid == null && it.attribute.objid == attrid };
			if(!test) {
				test = newinfos.findAll{it.household_member?.objid==null && it.attribute.objid == attrid };
			}	
		}
		else {
			test = entity.infos.findAll{ it.household_member?.objid!=null && it.household_member.objid == household_member.objid && it.attribute.objid == attrid };
			if(!test) {
				test =  newinfos.findAll{ it.household_member?.objid!=null && it.household_member.objid == household_member.objid && it.attribute.objid == attrid };
			}
		}

		if(test) return null;
			
		def info = [objid:"BPINFO"+new UID()];
		info.phase = phase;
		info.infotype = infotype;
		info.attribute = BV.read( [objid: attrid ] );
		//remove desc, state and system.
		info.attribute.remove("description");
		info.attribute.remove("state");
		info.attribute.remove("system");

		if(household_member) {
			info.household_member = [objid:household_member.objid, name:household_member.name];
		}

		info.datatype = info.attribute.datatype;
		
		if(val) {
			String datatype = info.attribute.datatype;
			switch(datatype) {
				case "integer":
					info.value = val.intValue;
					break;
				case "decimal":
					info.value = val.doubleValue;
					break;
				case "string":	
					info.value = val.stringValue;
					break;
				case "boolean":	
					info.value = val.booleanValue;
					break;
			}
		}			
		newinfos << info;
		return info;
	}




}