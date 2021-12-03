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
	    	  //XML 'Processzel�se' biztons�gosan
	    	  //T�mad�sok elkerl�se mint p�ld�ul: XML External Entities (XXE)
	          dbf.setFeature(XMLConstants.FEATURE_SECURE_PROCESSING, true);

	          //XML F�jl Parse
	          DocumentBuilder db = dbf.newDocumentBuilder();
	          Document doc = db.parse(new File(FILENAME));
	          //�sszevisszas�g van a string nevekn�l a .normalize(); ezt jav�tja ki.
	          doc.getDocumentElement().normalize();

	          System.out.println("Gy�k�r Element: " + doc.getDocumentElement().getNodeName());
	          System.out.print("------");

	          // get <auto>
	          NodeList auto = doc.getElementsByTagName("auto");

	          for (int temp = 0; temp < auto.getLength(); temp++) {
	        	  Node node = auto.item(temp);
	              if (node.getNodeType() == Node.ELEMENT_NODE) {
	                  Element element = (Element) node;
	                  // Az auto tag attrib�tuma
	                  String id = element.getAttribute("id");
	                  // Sz�veg, elemei
	                  String Aut�N�v = element.getElementsByTagName("Aut�N�v").item(0).getTextContent();
	                  String Versenyben = element.getElementsByTagName("Versenyben").item(0).getTextContent();
	                  String N�v = element.getElementsByTagName("N�v").item(0).getTextContent();
	                  //Kiirat�s
	                  System.out.println("\nJelenlegi element: " + node.getNodeName());
	                  System.out.println("Element ID: " + id);
	                  System.out.println("Aut� Neve: " + Aut�N�v);
	                  System.out.println("Versenyben van m�g? " + Versenyben);
	                  System.out.println("Szakasz Neve: " + N�v);
	              }
	          }
	          
	       // get <kornyezet>
	          NodeList kornyezet = doc.getElementsByTagName("kornyezet");

              System.out.print("\n------\n");
	          for (int temp = 0; temp < kornyezet.getLength(); temp++) {
	        	  Node node = kornyezet.item(temp);
	              if (node.getNodeType() == Node.ELEMENT_NODE) {
	                  Element element = (Element) node;
	                  // Az auto tag attrib�tuma
	                  String id = element.getAttribute("id");
	                  // Sz�veg, elemei
	                  String S�r�lt_aut� = element.getElementsByTagName("S�r�lt_aut�").item(0).getTextContent();
	                  String N�v = element.getElementsByTagName("N�v").item(0).getTextContent();
	                  String Aut�_Neve = element.getElementsByTagName("Aut�_Neve").item(0).getTextContent();
	                  //Kiirat�s
	                  System.out.println("\nJelenlegi element: " + node.getNodeName());
	                  System.out.println("Element ID: " + id);
	                  System.out.println("Adott Aut� s�r�lt-e: " + S�r�lt_aut�);
	                  System.out.println("Szakasz neve: " + N�v);
	                  System.out.println("Aut� Neve: " + Aut�_Neve);
	              }
	          }
	          
	       // get <nemzetiseg>
	          NodeList nemzetiseg = doc.getElementsByTagName("nemzetiseg");

              System.out.print("\n------\n");
	          for (int temp = 0; temp < nemzetiseg.getLength(); temp++) {
	        	  Node node = nemzetiseg.item(temp);
	              if (node.getNodeType() == Node.ELEMENT_NODE) {
	                  Element element = (Element) node;
	                  // Az auto tag attrib�tuma
	                  String id = element.getAttribute("id");
	                  // Sz�veg, elemei
	                  String NemzetK�d = element.getElementsByTagName("NemzetK�d").item(0).getTextContent();
	                  String N�v = element.getElementsByTagName("N�v").item(0).getTextContent();
	                  //Kiirat�s
	                  System.out.println("\nJelenlegi element: " + node.getNodeName());
	                  System.out.println("Element ID: " + id);
	                  System.out.println("Nemzetis�g k�dja: " + NemzetK�d);
	                  System.out.println("Nemzetis�g neve: " + N�v);
	              }
	          }
	          
	       // get <orszag>
	          NodeList orszag = doc.getElementsByTagName("orszag");

              System.out.print("\n------\n");
	          for (int temp = 0; temp < orszag.getLength(); temp++) {
	        	  Node node = orszag.item(temp);
	              if (node.getNodeType() == Node.ELEMENT_NODE) {
	                  Element element = (Element) node;
	                  // Az auto tag attrib�tuma
	                  String id = element.getAttribute("id");
	                  // Sz�veg, elemei
	                  String Orsz�gID = element.getElementsByTagName("Orsz�gID").item(0).getTextContent();
	                  String N�v = element.getElementsByTagName("N�v").item(0).getTextContent();
	                  //Kiirat�s
	                  System.out.println("\nJelenlegi element: " + node.getNodeName());
	                  System.out.println("Element ID: " + id);
	                  System.out.println("Orsz�g k�dja: " + Orsz�gID);
	                  System.out.println("Orsz�ghoz tartoz� szakasz neve: " + N�v);
	              }
	          }
	          
	       // get <szakasz>
	          NodeList szakasz = doc.getElementsByTagName("szakasz");

              System.out.print("\n------\n");
	          for (int temp = 0; temp < szakasz.getLength(); temp++) {
	        	  Node node = szakasz.item(temp);
	              if (node.getNodeType() == Node.ELEMENT_NODE) {
	                  Element element = (Element) node;
	                  // Az auto tag attrib�tuma
	                  String id = element.getAttribute("id");
	                  // Sz�veg, elemei
	                  String N�v = element.getElementsByTagName("N�v").item(0).getTextContent();
	                  String H�m�rs�klet = element.getElementsByTagName("H�m�rs�klet").item(0).getTextContent();
	                  String Hossz = element.getElementsByTagName("Hossz").item(0).getTextContent();
	                  String Fel�let = element.getElementsByTagName("Fel�let").item(0).getTextContent();
	                  String Vk�d = element.getElementsByTagName("Vk�d").item(0).getTextContent();
	                  //Kiirat�s
	                  System.out.println("\nJelenlegi element: " + node.getNodeName());
	                  System.out.println("Element ID: " + id);
	                  System.out.println("Szakasz neve: " + N�v);
	                  System.out.println("Szakaszon az adott h�m�rs�klet: " + H�m�rs�klet + " Celsius");
	                  System.out.println("Szakasz hossza: " + Hossz + " KM");
	                  System.out.println("Szakasz Fel�lete: " + Fel�let);
	                  System.out.println("Szakasz k�dja: " + Vk�d);
	              }
	          }
	          
	       // get <tulajdonos>
	          NodeList tulajdonos = doc.getElementsByTagName("tulajdonos");

              System.out.print("\n------\n");
	          for (int temp = 0; temp < tulajdonos.getLength(); temp++) {
	        	  Node node = tulajdonos.item(temp);
	              if (node.getNodeType() == Node.ELEMENT_NODE) {
	                  Element element = (Element) node;
	                  // Az auto tag attrib�tuma
	                  String id = element.getAttribute("id");
	                  // Sz�veg, elemei
	                  String Aut�N�v = element.getElementsByTagName("Aut�N�v").item(0).getTextContent();
	                  String NemzetK�d = element.getElementsByTagName("NemzetK�d").item(0).getTextContent();
	                  //Kiirat�s
	                  System.out.println("\nJelenlegi element: " + node.getNodeName());
	                  System.out.println("Element ID: " + id);
	                  System.out.println("Aut� Neve: " + Aut�N�v);
	                  System.out.println("Nemzetis�g k�dja: " + NemzetK�d);
	              }
	          }
	          
	       // get <versenyzo>
	          NodeList versenyzo = doc.getElementsByTagName("versenyzo");

              System.out.print("\n------\n");
	          for (int temp = 0; temp < versenyzo.getLength(); temp++) {
	        	  Node node = versenyzo.item(temp);
	              if (node.getNodeType() == Node.ELEMENT_NODE) {
	                  Element element = (Element) node;
	                  // Az auto tag attrib�tuma
	                  String id = element.getAttribute("id");
	                  // Sz�veg, elemei
	                  String Vk�d = element.getElementsByTagName("Vk�d").item(0).getTextContent();
	                  String Vezet�kn�v = element.getElementsByTagName("Vezet�kn�v").item(0).getTextContent();
	                  String Nemzetk�d = element.getElementsByTagName("Nemzetk�d").item(0).getTextContent();
	                  //Kiirat�s
	                  System.out.println("\nJelenlegi element: " + node.getNodeName());
	                  System.out.println("Element ID: " + id);
	                  System.out.println("Verseny k�dja: " + Vk�d);
	                  System.out.println("Vezetk�n�v: " + Vezet�kn�v);
	                  System.out.println("Nemzetis�g k�dja: " + Nemzetk�d);
	              }
	          }
	          
	       // get <v_keresztnev>
	          NodeList keresztnev = doc.getElementsByTagName("v_keresztnev");

              System.out.print("\n------\n");
	          for (int temp = 0; temp < keresztnev.getLength(); temp++) {
	        	  Node node = keresztnev.item(temp);
	              if (node.getNodeType() == Node.ELEMENT_NODE) {
	                  Element element = (Element) node;
	                  // Az auto tag attrib�tuma
	                  String id = element.getAttribute("id");
	                  // Sz�veg, elemei
	                  String Keresztn�v = element.getElementsByTagName("Keresztn�v").item(0).getTextContent();
	                  String Vk�d = element.getElementsByTagName("Vk�d").item(0).getTextContent();
	                  //Kiirat�s
	                  System.out.println("\nJelenlegi element: " + node.getNodeName());
	                  System.out.println("Element ID: " + id);
	                  System.out.println("Verseny k�dja: " + Vk�d);
	                  System.out.println("Keresztn�v: " + Keresztn�v);
	              }
	          }
	          
	      } catch (ParserConfigurationException | SAXException | IOException e) {
	          e.printStackTrace();
	      }

	  }
}
