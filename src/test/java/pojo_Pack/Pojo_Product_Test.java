package pojo_Pack;

import org.apache.juneau.html.HtmlSerializer;
import org.apache.juneau.json.Json5Parser;
import org.apache.juneau.json.JsonParser;
import org.apache.juneau.json.JsonSerializer;
import org.apache.juneau.xml.XmlSerializer;

import pojo_Pack.pojo_product;

public class Pojo_Product_Test {
	public static void main(String[] args) {
		
//SERIALIZATION   (BeanC , SJacskon  , GoogleGson, SimpleJson)
		// POJO to JSON
		JsonSerializer jsonSerializer = JsonSerializer.DEFAULT_READABLE;
		String[] sellerNames= {"xyz", "abc", "123"};
		pojo_product  product =new pojo_product("Lenovo",1000,sellerNames,"white");		
		String json=jsonSerializer.serialize(product);
		System.out.println(json);
		
		//POJO to XML
		XmlSerializer xmlSerializer= XmlSerializer.DEFAULT_NS_SQ_READABLE;
		String xml=xmlSerializer.serialize(product);
		System.out.println(xml);
		
		//POJO TO HTMLS
		HtmlSerializer htmlSerializer=HtmlSerializer.DEFAULT_SQ_READABLE;
		String html=htmlSerializer.serialize(product);
		System.out.println(html);

//DESERIALIZATION
		// JSON to POJO 
		
		JsonParser jsonparser = JsonParser.DEFAULT;
		String JsonValue="{\n"
				+ "	\"colour\": \"white\",\r\n"
				+ "	\"price\": 1000,\r\n"
				+ "	\"productName\": \"Lenovo\",\r\n"
				+ "	\"sellerNames\": [\n"
				+ "		\"xyz\",\n"
				+ "		\"abc\",\n"
				+ "		\"123\"\n"
				+ "	]\n"
				+ "}";
		
		pojo_product jsonPro=jsonparser.parse(JsonValue, pojo_product.class);
		System.out.println(jsonPro.getColour());
		System.out.println(jsonPro.getPrice());
		System.out.println(jsonPro.getProductName());
		System.out.println(jsonPro.getSellerNames());
		System.out.println(jsonPro);  // use toString to get output like this in override method  @Override toString()
		//product [productName=Lenovo, price=1000, sellerNames=[xyz, abc, 123], colour=white]
	}
}