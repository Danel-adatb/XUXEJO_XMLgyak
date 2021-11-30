package feladat_3;

import org.json.JSONException;
import org.json.JSONObject;
import org.json.XML;

public class ObjectXUXEJO {

	public static String xml= 	"<students>\r\n" + 
							"		<nev>BLaszlo</nev>\r\n" + 
							"		<fizetes>1000000</fizetes>\r\n" + 
							"		<kor>21</kor>\r\n" + 
								"</students>";
	  
	public static void main(String[] args) {  
		// TODO Auto-generated method stub  
		try {  
			JSONObject json = XML.toJSONObject(xml);   
		        String jsonString = json.toString(1);  
		        System.out.println(jsonString);  
		  
		}catch (JSONException e) {
			// TODO: handle exception  
			System.out.println(e.toString()); 
		}  
	  
	}  
}
