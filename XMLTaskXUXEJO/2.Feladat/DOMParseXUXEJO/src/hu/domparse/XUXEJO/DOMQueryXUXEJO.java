package hu.domparse.XUXEJO;

import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.DocumentBuilder;
import org.w3c.dom.Document;
import org.w3c.dom.NodeList;
import org.w3c.dom.Node;
import org.w3c.dom.Element;
import java.io.File;

public class DOMQueryXUXEJO {

   public static void main(String argv[]) {
 
      try {
    	  
    	 //XML Fajl Parse
         File inputFile = new File("C:\\java_projects\\DOMParseXUXEJO"
     			+ "\\src\\hu\\domparse\\XUXEJO\\1.c_XMLXUXEJO.xml");
         DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
         DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
         Document doc = dBuilder.parse(inputFile);
         doc.getDocumentElement().normalize();
         
         //Root Element es azon belul az auto node lekerese
         System.out.print("Root element: ");
         System.out.println(doc.getDocumentElement().getNodeName());
         NodeList auto = doc.getElementsByTagName("auto");
         System.out.println("----------------------------");
         
         for (int temp = 0; temp < auto.getLength(); temp++) {
        	//For ciklus hogy vegig loopoljunk az osszes elementen
            Node nNode = auto.item(temp);
            System.out.println("\nCurrent Element: ");
            System.out.print(nNode.getNodeName());
            
            if (nNode.getNodeType() == Node.ELEMENT_NODE) {
               //Egy IF-fel megvizsgaljuk, hogy melyik brandet kerjuk le - Ennek a neve AutóNév
               Element eElement = (Element) nNode;
               System.out.print("brand: ");
               System.out.println(eElement.getAttribute("brand"));
               NodeList carNameList = eElement.getElementsByTagName("AutóNév");
               
               for (int count = 0; count < carNameList.getLength(); count++) {
                  //Egy újabb For ciklus inditasa mellyel kiiratjuk a lekerd adatokat
            	   Node node1 = carNameList.item(count);
                  
                  if (node1.getNodeType() == node1.ELEMENT_NODE) {
                     Element car = (Element) node1;
                     System.out.print("Autó Márkája: ");
                     System.out.println(car.getTextContent());
                     System.out.print("Milyen szakaszra van felkészítve az autó: ");
                     System.out.println(car.getAttribute("type"));
                  }
               }
            }
         }
      } catch (Exception e) {
         e.printStackTrace();
      }
   }
}
