package tagbalay.actions;

import com.rameses.rules.common.*;
import tagbalay.facts.*;

public class AskTagBalayInfo extends AbstractTagBalayInfoAction implements RuleActionHandler {

	def request;

	public void execute(def params, def drools) {
	
		def hhm = params.hhm;
		def attrid = params.attribute.key;
		def defvalue = params.defaultvalue;
		def entity = request.entity;
		def newinfos = request.newinfos;
		def info = getInfo( entity, newinfos, hhm, attrid, null, request.phase );
		if(info) info.defaultvalue = defvalue;
	}

}

