package com.qa.utils;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class TestUtils {
	public static final long WAIT = 10;
	
//	public HashMap<String, String> parseStringXML(InputStream file) throws Exception{
//		HashMap<String, String> stringMap = new HashMap<String, String>();
//		//Get Document Builder
//		DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
//		DocumentBuilder builder = factory.newDocumentBuilder();
//
//		//Build Document
//		Document document = builder.parse(file);
//
//		//Normalize the XML Structure; It's just too important !!
//		document.getDocumentElement().normalize();
//
//		//Here comes the root node
//		Element root = document.getDocumentElement();
//
//		//Get all elements
//		NodeList nList = document.getElementsByTagName("string");
//
//		for (int temp = 0; temp < nList.getLength(); temp++)
//		{
//		 Node node = nList.item(temp);
//		 if (node.getNodeType() == Node.ELEMENT_NODE)
//		 {
//		    Element eElement = (Element) node;
//		    // Store each element key value in map
//		    stringMap.put(eElement.getAttribute("name"), eElement.getTextContent());
//		 }
//		}
//		return stringMap;
//	}
//
//	public String dateTime() {
//		DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd-HH-mm-ss");
//		Date date = new Date();
//		return dateFormat.format(date);
//	}

	public Logger log() {
		return LogManager.getLogger(Thread.currentThread().getStackTrace()[2].getClassName());
	}
	
}
