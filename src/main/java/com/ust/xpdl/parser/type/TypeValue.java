package com.ust.xpdl.parser.type;

public enum TypeValue {

	LIST("list"),
	//
	VALUE("value"),
	//
	VALUE_TO_OBJECT("valueToObject"),
	//
	OBJECT("object");

	private String type;

	TypeValue(String type) {
		this.type = type;
	}

	public static TypeValue fromString(String name) {
		TypeValue[] values = values();
		for (TypeValue typeValue : values) {
			if (typeValue.type.equals(name)) {
				return typeValue;
			}
		}
		return null;
	}

}
