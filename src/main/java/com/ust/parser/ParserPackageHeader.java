package com.ust.parser;

import org.wfmc.xpdl.PackageHeader;
import org.wfmc.xpdl2.CostUnit;
import org.wfmc.xpdl2.Created;
import org.wfmc.xpdl2.Description;
import org.wfmc.xpdl2.Documentation;
import org.wfmc.xpdl2.PriorityUnit;
import org.wfmc.xpdl2.Vendor;
import org.wfmc.xpdl2.XPDLVersion;

public class ParserPackageHeader {

	public static org.wfmc.xpdl2.PackageHeader createPackageHeader(PackageHeader packageHeader) {
		org.wfmc.xpdl2.PackageHeader packageHeader2 = new org.wfmc.xpdl2.PackageHeader();

		String xpdlVersionValue = packageHeader.getXPDLVersion();
		XPDLVersion xpdlVersion = createXPDLVersion(xpdlVersionValue);
		packageHeader2.setXPDLVersion(xpdlVersion);

		String vendorValue = packageHeader.getVendor();
		Vendor vendor = createVendor(vendorValue);
		packageHeader2.setVendor(vendor);

		String createdValue = packageHeader.getCreated();
		Created created = createCreated(createdValue);
		packageHeader2.setCreated(created);

		String descriptionValue = packageHeader.getDescription();
		Description description = createDescription(descriptionValue);
		packageHeader2.setDescription(description);

		String documentationValue = packageHeader.getDocumentation();
		Documentation documentation = createDocumentation(documentationValue);
		packageHeader2.setDocumentation(documentation);

		String priorityUnitValue = packageHeader.getPriorityUnit();
		PriorityUnit priorityUnit = createPriorityUnit(priorityUnitValue);
		packageHeader2.setPriorityUnit(priorityUnit);

		String costUnitValue = packageHeader.getCostUnit();
		CostUnit costUnit = createCostUnit(costUnitValue);
		packageHeader2.setCostUnit(costUnit);

		return packageHeader2;
	}

	private static CostUnit createCostUnit(String costUnitValue) {
		CostUnit costUnit = new CostUnit();
		costUnit.setValue(costUnitValue);
		return costUnit;
	}

	private static PriorityUnit createPriorityUnit(String priorityUnitValue) {
		PriorityUnit priorityUnit = new PriorityUnit();
		priorityUnit.setValue(priorityUnitValue);
		return priorityUnit;
	}

	private static Documentation createDocumentation(String documentationValue) {
		Documentation documentation = new Documentation();
		documentation.setValue(documentationValue);
		return documentation;
	}

	private static Description createDescription(String descriptionValue) {
		Description description = new Description();
		description.setValue(descriptionValue);
		return description;
	}

	private static Created createCreated(String createdValue) {
		Created created = new Created();
		created.setValue(createdValue);
		return created;
	}

	private static Vendor createVendor(String vendorValue) {
		Vendor vendor = new Vendor();
		vendor.setValue(vendorValue);
		return vendor;
	}

	private static XPDLVersion createXPDLVersion(String xpdlVersionValue) {
		XPDLVersion xpdlVersion = new XPDLVersion();
		xpdlVersion.setValue(xpdlVersionValue);
		return xpdlVersion;
	}

}
