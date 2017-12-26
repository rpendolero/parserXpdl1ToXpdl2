package com.ust.xpdl.parser.type;

import java.util.ArrayList;
import java.util.List;

public class ParserType {
	/**
	 * 
	 */
	private String name;
	/**
	 * 
	 */
	private String source;
	/**
	 * 
	 */
	private String tarjet;

	/**
	 * 
	 */
	private List<FieldType> listFields;

	/**
	 * @return
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return
	 */
	public String getSource() {
		return source;
	}

	/**
	 * @param source
	 */
	public void setSource(String source) {
		this.source = source;
	}

	/**
	 * @return
	 */
	public String getTarjet() {
		return tarjet;
	}

	/**
	 * @param tarjet
	 */
	public void setTarjet(String tarjet) {
		this.tarjet = tarjet;
	}

	public List<FieldType> getListFields() {
		if (listFields == null)
			listFields = new ArrayList<FieldType>();
		return listFields;
	}

}
