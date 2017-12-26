package com.ust.parser;

import org.wfmc.xpdl.RedefinableHeader;
import org.wfmc.xpdl.Responsibles;
import org.wfmc.xpdl2.Author;
import org.wfmc.xpdl2.Codepage;
import org.wfmc.xpdl2.Countrykey;
import org.wfmc.xpdl2.Version;

public class ParserRedinableHeader {

	public static org.wfmc.xpdl2.RedefinableHeader createRedefinableHeader(RedefinableHeader redefinableHeader) {
		if (redefinableHeader == null)
			return null;

		org.wfmc.xpdl2.RedefinableHeader redefinableHeader2 = new org.wfmc.xpdl2.RedefinableHeader();

		String authorValue = redefinableHeader.getAuthor();
		Author author = createAuthor(authorValue);
		redefinableHeader2.setAuthor(author);

		String versionValue = redefinableHeader.getVersion();
		Version version = createVersion(versionValue);
		redefinableHeader2.setVersion(version);

		String codepageValue = redefinableHeader.getCodepage();
		Codepage codepage = createCodepage(codepageValue);
		redefinableHeader2.setCodepage(codepage);

		String countrykeyValue = redefinableHeader.getCountrykey();
		Countrykey countrykey = createCountrykey(countrykeyValue);
		redefinableHeader2.setCountrykey(countrykey);

		Responsibles responsibles = redefinableHeader.getResponsibles();
		org.wfmc.xpdl2.Responsibles responsibles2 = ParserResponsibles.createResponsibles(responsibles);
		redefinableHeader2.setResponsibles(responsibles2);

		return redefinableHeader2;
	}

	private static Countrykey createCountrykey(String countrykeyValue) {
		Countrykey countrykey = new Countrykey();
		countrykey.setValue(countrykeyValue);
		return countrykey;
	}

	private static Codepage createCodepage(String codepageValue) {
		Codepage codepage = new Codepage();
		codepage.setValue(codepageValue);
		return codepage;
	}

	private static Version createVersion(String versionValue) {
		Version version = new Version();
		version.setValue(versionValue);
		return version;
	}

	private static Author createAuthor(String authorValue) {
		Author author = new Author();
		author.setValue(authorValue);
		return author;
	}

}
