package pojo_Pack;
import java.util.Arrays;
import org.apache.juneau.annotation.Beanc;

public class pojo_product {
	
		private String productName;
		private int price;
		private String[] sellerNames;
		private String colour;
	
		/**
		 * @param productName
		 * @param price
		 * @param sellerName
		 * @param selslerNames
		 */
		
		// Can use lombok to generate default constructors , all arguments constructor , getter , setter , toString and equals and hashcode
		@Beanc(properties="productName,  price, sellerNames ,colour ")
		public pojo_product(String productName, int price, String[] sellerNames, String colour) {
			this.productName = productName;
			this.price = price;
			this.sellerNames = sellerNames;
			this.colour = colour;
		}
		
		@Override
		public String toString() {
			return "product [productName=" + productName + ", price=" + price + ", sellerNames="
					+ Arrays.toString(sellerNames) + ", colour=" + colour + "]";
		}
		public String getProductName() {
			return productName;
		}
		public void setProductName(String productName) {
			this.productName = productName;
		}
		public int getPrice() {
			return price;
		}
		public void setPrice(int price) {
			this.price = price;
		}
		public String[] getSellerNames() {
			return sellerNames;
		}
		public void setSellerNames(String[] sellerNames) {
			this.sellerNames = sellerNames;
		}
		public String getColour() {
			return colour;
		}
		public void setColour(String colour) {
			this.colour = colour;
		}
}
