package tagbalay.actions;

import com.rameses.rules.common.*;
import tagbalay.facts.*;

public class AskTagBalayInfo extends AbstractTagBalayInfoAction implements RuleActionHandler {

	def request;

	public void execute(def params, def drools) {
	
		def member = params.member;
		// def couple = params.couple;
		def attrid = params.attribute.key;
		def defvalue = params.defaultvalue;
		def entity = request.entity;
		def newinfos = request.newinfos;
		def val = params.defaultvalue;
		// def info = getInfo( entity, newinfos, member, couple, attrid, null, request.phase );
		// if(info) info.defaultvalue = defvalue;
		if(!val || val == "null") {
			val = null;
		}
		else if( val instanceof String ) {
			val = new ActionExpression( val, [:] );	
		}

		def info = getInfo( entity, newinfos, member, attrid, val, request.phase );
		if ( info ) info.defaultvalue = info.value; 
	}

}

