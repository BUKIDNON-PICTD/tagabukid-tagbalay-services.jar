package tagbalay.actions;

import java.rmi.server.*;

public abstract class AbstractTagBalayInfoAction {
	
	def HV;
	String infotype;

	def getInfo( def entity, def newinfos, def hhm, def attrid, def val, def phase ) {
		//check first if info already exists. test is a list
		def test = null;
		if( !hhm ) {
			test = entity.infos.findAll{ it.hhm?.objid == null && it.attribute.objid == attrid };
			if(!test) {
				test = newinfos.findAll{it.hhm?.objid==null && it.attribute.objid == attrid };
			}	
		}
		else {
			test = entity.infos.findAll{ it.hhm?.objid!=null && it.hhm.objid == hhm.objid && it.attribute.objid == attrid };
			if(!test) {
				test =  newinfos.findAll{ it.hhm?.objid!=null && it.hhm.objid == hhm.objid && it.attribute.objid == attrid };
			}
		}

		if(test) return null;
			
		def info = [objid:"HHINFO"+new UID()];
		info.phase = phase;
		info.infotype = infotype;
		info.attribute = HV.read( [objid: attrid ] );
		//remove desc, state and system.
		info.attribute.remove("description");
		info.attribute.remove("state");
		info.attribute.remove("system");
		
		if(hhm) {
			info.hhm = [objid:hhm.objid, name:hhm.name];
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