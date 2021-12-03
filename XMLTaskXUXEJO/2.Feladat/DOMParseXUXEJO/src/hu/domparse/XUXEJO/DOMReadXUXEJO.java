package hu.domparse.XUXEJO;

import java.io.File;
import java.io.IOException;

import javax.xml.XMLConstants;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

public class DOMReadXUXEJO {
	private static final String FILENAME = "C:\\java_projects\\DOMParseXUXEJO"
			+ "\\src\\hu\\domparse\\XUXEJO\\1.c_XMLXUXEJO.xml";

	  public static void main(String[] args) {
	      DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();

	      try {
	    	  //XML 'Processzelése' biztonságosan
	    	  //Támadások elkerlése mint például: XML External Entities (XXE)
	          dbf.setFeature(XMLConstants.FEATURE_SECURE_PROCESSING, true);

	          //XML Fájl Parse
	          DocumentBuilder db = dbf.newDocumentBuilder();
	          Document doc = db.parse(new File(FILENAME));
	          //Összevisszaság van a string neveknél a .normalize(); ezt javítja ki.
	          doc.getDocumentElement().normalize();

	          System.out.println("Gyökér Element: " + doc.getDocumentElement().getNodeName());
	          System.out.print("------");

	          // get <auto>
	          NodeList auto = doc.getElementsByTagName("auto");

	          for (int temp = 0; temp < auto.getLength(); temp++) {
	        	  Node node = auto.item(temp);
	              if (node.getNodeType() == Node.ELEMENT_NODE) {
	                  Element element = (Element) node;
	                  // Az auto tag attribútuma
	                  String id = element.getAttribute("id");
	                  // Szöveg, elemei
	                  String AutóNév = element.getElementsByTagName("AutóNév").item(0).getTextContent();
	                  String Versenyben = element.getElementsByTagName("Versenyben").item(0).getTextContent();
	                  String Név = element.getElementsByTagName("Név").item(0).getTextContent();
	                  //Kiiratás
	                  System.out.println("\nJelenlegi element: " + node.getNodeName());
	                  System.out.println("Element ID: " + id);
	                  System.out.println("Autó Neve: " + AutóNév);
	                  System.out.println("Versenyben van még? " + Versenyben);
	                  System.out.println("Szakasz Neve: " + Név);
	              }
	          }
	          
	       // get <kornyezet>
	          NodeList kornyezet = doc.getElementsByTagName("kornyezet");

              System.out.print("\n------\n");
	          for (int temp = 0; temp < kornyezet.getLength(); temp++) {
	        	  Node node = kornyezet.item(temp);
	              if (node.getNodeType() == Node.ELEMENT_NODE) {
	                  Element element = (Element) node;
	                  // Az auto tag attribútuma
	                  String id = element.getAttribute("id");
	                  // Szöveg, elemei
	                  String Sérült_autó = element.getElementsByTagName("Sérült_autó").item(0).getTextContent();
	                  String Név = element.getElementsByTagName("Név").item(0).getTextContent();
	                  String Autó_Neve = element.getElementsByTagName("Autó_Neve").item(0).getTextContent();
	                  //Kiiratás
	                  System.out.println("\nJelenlegi element: " + node.getNodeName());
	                  System.out.println("Element ID: " + id);
	                  System.out.println("Adott Autó sérült-e: " + Sérült_autó);
	                  System.out.println("Szakasz neve: " + Név);
	                  System.out.println("Autó Neve: " + Autó_Neve);
	              }
	          }
	          
	       // get <nemzetiseg>
	          NodeList nemzetiseg = doc.getElementsByTagName("nemzetiseg");

              System.out.print("\n------\n");
	          for (int temp = 0; temp < nemzetiseg.getLength(); temp++) {
	        	  Node node = nemzetiseg.item(temp);
	              if (node.getNodeType() == Node.ELEMENT_NODE) {
	                  Element element = (Element) node;
	                  // Az auto tag attribútuma
	                  String id = element.getAttribute("id");
	                  // Szöveg, elemei
	                  String NemzetKód = element.getElementsByTagName("NemzetKód").item(0).getTextContent();
	                  String Név = element.getElementsByTagName("Név").item(0).getTextContent();
	                  //Kiiratás
	                  System.out.println("\nJelenlegi element: " + node.getNodeName());
	                  System.out.println("Element ID: " + id);
	                  System.out.println("Nemzetiség kódja: " + NemzetKód);
	                  System.out.println("Nemzetiség neve: " + Név);
	              }
	          }
	          
	       // get <orszag>
	          NodeList orszag = doc.getElementsByTagName("orszag");

              System.out.print("\n------\n");
	          for (int temp = 0; temp < orszag.getLength(); temp++) {
	        	  Node node = orszag.item(temp);
	              if (node.getNodeType() == Node.ELEMENT_NODE) {
	                  Element element = (Element) node;
	                  // Az auto tag attribútuma
	                  String id = element.getAttribute("id");
	                  // Szöveg, elemei
	                  String OrszágID = element.getElementsByTagName("OrszágID").item(0).getTextContent();
	                  String Név = element.getElementsByTagName("Név").item(0).getTextContent();
	                  //Kiiratás
	                  System.out.println("\nJelenlegi element: " + node.getNodeName());
	                  System.out.println("Element ID: " + id);
	                  System.out.println("Ország kódja: " + OrszágID);
	                  System.out.println("Országhoz tartozó szakasz neve: " + Név);
	              }
	          }
	          
	       // get <szakasz>
	          NodeList szakasz = doc.getElementsByTagName("szakasz");

              System.out.print("\n------\n");
	          for (int temp = 0; temp < szakasz.getLength(); temp++) {
	        	  Node node = szakasz.item(temp);
	              if (node.getNodeType() == Node.ELEMENT_NODE) {
	                  Element element = (Element) node;
	                  // Az auto tag attribútuma
	                  String id = element.getAttribute("id");
	                  // Szöveg, elemei
	                  String Név = element.getElementsByTagName("Név").item(0).getTextContent();
	                  String Hõmérséklet = element.getElementsByTagName("Hõmérséklet").item(0).getTextContent();
	                  String Hossz = element.getElementsByTagName("Hossz").item(0).getTextContent();
	                  String Felület = element.getElementsByTagName("Felület").item(0).getTextContent();
	                  String Vkód = element.getElementsByTagName("Vkód").item(0).getTextContent();
	                  //Kiiratás
	                  System.out.println("\nJelenlegi element: " + node.getNodeName());
	                  System.out.println("Element ID: " + id);
	                  System.out.println("Szakasz neve: " + Név);
	                  System.out.println("Szakaszon az adott hõmérséklet: " + Hõmérséklet + " Celsius");
	                  System.out.println("Szakasz hossza: " + Hossz + " KM");
	                  System.out.println("Szakasz Felülete: " + Felület);
	                  System.out.println("Szakasz kódja: " + Vkód);
	              }
	          }
	          
	       // get <tulajdonos>
	          NodeList tulajdonos = doc.getElementsByTagName("tulajdonos");

              System.out.print("\n------\n");
	          for (int temp = 0; temp < tulajdonos.getLength(); temp++) {
	        	  Node node = tulajdonos.item(temp);
	              if (node.getNodeType() == Node.ELEMENT_NODE) {
	                  Element element = (Element) node;
	                  // Az auto tag attribútuma
	                  String id = element.getAttribute("id");
	                  // Szöveg, elemei
	                  String AutóNév = element.getElementsByTagName("AutóNév").item(0).getTextContent();
	                  String NemzetKód = element.getElementsByTagName("NemzetKód").item(0).getTextContent();
	                  //Kiiratás
	                  System.out.println("\nJelenlegi element: " + node.getNodeName());
	                  System.out.println("Element ID: " + id);
	                  System.out.println("Autó Neve: " + AutóNév);
	                  System.out.println("Nemzetiség kódja: " + NemzetKód);
	              }
	          }
	          
	       // get <versenyzo>
	          NodeList versenyzo = doc.getElementsByTagName("versenyzo");

              System.out.print("\n------\n");
	          for (int temp = 0; temp < versenyzo.getLength(); temp++) {
	        	  Node node = versenyzo.item(temp);
	              if (node.getNodeType() == Node.ELEMENT_NODE) {
	                  Element element = (Element) node;
	                  // Az auto tag attribútuma
	                  String id = element.getAttribute("id");
	                  // Szöveg, elemei
	                  String Vkód = element.getElementsByTagName("Vkód").item(0).getTextContent();
	                  String Vezetéknév = element.getElementsByTagName("Vezetéknév").item(0).getTextContent();
	                  String Nemzetkód = element.getElementsByTagName("Nemzetkód").item(0).getTextContent();
	                  //Kiiratás
	                  System.out.println("\nJelenlegi element: " + node.getNodeName());
	                  System.out.println("Element ID: " + id);
	                  System.out.println("Verseny kódja: " + Vkód);
	                  System.out.println("Vezetkénév: " + Vezetéknév);
	                  System.out.println("Nemzetiség kódja: " + Nemzetkód);
	              }
	          }
	          
	       // get <v_keresztnev>
	          NodeList keresztnev = doc.getElementsByTagName("v_keresztnev");

              System.out.print("\n------\n");
	          for (int temp = 0; temp < keresztnev.getLength(); temp++) {
	        	  Node node = keresztnev.item(temp);
	              if (node.getNodeType() == Node.ELEMENT_NODE) {
	                  Element element = (Element) node;
	                  // Az auto tag attribútuma
	                  String id = element.getAttribute("id");
	                  // Szöveg, elemei
	                  String Keresztnév = element.getElementsByTagName("Keresztnév").item(0).getTextContent();
	                  String Vkód = element.getElementsByTagName("Vkód").item(0).getTextContent();
	                  //Kiiratás
	                  System.out.println("\nJelenlegi element: " + node.getNodeName());
	                  System.out.println("Element ID: " + id);
	                  System.out.println("Verseny kódja: " + Vkód);
	                  System.out.println("Keresztnév: " + Keresztnév);
	              }
	          }
	          
	      } catch (ParserConfigurationException | SAXException | IOException e) {
	          e.printStackTrace();
	      }

	  }
}
