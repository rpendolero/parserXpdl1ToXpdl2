package com.ust.parser;

import org.wfmc.xpdl.ConformanceClass;

public class ParserConformanceClass {

	public static org.wfmc.xpdl2.ConformanceClass createConformanceClass(ConformanceClass conformanceClass) {
		org.wfmc.xpdl2.ConformanceClass conformanceClass2 = new org.wfmc.xpdl2.ConformanceClass();
		conformanceClass2.setGraphConformance(conformanceClass.getGraphConformance());
		return conformanceClass2;
	}

}
