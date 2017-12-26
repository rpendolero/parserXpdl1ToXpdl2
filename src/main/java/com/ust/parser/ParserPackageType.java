package com.ust.parser;

import org.wfmc.xpdl.Applications;
import org.wfmc.xpdl.ConformanceClass;
import org.wfmc.xpdl.DataFields;
import org.wfmc.xpdl.ExtendedAttributes;
import org.wfmc.xpdl.ExternalPackages;
import org.wfmc.xpdl.Package;
import org.wfmc.xpdl.PackageHeader;
import org.wfmc.xpdl.Participants;
import org.wfmc.xpdl.RedefinableHeader;
import org.wfmc.xpdl.Script;
import org.wfmc.xpdl.TypeDeclarations;
import org.wfmc.xpdl.WorkflowProcesses;
import org.wfmc.xpdl2.PackageType;

public class ParserPackageType {

	public static PackageType createPackage(Package packageObject) {
		PackageType packageType = new PackageType();

		PackageHeader packageHeader = packageObject.getPackageHeader();
		org.wfmc.xpdl2.PackageHeader packageHeaderNew = ParserPackageHeader.createPackageHeader(packageHeader);
		packageType.setPackageHeader(packageHeaderNew);

		RedefinableHeader redefinableHeader = packageObject.getRedefinableHeader();
		org.wfmc.xpdl2.RedefinableHeader redefinableHeader2 = ParserRedinableHeader.createRedefinableHeader(redefinableHeader);
		packageType.setRedefinableHeader(redefinableHeader2);

		ConformanceClass conformanceClass = packageObject.getConformanceClass();
		org.wfmc.xpdl2.ConformanceClass conformanceClass2 = createConformanceClass(conformanceClass);
		packageType.setConformanceClass(conformanceClass2);

		Script script = packageObject.getScript();
		org.wfmc.xpdl2.Script scripts2 = createScript(script);
		packageType.setScript(scripts2);

		ExternalPackages externalPackages = packageObject.getExternalPackages();
		org.wfmc.xpdl2.ExternalPackages externalPackages2 = ParserExternalPackages.createExternalPackages(externalPackages);
		packageType.setExternalPackages(externalPackages2);

		TypeDeclarations typeDeclarations = packageObject.getTypeDeclarations();
		org.wfmc.xpdl2.TypeDeclarations typeDeclarations2 = ParserTypeDeclarations.createTypeDeclarations(typeDeclarations);
		packageType.setTypeDeclarations(typeDeclarations2);

		Participants participants = packageObject.getParticipants();
		org.wfmc.xpdl2.Participants participants2 = ParserParticipants.createParticipants(participants);
		packageType.setParticipants(participants2);

		Applications applications = packageObject.getApplications();
		org.wfmc.xpdl2.Applications applications2 = ParserApplications.createApplications(applications);
		packageType.setApplications(applications2);

		DataFields datafields = packageObject.getDataFields();
		org.wfmc.xpdl2.DataFields datafields2 = ParserDataFields.createDataFields(datafields);
		packageType.setDataFields(datafields2);

		WorkflowProcesses workflowProcesses = packageObject.getWorkflowProcesses();
		org.wfmc.xpdl2.WorkflowProcesses workflowProcesses2 = ParserWorkflowProcesses.createWorkflowProcesses(workflowProcesses);
		packageType.setWorkflowProcesses(workflowProcesses2);

		ExtendedAttributes extendedAttributes = packageObject.getExtendedAttributes();
		org.wfmc.xpdl2.ExtendedAttributes extendedAttributes2 = ParserExtendedAttributes.createExtendedAttributes(extendedAttributes);
		packageType.setExtendedAttributes(extendedAttributes2);

		return packageType;
	}

	private static org.wfmc.xpdl2.Script createScript(Script script) {
		org.wfmc.xpdl2.Script script2 = new org.wfmc.xpdl2.Script();
		script2.setGrammar(script.getGrammar());
		script2.setType(script.getType());
		script2.setVersion(script.getVersion());
		return script2;
	}

	private static org.wfmc.xpdl2.ConformanceClass createConformanceClass(ConformanceClass conformanceClass) {
		org.wfmc.xpdl2.ConformanceClass conformanceClass2 = new org.wfmc.xpdl2.ConformanceClass();
		conformanceClass2.setGraphConformance(conformanceClass.getGraphConformance());
		return conformanceClass2;
	}

}
