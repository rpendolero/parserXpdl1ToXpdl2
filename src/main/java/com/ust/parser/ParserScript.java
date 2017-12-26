package com.ust.parser;

import org.wfmc.xpdl.Script;

public class ParserScript {

	public static org.wfmc.xpdl2.Script createScript(Script script) {
		org.wfmc.xpdl2.Script script2 = new org.wfmc.xpdl2.Script();
		script2.setGrammar(script.getGrammar());
		script2.setType(script.getType());
		script2.setVersion(script.getVersion());
		return script2;
	}

}
