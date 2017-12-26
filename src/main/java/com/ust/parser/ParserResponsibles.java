package com.ust.parser;

import java.util.List;

import org.wfmc.xpdl.Responsibles;
import org.wfmc.xpdl2.Responsible;

public class ParserResponsibles {

	public static org.wfmc.xpdl2.Responsibles createResponsibles(Responsibles responsibles) {
		org.wfmc.xpdl2.Responsibles responsibles2 = new org.wfmc.xpdl2.Responsibles();

		List<Responsible> responsiblesArray = responsibles2.getResponsible();
		List<String> responsiblesValues = responsibles.getResponsible();
		for (String responsibleValue : responsiblesValues) {
			Responsible responsible2 = createResponsible(responsibleValue);
			responsiblesArray.add(responsible2);
		}

		return responsibles2;
	}

	private static Responsible createResponsible(String responsibleValue) {
		Responsible responsible = new Responsible();
		responsible.setValue(responsibleValue);
		return responsible;
	}

}
