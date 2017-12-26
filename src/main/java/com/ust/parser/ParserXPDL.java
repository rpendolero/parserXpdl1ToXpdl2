package com.ust.parser;

import java.io.File;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.Unmarshaller;

import org.wfmc.xpdl.Package;

import com.ust.xpdl.parser.ParserXpdl;

public class ParserXPDL {

	public static void main(String[] args) {
		try {

			JAXBContext jc = JAXBContext.newInstance("org.wfmc.xpdl");

			// create an Unmarshaller
			Unmarshaller u = jc.createUnmarshaller();

			// unmarshal a FosterHome instance document into a tree of Java
			// content
			// objects composed of classes from the com.abhi.xml.jaxb.generated
			// package.
			Package packageObject = (Package) u.unmarshal(new File("C:/TRABAJO/git/parseXpdl1ToXpdl2/Parser/src/stfpnf.xpdl"));
			ParserXpdl parserXpdl = new ParserXpdl();
			parserXpdl.parse(packageObject);
			// PackageType packageTypeObject =
			// ParserPackageType.createPackage(packageObject);

			System.out.println(packageObject.getName());
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

}
