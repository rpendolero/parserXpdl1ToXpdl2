package com.ust.parser;

import java.util.List;

import org.wfmc.xpdl.BasicType;
import org.wfmc.xpdl.DeclaredType;
import org.wfmc.xpdl.ExternalReference;
import org.wfmc.xpdl.SchemaType;
import org.wfmc.xpdl.TypeDeclaration;
import org.wfmc.xpdl.TypeDeclarations;
import org.wfmc.xpdl2.Description;

public class ParserTypeDeclarations {

	public static org.wfmc.xpdl2.TypeDeclarations createTypeDeclarations(TypeDeclarations typeDeclarations) {
		if (typeDeclarations == null)
			return null;
		org.wfmc.xpdl2.TypeDeclarations typeDeclarations2 = new org.wfmc.xpdl2.TypeDeclarations();
		List<TypeDeclaration> typeDeclationArray = typeDeclarations.getTypeDeclaration();
		for (TypeDeclaration typeDeclaration : typeDeclationArray) {
			org.wfmc.xpdl2.TypeDeclaration typeDeclaration2 = createTypeDeclaration(typeDeclaration);
			typeDeclarations2.getTypeDeclaration().add(typeDeclaration2);
		}
		return typeDeclarations2;
	}

	private static org.wfmc.xpdl2.TypeDeclaration createTypeDeclaration(TypeDeclaration typeDeclaration) {
		org.wfmc.xpdl2.TypeDeclaration typeDeclaration2 = new org.wfmc.xpdl2.TypeDeclaration();

		String idValue = typeDeclaration.getId();
		typeDeclaration2.setId(idValue);

		String nameValue = typeDeclaration.getName();
		typeDeclaration2.setName(nameValue);

		String descriptionValue = typeDeclaration.getDescription();
		Description description = new Description();
		description.setValue(descriptionValue);
		typeDeclaration2.setDescription(description);

		BasicType basicType = typeDeclaration.getBasicType();
		org.wfmc.xpdl2.BasicType basicType2 = createBasicType(basicType);
		typeDeclaration2.setBasicType(basicType2);

		DeclaredType declaredType = typeDeclaration.getDeclaredType();
		org.wfmc.xpdl2.DeclaredType declaredType2 = createDeclaredType(declaredType);
		typeDeclaration2.setDeclaredType(declaredType2);

		SchemaType schemaType = typeDeclaration.getSchemaType();
		org.wfmc.xpdl2.SchemaType schemaType2 = createSchemaType(schemaType);
		typeDeclaration2.setSchemaType(schemaType2);

		ExternalReference externalReference = typeDeclaration.getExternalReference();
		org.wfmc.xpdl2.ExternalReference externalReference2 = createExternalReference(externalReference);
		typeDeclaration2.setExternalReference(externalReference2);

		return typeDeclaration2;
	}

	private static org.wfmc.xpdl2.ExternalReference createExternalReference(ExternalReference externalReference) {
		// TODO Auto-generated method stub
		return null;
	}

	private static org.wfmc.xpdl2.SchemaType createSchemaType(SchemaType schemaType) {
		// TODO Auto-generated method stub
		return null;
	}

	private static org.wfmc.xpdl2.DeclaredType createDeclaredType(DeclaredType declaredType) {
		// TODO Auto-generated method stub
		return null;
	}

	private static org.wfmc.xpdl2.BasicType createBasicType(BasicType basicType) {
		return null;
	}

}
