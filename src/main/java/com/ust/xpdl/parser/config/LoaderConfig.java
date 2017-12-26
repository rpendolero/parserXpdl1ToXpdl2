package com.ust.xpdl.parser.config;

import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.Map;

import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;

import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

import com.ust.xpdl.parser.type.FieldType;
import com.ust.xpdl.parser.type.ParserType;

public class LoaderConfig {

	private Map<String, ParserType> parsers = new HashMap<String, ParserType>();

	private static final String FICHERO_CONFIG = "/com/ust/xpdl/parser/parser.xml";

	private SAXParser saxParser;

	private class Handler extends DefaultHandler {
		private static final String ATT_NAME = "name";
		private static final String ATT_TYPE = "type";
		private static final String ATT_SOURCE = "source";
		private static final String ATT_TARJET = "tarjet";

		private String pathParser = "parsers/parser/";
		private String pathField = "parsers/parser/field/";

		private StringBuilder sPath = new StringBuilder();
		private ParserType parser;

		@Override
		public void startElement(String uri, String localName, String qName, Attributes attributes) throws SAXException {
			sPath.append(qName).append("/");

			String name;
			String tarjet;
			if (sPath.toString().equals(pathParser)) {
				name = attributes.getValue(ATT_NAME);
				String source = attributes.getValue(ATT_SOURCE);
				tarjet = attributes.getValue(ATT_TARJET);
				parser = new ParserType();
				parser.setName(name);
				parser.setSource(source);
				parser.setTarjet(tarjet);
				parsers.put(name, parser);

			}
			if (sPath.toString().equals(pathField)) {
				name = attributes.getValue(ATT_NAME);
				String type = attributes.getValue(ATT_TYPE);
				tarjet = attributes.getValue(ATT_TARJET);
				FieldType field = new FieldType();
				field.setName(name);
				field.setTarjet(tarjet);
				field.setType(type);
				parser.getListFields().add(field);
			}
		}

		@Override
		public void endElement(String uri, String localName, String qName) throws SAXException {
			int pos = sPath.toString().lastIndexOf(qName);
			String target = sPath.substring(0, pos);

			sPath = new StringBuilder(target);
		}
	}

	/**
	 * @throws Exception
	 */
	private LoaderConfig() throws Exception {
		load();
	}

	/**
	 * @throws Exception
	 */
	private void load() throws Exception {
		// TODO Apéndice de método generado automáticamente
		Handler handler = new Handler();
		InputStream input = LoaderConfig.class.getResourceAsStream(FICHERO_CONFIG);
		if (input == null)
			return;

		parse(input, handler);
	}

	/**
	 * @return
	 */
	private SAXParser getParser() {
		try {
			if (saxParser == null) {
				SAXParserFactory factory = SAXParserFactory.newInstance();
				saxParser = factory.newSAXParser();
			}

		} catch (Exception saxe) {
			saxe.printStackTrace();
		}
		return saxParser;
	}

	/**
	 * @param input
	 * @param handler
	 */
	protected void parse(InputStream input, DefaultHandler handler) {
		try {
			getParser().parse(input, handler);
		} catch (SAXException e) {
			// TODO Bloque catch generado automáticamente
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Bloque catch generado automáticamente
			e.printStackTrace();
		}

	}

	public static LoaderConfig getInstance() throws Exception {
		return new LoaderConfig();
	}

	public Map<String, ParserType> getParsers() {
		return parsers;
	}
}
