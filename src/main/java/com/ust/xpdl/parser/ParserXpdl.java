package com.ust.xpdl.parser;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.wfmc.xpdl.Package;
import org.wfmc.xpdl2.PackageType;

import com.ust.xpdl.parser.config.LoaderConfig;
import com.ust.xpdl.parser.type.FieldType;
import com.ust.xpdl.parser.type.ParserType;
import com.ust.xpdl.parser.type.TypeValue;

public class ParserXpdl {
	private LoaderConfig config;
	private Map<String, ParserType> parsers;

	public ParserXpdl() throws Exception {
		config = LoaderConfig.getInstance();
		parsers = config.getParsers();
	}

	/**
	 * @param packageObject
	 * @return
	 * @throws Exception
	 */
	public PackageType parse(Package packageObject) throws Exception {
		return (PackageType) parse(packageObject, packageObject.getClass().getSimpleName());
	}

	/**
	 * @param objectSource
	 * @param name
	 * @return
	 * @throws Exception
	 */
	private Object parse(Object objectSource, String name) throws Exception {
		if (objectSource == null) {
			return null;
		}

		System.out.println(name);
		ParserType parserType = parsers.get(name);
		if (parserType == null)
			return null;
		
		String classTarjet = parserType.getTarjet();
		Object objectTarjet = newInstance(classTarjet);
		List<FieldType> listFields = parserType.getListFields();
		for (FieldType fieldType : listFields) {
			String fieldName = fieldType.getName();
			String fieldTarjet = fieldType.getTarjet();
			if (fieldTarjet == null)
				fieldTarjet = fieldName;

			TypeValue typeValue = TypeValue.fromString(fieldType.getType());
			Object objectTarjetValue = null;
			Object objectValueSource;
			switch (typeValue) {
			case LIST:
				objectValueSource = getValue(objectSource, fieldName);
				objectTarjetValue = createList(objectTarjet, fieldName, objectValueSource);
				break;
			case OBJECT:
				objectValueSource = getValue(objectSource, fieldName);
				objectTarjetValue = parse(objectValueSource, fieldName);
				break;
			case VALUE_TO_OBJECT:
				objectValueSource = getValue(objectSource, fieldName);
				objectTarjetValue = createObject(objectTarjet, fieldName, objectValueSource);
				break;
			case VALUE:
				objectTarjetValue = getValue(objectSource, fieldName);
				break;
			}
			setValue(objectTarjet, fieldTarjet, objectTarjetValue);
		}
		return objectTarjet;

	}

	/**
	 * @param objectTarjet
	 * @param fieldName
	 * @param objectValueSource
	 * @return
	 * @throws Exception
	 */
	@SuppressWarnings("unchecked")
	private Object createList(Object objectTarjet, String fieldName, Object objectValueSource) throws Exception {
		List<?> listSource = (List<?>) objectValueSource;
		List<?> listTarjet = (List<?>) getValue(objectTarjet, fieldName);
		for (Object objList : listSource) {
			Object objectListTarjet = parse(objList, fieldName);
			((ArrayList<Object>) listTarjet).add(objectListTarjet);
		}
		return listTarjet;
	}

	/**
	 * @param objectTarjet
	 * @param fieldName
	 * @param objectValue
	 * @return
	 * @throws Exception
	 */
	private Object createObject(Object objectTarjet, String fieldName, Object objectValue) throws Exception {
		Class<?>[] parameterTypes = new Class<?>[0];
		String methodName = "get" + fieldName;
		try {
			Method method = objectTarjet.getClass().getMethod(methodName, parameterTypes);
			Object valueObject = newInstance(method.getReturnType().getName());
			String fieldNameValue = "Value";
			setValue(valueObject, fieldNameValue, objectValue);
			return valueObject;
		} catch (Exception e) {
			throw new Exception(e.getMessage());
		}

	}

	private Object newInstance(String classTarjet) throws Exception {
		try {
			Class<?> classObject = Class.forName(classTarjet);
			return classObject.newInstance();
		} catch (Exception e) {
			throw new Exception(e.getMessage());
		}
	}

	private void setValue(Object obj, String fieldName, Object objectValue) throws Exception {
		if (objectValue == null)
			return;

		Class<?>[] parameterTypes = new Class<?>[1];
		if (objectValue instanceof ArrayList<?>) {
			return;

		} else {
			parameterTypes[0] = objectValue.getClass();
		}
		String methodName = "set" + fieldName;
		try {
			Method method = obj.getClass().getMethod(methodName, parameterTypes);
			method.invoke(obj, objectValue);
		} catch (Exception e) {
			throw new Exception(e.getMessage());
		}

	}

	private Object getValue(Object obj, String fieldName) throws Exception {
		Class<?>[] parameterTypes = new Class<?>[0];
		String methodName = "get" + fieldName;
		try {
			Method method = obj.getClass().getMethod(methodName, parameterTypes);
			return method.invoke(obj, null);
		} catch (Exception e) {
			throw new Exception(e.getMessage());
		}
	}

}
