package hu.domparse.XUXEJO;

import java.io.File;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NamedNodeMap;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

public class DOMModifyXUXEJO {

   public static void main(String argv[]) {

      try {
         File inputFile = new File("C:\\java_projects\\DOMParseXUXEJO"
      			+ "\\src\\hu\\domparse\\XUXEJO\\1.c_XMLXUXEJO.xml");
         DocumentBuilderFactory docFactory = DocumentBuilderFactory.newInstance();
         DocumentBuilder docBuilder = docFactory.newDocumentBuilder();
         Document doc = docBuilder.parse(inputFile);
         
         Node cars = doc.getFirstChild();
         Node auto = doc.getElementsByTagName("auto").item(0);
         
         // update brand attribute
         NamedNodeMap attr = auto.getAttributes();
         Node nodeAttr = attr.getNamedItem("brand");
         nodeAttr.setTextContent("Opel");

         // loop the auto child node
         NodeList list = auto.getChildNodes();
         
         for (int temp = 0; temp < list.getLength(); temp++) {
            Node node = list.item(temp);
            if (node.getNodeType() == Node.ELEMENT_NODE) {
               Element eElement = (Element) node;
               if ("AutóNév".equals(eElement.getNodeName())) {
                  if("bmw_m3_e30".equals(eElement.getTextContent())) {
                     eElement.setTextContent("corsa_r5");
                  }
               }
            }
         }
         NodeList childNodes = cars.getChildNodes();
         
         for(int count = 0; count < childNodes.getLength(); count++) {
            Node node = childNodes.item(count);
            if (node.getNodeType() == Node.ELEMENT_NODE) {
                Element element = (Element) node;
                String id = element.getAttribute("id");
                
                if("2".equals(id))
                    cars.removeChild(node);
            }
            
            
         }

         // write the content on console
         TransformerFactory transformerFactory = TransformerFactory.newInstance();
         Transformer transformer = transformerFactory.newTransformer();
         DOMSource source = new DOMSource(doc);
         System.out.println("-----------Modified File-----------");
         StreamResult consoleResult = new StreamResult(System.out);
         transformer.transform(source, consoleResult);
      } catch (Exception e) {
         e.printStackTrace();
      }
   }
}
