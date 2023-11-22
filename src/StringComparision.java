
public class StringComparision {

	public static void main(String[] args) {
		String s1 = "Ram";
		String s2 = "Ram";
		
		System.out.println("====> Reference Comparison");
		if(s1 == s2){
			System.out.println("References are pointing to same object");
			}else{
				System.out.println("References are pointing to Different object");
			}
		System.out.println("====> Data Comparison");
		if(s1.equals(s2)){
			System.out.println(" same data");
			}else{
				System.out.println(" Different data");
			}

		}
}
	

