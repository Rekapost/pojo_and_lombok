package lombok_pack;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import lombok.Data;
//Can use lombok to generate default constructors , all arguments constructor , getter , setter , toString and equals and hashcode
// useful in reducing code
//@NoArgsConstructor
//@AllArgsConstructor
//@Getter
//@Setter
//@ToString
//@EqualsAndHashCode

@AllArgsConstructor
@Data      //[@Getter, @Setter, @ToString, @EqualsAndHashCode, @NoArgsConstructor]
public class lombok_product {
	
	private String name;
	private int age;
	private String dob;
	private boolean isActive;

/*	public lombok_product() {
		super();
	}
	
	public lombok_product(String name, int age, String dob) {
		
		this.name = name;
		this.age = age;
		this.dob = dob;
	}	
	
	@Override
	public String toString() {
		return "lombok_product [name=" + name + ", age=" + age + ", dob=" + dob + "]";
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getDob() {
		return dob;
	}
	public void setDob(String dob) {
		this.dob = dob;
	}
	public boolean isActive() {
		return isActive;
	}
	public void setActive(boolean isActive) {
		this.isActive = isActive;
	}
*/	
}
