package com.ust.parser;

import java.util.List;

import org.wfmc.xpdl.ExternalPackage;
import org.wfmc.xpdl.ExternalPackages;

public class ParserExternalPackages {

	public static org.wfmc.xpdl2.ExternalPackages createExternalPackages(ExternalPackages externalPackages) {
		if (externalPackages == null)
			return null;
		org.wfmc.xpdl2.ExternalPackages externalPackages2 = new org.wfmc.xpdl2.ExternalPackages();
		List<ExternalPackage> externalPackagesArray = externalPackages.getExternalPackage();
		for (ExternalPackage externalPackage : externalPackagesArray) {
			org.wfmc.xpdl2.ExternalPackage externalPackage2 = createExternalPackage(externalPackage);
			externalPackages2.getExternalPackage().add(externalPackage2);
		}
		return externalPackages2;
	}

	private static org.wfmc.xpdl2.ExternalPackage createExternalPackage(ExternalPackage externalPackage) {
		org.wfmc.xpdl2.ExternalPackage externalPackage2 = new org.wfmc.xpdl2.ExternalPackage();
		externalPackage2.setHref(externalPackage.getHref());
		return externalPackage2;
	}

}
