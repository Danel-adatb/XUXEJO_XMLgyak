package feladat_3;

import com.fasterxml.jackson.databind.ObjectMapper;
import java.util.ArrayList;  
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject; 

public class ListXUXEJO {
	public static String json = "{\r\n" + 
			"   \"students\": {\r\n" + 
			"      \"nev\": \"BLaszlo\",\r\n" + 
			"      \"fizetes\": \"1000000\",\r\n" + 
			"      \"kor\": \"21\"\r\n" + 
			"   }\r\n" + 
			"}";

	    public static void main(String[] args) throws JSONException{ 
	          
	        //Converting jsonData string into JSON object  
	        JSONObject jsnobject = new JSONObject(json);  
	        //Printing JSON object  
	        System.out.println("JSON Object");  
	        System.out.println(jsnobject);  
	        //Getting languages JSON array from the JSON object  
	        JSONArray jsonArray = jsnobject.getJSONArray("students");  
	        //Printing JSON array  
	        System.out.println("JSON Array");  
	        System.out.println(jsonArray);  
	        //Creating an empty ArrayList of type Object  
	        ArrayList<Object> listdata = new ArrayList<Object>();  
	          
	        //Checking whether the JSON array has some value or not  
	        if (jsonArray != null) {   
	              
	            //Iterating JSON array  
	            for (int i=0;i<jsonArray.length();i++){   
	                  
	                //Adding each element of JSON array into ArrayList  
	                listdata.add(jsonArray.get(i));  
	            }   
	        }  
	        //Iterating ArrayList to print each element  
	  
	        System.out.println("Each element of ArrayList");  
	        for(int i=0; i<listdata.size(); i++) {  
	            //Printing each element of ArrayList  
	            System.out.println(listdata.get(i));  
	        }  
	    }  
	}  
