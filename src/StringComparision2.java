
public class StringComparision2 {

	public static void main(String[] args) {
		String s1 = "Ram";
		String s2= "Sita";
//		String s3 = "Ram"+"Sita";
//		String s4 ="Ram"+"Sita";
//		String s3 = "s1"+"s2";
//		String s4 ="s1"+"s2";
		String s3 = "s1"+"Sita";
		String s4 ="s1"+"Sita";
		
		System.out.println("====> Reference Comparison");
		if(s3== s4){
			System.out.println("References are pointing to same object");
			}else{
				System.out.println("References are pointing to Different object");
			}
		System.out.println("====> Data Comparison");
		if(s3.equals(s4)){
			System.out.println(" same data");
			}else{
				System.out.println(" Different data");
			}
	}
}