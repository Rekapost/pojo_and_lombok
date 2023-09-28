package lombok_pack;
import lombok_pack.lombok_product;

public class Lombok_Product_Test {
	public static void main(String[] args) {
		lombok_product lp=new lombok_product("Reka",40,"August", true);
		System.out.println(lp.getName());
		System.out.println(lp.getAge());
		System.out.println(lp.getDob());
		lp.setActive(false);
		System.out.println(lp.isActive());
		
/*		lp.setName("Reka");
		lp.setAge(40);
		lp.setDob("august");
		System.out.println(lp.getName());
		System.out.println(lp.getAge());
		System.out.println(lp.getDob());
*/
	}
}